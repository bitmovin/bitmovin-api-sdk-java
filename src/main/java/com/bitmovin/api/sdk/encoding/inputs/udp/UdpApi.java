package com.bitmovin.api.sdk.encoding.inputs.udp;

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

public class UdpApi {

    private final UdpApiClient apiClient;

    public UdpApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(UdpApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of UdpApi
     */
    public static BitmovinApiBuilder<UdpApi> builder() {
        return new BitmovinApiBuilder<>(UdpApi.class);
    }
    
    /**
     * UDP Input Details
     * 
     * @param inputId Id of the input (required)
     * @return UdpInput
     * @throws BitmovinException if fails to make API call
     */
    public UdpInput get(String inputId) throws BitmovinException {
        return this.apiClient.get(inputId).getData().getResult();
    }
    
    /**
     * List UDP inputs
     * 
     * @return List&lt;UdpInput&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<UdpInput> list() throws BitmovinException {
        return this.apiClient.list(new HashMap<String, Object>()).getData().getResult();
    }
    /**
     * List UDP inputs
     * 
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;UdpInput&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<UdpInput> list(UdpInputListQueryParams queryParams) throws BitmovinException {
        return this.apiClient.list(queryParams).getData().getResult();
    }
    
    interface UdpApiClient {
    
        @RequestLine("GET /encoding/inputs/udp/{input_id}")
        ResponseEnvelope<UdpInput> get(@Param(value = "input_id") String inputId) throws BitmovinException;
    
        @RequestLine("GET /encoding/inputs/udp")
        ResponseEnvelope<PaginationResponse<UdpInput>> list(@QueryMap Map<String, Object> queryParams) throws BitmovinException;
    }
}
