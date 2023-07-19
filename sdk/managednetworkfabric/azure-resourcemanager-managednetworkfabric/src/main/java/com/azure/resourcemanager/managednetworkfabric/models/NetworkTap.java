// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.models;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.managednetworkfabric.fluent.models.NetworkTapInner;
import java.util.List;
import java.util.Map;

/** An immutable client-side representation of NetworkTap. */
public interface NetworkTap {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the location property: The geo-location where the resource lives.
     *
     * @return the location value.
     */
    String location();

    /**
     * Gets the tags property: Resource tags.
     *
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the networkPacketBrokerId property: ARM resource ID of the Network Packet Broker.
     *
     * @return the networkPacketBrokerId value.
     */
    String networkPacketBrokerId();

    /**
     * Gets the sourceTapRuleId property: Source Tap Rule Id. ARM Resource ID of the Network Tap Rule.
     *
     * @return the sourceTapRuleId value.
     */
    String sourceTapRuleId();

    /**
     * Gets the destinations property: List of destinations to send the filter traffic.
     *
     * @return the destinations value.
     */
    List<NetworkTapPropertiesDestinationsItem> destinations();

    /**
     * Gets the pollingType property: Polling type.
     *
     * @return the pollingType value.
     */
    PollingType pollingType();

    /**
     * Gets the configurationState property: Gets the configurations state of the resource.
     *
     * @return the configurationState value.
     */
    ConfigurationState configurationState();

    /**
     * Gets the provisioningState property: Provides you the latest status of the NFC service, whether it is Accepted,
     * updating, Succeeded or Failed. During this process, the states keep changing based on the status of Network Tap
     * provisioning.
     *
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the administrativeState property: Administrative state of the resource. Example -Enabled/Disabled.
     *
     * @return the administrativeState value.
     */
    AdministrativeState administrativeState();

    /**
     * Gets the annotation property: Switch configuration description.
     *
     * @return the annotation value.
     */
    String annotation();

    /**
     * Gets the region of the resource.
     *
     * @return the region of the resource.
     */
    Region region();

    /**
     * Gets the name of the resource region.
     *
     * @return the name of the resource region.
     */
    String regionName();

    /**
     * Gets the name of the resource group.
     *
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.managednetworkfabric.fluent.models.NetworkTapInner object.
     *
     * @return the inner object.
     */
    NetworkTapInner innerModel();

    /** The entirety of the NetworkTap definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithResourceGroup,
            DefinitionStages.WithNetworkPacketBrokerId,
            DefinitionStages.WithDestinations,
            DefinitionStages.WithCreate {
    }

    /** The NetworkTap definition stages. */
    interface DefinitionStages {
        /** The first stage of the NetworkTap definition. */
        interface Blank extends WithLocation {
        }

        /** The stage of the NetworkTap definition allowing to specify location. */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(Region location);

            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(String location);
        }

        /** The stage of the NetworkTap definition allowing to specify parent resource. */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             *
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @return the next definition stage.
             */
            WithNetworkPacketBrokerId withExistingResourceGroup(String resourceGroupName);
        }

        /** The stage of the NetworkTap definition allowing to specify networkPacketBrokerId. */
        interface WithNetworkPacketBrokerId {
            /**
             * Specifies the networkPacketBrokerId property: ARM resource ID of the Network Packet Broker..
             *
             * @param networkPacketBrokerId ARM resource ID of the Network Packet Broker.
             * @return the next definition stage.
             */
            WithDestinations withNetworkPacketBrokerId(String networkPacketBrokerId);
        }

        /** The stage of the NetworkTap definition allowing to specify destinations. */
        interface WithDestinations {
            /**
             * Specifies the destinations property: List of destinations to send the filter traffic..
             *
             * @param destinations List of destinations to send the filter traffic.
             * @return the next definition stage.
             */
            WithCreate withDestinations(List<NetworkTapPropertiesDestinationsItem> destinations);
        }

        /**
         * The stage of the NetworkTap definition which contains all the minimum required properties for the resource to
         * be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags, DefinitionStages.WithPollingType, DefinitionStages.WithAnnotation {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            NetworkTap create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            NetworkTap create(Context context);
        }

        /** The stage of the NetworkTap definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }

        /** The stage of the NetworkTap definition allowing to specify pollingType. */
        interface WithPollingType {
            /**
             * Specifies the pollingType property: Polling type..
             *
             * @param pollingType Polling type.
             * @return the next definition stage.
             */
            WithCreate withPollingType(PollingType pollingType);
        }

        /** The stage of the NetworkTap definition allowing to specify annotation. */
        interface WithAnnotation {
            /**
             * Specifies the annotation property: Switch configuration description..
             *
             * @param annotation Switch configuration description.
             * @return the next definition stage.
             */
            WithCreate withAnnotation(String annotation);
        }
    }

    /**
     * Begins update for the NetworkTap resource.
     *
     * @return the stage of resource update.
     */
    NetworkTap.Update update();

    /** The template for NetworkTap update. */
    interface Update
        extends UpdateStages.WithTags,
            UpdateStages.WithPollingType,
            UpdateStages.WithDestinations,
            UpdateStages.WithAnnotation {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        NetworkTap apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        NetworkTap apply(Context context);
    }

    /** The NetworkTap update stages. */
    interface UpdateStages {
        /** The stage of the NetworkTap update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags.
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }

        /** The stage of the NetworkTap update allowing to specify pollingType. */
        interface WithPollingType {
            /**
             * Specifies the pollingType property: Polling type..
             *
             * @param pollingType Polling type.
             * @return the next definition stage.
             */
            Update withPollingType(PollingType pollingType);
        }

        /** The stage of the NetworkTap update allowing to specify destinations. */
        interface WithDestinations {
            /**
             * Specifies the destinations property: List of destination properties to send the filter traffic..
             *
             * @param destinations List of destination properties to send the filter traffic.
             * @return the next definition stage.
             */
            Update withDestinationsForUpdate(List<NetworkTapPatchableParametersDestinationsItem> destinations);
        }

        /** The stage of the NetworkTap update allowing to specify annotation. */
        interface WithAnnotation {
            /**
             * Specifies the annotation property: Switch configuration description..
             *
             * @param annotation Switch configuration description.
             * @return the next definition stage.
             */
            Update withAnnotation(String annotation);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    NetworkTap refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    NetworkTap refresh(Context context);

    /**
     * Updates administrative state of Network Tap.
     *
     * <p>Implements the operation to the underlying resources.
     *
     * @param body Request payload.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response for device updates.
     */
    CommonPostActionResponseForDeviceUpdate updateAdministrativeState(UpdateAdministrativeState body);

    /**
     * Updates administrative state of Network Tap.
     *
     * <p>Implements the operation to the underlying resources.
     *
     * @param body Request payload.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response for device updates.
     */
    CommonPostActionResponseForDeviceUpdate updateAdministrativeState(UpdateAdministrativeState body, Context context);

    /**
     * Resync operation on the Network Tap.
     *
     * <p>Implements the operation to the underlying resources.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response for the state updates.
     */
    CommonPostActionResponseForStateUpdate resync();

    /**
     * Resync operation on the Network Tap.
     *
     * <p>Implements the operation to the underlying resources.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return common response for the state updates.
     */
    CommonPostActionResponseForStateUpdate resync(Context context);
}