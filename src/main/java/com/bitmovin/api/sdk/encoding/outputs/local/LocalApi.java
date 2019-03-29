package com.bitmovin.api.sdk.encoding.outputs.local;

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
import com.bitmovin.api.sdk.encoding.outputs.local.customdata.CustomdataApi;

public class LocalApi {
    public final CustomdataApi customdata;

    private final LocalApiClient apiClient;

    public LocalApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(LocalApiClient.class);

        this.customdata = new CustomdataApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of LocalApi
     */
    public static BitmovinApiBuilder<LocalApi> builder() {
        return new BitmovinApiBuilder<>(LocalApi.class);
    }
    
    /**
     * Create Local Output
     * 
     * @param localOutput The Local output to be created (optional)
     * @return LocalOutput
     * @throws BitmovinException if fails to make API call
     */
    public LocalOutput create(LocalOutput localOutput) throws BitmovinException {
        return this.apiClient.create(localOutput).getData().getResult();
    }
    
    /**
     * Delete Local Output
     * 
     * @param outputId Id of the output (required)
     * @return LocalOutput
     * @throws BitmovinException if fails to make API call
     */
    public LocalOutput delete(String outputId) throws BitmovinException {
        return this.apiClient.delete(outputId).getData().getResult();
    }
    
    /**
     * Local Output Details
     * 
     * @param outputId Id of the output (required)
     * @return LocalOutput
     * @throws BitmovinException if fails to make API call
     */
    public LocalOutput get(String outputId) throws BitmovinException {
        return this.apiClient.get(outputId).getData().getResult();
    }
    
    /**
     * List Local Outputs
     * 
     * @return List&lt;LocalOutput&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<LocalOutput> list() throws BitmovinException {
        return this.apiClient.list(new HashMap<String, Object>()).getData().getResult();
    }
    /**
     * List Local Outputs
     * 
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;LocalOutput&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<LocalOutput> list(LocalOutputListQueryParams queryParams) throws BitmovinException {
        return this.apiClient.list(queryParams).getData().getResult();
    }
    
    interface LocalApiClient {
    
        @RequestLine("POST /encoding/outputs/local")
        ResponseEnvelope<LocalOutput> create(LocalOutput localOutput) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/outputs/local/{output_id}")
        ResponseEnvelope<LocalOutput> delete(@Param(value = "output_id") String outputId) throws BitmovinException;
    
        @RequestLine("GET /encoding/outputs/local/{output_id}")
        ResponseEnvelope<LocalOutput> get(@Param(value = "output_id") String outputId) throws BitmovinException;
    
        @RequestLine("GET /encoding/outputs/local")
        ResponseEnvelope<PaginationResponse<LocalOutput>> list(@QueryMap Map<String, Object> queryParams) throws BitmovinException;
    }
}
