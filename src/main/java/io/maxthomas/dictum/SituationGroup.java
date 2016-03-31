/*
 * Copyright 2016 Max Thomas. All rights reserved.
 * See LICENSE in the project root directory.
 */
package io.maxthomas.dictum;

import java.util.Map;
import java.util.UUID;

import org.inferred.freebuilder.FreeBuilder;

@FreeBuilder
public abstract class SituationGroup extends UUIDableFlatMetadata {
  public abstract Map<UUID, Situation> getIdToSituationMap();

  public static class Builder extends SituationGroup_Builder { }

  SituationGroup() {
  }
}
