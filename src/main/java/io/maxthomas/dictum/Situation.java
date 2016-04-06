/*
 * Copyright 2016 Max Thomas. All rights reserved.
 * See LICENSE in the project root directory.
 */
package io.maxthomas.dictum;

import java.util.Optional;

import org.inferred.freebuilder.FreeBuilder;

@FreeBuilder
public abstract class Situation extends DictumTokenGrouping
    implements UUIDable, PolarityIntensityConfidenceScorable {
  public abstract String getSituationType();

  public abstract Optional<String> getSituationKind();

  public abstract Optional<String> getTimeMLClass();

  public abstract Optional<String> getTimeMLTense();

  public abstract Optional<String> getTimeMLAspect();

  public static class Builder extends Situation_Builder { }
}
