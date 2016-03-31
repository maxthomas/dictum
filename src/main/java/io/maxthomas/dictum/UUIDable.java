/*
 * Copyright 2016 Max Thomas. All rights reserved.
 * See LICENSE in the project root directory.
 */
package io.maxthomas.dictum;

import java.util.UUID;

/**
 * Interface whose implementations have a {@link UUID} associated with them.
 */
public interface UUIDable {
  public UUID getUUID();
}
