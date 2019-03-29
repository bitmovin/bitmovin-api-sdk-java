package com.bitmovin.api.sdk.encoding.inputs.tcp;

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

public class TcpApi {

    private final TcpApiClient apiClient;

    public TcpApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(TcpApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of TcpApi
     */
    public static BitmovinApiBuilder<TcpApi> builder() {
        return new BitmovinApiBuilder<>(TcpApi.class);
    }
    
    /**
     * TCP Input Details
     * 
     * @param inputId Id of the input (required)
     * @return TcpInput
     * @throws BitmovinException if fails to make API call
     */
    public TcpInput get(String inputId) throws BitmovinException {
        return this.apiClient.get(inputId).getData().getResult();
    }
    
    /**
     * List TCP inputs
     * 
     * @return List&lt;TcpInput&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<TcpInput> list() throws BitmovinException {
        return this.apiClient.list(new HashMap<String, Object>()).getData().getResult();
    }
    /**
     * List TCP inputs
     * 
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;TcpInput&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<TcpInput> list(TcpInputListQueryParams queryParams) throws BitmovinException {
        return this.apiClient.list(queryParams).getData().getResult();
    }
    
    interface TcpApiClient {
    
        @RequestLine("GET /encoding/inputs/tcp/{input_id}")
        ResponseEnvelope<TcpInput> get(@Param(value = "input_id") String inputId) throws BitmovinException;
    
        @RequestLine("GET /encoding/inputs/tcp")
        ResponseEnvelope<PaginationResponse<TcpInput>> list(@QueryMap Map<String, Object> queryParams) throws BitmovinException;
    }
}
