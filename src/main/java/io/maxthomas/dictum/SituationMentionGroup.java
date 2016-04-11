/*
 * Copyright 2016 Max Thomas. All rights reserved.
 * See LICENSE in the project root directory.
 */
package io.maxthomas.dictum;

import java.util.Map;
import java.util.UUID;

import org.inferred.freebuilder.FreeBuilder;

import io.maxthomas.dictum.primitives.IntGreaterThanZero;
import io.maxthomas.dictum.primitives.UnixTimestamp;

@FreeBuilder
public abstract class SituationMentionGroup implements FlatMetadataWithUUID {

  public abstract Map<UUID, SituationMention> getIdToSituationMentionMap();

  SituationMentionGroup() {
  }

  public static class Builder extends SituationMentionGroup_Builder {
    public Builder() {
      // defaults: UUID, kbest = 1, ts = current system time.
      super.setUUID(UUID.randomUUID());
      super.setKBest(IntGreaterThanZero.create(1));
      super.setTimestamp(UnixTimestamp.now());
    }
  }
}
