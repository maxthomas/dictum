/*
 * Copyright 2016 Max Thomas. All rights reserved.
 * See LICENSE in the project root directory.
 */
package io.maxthomas.dictum.primitives;

import org.inferred.freebuilder.FreeBuilder;

import io.maxthomas.dictum.rules.Rules;

/**
 * Class that represents a non empty string that is not filled
 * with whitespace.
 */
@FreeBuilder
public abstract class NonEmptyNonWhitespaceString {

  NonEmptyNonWhitespaceString() {
  }

  public abstract String getString();

  /**
   * @param s the {@link String} to wrap and validate
   * @return a {@link NonEmptyNonWhitespaceString}
   */
  public static final NonEmptyNonWhitespaceString create(String s) {
    return new NonEmptyNonWhitespaceString.Builder().setString(s).build();
  }

  public static class Builder extends NonEmptyNonWhitespaceString_Builder {
    public Builder() {
    }

    @Override
    public Builder setString(String s) {
      if (Rules.isEmptyOrWhitespaceOnly().test(s))
        throw new IllegalArgumentException("String cannot be empty or only contain whitespace.");
      return super.setString(s);
    }
  }
}
