package com.bitmovin.api.sdk.account.organizations.tenants;

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
     * List all Tenants with their groups for a given organization
     * 
     * @param organizationId Id of the organization (required)
     * @return List&lt;TenantWithGroups&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<TenantWithGroups> list(String organizationId) throws BitmovinException {
        try {
            return this.apiClient.list(organizationId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface TenantsApiClient {

        @RequestLine("GET /account/organizations/{organization_id}/tenants")
        ResponseEnvelope<PaginationResponse<TenantWithGroups>> list(@Param(value = "organization_id") String organizationId) throws BitmovinException;
    }
}
