// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.jobrouter.implementation.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Supported parameters for scoring workers. */
public final class ScoringRuleParameterSelectorInternal
        extends ExpandableStringEnum<ScoringRuleParameterSelectorInternal> {
    /** Static value jobLabels for ScoringRuleParameterSelectorInternal. */
    public static final ScoringRuleParameterSelectorInternal JOB_LABELS = fromString("jobLabels");

    /** Static value workerSelectors for ScoringRuleParameterSelectorInternal. */
    public static final ScoringRuleParameterSelectorInternal WORKER_SELECTORS = fromString("workerSelectors");

    /**
     * Creates a new instance of ScoringRuleParameterSelectorInternal value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ScoringRuleParameterSelectorInternal() {}

    /**
     * Creates or finds a ScoringRuleParameterSelectorInternal from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ScoringRuleParameterSelectorInternal.
     */
    @JsonCreator
    public static ScoringRuleParameterSelectorInternal fromString(String name) {
        return fromString(name, ScoringRuleParameterSelectorInternal.class);
    }

    /**
     * Gets known ScoringRuleParameterSelectorInternal values.
     *
     * @return known ScoringRuleParameterSelectorInternal values.
     */
    public static Collection<ScoringRuleParameterSelectorInternal> values() {
        return values(ScoringRuleParameterSelectorInternal.class);
    }
}