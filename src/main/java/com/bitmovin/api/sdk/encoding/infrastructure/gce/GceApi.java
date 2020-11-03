package com.bitmovin.api.sdk.encoding.infrastructure.gce;

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
import com.bitmovin.api.sdk.encoding.infrastructure.gce.regions.RegionsApi;

public class GceApi {
    public final RegionsApi regions;

    private final GceApiClient apiClient;

    public GceApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(GceApiClient.class);

        this.regions = new RegionsApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of GceApi
     */
    public static BitmovinApiBuilder<GceApi> builder() {
        return new BitmovinApiBuilder<>(GceApi.class);
    }
    
    /**
     * Add GCE Account
     * 
     * @param gceAccount The GCE Account to be added (required)
     * @return GceAccount
     * @throws BitmovinException if fails to make API call
     */
    public GceAccount create(GceAccount gceAccount) throws BitmovinException {
        try {
            return this.apiClient.create(gceAccount).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * Delete GCE Account
     * 
     * @param infrastructureId Id of the GCE account (required)
     * @return GceAccount
     * @throws BitmovinException if fails to make API call
     */
    public GceAccount delete(String infrastructureId) throws BitmovinException {
        try {
            return this.apiClient.delete(infrastructureId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * GCE Account Details
     * 
     * @param infrastructureId Id of the GCE account (required)
     * @return GceAccount
     * @throws BitmovinException if fails to make API call
     */
    public GceAccount get(String infrastructureId) throws BitmovinException {
        try {
            return this.apiClient.get(infrastructureId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * List GCE Accounts
     * 
     * @return List&lt;GceAccount&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<GceAccount> list() throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * List GCE Accounts
     * 
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;GceAccount&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<GceAccount> list(GceAccountListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    interface GceApiClient {
    
        @RequestLine("POST /encoding/infrastructure/gce")
        ResponseEnvelope<GceAccount> create(GceAccount gceAccount) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/infrastructure/gce/{infrastructure_id}")
        ResponseEnvelope<GceAccount> delete(@Param(value = "infrastructure_id") String infrastructureId) throws BitmovinException;
    
        @RequestLine("GET /encoding/infrastructure/gce/{infrastructure_id}")
        ResponseEnvelope<GceAccount> get(@Param(value = "infrastructure_id") String infrastructureId) throws BitmovinException;
    
        @RequestLine("GET /encoding/infrastructure/gce")
        ResponseEnvelope<PaginationResponse<GceAccount>> list(@QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    }
}
