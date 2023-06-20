// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managementgroups.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.managementgroups.fluent.models.ManagementGroupInfoInner;
import com.azure.resourcemanager.managementgroups.models.ManagementGroupListResult;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ManagementGroupListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ManagementGroupListResult model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"id\":\"quvgjxpybczme\",\"type\":\"tzopbsphrupidgsy\",\"name\":\"ejhphoyc\",\"properties\":{\"tenantId\":\"ao\",\"displayName\":\"dxbmtqioq\"}},{\"id\":\"ehtbm\",\"type\":\"p\",\"name\":\"noi\",\"properties\":{\"tenantId\":\"lrxybqsoq\",\"displayName\":\"gkdmb\"}},{\"id\":\"zlobcufpd\",\"type\":\"rbt\",\"name\":\"qjnqglhqgnufoooj\",\"properties\":{\"tenantId\":\"fsqesaagdfmglzlh\",\"displayName\":\"rifkwm\"}}],\"@nextLink\":\"ktsizntocipaou\"}")
                .toObject(ManagementGroupListResult.class);
        Assertions.assertEquals("ao", model.value().get(0).tenantId());
        Assertions.assertEquals("dxbmtqioq", model.value().get(0).displayName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ManagementGroupListResult model =
            new ManagementGroupListResult()
                .withValue(
                    Arrays
                        .asList(
                            new ManagementGroupInfoInner().withTenantId("ao").withDisplayName("dxbmtqioq"),
                            new ManagementGroupInfoInner().withTenantId("lrxybqsoq").withDisplayName("gkdmb"),
                            new ManagementGroupInfoInner().withTenantId("fsqesaagdfmglzlh").withDisplayName("rifkwm")));
        model = BinaryData.fromObject(model).toObject(ManagementGroupListResult.class);
        Assertions.assertEquals("ao", model.value().get(0).tenantId());
        Assertions.assertEquals("dxbmtqioq", model.value().get(0).displayName());
    }
}