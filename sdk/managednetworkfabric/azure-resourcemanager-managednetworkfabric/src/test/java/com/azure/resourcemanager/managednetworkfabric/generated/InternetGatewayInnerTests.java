// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.managednetworkfabric.fluent.models.InternetGatewayInner;
import com.azure.resourcemanager.managednetworkfabric.models.GatewayType;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class InternetGatewayInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        InternetGatewayInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"ipv4Address\":\"spkxkdt\",\"port\":908846418,\"type\":\"Workload\",\"networkFabricControllerId\":\"dlqvtwknvg\",\"provisioningState\":\"Accepted\",\"internetGatewayRuleId\":\"gtywatmqaqkue\",\"annotation\":\"groeshoyg\"},\"location\":\"byfqxkfaoy\",\"tags\":{\"mtdwcky\":\"qpuvjmv\"},\"id\":\"roejnndl\",\"name\":\"djus\",\"type\":\"br\"}")
                .toObject(InternetGatewayInner.class);
        Assertions.assertEquals("byfqxkfaoy", model.location());
        Assertions.assertEquals("qpuvjmv", model.tags().get("mtdwcky"));
        Assertions.assertEquals(GatewayType.WORKLOAD, model.typePropertiesType());
        Assertions.assertEquals("dlqvtwknvg", model.networkFabricControllerId());
        Assertions.assertEquals("gtywatmqaqkue", model.internetGatewayRuleId());
        Assertions.assertEquals("groeshoyg", model.annotation());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        InternetGatewayInner model =
            new InternetGatewayInner()
                .withLocation("byfqxkfaoy")
                .withTags(mapOf("mtdwcky", "qpuvjmv"))
                .withTypePropertiesType(GatewayType.WORKLOAD)
                .withNetworkFabricControllerId("dlqvtwknvg")
                .withInternetGatewayRuleId("gtywatmqaqkue")
                .withAnnotation("groeshoyg");
        model = BinaryData.fromObject(model).toObject(InternetGatewayInner.class);
        Assertions.assertEquals("byfqxkfaoy", model.location());
        Assertions.assertEquals("qpuvjmv", model.tags().get("mtdwcky"));
        Assertions.assertEquals(GatewayType.WORKLOAD, model.typePropertiesType());
        Assertions.assertEquals("dlqvtwknvg", model.networkFabricControllerId());
        Assertions.assertEquals("gtywatmqaqkue", model.internetGatewayRuleId());
        Assertions.assertEquals("groeshoyg", model.annotation());
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}