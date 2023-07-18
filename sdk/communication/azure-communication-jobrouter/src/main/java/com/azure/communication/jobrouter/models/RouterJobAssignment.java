// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.jobrouter.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Assignment details of a job to a worker. */
@Fluent
public final class RouterJobAssignment {
    /*
     * The Id of the job assignment.
     */
    @JsonProperty(value = "assignmentId", required = true)
    private String assignmentId;

    /*
     * The Id of the Worker assigned to the job.
     */
    @JsonProperty(value = "workerId")
    private String workerId;

    /*
     * The assignment time of the job in UTC.
     */
    @JsonProperty(value = "assignedAt", required = true)
    private OffsetDateTime assignedAt;

    /*
     * The time the job was marked as completed after being assigned in UTC.
     */
    @JsonProperty(value = "completedAt")
    private OffsetDateTime completedAt;

    /*
     * The time the job was marked as closed after being completed in UTC.
     */
    @JsonProperty(value = "closedAt")
    private OffsetDateTime closedAt;

    /**
     * Get the assignmentId property: The Id of the job assignment.
     *
     * @return the assignmentId value.
     */
    public String getAssignmentId() {
        return this.assignmentId;
    }

    /**
     * Set the assignmentId property: The Id of the job assignment.
     *
     * @param assignmentId the assignmentId value to set.
     * @return the RouterJobAssignment object itself.
     */
    public RouterJobAssignment setAssignmentId(String assignmentId) {
        this.assignmentId = assignmentId;
        return this;
    }

    /**
     * Get the workerId property: The Id of the Worker assigned to the job.
     *
     * @return the workerId value.
     */
    public String getWorkerId() {
        return this.workerId;
    }

    /**
     * Set the workerId property: The Id of the Worker assigned to the job.
     *
     * @param workerId the workerId value to set.
     * @return the RouterJobAssignment object itself.
     */
    public RouterJobAssignment setWorkerId(String workerId) {
        this.workerId = workerId;
        return this;
    }

    /**
     * Get the assignedAt property: The assignment time of the job in UTC.
     *
     * @return the assignedAt value.
     */
    public OffsetDateTime getAssignedAt() {
        return this.assignedAt;
    }

    /**
     * Set the assignedAt property: The assignment time of the job in UTC.
     *
     * @param assignedAt the assignedAt value to set.
     * @return the RouterJobAssignment object itself.
     */
    public RouterJobAssignment setAssignedAt(OffsetDateTime assignedAt) {
        this.assignedAt = assignedAt;
        return this;
    }

    /**
     * Get the completedAt property: The time the job was marked as completed after being assigned in UTC.
     *
     * @return the completedAt value.
     */
    public OffsetDateTime getCompletedAt() {
        return this.completedAt;
    }

    /**
     * Set the completedAt property: The time the job was marked as completed after being assigned in UTC.
     *
     * @param completedAt the completedAt value to set.
     * @return the RouterJobAssignment object itself.
     */
    public RouterJobAssignment setCompletedAt(OffsetDateTime completedAt) {
        this.completedAt = completedAt;
        return this;
    }

    /**
     * Get the closedAt property: The time the job was marked as closed after being completed in UTC.
     *
     * @return the closedAt value.
     */
    public OffsetDateTime getClosedAt() {
        return this.closedAt;
    }

    /**
     * Set the closedAt property: The time the job was marked as closed after being completed in UTC.
     *
     * @param closedAt the closedAt value to set.
     * @return the RouterJobAssignment object itself.
     */
    public RouterJobAssignment setClosedAt(OffsetDateTime closedAt) {
        this.closedAt = closedAt;
        return this;
    }
}