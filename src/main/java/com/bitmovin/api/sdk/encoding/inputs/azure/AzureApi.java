package com.bitmovin.api.sdk.encoding.inputs.azure;

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
import com.bitmovin.api.sdk.encoding.inputs.azure.customdata.CustomdataApi;

public class AzureApi {
    public final CustomdataApi customdata;

    private final AzureApiClient apiClient;

    public AzureApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(AzureApiClient.class);

        this.customdata = new CustomdataApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of AzureApi
     */
    public static BitmovinApiBuilder<AzureApi> builder() {
        return new BitmovinApiBuilder<>(AzureApi.class);
    }
    
    /**
     * Create Azure Input
     * 
     * @param azureInput The Azure input to be created (required)
     * @return AzureInput
     * @throws BitmovinException if fails to make API call
     */
    public AzureInput create(AzureInput azureInput) throws BitmovinException {
        return this.apiClient.create(azureInput).getData().getResult();
    }
    
    /**
     * Delete Azure Input
     * 
     * @param inputId Id of the input (required)
     * @return AzureInput
     * @throws BitmovinException if fails to make API call
     */
    public AzureInput delete(String inputId) throws BitmovinException {
        return this.apiClient.delete(inputId).getData().getResult();
    }
    
    /**
     * Azure Input Details
     * 
     * @param inputId Id of the input (required)
     * @return AzureInput
     * @throws BitmovinException if fails to make API call
     */
    public AzureInput get(String inputId) throws BitmovinException {
        return this.apiClient.get(inputId).getData().getResult();
    }
    
    /**
     * List Azure Inputs
     * 
     * @return List&lt;AzureInput&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<AzureInput> list() throws BitmovinException {
        return this.apiClient.list(new HashMap<String, Object>()).getData().getResult();
    }
    /**
     * List Azure Inputs
     * 
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;AzureInput&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<AzureInput> list(AzureInputListQueryParams queryParams) throws BitmovinException {
        return this.apiClient.list(queryParams).getData().getResult();
    }
    
    interface AzureApiClient {
    
        @RequestLine("POST /encoding/inputs/azure")
        ResponseEnvelope<AzureInput> create(AzureInput azureInput) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/inputs/azure/{input_id}")
        ResponseEnvelope<AzureInput> delete(@Param(value = "input_id") String inputId) throws BitmovinException;
    
        @RequestLine("GET /encoding/inputs/azure/{input_id}")
        ResponseEnvelope<AzureInput> get(@Param(value = "input_id") String inputId) throws BitmovinException;
    
        @RequestLine("GET /encoding/inputs/azure")
        ResponseEnvelope<PaginationResponse<AzureInput>> list(@QueryMap Map<String, Object> queryParams) throws BitmovinException;
    }
}
