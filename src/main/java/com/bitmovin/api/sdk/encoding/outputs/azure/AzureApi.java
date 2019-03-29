package com.bitmovin.api.sdk.encoding.outputs.azure;

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
import com.bitmovin.api.sdk.encoding.outputs.azure.customdata.CustomdataApi;

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
     * Create Azure Output
     * 
     * @param azureOutput The Azure output to be created (optional)
     * @return AzureOutput
     * @throws BitmovinException if fails to make API call
     */
    public AzureOutput create(AzureOutput azureOutput) throws BitmovinException {
        return this.apiClient.create(azureOutput).getData().getResult();
    }
    
    /**
     * Delete Azure Output
     * 
     * @param outputId Id of the output (required)
     * @return AzureOutput
     * @throws BitmovinException if fails to make API call
     */
    public AzureOutput delete(String outputId) throws BitmovinException {
        return this.apiClient.delete(outputId).getData().getResult();
    }
    
    /**
     * Azure Output Details
     * 
     * @param outputId Id of the output (required)
     * @return AzureOutput
     * @throws BitmovinException if fails to make API call
     */
    public AzureOutput get(String outputId) throws BitmovinException {
        return this.apiClient.get(outputId).getData().getResult();
    }
    
    /**
     * List Azure Outputs
     * 
     * @return List&lt;AzureOutput&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<AzureOutput> list() throws BitmovinException {
        return this.apiClient.list(new HashMap<String, Object>()).getData().getResult();
    }
    /**
     * List Azure Outputs
     * 
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;AzureOutput&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<AzureOutput> list(AzureOutputListQueryParams queryParams) throws BitmovinException {
        return this.apiClient.list(queryParams).getData().getResult();
    }
    
    interface AzureApiClient {
    
        @RequestLine("POST /encoding/outputs/azure")
        ResponseEnvelope<AzureOutput> create(AzureOutput azureOutput) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/outputs/azure/{output_id}")
        ResponseEnvelope<AzureOutput> delete(@Param(value = "output_id") String outputId) throws BitmovinException;
    
        @RequestLine("GET /encoding/outputs/azure/{output_id}")
        ResponseEnvelope<AzureOutput> get(@Param(value = "output_id") String outputId) throws BitmovinException;
    
        @RequestLine("GET /encoding/outputs/azure")
        ResponseEnvelope<PaginationResponse<AzureOutput>> list(@QueryMap Map<String, Object> queryParams) throws BitmovinException;
    }
}
