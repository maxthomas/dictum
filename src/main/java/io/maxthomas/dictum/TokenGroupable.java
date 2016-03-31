/*
 * Copyright 2016 Max Thomas. All rights reserved.
 * See LICENSE in the project root directory.
 */
package io.maxthomas.dictum;

import java.util.Optional;
/**
 * Interface whose implementations offer an {@link Optional}
 * {@link FlatTokenGrouping}.
 *
 */
public interface TokenGroupable {
  public Optional<FlatTokenGrouping> getTokenGrouping();
}
