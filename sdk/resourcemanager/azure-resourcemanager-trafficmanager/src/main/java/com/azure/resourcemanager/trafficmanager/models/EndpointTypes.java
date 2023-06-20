// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.trafficmanager.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for EndpointTypes. */
public enum EndpointTypes {
    /** Enum value AzureEndpoints. */
    AZURE_ENDPOINTS("AzureEndpoints"),

    /** Enum value ExternalEndpoints. */
    EXTERNAL_ENDPOINTS("ExternalEndpoints"),

    /** Enum value NestedEndpoints. */
    NESTED_ENDPOINTS("NestedEndpoints");

    /** The actual serialized value for a EndpointTypes instance. */
    private final String value;

    EndpointTypes(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a EndpointTypes instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed EndpointTypes object, or null if unable to parse.
     */
    @JsonCreator
    public static EndpointTypes fromString(String value) {
        if (value == null) {
            return null;
        }
        EndpointTypes[] items = EndpointTypes.values();
        for (EndpointTypes item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    /** {@inheritDoc} */
    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}