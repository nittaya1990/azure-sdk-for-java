// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.networkcloud.fluent.models.KubernetesClusterInner;
import com.azure.resourcemanager.networkcloud.models.ExtendedLocation;
import com.azure.resourcemanager.networkcloud.models.KubernetesClusterList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class KubernetesClusterListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        KubernetesClusterList model =
            BinaryData
                .fromString(
                    "{\"nextLink\":\"gylgqgitxmedjvcs\",\"value\":[{\"extendedLocation\":{\"name\":\"qwwncw\",\"type\":\"zhxgktrmgucn\"},\"properties\":{\"attachedNetworkIds\":[],\"availableUpgrades\":[],\"clusterId\":\"ellwptfdy\",\"connectedClusterId\":\"fqbuaceopzf\",\"controlPlaneKubernetesVersion\":\"hhuao\",\"detailedStatus\":\"Error\",\"detailedStatusMessage\":\"qeqxo\",\"featureStatuses\":[],\"initialAgentPoolConfigurations\":[],\"kubernetesVersion\":\"dahzxctobg\",\"nodes\":[],\"provisioningState\":\"Deleting\"},\"location\":\"zpostmgrcfbu\",\"tags\":{\"xxjyngudivkrtsw\":\"fqjhhkxbpvjymj\",\"vjfdx\":\"xqzvszjfa\",\"qtdo\":\"ivetvtcq\"},\"id\":\"mcbxvwvxysl\",\"name\":\"bhsfxob\",\"type\":\"ytkblmpew\"}]}")
                .toObject(KubernetesClusterList.class);
        Assertions.assertEquals("gylgqgitxmedjvcs", model.nextLink());
        Assertions.assertEquals("zpostmgrcfbu", model.value().get(0).location());
        Assertions.assertEquals("fqjhhkxbpvjymj", model.value().get(0).tags().get("xxjyngudivkrtsw"));
        Assertions.assertEquals("qwwncw", model.value().get(0).extendedLocation().name());
        Assertions.assertEquals("zhxgktrmgucn", model.value().get(0).extendedLocation().type());
        Assertions.assertEquals("dahzxctobg", model.value().get(0).kubernetesVersion());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        KubernetesClusterList model =
            new KubernetesClusterList()
                .withNextLink("gylgqgitxmedjvcs")
                .withValue(
                    Arrays
                        .asList(
                            new KubernetesClusterInner()
                                .withLocation("zpostmgrcfbu")
                                .withTags(
                                    mapOf(
                                        "xxjyngudivkrtsw", "fqjhhkxbpvjymj", "vjfdx", "xqzvszjfa", "qtdo", "ivetvtcq"))
                                .withExtendedLocation(
                                    new ExtendedLocation().withName("qwwncw").withType("zhxgktrmgucn"))
                                .withInitialAgentPoolConfigurations(Arrays.asList())
                                .withKubernetesVersion("dahzxctobg")));
        model = BinaryData.fromObject(model).toObject(KubernetesClusterList.class);
        Assertions.assertEquals("gylgqgitxmedjvcs", model.nextLink());
        Assertions.assertEquals("zpostmgrcfbu", model.value().get(0).location());
        Assertions.assertEquals("fqjhhkxbpvjymj", model.value().get(0).tags().get("xxjyngudivkrtsw"));
        Assertions.assertEquals("qwwncw", model.value().get(0).extendedLocation().name());
        Assertions.assertEquals("zhxgktrmgucn", model.value().get(0).extendedLocation().type());
        Assertions.assertEquals("dahzxctobg", model.value().get(0).kubernetesVersion());
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