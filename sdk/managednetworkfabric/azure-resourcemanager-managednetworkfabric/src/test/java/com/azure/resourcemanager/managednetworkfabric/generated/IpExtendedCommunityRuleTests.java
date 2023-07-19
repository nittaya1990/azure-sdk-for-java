// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.managednetworkfabric.models.CommunityActionTypes;
import com.azure.resourcemanager.managednetworkfabric.models.IpExtendedCommunityRule;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class IpExtendedCommunityRuleTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        IpExtendedCommunityRule model =
            BinaryData
                .fromString(
                    "{\"action\":\"Permit\",\"sequenceNumber\":411122355974604115,\"routeTargets\":[\"v\",\"hctmmkosz\",\"dblnsntrp\"]}")
                .toObject(IpExtendedCommunityRule.class);
        Assertions.assertEquals(CommunityActionTypes.PERMIT, model.action());
        Assertions.assertEquals(411122355974604115L, model.sequenceNumber());
        Assertions.assertEquals("v", model.routeTargets().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        IpExtendedCommunityRule model =
            new IpExtendedCommunityRule()
                .withAction(CommunityActionTypes.PERMIT)
                .withSequenceNumber(411122355974604115L)
                .withRouteTargets(Arrays.asList("v", "hctmmkosz", "dblnsntrp"));
        model = BinaryData.fromObject(model).toObject(IpExtendedCommunityRule.class);
        Assertions.assertEquals(CommunityActionTypes.PERMIT, model.action());
        Assertions.assertEquals(411122355974604115L, model.sequenceNumber());
        Assertions.assertEquals("v", model.routeTargets().get(0));
    }
}