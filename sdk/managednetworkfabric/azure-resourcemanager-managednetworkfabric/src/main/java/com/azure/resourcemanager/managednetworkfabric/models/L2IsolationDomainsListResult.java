// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.managednetworkfabric.fluent.models.L2IsolationDomainInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** List of L2IsolationDomains. */
@Fluent
public final class L2IsolationDomainsListResult {
    /*
     * Displays list of L2IsolationDomain resources.
     */
    @JsonProperty(value = "value")
    private List<L2IsolationDomainInner> value;

    /*
     * Url to follow for getting next page of resources.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /** Creates an instance of L2IsolationDomainsListResult class. */
    public L2IsolationDomainsListResult() {
    }

    /**
     * Get the value property: Displays list of L2IsolationDomain resources.
     *
     * @return the value value.
     */
    public List<L2IsolationDomainInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Displays list of L2IsolationDomain resources.
     *
     * @param value the value value to set.
     * @return the L2IsolationDomainsListResult object itself.
     */
    public L2IsolationDomainsListResult withValue(List<L2IsolationDomainInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: Url to follow for getting next page of resources.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: Url to follow for getting next page of resources.
     *
     * @param nextLink the nextLink value to set.
     * @return the L2IsolationDomainsListResult object itself.
     */
    public L2IsolationDomainsListResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}