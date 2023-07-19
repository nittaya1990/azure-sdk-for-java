// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.managednetworkfabric.models.OptionBLayer3Configuration;
import org.junit.jupiter.api.Assertions;

public final class OptionBLayer3ConfigurationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OptionBLayer3Configuration model =
            BinaryData
                .fromString(
                    "{\"peerASN\":8546706426959520217,\"vlanId\":105550555,\"fabricASN\":9182440334932785567,\"primaryIpv4Prefix\":\"zpvxak\",\"primaryIpv6Prefix\":\"hpsesrf\",\"secondaryIpv4Prefix\":\"mqiydvxcgdh\",\"secondaryIpv6Prefix\":\"goqg\"}")
                .toObject(OptionBLayer3Configuration.class);
        Assertions.assertEquals("zpvxak", model.primaryIpv4Prefix());
        Assertions.assertEquals("hpsesrf", model.primaryIpv6Prefix());
        Assertions.assertEquals("mqiydvxcgdh", model.secondaryIpv4Prefix());
        Assertions.assertEquals("goqg", model.secondaryIpv6Prefix());
        Assertions.assertEquals(8546706426959520217L, model.peerAsn());
        Assertions.assertEquals(105550555, model.vlanId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        OptionBLayer3Configuration model =
            new OptionBLayer3Configuration()
                .withPrimaryIpv4Prefix("zpvxak")
                .withPrimaryIpv6Prefix("hpsesrf")
                .withSecondaryIpv4Prefix("mqiydvxcgdh")
                .withSecondaryIpv6Prefix("goqg")
                .withPeerAsn(8546706426959520217L)
                .withVlanId(105550555);
        model = BinaryData.fromObject(model).toObject(OptionBLayer3Configuration.class);
        Assertions.assertEquals("zpvxak", model.primaryIpv4Prefix());
        Assertions.assertEquals("hpsesrf", model.primaryIpv6Prefix());
        Assertions.assertEquals("mqiydvxcgdh", model.secondaryIpv4Prefix());
        Assertions.assertEquals("goqg", model.secondaryIpv6Prefix());
        Assertions.assertEquals(8546706426959520217L, model.peerAsn());
        Assertions.assertEquals(105550555, model.vlanId());
    }
}