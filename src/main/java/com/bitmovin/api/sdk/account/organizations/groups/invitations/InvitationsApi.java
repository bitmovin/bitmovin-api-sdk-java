package com.bitmovin.api.sdk.account.organizations.groups.invitations;

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

public class InvitationsApi {

    private final InvitationsApiClient apiClient;

    public InvitationsApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(InvitationsApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of InvitationsApi
     */
    public static BitmovinApiBuilder<InvitationsApi> builder() {
        return new BitmovinApiBuilder<>(InvitationsApi.class);
    }
    
    /**
     * Add Invitation to Group
     * 
     * @param organizationId Id of the organization (required)
     * @param groupId Id of the group (required)
     * @param invitation Invitation details (required)
     * @return Invitation
     * @throws BitmovinException if fails to make API call
     */
    public Invitation create(String organizationId, String groupId, Invitation invitation) throws BitmovinException {
        try {
            return this.apiClient.create(organizationId, groupId, invitation).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * List Invitations
     * 
     * @param organizationId Id of the organization (required)
     * @param groupId Id of the group (required)
     * @return List&lt;Invitation&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<Invitation> list(String organizationId, String groupId) throws BitmovinException {
        try {
            return this.apiClient.list(organizationId, groupId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    interface InvitationsApiClient {
    
        @RequestLine("POST /account/organizations/{organization_id}/groups/{group_id}/invitations")
        ResponseEnvelope<Invitation> create(@Param(value = "organization_id") String organizationId, @Param(value = "group_id") String groupId, Invitation invitation) throws BitmovinException;
    
        @RequestLine("GET /account/organizations/{organization_id}/groups/{group_id}/invitations")
        ResponseEnvelope<PaginationResponse<Invitation>> list(@Param(value = "organization_id") String organizationId, @Param(value = "group_id") String groupId) throws BitmovinException;
    }
}
