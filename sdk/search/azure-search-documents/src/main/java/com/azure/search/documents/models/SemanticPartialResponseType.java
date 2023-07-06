// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/** Type of partial response that was returned for a semantic search request. */
public final class SemanticPartialResponseType extends ExpandableStringEnum<SemanticPartialResponseType> {
    /** Results without any semantic enrichment or reranking. */
    public static final SemanticPartialResponseType BASE_RESULTS = fromString("baseResults");

    /**
     * Results have been reranked with the reranker model and will include semantic captions. They will not include any
     * answers, answers highlights or caption highlights.
     */
    public static final SemanticPartialResponseType RERANKED_RESULTS = fromString("rerankedResults");

    /**
     * Creates a new instance of SemanticPartialResponseType value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public SemanticPartialResponseType() {}

    /**
     * Creates or finds a SemanticPartialResponseType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding SemanticPartialResponseType.
     */
    public static SemanticPartialResponseType fromString(String name) {
        return fromString(name, SemanticPartialResponseType.class);
    }

    /**
     * Gets known SemanticPartialResponseType values.
     *
     * @return known SemanticPartialResponseType values.
     */
    public static Collection<SemanticPartialResponseType> values() {
        return values(SemanticPartialResponseType.class);
    }
}