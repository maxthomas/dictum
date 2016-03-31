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
public abstract class Justification implements TokenGroupable {

  Justification() {
  }

  public abstract Optional<String> getJustificationType();
  public abstract UUID getMentionId();

  public static class Builder extends Justification_Builder {
    public Builder() {

    }
  }
}
