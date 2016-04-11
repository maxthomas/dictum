/*
 * Copyright 2016 Max Thomas. All rights reserved.
 * See LICENSE in the project root directory.
 */
package io.maxthomas.dictum;

import io.maxthomas.dictum.primitives.IntZeroOrGreater;

/**
 * Interface representing an object that has a zero-based index field.
 */
public interface ZeroBasedIndexable {
  public IntZeroOrGreater getIndex();
}
