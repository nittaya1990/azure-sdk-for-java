// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** L3NetworkAttachmentConfiguration represents the configuration of the attachment of a Layer 3 network. */
@Fluent
public final class L3NetworkAttachmentConfiguration {
    /*
     * The indication of whether this network will or will not perform IP address management and allocate IP addresses
     * when attached.
     */
    @JsonProperty(value = "ipamEnabled")
    private L3NetworkConfigurationIpamEnabled ipamEnabled;

    /*
     * The resource ID of the network that is being configured for attachment.
     */
    @JsonProperty(value = "networkId", required = true)
    private String networkId;

    /*
     * The indicator of how this network will be utilized by the Kubernetes cluster.
     */
    @JsonProperty(value = "pluginType")
    private KubernetesPluginType pluginType;

    /** Creates an instance of L3NetworkAttachmentConfiguration class. */
    public L3NetworkAttachmentConfiguration() {
    }

    /**
     * Get the ipamEnabled property: The indication of whether this network will or will not perform IP address
     * management and allocate IP addresses when attached.
     *
     * @return the ipamEnabled value.
     */
    public L3NetworkConfigurationIpamEnabled ipamEnabled() {
        return this.ipamEnabled;
    }

    /**
     * Set the ipamEnabled property: The indication of whether this network will or will not perform IP address
     * management and allocate IP addresses when attached.
     *
     * @param ipamEnabled the ipamEnabled value to set.
     * @return the L3NetworkAttachmentConfiguration object itself.
     */
    public L3NetworkAttachmentConfiguration withIpamEnabled(L3NetworkConfigurationIpamEnabled ipamEnabled) {
        this.ipamEnabled = ipamEnabled;
        return this;
    }

    /**
     * Get the networkId property: The resource ID of the network that is being configured for attachment.
     *
     * @return the networkId value.
     */
    public String networkId() {
        return this.networkId;
    }

    /**
     * Set the networkId property: The resource ID of the network that is being configured for attachment.
     *
     * @param networkId the networkId value to set.
     * @return the L3NetworkAttachmentConfiguration object itself.
     */
    public L3NetworkAttachmentConfiguration withNetworkId(String networkId) {
        this.networkId = networkId;
        return this;
    }

    /**
     * Get the pluginType property: The indicator of how this network will be utilized by the Kubernetes cluster.
     *
     * @return the pluginType value.
     */
    public KubernetesPluginType pluginType() {
        return this.pluginType;
    }

    /**
     * Set the pluginType property: The indicator of how this network will be utilized by the Kubernetes cluster.
     *
     * @param pluginType the pluginType value to set.
     * @return the L3NetworkAttachmentConfiguration object itself.
     */
    public L3NetworkAttachmentConfiguration withPluginType(KubernetesPluginType pluginType) {
        this.pluginType = pluginType;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (networkId() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property networkId in model L3NetworkAttachmentConfiguration"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(L3NetworkAttachmentConfiguration.class);
}