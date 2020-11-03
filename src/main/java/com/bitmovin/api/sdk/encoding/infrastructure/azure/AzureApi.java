package com.bitmovin.api.sdk.encoding.infrastructure.azure;

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
import com.bitmovin.api.sdk.encoding.infrastructure.azure.regions.RegionsApi;

public class AzureApi {
    public final RegionsApi regions;

    private final AzureApiClient apiClient;

    public AzureApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(AzureApiClient.class);

        this.regions = new RegionsApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of AzureApi
     */
    public static BitmovinApiBuilder<AzureApi> builder() {
        return new BitmovinApiBuilder<>(AzureApi.class);
    }
    
    /**
     * Add Azure Account
     * 
     * @param azureAccount The Azure Account to be added (required)
     * @return AzureAccount
     * @throws BitmovinException if fails to make API call
     */
    public AzureAccount create(AzureAccount azureAccount) throws BitmovinException {
        try {
            return this.apiClient.create(azureAccount).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * Delete Azure Account
     * 
     * @param infrastructureId Id of the Azure account (required)
     * @return AzureAccount
     * @throws BitmovinException if fails to make API call
     */
    public AzureAccount delete(String infrastructureId) throws BitmovinException {
        try {
            return this.apiClient.delete(infrastructureId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * Azure Account Details
     * 
     * @param infrastructureId Id of the Azure account (required)
     * @return AzureAccount
     * @throws BitmovinException if fails to make API call
     */
    public AzureAccount get(String infrastructureId) throws BitmovinException {
        try {
            return this.apiClient.get(infrastructureId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * List Azure Accounts
     * 
     * @return List&lt;AzureAccount&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<AzureAccount> list() throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * List Azure Accounts
     * 
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;AzureAccount&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<AzureAccount> list(AzureAccountListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    interface AzureApiClient {
    
        @RequestLine("POST /encoding/infrastructure/azure")
        ResponseEnvelope<AzureAccount> create(AzureAccount azureAccount) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/infrastructure/azure/{infrastructure_id}")
        ResponseEnvelope<AzureAccount> delete(@Param(value = "infrastructure_id") String infrastructureId) throws BitmovinException;
    
        @RequestLine("GET /encoding/infrastructure/azure/{infrastructure_id}")
        ResponseEnvelope<AzureAccount> get(@Param(value = "infrastructure_id") String infrastructureId) throws BitmovinException;
    
        @RequestLine("GET /encoding/infrastructure/azure")
        ResponseEnvelope<PaginationResponse<AzureAccount>> list(@QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    }
}
