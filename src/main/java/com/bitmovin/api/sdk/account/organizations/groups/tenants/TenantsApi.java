package com.bitmovin.api.sdk.account.organizations.groups.tenants;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import feign.Param;
import feign.QueryMap;
import feign.RequestLine;
import feign.Body;
import feign.Headers;

import com.bitmovin.api.sdk.model.*;
import com.bitmovin.api.sdk.common.BitmovinException;
import com.bitmovin.api.sdk.common.BitmovinDateExpander;
import com.bitmovin.api.sdk.common.BitmovinApiBuilder;
import com.bitmovin.api.sdk.common.BitmovinApiClientFactory;

public class TenantsApi {

    private final TenantsApiClient apiClient;

    public TenantsApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(TenantsApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of TenantsApi
     */
    public static BitmovinApiBuilder<TenantsApi> builder() {
        return new BitmovinApiBuilder<>(TenantsApi.class);
    }
    
    /**
     * Add Tenant to Group
     * 
     * @param organizationId Id of the organization (required)
     * @param groupId Id of the group (required)
     * @param tenant Tenant details (optional)
     * @return Tenant
     * @throws BitmovinException if fails to make API call
     */
    public Tenant create(String organizationId, String groupId, Tenant tenant) throws BitmovinException {
        return this.apiClient.create(organizationId, groupId, tenant).getData().getResult();
    }
    
    /**
     * Delete Tenant
     * 
     * @param organizationId Id of the organization (required)
     * @param groupId Id of the group (required)
     * @param tenantId Id of the tenant. (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse delete(String organizationId, String groupId, String tenantId) throws BitmovinException {
        return this.apiClient.delete(organizationId, groupId, tenantId).getData().getResult();
    }
    
    /**
     * Tenant Details
     * 
     * @param organizationId Id of the organization (required)
     * @param groupId Id of the group (required)
     * @param tenantId Id of the tenant. (required)
     * @return Tenant
     * @throws BitmovinException if fails to make API call
     */
    public Tenant get(String organizationId, String groupId, String tenantId) throws BitmovinException {
        return this.apiClient.get(organizationId, groupId, tenantId).getData().getResult();
    }
    
    /**
     * List Tenants
     * 
     * @param organizationId Id of the organization (required)
     * @param groupId Id of the group (required)
     * @return List&lt;Tenant&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<Tenant> list(String organizationId, String groupId) throws BitmovinException {
        return this.apiClient.list(organizationId, groupId).getData().getResult();
    }
    
    interface TenantsApiClient {
    
        @RequestLine("POST /account/organizations/{organization_id}/groups/{group_id}/tenants")
        ResponseEnvelope<Tenant> create(@Param(value = "organization_id") String organizationId, @Param(value = "group_id") String groupId, Tenant tenant) throws BitmovinException;
    
        @RequestLine("DELETE /account/organizations/{organization_id}/groups/{group_id}/tenants/{tenant_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "organization_id") String organizationId, @Param(value = "group_id") String groupId, @Param(value = "tenant_id") String tenantId) throws BitmovinException;
    
        @RequestLine("GET /account/organizations/{organization_id}/groups/{group_id}/tenants/{tenant_id}")
        ResponseEnvelope<Tenant> get(@Param(value = "organization_id") String organizationId, @Param(value = "group_id") String groupId, @Param(value = "tenant_id") String tenantId) throws BitmovinException;
    
        @RequestLine("GET /account/organizations/{organization_id}/groups/{group_id}/tenants")
        ResponseEnvelope<PaginationResponse<Tenant>> list(@Param(value = "organization_id") String organizationId, @Param(value = "group_id") String groupId) throws BitmovinException;
    }
}
