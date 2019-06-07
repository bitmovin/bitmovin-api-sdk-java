package com.bitmovin.api.sdk.encoding.encodings.keyframes;

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

public class KeyframesApi {

    private final KeyframesApiClient apiClient;

    public KeyframesApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(KeyframesApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of KeyframesApi
     */
    public static BitmovinApiBuilder<KeyframesApi> builder() {
        return new BitmovinApiBuilder<>(KeyframesApi.class);
    }
    
    /**
     * Create Keyframes
     * 
     * @param encodingId Id of the encoding. (required)
     * @param keyframe  (required)
     * @return Keyframe
     * @throws BitmovinException if fails to make API call
     */
    public Keyframe create(String encodingId, Keyframe keyframe) throws BitmovinException {
        return this.apiClient.create(encodingId, keyframe).getData().getResult();
    }
    
    /**
     * Delete Keyframe
     * 
     * @param encodingId Id of the encoding. (required)
     * @param keyframeId Id of the keyframe. (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse delete(String encodingId, String keyframeId) throws BitmovinException {
        return this.apiClient.delete(encodingId, keyframeId).getData().getResult();
    }
    
    /**
     * Keyframe Details
     * 
     * @param encodingId Id of the encoding. (required)
     * @param keyframeId Id of the keyframe. (required)
     * @return Keyframe
     * @throws BitmovinException if fails to make API call
     */
    public Keyframe get(String encodingId, String keyframeId) throws BitmovinException {
        return this.apiClient.get(encodingId, keyframeId).getData().getResult();
    }
    
    /**
     * List all Keyframes
     * 
     * @param encodingId Id of the encoding. (required)
     * @return List&lt;Keyframe&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<Keyframe> list(String encodingId) throws BitmovinException {
        return this.apiClient.list(encodingId, new HashMap<String, Object>()).getData().getResult();
    }
    /**
     * List all Keyframes
     * 
     * @param encodingId Id of the encoding. (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;Keyframe&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<Keyframe> list(String encodingId, KeyframeListQueryParams queryParams) throws BitmovinException {
        return this.apiClient.list(encodingId, queryParams).getData().getResult();
    }
    
    interface KeyframesApiClient {
    
        @RequestLine("POST /encoding/encodings/{encoding_id}/keyframes")
        ResponseEnvelope<Keyframe> create(@Param(value = "encoding_id") String encodingId, Keyframe keyframe) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/encodings/{encoding_id}/keyframes/{keyframe_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "encoding_id") String encodingId, @Param(value = "keyframe_id") String keyframeId) throws BitmovinException;
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/keyframes/{keyframe_id}")
        ResponseEnvelope<Keyframe> get(@Param(value = "encoding_id") String encodingId, @Param(value = "keyframe_id") String keyframeId) throws BitmovinException;
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/keyframes")
        ResponseEnvelope<PaginationResponse<Keyframe>> list(@Param(value = "encoding_id") String encodingId, @QueryMap Map<String, Object> queryParams) throws BitmovinException;
    }
}
