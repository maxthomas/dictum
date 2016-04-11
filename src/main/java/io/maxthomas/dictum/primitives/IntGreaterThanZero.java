/*
 * Copyright 2016 Max Thomas. All rights reserved.
 * See LICENSE in the project root directory.
 */
package io.maxthomas.dictum.primitives;

import org.inferred.freebuilder.FreeBuilder;

import io.maxthomas.dictum.rules.Rules;

/**
 * Class representing an <code>int</code> that is greater than <code>1</code>.
 */
@FreeBuilder
public abstract class IntGreaterThanZero {
  IntGreaterThanZero() {
  }

  public abstract int getVal();

  /**
   * @param i the <code>int</code> to wrap
   * @return an {@link IntGreaterThanZero}
   */
  public static IntGreaterThanZero create (int i) {
    return new Builder().setVal(i).build();
  }

  public static class Builder extends IntGreaterThanZero_Builder {
    public Builder() {
    }

    @Override
    public Builder setVal(int i) {
      if (Rules.isGTZero().negate().test(i))
        throw new IllegalArgumentException("int must be > 0");
      return super.setVal(i);
    }
  }
}
