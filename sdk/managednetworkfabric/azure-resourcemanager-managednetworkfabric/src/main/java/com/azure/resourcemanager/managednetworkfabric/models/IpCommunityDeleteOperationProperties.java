// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** IP Community delete operation properties. */
@Fluent
public class IpCommunityDeleteOperationProperties {
    /*
     * IP Community ID list properties.
     */
    @JsonProperty(value = "delete")
    private IpCommunityIdList delete;

    /** Creates an instance of IpCommunityDeleteOperationProperties class. */
    public IpCommunityDeleteOperationProperties() {
    }

    /**
     * Get the delete property: IP Community ID list properties.
     *
     * @return the delete value.
     */
    public IpCommunityIdList delete() {
        return this.delete;
    }

    /**
     * Set the delete property: IP Community ID list properties.
     *
     * @param delete the delete value to set.
     * @return the IpCommunityDeleteOperationProperties object itself.
     */
    public IpCommunityDeleteOperationProperties withDelete(IpCommunityIdList delete) {
        this.delete = delete;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (delete() != null) {
            delete().validate();
        }
    }
}