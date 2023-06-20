// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managementgroups.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.managementgroups.models.ManagementGroupChildInfo;
import com.azure.resourcemanager.managementgroups.models.ManagementGroupDetails;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The generic properties of a management group. */
@Fluent
public final class ManagementGroupProperties {
    /*
     * The AAD Tenant ID associated with the management group. For example, 00000000-0000-0000-0000-000000000000
     */
    @JsonProperty(value = "tenantId")
    private String tenantId;

    /*
     * The friendly name of the management group.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /*
     * The details of a management group.
     */
    @JsonProperty(value = "details")
    private ManagementGroupDetails details;

    /*
     * The list of children.
     */
    @JsonProperty(value = "children")
    private List<ManagementGroupChildInfo> children;

    /** Creates an instance of ManagementGroupProperties class. */
    public ManagementGroupProperties() {
    }

    /**
     * Get the tenantId property: The AAD Tenant ID associated with the management group. For example,
     * 00000000-0000-0000-0000-000000000000.
     *
     * @return the tenantId value.
     */
    public String tenantId() {
        return this.tenantId;
    }

    /**
     * Set the tenantId property: The AAD Tenant ID associated with the management group. For example,
     * 00000000-0000-0000-0000-000000000000.
     *
     * @param tenantId the tenantId value to set.
     * @return the ManagementGroupProperties object itself.
     */
    public ManagementGroupProperties withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
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
     * @return the ManagementGroupProperties object itself.
     */
    public ManagementGroupProperties withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the details property: The details of a management group.
     *
     * @return the details value.
     */
    public ManagementGroupDetails details() {
        return this.details;
    }

    /**
     * Set the details property: The details of a management group.
     *
     * @param details the details value to set.
     * @return the ManagementGroupProperties object itself.
     */
    public ManagementGroupProperties withDetails(ManagementGroupDetails details) {
        this.details = details;
        return this;
    }

    /**
     * Get the children property: The list of children.
     *
     * @return the children value.
     */
    public List<ManagementGroupChildInfo> children() {
        return this.children;
    }

    /**
     * Set the children property: The list of children.
     *
     * @param children the children value to set.
     * @return the ManagementGroupProperties object itself.
     */
    public ManagementGroupProperties withChildren(List<ManagementGroupChildInfo> children) {
        this.children = children;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (details() != null) {
            details().validate();
        }
        if (children() != null) {
            children().forEach(e -> e.validate());
        }
    }
}