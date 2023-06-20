// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managementgroups.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.managementgroups.fluent.models.HierarchySettingsInner;
import org.junit.jupiter.api.Assertions;

public final class HierarchySettingsInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        HierarchySettingsInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"tenantId\":\"vleggzfbuhfmvfax\",\"requireAuthorizationForGroupCreation\":true,\"defaultManagementGroup\":\"iith\"},\"id\":\"vmezy\",\"name\":\"shxmzsbbzoggigrx\",\"type\":\"burvjxxjnspy\"}")
                .toObject(HierarchySettingsInner.class);
        Assertions.assertEquals("vleggzfbuhfmvfax", model.tenantId());
        Assertions.assertEquals(true, model.requireAuthorizationForGroupCreation());
        Assertions.assertEquals("iith", model.defaultManagementGroup());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        HierarchySettingsInner model =
            new HierarchySettingsInner()
                .withTenantId("vleggzfbuhfmvfax")
                .withRequireAuthorizationForGroupCreation(true)
                .withDefaultManagementGroup("iith");
        model = BinaryData.fromObject(model).toObject(HierarchySettingsInner.class);
        Assertions.assertEquals("vleggzfbuhfmvfax", model.tenantId());
        Assertions.assertEquals(true, model.requireAuthorizationForGroupCreation());
        Assertions.assertEquals("iith", model.defaultManagementGroup());
    }
}