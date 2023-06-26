// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.generated;

import com.azure.core.util.Context;

/** Samples for ApiPortalCustomDomains Get. */
public final class ApiPortalCustomDomainsGetSamples {
    /*
     * x-ms-original-file: specification/appplatform/resource-manager/Microsoft.AppPlatform/stable/2022-12-01/examples/ApiPortalCustomDomains_Get.json
     */
    /**
     * Sample code: ApiPortalCustomDomains_Get.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void apiPortalCustomDomainsGet(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .springServices()
            .manager()
            .serviceClient()
            .getApiPortalCustomDomains()
            .getWithResponse("myResourceGroup", "myservice", "default", "myDomainName", Context.NONE);
    }
}