/*
 * Copyright 2016 Max Thomas. All rights reserved.
 * See LICENSE in the project root directory.
 */
package io.maxthomas.dictum;

import java.util.Map;
import java.util.Optional;
import java.util.UUID;

import org.inferred.freebuilder.FreeBuilder;

@FreeBuilder
public abstract class InDocEntityGroup extends UUIDableFlatMetadata {
  InDocEntityGroup() {
  }

  public abstract Map<UUID, InDocEntity> getIdToEntityMap();

  public abstract Optional<UUID> getMentionSetUUID();

  public static class Builder extends InDocEntityGroup_Builder {

  }
}
