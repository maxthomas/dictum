/*
 * Copyright 2016 Max Thomas. All rights reserved.
 * See LICENSE in the project root directory.
 */
package io.maxthomas.dictum;

import java.util.Optional;
import java.util.UUID;

import org.inferred.freebuilder.FreeBuilder;

/**
 *
 */
@FreeBuilder
public abstract class SpanLink extends DictumTokenGrouping {
  public abstract Optional<String> getExternalTarget();

  public abstract Optional<UUID> getConcreteTarget();

  public abstract String getLinkType();

  public static class Builder extends SpanLink_Builder { }

  SpanLink() {
  }
}
