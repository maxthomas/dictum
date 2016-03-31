/*
 * Copyright 2016 Max Thomas. All rights reserved.
 * See LICENSE in the project root directory.
 */
package io.maxthomas.dictum;

import java.util.Map;
import java.util.UUID;

import org.inferred.freebuilder.FreeBuilder;

@FreeBuilder
public abstract class SituationMentionGroup extends UUIDableFlatMetadata {

  public abstract Map<UUID, SituationMention> getIdToSituationMentionMap();

  SituationMentionGroup() {
  }

  public static class Builder extends SituationMentionGroup_Builder {

  }
}
