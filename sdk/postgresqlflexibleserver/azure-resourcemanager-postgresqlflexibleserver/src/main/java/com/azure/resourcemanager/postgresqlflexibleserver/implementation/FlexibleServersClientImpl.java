// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.postgresqlflexibleserver.fluent.FlexibleServersClient;
import com.azure.resourcemanager.postgresqlflexibleserver.fluent.models.LtrBackupResponseInner;
import com.azure.resourcemanager.postgresqlflexibleserver.fluent.models.LtrPreBackupResponseInner;
import com.azure.resourcemanager.postgresqlflexibleserver.models.FlexibleServersTriggerLtrPreBackupResponse;
import com.azure.resourcemanager.postgresqlflexibleserver.models.LtrBackupRequest;
import com.azure.resourcemanager.postgresqlflexibleserver.models.LtrPreBackupRequest;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in FlexibleServersClient. */
public final class FlexibleServersClientImpl implements FlexibleServersClient {
    /** The proxy service used to perform REST calls. */
    private final FlexibleServersService service;

    /** The service client containing this operation class. */
    private final PostgreSqlManagementClientImpl client;

    /**
     * Initializes an instance of FlexibleServersClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    FlexibleServersClientImpl(PostgreSqlManagementClientImpl client) {
        this.service =
            RestProxy.create(FlexibleServersService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for PostgreSqlManagementClientFlexibleServers to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "PostgreSqlManagement")
    public interface FlexibleServersService {
        @Headers({"Content-Type: application/json"})
        @Post(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DBforPostgreSQL/flexibleServers/{serverName}/ltrPreBackup")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<FlexibleServersTriggerLtrPreBackupResponse> triggerLtrPreBackup(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("serverName") String serverName,
            @BodyParam("application/json") LtrPreBackupRequest parameters,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Post(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DBforPostgreSQL/flexibleServers/{serverName}/startLtrBackup")
        @ExpectedResponses({200, 202})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<Flux<ByteBuffer>>> startLtrBackup(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("serverName") String serverName,
            @BodyParam("application/json") LtrBackupRequest parameters,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * PreBackup operation performs all the checks that are needed for the subsequent long term retention backup
     * operation to succeed.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param parameters Request body for operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for the LTR pre-backup API call on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<FlexibleServersTriggerLtrPreBackupResponse> triggerLtrPreBackupWithResponseAsync(
        String resourceGroupName, String serverName, LtrPreBackupRequest parameters) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (serverName == null) {
            return Mono.error(new IllegalArgumentException("Parameter serverName is required and cannot be null."));
        }
        if (parameters == null) {
            return Mono.error(new IllegalArgumentException("Parameter parameters is required and cannot be null."));
        } else {
            parameters.validate();
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .triggerLtrPreBackup(
                            this.client.getEndpoint(),
                            this.client.getApiVersion(),
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            serverName,
                            parameters,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * PreBackup operation performs all the checks that are needed for the subsequent long term retention backup
     * operation to succeed.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param parameters Request body for operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for the LTR pre-backup API call on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<FlexibleServersTriggerLtrPreBackupResponse> triggerLtrPreBackupWithResponseAsync(
        String resourceGroupName, String serverName, LtrPreBackupRequest parameters, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (serverName == null) {
            return Mono.error(new IllegalArgumentException("Parameter serverName is required and cannot be null."));
        }
        if (parameters == null) {
            return Mono.error(new IllegalArgumentException("Parameter parameters is required and cannot be null."));
        } else {
            parameters.validate();
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .triggerLtrPreBackup(
                this.client.getEndpoint(),
                this.client.getApiVersion(),
                this.client.getSubscriptionId(),
                resourceGroupName,
                serverName,
                parameters,
                accept,
                context);
    }

    /**
     * PreBackup operation performs all the checks that are needed for the subsequent long term retention backup
     * operation to succeed.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param parameters Request body for operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for the LTR pre-backup API call on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<LtrPreBackupResponseInner> triggerLtrPreBackupAsync(
        String resourceGroupName, String serverName, LtrPreBackupRequest parameters) {
        return triggerLtrPreBackupWithResponseAsync(resourceGroupName, serverName, parameters)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * PreBackup operation performs all the checks that are needed for the subsequent long term retention backup
     * operation to succeed.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param parameters Request body for operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for the LTR pre-backup API call.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public FlexibleServersTriggerLtrPreBackupResponse triggerLtrPreBackupWithResponse(
        String resourceGroupName, String serverName, LtrPreBackupRequest parameters, Context context) {
        return triggerLtrPreBackupWithResponseAsync(resourceGroupName, serverName, parameters, context).block();
    }

    /**
     * PreBackup operation performs all the checks that are needed for the subsequent long term retention backup
     * operation to succeed.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param parameters Request body for operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for the LTR pre-backup API call.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public LtrPreBackupResponseInner triggerLtrPreBackup(
        String resourceGroupName, String serverName, LtrPreBackupRequest parameters) {
        return triggerLtrPreBackupWithResponse(resourceGroupName, serverName, parameters, Context.NONE).getValue();
    }

    /**
     * Start the Long Term Retention Backup operation.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param parameters Request body for operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for the LTR backup API call along with {@link Response} on successful completion of {@link
     *     Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Flux<ByteBuffer>>> startLtrBackupWithResponseAsync(
        String resourceGroupName, String serverName, LtrBackupRequest parameters) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (serverName == null) {
            return Mono.error(new IllegalArgumentException("Parameter serverName is required and cannot be null."));
        }
        if (parameters == null) {
            return Mono.error(new IllegalArgumentException("Parameter parameters is required and cannot be null."));
        } else {
            parameters.validate();
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .startLtrBackup(
                            this.client.getEndpoint(),
                            this.client.getApiVersion(),
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            serverName,
                            parameters,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Start the Long Term Retention Backup operation.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param parameters Request body for operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for the LTR backup API call along with {@link Response} on successful completion of {@link
     *     Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Flux<ByteBuffer>>> startLtrBackupWithResponseAsync(
        String resourceGroupName, String serverName, LtrBackupRequest parameters, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (serverName == null) {
            return Mono.error(new IllegalArgumentException("Parameter serverName is required and cannot be null."));
        }
        if (parameters == null) {
            return Mono.error(new IllegalArgumentException("Parameter parameters is required and cannot be null."));
        } else {
            parameters.validate();
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .startLtrBackup(
                this.client.getEndpoint(),
                this.client.getApiVersion(),
                this.client.getSubscriptionId(),
                resourceGroupName,
                serverName,
                parameters,
                accept,
                context);
    }

    /**
     * Start the Long Term Retention Backup operation.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param parameters Request body for operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of response for the LTR backup API call.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public PollerFlux<PollResult<LtrBackupResponseInner>, LtrBackupResponseInner> beginStartLtrBackupAsync(
        String resourceGroupName, String serverName, LtrBackupRequest parameters) {
        Mono<Response<Flux<ByteBuffer>>> mono =
            startLtrBackupWithResponseAsync(resourceGroupName, serverName, parameters);
        return this
            .client
            .<LtrBackupResponseInner, LtrBackupResponseInner>getLroResult(
                mono,
                this.client.getHttpPipeline(),
                LtrBackupResponseInner.class,
                LtrBackupResponseInner.class,
                this.client.getContext());
    }

    /**
     * Start the Long Term Retention Backup operation.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param parameters Request body for operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of response for the LTR backup API call.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    private PollerFlux<PollResult<LtrBackupResponseInner>, LtrBackupResponseInner> beginStartLtrBackupAsync(
        String resourceGroupName, String serverName, LtrBackupRequest parameters, Context context) {
        context = this.client.mergeContext(context);
        Mono<Response<Flux<ByteBuffer>>> mono =
            startLtrBackupWithResponseAsync(resourceGroupName, serverName, parameters, context);
        return this
            .client
            .<LtrBackupResponseInner, LtrBackupResponseInner>getLroResult(
                mono,
                this.client.getHttpPipeline(),
                LtrBackupResponseInner.class,
                LtrBackupResponseInner.class,
                context);
    }

    /**
     * Start the Long Term Retention Backup operation.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param parameters Request body for operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of response for the LTR backup API call.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public SyncPoller<PollResult<LtrBackupResponseInner>, LtrBackupResponseInner> beginStartLtrBackup(
        String resourceGroupName, String serverName, LtrBackupRequest parameters) {
        return this.beginStartLtrBackupAsync(resourceGroupName, serverName, parameters).getSyncPoller();
    }

    /**
     * Start the Long Term Retention Backup operation.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param parameters Request body for operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of response for the LTR backup API call.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public SyncPoller<PollResult<LtrBackupResponseInner>, LtrBackupResponseInner> beginStartLtrBackup(
        String resourceGroupName, String serverName, LtrBackupRequest parameters, Context context) {
        return this.beginStartLtrBackupAsync(resourceGroupName, serverName, parameters, context).getSyncPoller();
    }

    /**
     * Start the Long Term Retention Backup operation.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param parameters Request body for operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for the LTR backup API call on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<LtrBackupResponseInner> startLtrBackupAsync(
        String resourceGroupName, String serverName, LtrBackupRequest parameters) {
        return beginStartLtrBackupAsync(resourceGroupName, serverName, parameters)
            .last()
            .flatMap(this.client::getLroFinalResultOrError);
    }

    /**
     * Start the Long Term Retention Backup operation.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param parameters Request body for operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for the LTR backup API call on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<LtrBackupResponseInner> startLtrBackupAsync(
        String resourceGroupName, String serverName, LtrBackupRequest parameters, Context context) {
        return beginStartLtrBackupAsync(resourceGroupName, serverName, parameters, context)
            .last()
            .flatMap(this.client::getLroFinalResultOrError);
    }

    /**
     * Start the Long Term Retention Backup operation.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param parameters Request body for operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for the LTR backup API call.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public LtrBackupResponseInner startLtrBackup(
        String resourceGroupName, String serverName, LtrBackupRequest parameters) {
        return startLtrBackupAsync(resourceGroupName, serverName, parameters).block();
    }

    /**
     * Start the Long Term Retention Backup operation.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param parameters Request body for operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for the LTR backup API call.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public LtrBackupResponseInner startLtrBackup(
        String resourceGroupName, String serverName, LtrBackupRequest parameters, Context context) {
        return startLtrBackupAsync(resourceGroupName, serverName, parameters, context).block();
    }
}