package com.bitmovin.api.sdk.encoding.manifests.hls.streams.customTag;

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

public class CustomTagApi {

    private final CustomTagApiClient apiClient;

    public CustomTagApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(CustomTagApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of CustomTagApi
     */
    public static BitmovinApiBuilder<CustomTagApi> builder() {
        return new BitmovinApiBuilder<>(CustomTagApi.class);
    }
    
    /**
     * Add Custom Tag to Variant Stream
     * 
     * @param manifestId Id of the hls manifest. (required)
     * @param streamId Id of the variant stream. (required)
     * @param customTag  (optional)
     * @return CustomTag
     * @throws BitmovinException if fails to make API call
     */
    public CustomTag create(String manifestId, String streamId, CustomTag customTag) throws BitmovinException {
        return this.apiClient.create(manifestId, streamId, customTag).getData().getResult();
    }
    
    /**
     * Delete Custom Tag
     * 
     * @param manifestId Id of the hls manifest. (required)
     * @param streamId Id of the variant stream. (required)
     * @param customTagId Id of the custom tag. (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse delete(String manifestId, String streamId, String customTagId) throws BitmovinException {
        return this.apiClient.delete(manifestId, streamId, customTagId).getData().getResult();
    }
    
    /**
     * Custom Tag Details
     * 
     * @param manifestId Id of the hls manifest. (required)
     * @param streamId Id of the variant stream. (required)
     * @param customTagId Id of the custom tag. (required)
     * @return CustomTag
     * @throws BitmovinException if fails to make API call
     */
    public CustomTag get(String manifestId, String streamId, String customTagId) throws BitmovinException {
        return this.apiClient.get(manifestId, streamId, customTagId).getData().getResult();
    }
    
    /**
     * List all Custom Tags of a Variant Stream
     * 
     * @param manifestId Id of the hls manifest. (required)
     * @param streamId Id of the variant stream. (required)
     * @return List&lt;CustomTag&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<CustomTag> list(String manifestId, String streamId) throws BitmovinException {
        return this.apiClient.list(manifestId, streamId, new HashMap<String, Object>()).getData().getResult();
    }
    /**
     * List all Custom Tags of a Variant Stream
     * 
     * @param manifestId Id of the hls manifest. (required)
     * @param streamId Id of the variant stream. (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;CustomTag&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<CustomTag> list(String manifestId, String streamId, CustomTagListQueryParams queryParams) throws BitmovinException {
        return this.apiClient.list(manifestId, streamId, queryParams).getData().getResult();
    }
    
    interface CustomTagApiClient {
    
        @RequestLine("POST /encoding/manifests/hls/{manifest_id}/streams/{stream_id}/custom-tag")
        ResponseEnvelope<CustomTag> create(@Param(value = "manifest_id") String manifestId, @Param(value = "stream_id") String streamId, CustomTag customTag) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/manifests/hls/{manifest_id}/streams/{stream_id}/custom-tag/{custom_tag_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "manifest_id") String manifestId, @Param(value = "stream_id") String streamId, @Param(value = "custom_tag_id") String customTagId) throws BitmovinException;
    
        @RequestLine("GET /encoding/manifests/hls/{manifest_id}/streams/{stream_id}/custom-tag/{custom_tag_id}")
        ResponseEnvelope<CustomTag> get(@Param(value = "manifest_id") String manifestId, @Param(value = "stream_id") String streamId, @Param(value = "custom_tag_id") String customTagId) throws BitmovinException;
    
        @RequestLine("GET /encoding/manifests/hls/{manifest_id}/streams/{stream_id}/custom-tag")
        ResponseEnvelope<PaginationResponse<CustomTag>> list(@Param(value = "manifest_id") String manifestId, @Param(value = "stream_id") String streamId, @QueryMap Map<String, Object> queryParams) throws BitmovinException;
    }
}
