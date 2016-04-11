/*
 * Copyright 2016 Max Thomas. All rights reserved.
 * See LICENSE in the project root directory.
 */
package io.maxthomas.dictum.primitives;

import org.inferred.freebuilder.FreeBuilder;

import io.maxthomas.dictum.rules.Rules;

/**
 * Representation of a confidence score.
 */
@FreeBuilder
public abstract class Confidence {
  public abstract double getScore();

  public static class Builder extends Confidence_Builder {
    public Builder() {
    }

    @Override
    public Builder setScore(double score) {
      if (Rules.isBetweenZeroAndOneInclusive().test(score))
        return super.setScore(score);
      else
        throw new IllegalArgumentException("Invalid confidence score: " + score);
    }
  }

  Confidence () { }
}
