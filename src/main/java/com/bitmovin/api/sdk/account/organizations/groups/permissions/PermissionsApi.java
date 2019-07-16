package com.bitmovin.api.sdk.account.organizations.groups.permissions;

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

public class PermissionsApi {

    private final PermissionsApiClient apiClient;

    public PermissionsApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(PermissionsApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of PermissionsApi
     */
    public static BitmovinApiBuilder<PermissionsApi> builder() {
        return new BitmovinApiBuilder<>(PermissionsApi.class);
    }
    
    /**
     * Set Group Permissions
     * 
     * @param organizationId Id of the organization (required)
     * @param groupId Id of the group (required)
     * @param acl Group Permissions (required)
     * @return Acl
     * @throws BitmovinException if fails to make API call
     */
    public Acl create(String organizationId, String groupId, Acl acl) throws BitmovinException {
        return this.apiClient.create(organizationId, groupId, acl).getData().getResult();
    }
    
    /**
     * Delete Permission
     * 
     * @param organizationId Id of the organization (required)
     * @param groupId Id of the group (required)
     * @param permissionId Id of the permission (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse delete(String organizationId, String groupId, String permissionId) throws BitmovinException {
        return this.apiClient.delete(organizationId, groupId, permissionId).getData().getResult();
    }
    
    /**
     * Get Group Permissions
     * 
     * @param organizationId Id of the organization (required)
     * @param groupId Id of the group (required)
     * @return List&lt;Acl&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<Acl> list(String organizationId, String groupId) throws BitmovinException {
        return this.apiClient.list(organizationId, groupId).getData().getResult();
    }
    
    interface PermissionsApiClient {
    
        @RequestLine("POST /account/organizations/{organization_id}/groups/{group_id}/permissions")
        ResponseEnvelope<Acl> create(@Param(value = "organization_id") String organizationId, @Param(value = "group_id") String groupId, Acl acl) throws BitmovinException;
    
        @RequestLine("DELETE /account/organizations/{organization_id}/groups/{group_id}/permissions/{permission_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "organization_id") String organizationId, @Param(value = "group_id") String groupId, @Param(value = "permission_id") String permissionId) throws BitmovinException;
    
        @RequestLine("GET /account/organizations/{organization_id}/groups/{group_id}/permissions")
        ResponseEnvelope<PaginationResponse<Acl>> list(@Param(value = "organization_id") String organizationId, @Param(value = "group_id") String groupId) throws BitmovinException;
    }
}
