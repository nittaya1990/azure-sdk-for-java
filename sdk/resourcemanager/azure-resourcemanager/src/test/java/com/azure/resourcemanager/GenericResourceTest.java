// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.resourcemanager;

import com.azure.core.credential.TokenCredential;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.http.policy.HttpPipelinePolicy;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.management.Region;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.resources.fluentcore.utils.HttpPipelineProvider;
import com.azure.resourcemanager.resources.fluentcore.utils.ResourceManagerUtils;
import com.azure.resourcemanager.resources.models.GenericResource;
import com.azure.resourcemanager.sql.models.SqlElasticPool;
import com.azure.resourcemanager.sql.models.SqlServer;
import com.azure.resourcemanager.test.ResourceManagerTestBase;
import com.azure.resourcemanager.test.utils.TestDelayProvider;
import com.azure.resourcemanager.test.utils.TestIdentifierProvider;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.temporal.ChronoUnit;
import java.util.List;

public class GenericResourceTest extends ResourceManagerTestBase {

    private AzureResourceManager azureResourceManager;

    protected String rgName = "";
    protected final Region region = Region.US_EAST;

    @Override
    protected HttpPipeline buildHttpPipeline(
        TokenCredential credential,
        AzureProfile profile,
        HttpLogOptions httpLogOptions,
        List<HttpPipelinePolicy> policies,
        HttpClient httpClient) {
        return HttpPipelineProvider.buildHttpPipeline(
            credential,
            profile,
            null,
            httpLogOptions,
            null,
            new RetryPolicy("Retry-After", ChronoUnit.SECONDS),
            policies,
            httpClient);
    }

    @Override
    protected void initializeClients(HttpPipeline httpPipeline, AzureProfile profile) {
        ResourceManagerUtils.InternalRuntimeContext.setDelayProvider(new TestDelayProvider(!isPlaybackMode()));
        ResourceManagerUtils.InternalRuntimeContext internalContext = new ResourceManagerUtils.InternalRuntimeContext();
        internalContext.setIdentifierFunction(name -> new TestIdentifierProvider(testResourceNamer));
        azureResourceManager = buildManager(AzureResourceManager.class, httpPipeline, profile);
        setInternalContext(internalContext, azureResourceManager);

        rgName = generateRandomResourceName("javacsmrg", 15);
    }

    @Override
    protected void cleanUpResources() {
        try {
            azureResourceManager.resourceGroups().beginDeleteByName(rgName);
        } catch (Exception e) {
        }
    }

    @Test
    public void testResourceWithSpaceInName() {
        SqlElasticPool elasticPool = ensureElasticPoolWithSpace();
        String poolId = elasticPool.id();
        String poolName = elasticPool.name();

        GenericResource pool = azureResourceManager.genericResources().getById(poolId);
        Assertions.assertNotNull(pool);
        Assertions.assertEquals(poolName, pool.name());

        pool = pool.refresh();
        Assertions.assertEquals(poolName, pool.name());

        pool.update()
            .withTag("keyInSpaceTest", "value")
            .apply();
        Assertions.assertEquals(poolName, pool.name());
        Assertions.assertTrue(pool.tags().containsKey("keyInSpaceTest"));

        // status code 405
//        Assertions.assertTrue(azureResourceManager.genericResources().checkExistenceById(poolId));

        azureResourceManager.genericResources().deleteById(poolId);
    }

    private SqlElasticPool ensureElasticPoolWithSpace() {
        String sqlServerName = generateRandomResourceName("JMonitorSql-", 18);

        SqlServer sqlServer = azureResourceManager
            .sqlServers()
            .define(sqlServerName)
            .withRegion(region)
            .withNewResourceGroup(rgName)
            .withAdministratorLogin("admin123")
            .withAdministratorPassword(password())
            .create();

        // white space in pool name
        SqlElasticPool pool = sqlServer.elasticPools()
            .define("name with space")
            .withBasicPool()
            .create();
        return pool;
    }
}