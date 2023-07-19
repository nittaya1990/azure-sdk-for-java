// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.managednetworkfabric.models.DestinationType;
import com.azure.resourcemanager.managednetworkfabric.models.Encapsulation;
import com.azure.resourcemanager.managednetworkfabric.models.IsolationDomainProperties;
import com.azure.resourcemanager.managednetworkfabric.models.NetworkTapPatchableParametersDestinationsItem;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class NetworkTapPatchableParametersDestinationsItemTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        NetworkTapPatchableParametersDestinationsItem model =
            BinaryData
                .fromString(
                    "{\"name\":\"dnuehxwltssjdywb\",\"destinationType\":\"Direct\",\"destinationId\":\"erxa\",\"isolationDomainProperties\":{\"encapsulation\":\"None\",\"neighborGroupIds\":[\"xc\",\"mpt\"]},\"destinationTapRuleId\":\"rm\"}")
                .toObject(NetworkTapPatchableParametersDestinationsItem.class);
        Assertions.assertEquals("dnuehxwltssjdywb", model.name());
        Assertions.assertEquals(DestinationType.DIRECT, model.destinationType());
        Assertions.assertEquals("erxa", model.destinationId());
        Assertions.assertEquals(Encapsulation.NONE, model.isolationDomainProperties().encapsulation());
        Assertions.assertEquals("xc", model.isolationDomainProperties().neighborGroupIds().get(0));
        Assertions.assertEquals("rm", model.destinationTapRuleId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        NetworkTapPatchableParametersDestinationsItem model =
            new NetworkTapPatchableParametersDestinationsItem()
                .withName("dnuehxwltssjdywb")
                .withDestinationType(DestinationType.DIRECT)
                .withDestinationId("erxa")
                .withIsolationDomainProperties(
                    new IsolationDomainProperties()
                        .withEncapsulation(Encapsulation.NONE)
                        .withNeighborGroupIds(Arrays.asList("xc", "mpt")))
                .withDestinationTapRuleId("rm");
        model = BinaryData.fromObject(model).toObject(NetworkTapPatchableParametersDestinationsItem.class);
        Assertions.assertEquals("dnuehxwltssjdywb", model.name());
        Assertions.assertEquals(DestinationType.DIRECT, model.destinationType());
        Assertions.assertEquals("erxa", model.destinationId());
        Assertions.assertEquals(Encapsulation.NONE, model.isolationDomainProperties().encapsulation());
        Assertions.assertEquals("xc", model.isolationDomainProperties().neighborGroupIds().get(0));
        Assertions.assertEquals("rm", model.destinationTapRuleId());
    }
}