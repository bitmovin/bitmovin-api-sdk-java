package com.bitmovin.api.sdk.encoding.manifests.hls.streams.customTags;

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

public class CustomTagsApi {

    private final CustomTagsApiClient apiClient;

    public CustomTagsApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(CustomTagsApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of CustomTagsApi
     */
    public static BitmovinApiBuilder<CustomTagsApi> builder() {
        return new BitmovinApiBuilder<>(CustomTagsApi.class);
    }

    /**
     * Add Custom Tag to Variant Stream
     * 
     * @param manifestId Id of the hls manifest. (required)
     * @param streamId Id of the variant stream. (required)
     * @param customTag The Custom Tag to be added (required)
     * @return CustomTag
     * @throws BitmovinException if fails to make API call
     */
    public CustomTag create(String manifestId, String streamId, CustomTag customTag) throws BitmovinException {
        try {
            return this.apiClient.create(manifestId, streamId, customTag).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
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
        try {
            return this.apiClient.delete(manifestId, streamId, customTagId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
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
        try {
            return this.apiClient.get(manifestId, streamId, customTagId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
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
        try {
            return this.apiClient.list(manifestId, streamId, new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
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
        try {
            return this.apiClient.list(manifestId, streamId, new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface CustomTagsApiClient {

        @RequestLine("POST /encoding/manifests/hls/{manifest_id}/streams/{stream_id}/custom-tags")
        ResponseEnvelope<CustomTag> create(@Param(value = "manifest_id") String manifestId, @Param(value = "stream_id") String streamId, CustomTag customTag) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/manifests/hls/{manifest_id}/streams/{stream_id}/custom-tags/{custom_tag_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "manifest_id") String manifestId, @Param(value = "stream_id") String streamId, @Param(value = "custom_tag_id") String customTagId) throws BitmovinException;
    
        @RequestLine("GET /encoding/manifests/hls/{manifest_id}/streams/{stream_id}/custom-tags/{custom_tag_id}")
        ResponseEnvelope<CustomTag> get(@Param(value = "manifest_id") String manifestId, @Param(value = "stream_id") String streamId, @Param(value = "custom_tag_id") String customTagId) throws BitmovinException;
    
        @RequestLine("GET /encoding/manifests/hls/{manifest_id}/streams/{stream_id}/custom-tags")
        ResponseEnvelope<PaginationResponse<CustomTag>> list(@Param(value = "manifest_id") String manifestId, @Param(value = "stream_id") String streamId, @QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    }
}
