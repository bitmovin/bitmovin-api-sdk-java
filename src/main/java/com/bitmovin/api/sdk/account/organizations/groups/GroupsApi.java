package com.bitmovin.api.sdk.account.organizations.groups;

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
import com.bitmovin.api.sdk.common.BitmovinApiBuilder;
import com.bitmovin.api.sdk.common.BitmovinApiClientFactory;
import com.bitmovin.api.sdk.account.organizations.groups.tenants.TenantsApi;
import com.bitmovin.api.sdk.account.organizations.groups.permissions.PermissionsApi;

public class GroupsApi {
    public final TenantsApi tenants;
    public final PermissionsApi permissions;

    private final GroupsApiClient apiClient;

    public GroupsApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(GroupsApiClient.class);

        this.tenants = new TenantsApi(clientFactory);
        this.permissions = new PermissionsApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of GroupsApi
     */
    public static BitmovinApiBuilder<GroupsApi> builder() {
        return new BitmovinApiBuilder<>(GroupsApi.class);
    }
    
    /**
     * Add Group
     * 
     * @param organizationId Id of the organization (required)
     * @param group Tenant Group details (required)
     * @return Group
     * @throws BitmovinException if fails to make API call
     */
    public Group create(String organizationId, Group group) throws BitmovinException {
        try {
            return this.apiClient.create(organizationId, group).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * Delete Group
     * 
     * @param organizationId Id of the organization (required)
     * @param groupId Id of the group (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse delete(String organizationId, String groupId) throws BitmovinException {
        try {
            return this.apiClient.delete(organizationId, groupId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * Group Details
     * 
     * @param organizationId Id of the organization (required)
     * @param groupId Id of the group. (required)
     * @return Group
     * @throws BitmovinException if fails to make API call
     */
    public Group get(String organizationId, String groupId) throws BitmovinException {
        try {
            return this.apiClient.get(organizationId, groupId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * List Groups
     * 
     * @param organizationId Id of the organization (required)
     * @return List&lt;Group&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<Group> list(String organizationId) throws BitmovinException {
        try {
            return this.apiClient.list(organizationId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    interface GroupsApiClient {
    
        @RequestLine("POST /account/organizations/{organization_id}/groups")
        ResponseEnvelope<Group> create(@Param(value = "organization_id") String organizationId, Group group) throws BitmovinException;
    
        @RequestLine("DELETE /account/organizations/{organization_id}/groups/{group_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "organization_id") String organizationId, @Param(value = "group_id") String groupId) throws BitmovinException;
    
        @RequestLine("GET /account/organizations/{organization_id}/groups/{group_id}")
        ResponseEnvelope<Group> get(@Param(value = "organization_id") String organizationId, @Param(value = "group_id") String groupId) throws BitmovinException;
    
        @RequestLine("GET /account/organizations/{organization_id}/groups")
        ResponseEnvelope<PaginationResponse<Group>> list(@Param(value = "organization_id") String organizationId) throws BitmovinException;
    }
}
