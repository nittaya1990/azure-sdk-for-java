// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.generated;

/** Samples for NetworkTaps Delete. */
public final class NetworkTapsDeleteSamples {
    /*
     * x-ms-original-file: specification/managednetworkfabric/resource-manager/Microsoft.ManagedNetworkFabric/stable/2023-06-15/examples/NetworkTaps_Delete_MaximumSet_Gen.json
     */
    /**
     * Sample code: NetworkTaps_Delete_MaximumSet_Gen.
     *
     * @param manager Entry point to ManagedNetworkFabricManager.
     */
    public static void networkTapsDeleteMaximumSetGen(
        com.azure.resourcemanager.managednetworkfabric.ManagedNetworkFabricManager manager) {
        manager.networkTaps().delete("example-rg", "example-networkTap", com.azure.core.util.Context.NONE);
    }
}