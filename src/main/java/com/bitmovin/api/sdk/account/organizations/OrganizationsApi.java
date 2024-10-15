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
import static com.bitmovin.api.sdk.common.BitmovinExceptionFactory.buildBitmovinException;
import com.bitmovin.api.sdk.common.BitmovinDateExpander;
import com.bitmovin.api.sdk.common.QueryMapWrapper;
import com.bitmovin.api.sdk.common.BitmovinApiBuilder;
import com.bitmovin.api.sdk.common.BitmovinApiClientFactory;
import com.bitmovin.api.sdk.account.organizations.subOrganizations.SubOrganizationsApi;
import com.bitmovin.api.sdk.account.organizations.tenants.TenantsApi;
import com.bitmovin.api.sdk.account.organizations.invitations.InvitationsApi;
import com.bitmovin.api.sdk.account.organizations.groups.GroupsApi;

public class OrganizationsApi {
    public final SubOrganizationsApi subOrganizations;
    public final TenantsApi tenants;
    public final InvitationsApi invitations;
    public final GroupsApi groups;

    private final OrganizationsApiClient apiClient;

    public OrganizationsApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(OrganizationsApiClient.class);

        this.subOrganizations = new SubOrganizationsApi(clientFactory);
        this.tenants = new TenantsApi(clientFactory);
        this.invitations = new InvitationsApi(clientFactory);
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
     * @param organization Organization Details (required)
     * @return Organization
     * @throws BitmovinException if fails to make API call
     */
    public Organization create(Organization organization) throws BitmovinException {
        try {
            return this.apiClient.create(organization).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * Organization Details
     * 
     * @param organizationId ID of the organization (required)
     * @return Organization
     * @throws BitmovinException if fails to make API call
     */
    public Organization get(String organizationId) throws BitmovinException {
        try {
            return this.apiClient.get(organizationId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * List Organizations
     * 
     * @return List&lt;Organization&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<Organization> list() throws BitmovinException {
        try {
            return this.apiClient.list().getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * Update Organization
     * 
     * @param organizationId ID of the organization (required)
     * @param updateOrganizationRequest Organization Details fields to be updated (required)
     * @return Organization
     * @throws BitmovinException if fails to make API call
     */
    public Organization update(String organizationId, UpdateOrganizationRequest updateOrganizationRequest) throws BitmovinException {
        try {
            return this.apiClient.update(organizationId, updateOrganizationRequest).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface OrganizationsApiClient { 
        @RequestLine("POST /account/organizations")
        ResponseEnvelope<Organization> create(Organization organization) throws BitmovinException;
   
        @RequestLine("GET /account/organizations/{organization_id}")
        ResponseEnvelope<Organization> get(@Param(value = "organization_id") String organizationId) throws BitmovinException;
   
        @RequestLine("GET /account/organizations")
        ResponseEnvelope<PaginationResponse<Organization>> list() throws BitmovinException;
   
        @RequestLine("PUT /account/organizations/{organization_id}")
        ResponseEnvelope<Organization> update(@Param(value = "organization_id") String organizationId, UpdateOrganizationRequest updateOrganizationRequest) throws BitmovinException;
    }
}
