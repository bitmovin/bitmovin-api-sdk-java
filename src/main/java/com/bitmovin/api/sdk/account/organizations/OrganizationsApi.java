package com.bitmovin.api.sdk.account.organizations;

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
import com.bitmovin.api.sdk.account.organizations.groups.GroupsApi;

public class OrganizationsApi {
    public final GroupsApi groups;

    private final OrganizationsApiClient apiClient;

    public OrganizationsApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(OrganizationsApiClient.class);

        this.groups = new GroupsApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of OrganizationsApi
     */
    public static BitmovinApiBuilder<OrganizationsApi> builder() {
        return new BitmovinApiBuilder<>(OrganizationsApi.class);
    }
    
    /**
     * Add Organization
     * 
     * @param organization Orgnaization Details (optional)
     * @return Organization
     * @throws BitmovinException if fails to make API call
     */
    public Organization create(Organization organization) throws BitmovinException {
        return this.apiClient.create(organization).getData().getResult();
    }
    
    /**
     * Delete Organization
     * 
     * @param organizationId Id of the organization (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse delete(String organizationId) throws BitmovinException {
        return this.apiClient.delete(organizationId).getData().getResult();
    }
    
    /**
     * Organization Details
     * 
     * @param organizationId Id of the organization (required)
     * @return Organization
     * @throws BitmovinException if fails to make API call
     */
    public Organization get(String organizationId) throws BitmovinException {
        return this.apiClient.get(organizationId).getData().getResult();
    }
    
    /**
     * List Organizations
     * 
     * @return List&lt;Organization&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<Organization> list() throws BitmovinException {
        return this.apiClient.list().getData().getResult();
    }
    
    interface OrganizationsApiClient {
    
        @RequestLine("POST /account/organizations")
        ResponseEnvelope<Organization> create(Organization organization) throws BitmovinException;
    
        @RequestLine("DELETE /account/organizations/{organization_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "organization_id") String organizationId) throws BitmovinException;
    
        @RequestLine("GET /account/organizations/{organization_id}")
        ResponseEnvelope<Organization> get(@Param(value = "organization_id") String organizationId) throws BitmovinException;
    
        @RequestLine("GET /account/organizations")
        ResponseEnvelope<PaginationResponse<Organization>> list() throws BitmovinException;
    }
}
