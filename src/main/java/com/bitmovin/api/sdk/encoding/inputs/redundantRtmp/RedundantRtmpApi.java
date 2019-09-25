package com.bitmovin.api.sdk.encoding.inputs.redundantRtmp;

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

public class RedundantRtmpApi {

    private final RedundantRtmpApiClient apiClient;

    public RedundantRtmpApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(RedundantRtmpApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of RedundantRtmpApi
     */
    public static BitmovinApiBuilder<RedundantRtmpApi> builder() {
        return new BitmovinApiBuilder<>(RedundantRtmpApi.class);
    }
    
    /**
     * Create Redundant RTMP Input
     * 
     * @param redundantRtmpInput The Redundant RTMP input to be created (required)
     * @return RedundantRtmpInput
     * @throws BitmovinException if fails to make API call
     */
    public RedundantRtmpInput create(RedundantRtmpInput redundantRtmpInput) throws BitmovinException {
        try {
            return this.apiClient.create(redundantRtmpInput).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * Delete Redundant RTMP Input
     * 
     * @param inputId Id of the input (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse delete(String inputId) throws BitmovinException {
        try {
            return this.apiClient.delete(inputId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * Redundant RTMP Input Details
     * 
     * @param inputId Id of the input (required)
     * @return RedundantRtmpInput
     * @throws BitmovinException if fails to make API call
     */
    public RedundantRtmpInput get(String inputId) throws BitmovinException {
        try {
            return this.apiClient.get(inputId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * List Redundant RTMP Inputs
     * 
     * @return List&lt;RedundantRtmpInput&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<RedundantRtmpInput> list() throws BitmovinException {
        try {
            return this.apiClient.list(new HashMap<String, Object>()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * List Redundant RTMP Inputs
     * 
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;RedundantRtmpInput&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<RedundantRtmpInput> list(RedundantRtmpInputListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(queryParams).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    interface RedundantRtmpApiClient {
    
        @RequestLine("POST /encoding/inputs/redundant-rtmp")
        ResponseEnvelope<RedundantRtmpInput> create(RedundantRtmpInput redundantRtmpInput) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/inputs/redundant-rtmp/{input_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "input_id") String inputId) throws BitmovinException;
    
        @RequestLine("GET /encoding/inputs/redundant-rtmp/{input_id}")
        ResponseEnvelope<RedundantRtmpInput> get(@Param(value = "input_id") String inputId) throws BitmovinException;
    
        @RequestLine("GET /encoding/inputs/redundant-rtmp")
        ResponseEnvelope<PaginationResponse<RedundantRtmpInput>> list(@QueryMap Map<String, Object> queryParams) throws BitmovinException;
    }
}
