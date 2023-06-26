// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservicefleet.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The status of the wait duration. */
@Immutable
public final class WaitStatus {
    /*
     * The status of the wait duration.
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private UpdateStatus status;

    /*
     * The wait duration configured in seconds.
     */
    @JsonProperty(value = "waitDurationInSeconds", access = JsonProperty.Access.WRITE_ONLY)
    private Integer waitDurationInSeconds;

    /** Creates an instance of WaitStatus class. */
    public WaitStatus() {
    }

    /**
     * Get the status property: The status of the wait duration.
     *
     * @return the status value.
     */
    public UpdateStatus status() {
        return this.status;
    }

    /**
     * Get the waitDurationInSeconds property: The wait duration configured in seconds.
     *
     * @return the waitDurationInSeconds value.
     */
    public Integer waitDurationInSeconds() {
        return this.waitDurationInSeconds;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (status() != null) {
            status().validate();
        }
    }
}