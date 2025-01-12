// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.purview.catalog;

import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.core.util.Context;
import com.azure.identity.DefaultAzureCredentialBuilder;

public class GlossaryListGlossaries {
    public static void main(String[] args) {
        GlossaryClient client =
                new PurviewCatalogClientBuilder()
                        .endpoint(System.getenv("ENDPOINT"))
                        .credential(new DefaultAzureCredentialBuilder().build())
                        .buildGlossaryClient();
        RequestOptions requestOptions = new RequestOptions();
        requestOptions.addQueryParam("limit", "1");
        requestOptions.addQueryParam("sort", "ASC");
        requestOptions.addQueryParam("offset", "0");
        Response<BinaryData> response = client.listGlossariesWithResponse(requestOptions, Context.NONE);
    }
}
