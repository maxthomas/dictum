/*
 * Copyright 2016 Max Thomas. All rights reserved.
 * See LICENSE in the project root directory.
 */
package io.maxthomas.dictum;
/**
 * Interface representing something that has {@link FlatMetadata}.
 */
public interface Metadatable {
  public FlatMetadata getMetadata();
}
