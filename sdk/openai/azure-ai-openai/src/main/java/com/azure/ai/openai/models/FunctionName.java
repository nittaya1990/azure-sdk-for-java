// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.azure.ai.openai.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A structure that specifies the exact name of a specific, request-provided function to use when processing a chat
 * completions operation.
 */
@Immutable
public final class FunctionName {

    /*
     * The name of the function to call.
     */
    @Generated
    @JsonProperty(value = "name")
    private String name;

    /**
     * Creates an instance of FunctionName class.
     *
     * @param name the name value to set.
     */
    @Generated
    @JsonCreator
    public FunctionName(@JsonProperty(value = "name") String name) {
        this.name = name;
    }

    /**
     * Get the name property: The name of the function to call.
     *
     * @return the name value.
     */
    @Generated
    public String getName() {
        return this.name;
    }
}