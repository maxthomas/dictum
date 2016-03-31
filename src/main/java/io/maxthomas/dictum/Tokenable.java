/*
 * Copyright 2016 Max Thomas. All rights reserved.
 * See LICENSE in the project root directory.
 */
package io.maxthomas.dictum;

/**
 * An interface for objects that can produce {@link Token}s.
 */
public interface Tokenable {
  public Token getToken();
}
