/*
 * Copyright 2016 Max Thomas. All rights reserved.
 * See LICENSE in the project root directory.
 */
package io.maxthomas.dictum;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.inferred.freebuilder.FreeBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Class, extending {@link UUIDableFlatMetadata}, that represents a collection
 * of {@link Constituent} objects, as well as a UUID and metadata.
 * <br><br>
 * Each {@link Constituent#getChildList()} is also checked to ensure that
 * each child pointer is present in this annotation.
 */
@FreeBuilder
public abstract class Parse extends UUIDableFlatMetadata {

  private static final Logger LOGGER = LoggerFactory.getLogger(Parse.class);

  Parse() {
  }

  public abstract Map<Integer, Constituent> getConstituents();

  public static class Builder extends Parse_Builder {
    public Builder() {

    }

    @Override
    public Parse build() {
      Parse pp = super.build();
      Map<Integer, Constituent> m = pp.getConstituents();
      Set<Integer> idxs = m.keySet();
      List<Integer> il = new ArrayList<>(idxs);
      for (int i = 0; i < m.size(); i++) {
        Integer n = il.get(i);
        if (n.intValue() != i)
          throw new IllegalArgumentException("Index should be " + i
              + ", but instead it was " + n);
      }
      m.forEach((i, c) -> {
        LOGGER.debug("Validating constituent: {}", i);
        // ensure all children are present in this annotation
        if (!idxs.containsAll(c.getChildList()))
          throw new IllegalArgumentException("Not all constituent children indices "
              + "are present in this Constituent list.");
      });
      return pp;
    }
  }
}
