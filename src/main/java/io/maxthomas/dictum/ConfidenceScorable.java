/*
 * Copyright 2016 Max Thomas. All rights reserved.
 * See LICENSE in the project root directory.
 */
package io.maxthomas.dictum;

import java.util.Optional;

/**
 * Interface for objects that may produce a {@link Confidence}.
 */
public interface ConfidenceScorable {
  public Optional<Confidence> getConfidence();
}
