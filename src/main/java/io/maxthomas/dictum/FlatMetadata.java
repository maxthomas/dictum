/*
 * Copyright 2016 Max Thomas. All rights reserved.
 * See LICENSE in the project root directory.
 */
package io.maxthomas.dictum;

import io.maxthomas.dictum.primitives.IntGreaterThanZero;
import io.maxthomas.dictum.primitives.NonEmptyNonWhitespaceString;
import io.maxthomas.dictum.primitives.UnixTimestamp;

/**
 * Interface capturing metadata about a particular annotation.
 */
public interface FlatMetadata {
  public NonEmptyNonWhitespaceString getTool();

  public IntGreaterThanZero getKBest();

  public UnixTimestamp getTimestamp();
}
