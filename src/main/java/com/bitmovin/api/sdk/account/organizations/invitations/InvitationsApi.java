package com.bitmovin.api.sdk.account.organizations.invitations;

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
     * List all pending invitations of an org id
     * 
     * @param organizationId Id of the organization (required)
     * @return List&lt;OrganizationPendingInvitation&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<OrganizationPendingInvitation> list(String organizationId) throws BitmovinException {
        try {
            return this.apiClient.list(organizationId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface InvitationsApiClient {

        @RequestLine("GET /account/organizations/{organization_id}/invitations")
        ResponseEnvelope<PaginationResponse<OrganizationPendingInvitation>> list(@Param(value = "organization_id") String organizationId) throws BitmovinException;
    }
}
