package com.bitmovin.api.sdk.encoding.infrastructure.akamai;

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
import com.bitmovin.api.sdk.encoding.infrastructure.akamai.regions.RegionsApi;

public class AkamaiApi {
    public final RegionsApi regions;

    private final AkamaiApiClient apiClient;

    public AkamaiApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(AkamaiApiClient.class);

        this.regions = new RegionsApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of AkamaiApi
     */
    public static BitmovinApiBuilder<AkamaiApi> builder() {
        return new BitmovinApiBuilder<>(AkamaiApi.class);
    }
    /**
     * Add Akamai account
     * 
     * @param akamaiAccount The Akamai account to be added (required)
     * @return AkamaiAccount
     * @throws BitmovinException if fails to make API call
     */
    public AkamaiAccount create(AkamaiAccount akamaiAccount) throws BitmovinException {
        try {
            return this.apiClient.create(akamaiAccount).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * Delete Akamai account
     * 
     * @param infrastructureId Id of the Akamai account (required)
     * @return AkamaiAccount
     * @throws BitmovinException if fails to make API call
     */
    public AkamaiAccount delete(String infrastructureId) throws BitmovinException {
        try {
            return this.apiClient.delete(infrastructureId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * Akamai account details
     * 
     * @param infrastructureId Id of the Akamai account (required)
     * @return AkamaiAccount
     * @throws BitmovinException if fails to make API call
     */
    public AkamaiAccount get(String infrastructureId) throws BitmovinException {
        try {
            return this.apiClient.get(infrastructureId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * List Akamai accounts
     * 
     * @return List&lt;AkamaiAccount&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<AkamaiAccount> list() throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * List Akamai accounts
     * 
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;AkamaiAccount&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<AkamaiAccount> list(AkamaiAccountListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface AkamaiApiClient { 
        @RequestLine("POST /encoding/infrastructure/akamai")
        ResponseEnvelope<AkamaiAccount> create(AkamaiAccount akamaiAccount) throws BitmovinException;
   
        @RequestLine("DELETE /encoding/infrastructure/akamai/{infrastructure_id}")
        ResponseEnvelope<AkamaiAccount> delete(@Param(value = "infrastructure_id") String infrastructureId) throws BitmovinException;
   
        @RequestLine("GET /encoding/infrastructure/akamai/{infrastructure_id}")
        ResponseEnvelope<AkamaiAccount> get(@Param(value = "infrastructure_id") String infrastructureId) throws BitmovinException;
   
        @RequestLine("GET /encoding/infrastructure/akamai")
        ResponseEnvelope<PaginationResponse<AkamaiAccount>> list(@QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    }
}
