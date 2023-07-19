// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Type of the condition used. */
public final class RoutePolicyConditionType extends ExpandableStringEnum<RoutePolicyConditionType> {
    /** Static value Or for RoutePolicyConditionType. */
    public static final RoutePolicyConditionType OR = fromString("Or");

    /** Static value And for RoutePolicyConditionType. */
    public static final RoutePolicyConditionType AND = fromString("And");

    /**
     * Creates a new instance of RoutePolicyConditionType value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public RoutePolicyConditionType() {
    }

    /**
     * Creates or finds a RoutePolicyConditionType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding RoutePolicyConditionType.
     */
    @JsonCreator
    public static RoutePolicyConditionType fromString(String name) {
        return fromString(name, RoutePolicyConditionType.class);
    }

    /**
     * Gets known RoutePolicyConditionType values.
     *
     * @return known RoutePolicyConditionType values.
     */
    public static Collection<RoutePolicyConditionType> values() {
        return values(RoutePolicyConditionType.class);
    }
}