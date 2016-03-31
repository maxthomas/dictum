/*
 * Copyright 2016 Max Thomas. All rights reserved.
 * See LICENSE in the project root directory.
 */
package io.maxthomas.dictum;

import java.util.List;

import org.inferred.freebuilder.FreeBuilder;

@FreeBuilder
public abstract class DependencyParse extends UUIDableFlatMetadata {
  public abstract List<Dependency> getDependencies();

  public static class Builder extends DependencyParse_Builder {
    public Builder() {

    }
  }

  DependencyParse() {
  }
}
