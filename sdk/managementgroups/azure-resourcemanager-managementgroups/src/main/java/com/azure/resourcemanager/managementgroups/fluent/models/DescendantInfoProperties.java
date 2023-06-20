// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managementgroups.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.managementgroups.models.DescendantParentGroupInfo;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The generic properties of an descendant. */
@Fluent
public final class DescendantInfoProperties {
    /*
     * The friendly name of the management group.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /*
     * The ID of the parent management group.
     */
    @JsonProperty(value = "parent")
    private DescendantParentGroupInfo parent;

    /** Creates an instance of DescendantInfoProperties class. */
    public DescendantInfoProperties() {
    }

    /**
     * Get the displayName property: The friendly name of the management group.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: The friendly name of the management group.
     *
     * @param displayName the displayName value to set.
     * @return the DescendantInfoProperties object itself.
     */
    public DescendantInfoProperties withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the parent property: The ID of the parent management group.
     *
     * @return the parent value.
     */
    public DescendantParentGroupInfo parent() {
        return this.parent;
    }

    /**
     * Set the parent property: The ID of the parent management group.
     *
     * @param parent the parent value to set.
     * @return the DescendantInfoProperties object itself.
     */
    public DescendantInfoProperties withParent(DescendantParentGroupInfo parent) {
        this.parent = parent;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (parent() != null) {
            parent().validate();
        }
    }
}