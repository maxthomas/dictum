/*
 * Copyright 2016 Max Thomas. All rights reserved.
 * See LICENSE in the project root directory.
 */
package io.maxthomas.dictum;

import org.inferred.freebuilder.FreeBuilder;

import io.maxthomas.dictum.rules.Rules;

/**
 * Interface representing an object that has a zero-based index field.
 * Validation code is run to ensure this is true.
 */
@FreeBuilder
public abstract class ZeroBasedIndexable {
  ZeroBasedIndexable() {
  }

  /**
   * @return the index. Zero based.
   */
  public abstract int getIndex();

  public static class Builder extends ZeroBasedIndexable_Builder {
    public Builder() {

    }

    @Override
    public Builder setIndex(int i) {
      if (Rules.isGTOrEqualToZero().test(i))
        return super.setIndex(i);
      else
        throw new IllegalArgumentException("Failed: was not >= 0.");
    }
  }
}
