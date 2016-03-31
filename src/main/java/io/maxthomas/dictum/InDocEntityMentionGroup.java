/*
 * Copyright 2016 Max Thomas. All rights reserved.
 * See LICENSE in the project root directory.
 */
package io.maxthomas.dictum;

import java.util.Map;
import java.util.Set;
import java.util.UUID;

import org.inferred.freebuilder.FreeBuilder;

/**
 * Class that represents a group of {@link InDocEntityMention}
 * objects. Extends {@link UUIDableFlatMetadata}.
 */
@FreeBuilder
public abstract class InDocEntityMentionGroup extends UUIDableFlatMetadata {
  InDocEntityMentionGroup() {
  }

  public abstract Map<UUID, InDocEntityMention> getIdToEntityMentionMap();

  public static class Builder extends InDocEntityMentionGroup_Builder {
    public Builder() {
      // defaults: UUID.
      super.setUUID(UUID.randomUUID());
    }

    @Override
    public InDocEntityMentionGroup build() {
      InDocEntityMentionGroup g = super.build();
      // validate that all child pointers
      // are actually UUIDs in this set.
      Set<UUID> allMentionIDs = g.getIdToEntityMentionMap().keySet();
      g.getIdToEntityMentionMap().values()
          .forEach(ids -> {
            if (!allMentionIDs.containsAll(ids.getChildMentionUUIDs())) {
              throw new IllegalArgumentException("Child ID pointers for EntityMention "
                  + ids.getUUID().toString() + " include at least one UUID that is not a part of "
                  + "the UUIDs of this EntityMentionGroup.");
            }
          });
      return g;
    }
  }
}
