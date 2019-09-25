package com.bitmovin.api.sdk.encoding.inputs.rtmp;

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
import com.bitmovin.api.sdk.common.BitmovinApiBuilder;
import com.bitmovin.api.sdk.common.BitmovinApiClientFactory;

public class RtmpApi {

    private final RtmpApiClient apiClient;

    public RtmpApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(RtmpApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of RtmpApi
     */
    public static BitmovinApiBuilder<RtmpApi> builder() {
        return new BitmovinApiBuilder<>(RtmpApi.class);
    }
    
    /**
     * RTMP Input Details
     * 
     * @param inputId Id of the input (required)
     * @return RtmpInput
     * @throws BitmovinException if fails to make API call
     */
    public RtmpInput get(String inputId) throws BitmovinException {
        try {
            return this.apiClient.get(inputId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * List RTMP Inputs
     * 
     * @return List&lt;RtmpInput&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<RtmpInput> list() throws BitmovinException {
        try {
            return this.apiClient.list(new HashMap<String, Object>()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * List RTMP Inputs
     * 
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;RtmpInput&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<RtmpInput> list(RtmpInputListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(queryParams).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    interface RtmpApiClient {
    
        @RequestLine("GET /encoding/inputs/rtmp/{input_id}")
        ResponseEnvelope<RtmpInput> get(@Param(value = "input_id") String inputId) throws BitmovinException;
    
        @RequestLine("GET /encoding/inputs/rtmp")
        ResponseEnvelope<PaginationResponse<RtmpInput>> list(@QueryMap Map<String, Object> queryParams) throws BitmovinException;
    }
}
