// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.dataprotection.models.DppIdentityDetails;
import com.azure.resourcemanager.dataprotection.models.DppTrackedResource;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class DppTrackedResourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DppTrackedResource model =
            BinaryData
                .fromString(
                    "{\"identity\":{\"principalId\":\"bljofxqeof\",\"tenantId\":\"e\",\"type\":\"hqjbasvmsmj\"},\"eTag\":\"lngsntnbybkzgcwr\",\"location\":\"lxxwrljdouskc\",\"tags\":{\"tnhxbn\":\"ocrcjdk\",\"gls\":\"biksq\",\"pee\":\"ainqpjwnzlljfm\",\"yqduujit\":\"vmgxsab\"},\"id\":\"jczdzevndh\",\"name\":\"rwpdappdsbdkvwrw\",\"type\":\"feusnhut\"}")
                .toObject(DppTrackedResource.class);
        Assertions.assertEquals("lxxwrljdouskc", model.location());
        Assertions.assertEquals("ocrcjdk", model.tags().get("tnhxbn"));
        Assertions.assertEquals("lngsntnbybkzgcwr", model.etag());
        Assertions.assertEquals("hqjbasvmsmj", model.identity().type());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DppTrackedResource model =
            new DppTrackedResource()
                .withLocation("lxxwrljdouskc")
                .withTags(mapOf("tnhxbn", "ocrcjdk", "gls", "biksq", "pee", "ainqpjwnzlljfm", "yqduujit", "vmgxsab"))
                .withEtag("lngsntnbybkzgcwr")
                .withIdentity(new DppIdentityDetails().withType("hqjbasvmsmj"));
        model = BinaryData.fromObject(model).toObject(DppTrackedResource.class);
        Assertions.assertEquals("lxxwrljdouskc", model.location());
        Assertions.assertEquals("ocrcjdk", model.tags().get("tnhxbn"));
        Assertions.assertEquals("lngsntnbybkzgcwr", model.etag());
        Assertions.assertEquals("hqjbasvmsmj", model.identity().type());
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