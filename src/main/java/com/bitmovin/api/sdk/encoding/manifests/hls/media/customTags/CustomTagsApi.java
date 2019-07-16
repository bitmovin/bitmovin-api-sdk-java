package com.bitmovin.api.sdk.encoding.manifests.hls.media.customTags;

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
     * Add Custom Tag to Audio Media
     * 
     * @param manifestId Id of the hls manifest. (required)
     * @param mediaId Id of the audio media. (required)
     * @param customTag The Custom Tag to be added (required)
     * @return CustomTag
     * @throws BitmovinException if fails to make API call
     */
    public CustomTag create(String manifestId, String mediaId, CustomTag customTag) throws BitmovinException {
        return this.apiClient.create(manifestId, mediaId, customTag).getData().getResult();
    }
    
    /**
     * Delete Custom Tag
     * 
     * @param manifestId Id of the hls manifest. (required)
     * @param mediaId Id of the audio media. (required)
     * @param customTagId Id of the custom tag. (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse delete(String manifestId, String mediaId, String customTagId) throws BitmovinException {
        return this.apiClient.delete(manifestId, mediaId, customTagId).getData().getResult();
    }
    
    /**
     * Custom Tag Details
     * 
     * @param manifestId Id of the hls manifest. (required)
     * @param mediaId Id of the audio media (required)
     * @param customTagId Id of the custom tag. (required)
     * @return CustomTag
     * @throws BitmovinException if fails to make API call
     */
    public CustomTag get(String manifestId, String mediaId, String customTagId) throws BitmovinException {
        return this.apiClient.get(manifestId, mediaId, customTagId).getData().getResult();
    }
    
    /**
     * List all Custom Tags of a Audio media
     * 
     * @param manifestId Id of the hls manifest. (required)
     * @param mediaId Id of the audio media. (required)
     * @return List&lt;CustomTag&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<CustomTag> list(String manifestId, String mediaId) throws BitmovinException {
        return this.apiClient.list(manifestId, mediaId, new HashMap<String, Object>()).getData().getResult();
    }
    /**
     * List all Custom Tags of a Audio media
     * 
     * @param manifestId Id of the hls manifest. (required)
     * @param mediaId Id of the audio media. (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;CustomTag&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<CustomTag> list(String manifestId, String mediaId, CustomTagListQueryParams queryParams) throws BitmovinException {
        return this.apiClient.list(manifestId, mediaId, queryParams).getData().getResult();
    }
    
    interface CustomTagsApiClient {
    
        @RequestLine("POST /encoding/manifests/hls/{manifest_id}/media/{media_id}/custom-tags")
        ResponseEnvelope<CustomTag> create(@Param(value = "manifest_id") String manifestId, @Param(value = "media_id") String mediaId, CustomTag customTag) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/manifests/hls/{manifest_id}/media/{media_id}/custom-tags/{custom_tag_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "manifest_id") String manifestId, @Param(value = "media_id") String mediaId, @Param(value = "custom_tag_id") String customTagId) throws BitmovinException;
    
        @RequestLine("GET /encoding/manifests/hls/{manifest_id}/media/{media_id}/custom-tags/{custom_tag_id}")
        ResponseEnvelope<CustomTag> get(@Param(value = "manifest_id") String manifestId, @Param(value = "media_id") String mediaId, @Param(value = "custom_tag_id") String customTagId) throws BitmovinException;
    
        @RequestLine("GET /encoding/manifests/hls/{manifest_id}/media/{media_id}/custom-tags")
        ResponseEnvelope<PaginationResponse<CustomTag>> list(@Param(value = "manifest_id") String manifestId, @Param(value = "media_id") String mediaId, @QueryMap Map<String, Object> queryParams) throws BitmovinException;
    }
}
