/*
 * Copyright 2016 Max Thomas. All rights reserved.
 * See LICENSE in the project root directory.
 */
package io.maxthomas.dictum;

import org.inferred.freebuilder.FreeBuilder;

/**
 * Combination of {@link FlatMetadata} and {@link UUIDable} interfaces.
 */
@FreeBuilder
public abstract class UUIDableFlatMetadata extends FlatMetadata
    implements UUIDable {

  public static class Builder extends UUIDableFlatMetadata_Builder { }

  UUIDableFlatMetadata() { }
}
