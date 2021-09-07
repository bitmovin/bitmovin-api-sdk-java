package com.bitmovin.api.sdk.account.organizations.subOrganizations;

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

public class SubOrganizationsApi {

    private final SubOrganizationsApiClient apiClient;

    public SubOrganizationsApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(SubOrganizationsApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of SubOrganizationsApi
     */
    public static BitmovinApiBuilder<SubOrganizationsApi> builder() {
        return new BitmovinApiBuilder<>(SubOrganizationsApi.class);
    }

    /**
     * Organizations under given parent organization
     * 
     * @param organizationId ID of the parent organization (required)
     * @return List&lt;Organization&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<Organization> list(String organizationId) throws BitmovinException {
        try {
            return this.apiClient.list(organizationId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface SubOrganizationsApiClient {

        @RequestLine("GET /account/organizations/{organization_id}/sub-organizations")
        ResponseEnvelope<PaginationResponse<Organization>> list(@Param(value = "organization_id") String organizationId) throws BitmovinException;
    }
}
