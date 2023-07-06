// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The indicator to determine if automatic allocation from the pool should occur. */
public final class BfdEnabled extends ExpandableStringEnum<BfdEnabled> {
    /** Static value True for BfdEnabled. */
    public static final BfdEnabled TRUE = fromString("True");

    /** Static value False for BfdEnabled. */
    public static final BfdEnabled FALSE = fromString("False");

    /**
     * Creates a new instance of BfdEnabled value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public BfdEnabled() {
    }

    /**
     * Creates or finds a BfdEnabled from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding BfdEnabled.
     */
    @JsonCreator
    public static BfdEnabled fromString(String name) {
        return fromString(name, BfdEnabled.class);
    }

    /**
     * Gets known BfdEnabled values.
     *
     * @return known BfdEnabled values.
     */
    public static Collection<BfdEnabled> values() {
        return values(BfdEnabled.class);
    }
}