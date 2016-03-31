/*
 * Copyright 2016 Max Thomas. All rights reserved.
 * See LICENSE in the project root directory.
 */
package io.maxthomas.dictum;

import java.util.Map;

import org.inferred.freebuilder.FreeBuilder;

/**
 *
 */
@FreeBuilder
public abstract class LanguageID extends UUIDableFlatMetadata {

  public abstract Map<String, Double> getLanguageToProbMap();

  LanguageID() {
  }

  public static class Builder extends LanguageID_Builder {
    public Builder() {

    }
  }
}
