// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.managednetworkfabric.models.L2IsolationDomainPatch;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class L2IsolationDomainPatchTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        L2IsolationDomainPatch model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"mtu\":720121920,\"annotation\":\"whzlsicohoq\"},\"tags\":{\"gyxzk\":\"vlryavwhheunmmq\"}}")
                .toObject(L2IsolationDomainPatch.class);
        Assertions.assertEquals("vlryavwhheunmmq", model.tags().get("gyxzk"));
        Assertions.assertEquals(720121920, model.mtu());
        Assertions.assertEquals("whzlsicohoq", model.annotation());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        L2IsolationDomainPatch model =
            new L2IsolationDomainPatch()
                .withTags(mapOf("gyxzk", "vlryavwhheunmmq"))
                .withMtu(720121920)
                .withAnnotation("whzlsicohoq");
        model = BinaryData.fromObject(model).toObject(L2IsolationDomainPatch.class);
        Assertions.assertEquals("vlryavwhheunmmq", model.tags().get("gyxzk"));
        Assertions.assertEquals(720121920, model.mtu());
        Assertions.assertEquals("whzlsicohoq", model.annotation());
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