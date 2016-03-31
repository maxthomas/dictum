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
public abstract class CommunicationTagging extends UUIDableFlatMetadata {

  public abstract String getTaggingType();

  public abstract Map<String, Confidence> getTagToConfidenceMap();

  CommunicationTagging() {
  }

  public static class Builder extends CommunicationTagging_Builder {
    public Builder() {

    }
  }
}
