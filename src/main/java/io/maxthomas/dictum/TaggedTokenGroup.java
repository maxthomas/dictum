/*
 * Copyright 2016 Max Thomas. All rights reserved.
 * See LICENSE in the project root directory.
 */
package io.maxthomas.dictum;

import java.util.Map;
import java.util.Optional;

import org.inferred.freebuilder.FreeBuilder;

/**
 * Abstract class that represents a group of {@link TaggedToken}
 * objects. Extends {@link UUIDableFlatMetadata}.
 */
@FreeBuilder
public abstract class TaggedTokenGroup extends UUIDableFlatMetadata {
  TaggedTokenGroup() {
  }

  public abstract Optional<String> getTaggingType();

  public abstract Map<Integer, TaggedToken> getIndexToTaggedTokenMap();

  public static class Builder extends TaggedTokenGroup_Builder {

  }
}
