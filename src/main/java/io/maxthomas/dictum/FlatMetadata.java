/*
 * Copyright 2016 Max Thomas. All rights reserved.
 * See LICENSE in the project root directory.
 */
package io.maxthomas.dictum;

import org.inferred.freebuilder.FreeBuilder;

/**
 * Interface capturing metadata about a particular annotation.
 * The following validation checks are performed:
 * <ul>
 * <li><code>tool</code>: must be non-empty and contain characters other than whitespaces</li>
 * <li><code>kbest</code>: must be greater than <code>0</code></li>
 * </ul>
 */
@FreeBuilder
public abstract class FlatMetadata {
  public abstract String getTool();

  public abstract int getKBest();

  public abstract long getTimestamp();

  public static class Builder extends FlatMetadata_Builder {
    public Builder() {

    }

    @Override
    public Builder setTool(String tool) {
      if (Rules.isEmptyOrWhitespaceOnly().test(tool))
        throw new IllegalArgumentException("Tool cannot be empty or contain only whitespace.");
      else
        return super.setTool(tool);
    }

    @Override
    public Builder setKBest(int kbest) {
      if (Rules.isGTZero().test(kbest))
        return super.setKBest(kbest);
      else
        throw new IllegalArgumentException("Invalid kbest score: " + kbest);
    }
  }

  FlatMetadata() { }
}
