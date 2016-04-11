/*
 * Copyright 2016 Max Thomas. All rights reserved.
 * See LICENSE in the project root directory.
 */
package io.maxthomas.dictum;

import java.util.Optional;

import org.inferred.freebuilder.FreeBuilder;

/**
 * An abstract class that represents a token in text.
 * Implements the {@link DictumTextSpannable} interface.
 *
 * @see ZeroBasedIndexable
 */
@FreeBuilder
public abstract class Token implements TextSpannable, ZeroBasedIndexable {
  Token() { }

  public abstract Optional<String> getTokenText();

  public static class Builder extends Token_Builder { }
}
