/*
 * Copyright 2016 Max Thomas. All rights reserved.
 * See LICENSE in the project root directory.
 */
package io.maxthomas.dictum;

import java.util.Optional;
import java.util.Set;
import java.util.UUID;

import org.inferred.freebuilder.FreeBuilder;


/**
 * Interface supporting entities within a particular document.
 */
@FreeBuilder
public abstract class InDocEntity implements UUIDable, ConfidenceScorable {
  InDocEntity() {
  }

  public abstract Set<UUID> getMentionUUIDs();

  public abstract Optional<String> getType();

  public abstract Optional<String> getCanonicalName();

  public static class Builder extends InDocEntity_Builder { }
}
