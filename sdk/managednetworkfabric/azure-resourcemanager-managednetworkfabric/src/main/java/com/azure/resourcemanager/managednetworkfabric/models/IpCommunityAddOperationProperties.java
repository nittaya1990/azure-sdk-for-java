// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** IP Community add operation properties. */
@Fluent
public class IpCommunityAddOperationProperties {
    /*
     * IP Community ID list properties.
     */
    @JsonProperty(value = "add")
    private IpCommunityIdList add;

    /** Creates an instance of IpCommunityAddOperationProperties class. */
    public IpCommunityAddOperationProperties() {
    }

    /**
     * Get the add property: IP Community ID list properties.
     *
     * @return the add value.
     */
    public IpCommunityIdList add() {
        return this.add;
    }

    /**
     * Set the add property: IP Community ID list properties.
     *
     * @param add the add value to set.
     * @return the IpCommunityAddOperationProperties object itself.
     */
    public IpCommunityAddOperationProperties withAdd(IpCommunityIdList add) {
        this.add = add;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (add() != null) {
            add().validate();
        }
    }
}