// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** For schedules like: 'recur every month on the 15th' or 'recur every 3 months on the 20th'. */
@Fluent
public final class AbsoluteMonthlySchedule {
    /*
     * Specifies the number of months between each set of occurrences.
     */
    @JsonProperty(value = "intervalMonths", required = true)
    private int intervalMonths;

    /*
     * The date of the month.
     */
    @JsonProperty(value = "dayOfMonth", required = true)
    private int dayOfMonth;

    /** Creates an instance of AbsoluteMonthlySchedule class. */
    public AbsoluteMonthlySchedule() {
    }

    /**
     * Get the intervalMonths property: Specifies the number of months between each set of occurrences.
     *
     * @return the intervalMonths value.
     */
    public int intervalMonths() {
        return this.intervalMonths;
    }

    /**
     * Set the intervalMonths property: Specifies the number of months between each set of occurrences.
     *
     * @param intervalMonths the intervalMonths value to set.
     * @return the AbsoluteMonthlySchedule object itself.
     */
    public AbsoluteMonthlySchedule withIntervalMonths(int intervalMonths) {
        this.intervalMonths = intervalMonths;
        return this;
    }

    /**
     * Get the dayOfMonth property: The date of the month.
     *
     * @return the dayOfMonth value.
     */
    public int dayOfMonth() {
        return this.dayOfMonth;
    }

    /**
     * Set the dayOfMonth property: The date of the month.
     *
     * @param dayOfMonth the dayOfMonth value to set.
     * @return the AbsoluteMonthlySchedule object itself.
     */
    public AbsoluteMonthlySchedule withDayOfMonth(int dayOfMonth) {
        this.dayOfMonth = dayOfMonth;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}