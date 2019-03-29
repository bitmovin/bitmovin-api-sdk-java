package com.bitmovin.api.sdk.encoding.manifests.hls.media.video;

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
import com.bitmovin.api.sdk.encoding.manifests.hls.media.video.iframe.IframeApi;

public class VideoApi {
    public final IframeApi iframe;

    private final VideoApiClient apiClient;

    public VideoApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(VideoApiClient.class);

        this.iframe = new IframeApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of VideoApi
     */
    public static BitmovinApiBuilder<VideoApi> builder() {
        return new BitmovinApiBuilder<>(VideoApi.class);
    }
    
    /**
     * Add Video Media
     * 
     * @param manifestId Id of the hls manifest. (required)
     * @param videoMediaInfo  (optional)
     * @return VideoMediaInfo
     * @throws BitmovinException if fails to make API call
     */
    public VideoMediaInfo create(String manifestId, VideoMediaInfo videoMediaInfo) throws BitmovinException {
        return this.apiClient.create(manifestId, videoMediaInfo).getData().getResult();
    }
    
    /**
     * Delete Video Media
     * 
     * @param manifestId Id of the hls manifest. (required)
     * @param mediaId Id of the video media. (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse delete(String manifestId, String mediaId) throws BitmovinException {
        return this.apiClient.delete(manifestId, mediaId).getData().getResult();
    }
    
    /**
     * Video Media Details
     * 
     * @param manifestId Id of the hls manifest. (required)
     * @param mediaId Id of the video media. (required)
     * @return VideoMediaInfo
     * @throws BitmovinException if fails to make API call
     */
    public VideoMediaInfo get(String manifestId, String mediaId) throws BitmovinException {
        return this.apiClient.get(manifestId, mediaId).getData().getResult();
    }
    
    /**
     * List all Video Media
     * 
     * @param manifestId Id of the hls manifest. (required)
     * @return List&lt;VideoMediaInfo&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<VideoMediaInfo> list(String manifestId) throws BitmovinException {
        return this.apiClient.list(manifestId, new HashMap<String, Object>()).getData().getResult();
    }
    /**
     * List all Video Media
     * 
     * @param manifestId Id of the hls manifest. (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;VideoMediaInfo&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<VideoMediaInfo> list(String manifestId, VideoMediaInfoListQueryParams queryParams) throws BitmovinException {
        return this.apiClient.list(manifestId, queryParams).getData().getResult();
    }
    
    interface VideoApiClient {
    
        @RequestLine("POST /encoding/manifests/hls/{manifest_id}/media/video")
        ResponseEnvelope<VideoMediaInfo> create(@Param(value = "manifest_id") String manifestId, VideoMediaInfo videoMediaInfo) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/manifests/hls/{manifest_id}/media/video/{media_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "manifest_id") String manifestId, @Param(value = "media_id") String mediaId) throws BitmovinException;
    
        @RequestLine("GET /encoding/manifests/hls/{manifest_id}/media/video/{media_id}")
        ResponseEnvelope<VideoMediaInfo> get(@Param(value = "manifest_id") String manifestId, @Param(value = "media_id") String mediaId) throws BitmovinException;
    
        @RequestLine("GET /encoding/manifests/hls/{manifest_id}/media/video")
        ResponseEnvelope<PaginationResponse<VideoMediaInfo>> list(@Param(value = "manifest_id") String manifestId, @QueryMap Map<String, Object> queryParams) throws BitmovinException;
    }
}
