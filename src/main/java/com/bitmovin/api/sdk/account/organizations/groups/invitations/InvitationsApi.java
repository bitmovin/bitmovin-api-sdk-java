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
import com.bitmovin.api.sdk.common.QueryMapWrapper;
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
     * Delete Invitation
     * 
     * @param organizationId Id of the organization (required)
     * @param groupId Id of the group (required)
     * @param invitationId Id of the invitation. (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse delete(String organizationId, String groupId, String invitationId) throws BitmovinException {
        try {
            return this.apiClient.delete(organizationId, groupId, invitationId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * Invitation Details
     * 
     * @param organizationId Id of the organization (required)
     * @param groupId Id of the group (required)
     * @param invitationId Id of the invitation. (required)
     * @return Invitation
     * @throws BitmovinException if fails to make API call
     */
    public Invitation get(String organizationId, String groupId, String invitationId) throws BitmovinException {
        try {
            return this.apiClient.get(organizationId, groupId, invitationId).getData().getResult();
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
            return this.apiClient.list(organizationId, groupId, new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * List Invitations
     * 
     * @param organizationId Id of the organization (required)
     * @param groupId Id of the group (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;Invitation&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<Invitation> list(String organizationId, String groupId, InvitationListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(organizationId, groupId, new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface InvitationsApiClient {

        @RequestLine("POST /account/organizations/{organization_id}/groups/{group_id}/invitations")
        ResponseEnvelope<Invitation> create(@Param(value = "organization_id") String organizationId, @Param(value = "group_id") String groupId, Invitation invitation) throws BitmovinException;
    
        @RequestLine("DELETE /account/organizations/{organization_id}/groups/{group_id}/invitations/{invitation_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "organization_id") String organizationId, @Param(value = "group_id") String groupId, @Param(value = "invitation_id") String invitationId) throws BitmovinException;
    
        @RequestLine("GET /account/organizations/{organization_id}/groups/{group_id}/invitations/{invitation_id}")
        ResponseEnvelope<Invitation> get(@Param(value = "organization_id") String organizationId, @Param(value = "group_id") String groupId, @Param(value = "invitation_id") String invitationId) throws BitmovinException;
    
        @RequestLine("GET /account/organizations/{organization_id}/groups/{group_id}/invitations")
        ResponseEnvelope<PaginationResponse<Invitation>> list(@Param(value = "organization_id") String organizationId, @Param(value = "group_id") String groupId, @QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    }
}
