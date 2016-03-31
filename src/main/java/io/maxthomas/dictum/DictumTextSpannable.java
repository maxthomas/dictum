/*
 * Copyright 2016 Max Thomas. All rights reserved.
 * See LICENSE in the project root directory.
 */
package io.maxthomas.dictum;

import java.util.Optional;

/**
 * Interface that represents an object that can return an optional
 * {@link DictumTextSpan} object.
 */
public interface DictumTextSpannable {
  public Optional<DictumTextSpan> getTextSpan();
}
