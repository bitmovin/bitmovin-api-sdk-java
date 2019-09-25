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
import static com.bitmovin.api.sdk.common.BitmovinExceptionFactory.buildBitmovinException;
import com.bitmovin.api.sdk.common.BitmovinDateExpander;
import com.bitmovin.api.sdk.common.BitmovinApiBuilder;
import com.bitmovin.api.sdk.common.BitmovinApiClientFactory;

public class VideoApi {

    private final VideoApiClient apiClient;

    public VideoApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(VideoApiClient.class);

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
     * @param videoMediaInfo The Video Media to be added (required)
     * @return VideoMediaInfo
     * @throws BitmovinException if fails to make API call
     */
    public VideoMediaInfo create(String manifestId, VideoMediaInfo videoMediaInfo) throws BitmovinException {
        try {
            return this.apiClient.create(manifestId, videoMediaInfo).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
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
        try {
            return this.apiClient.delete(manifestId, mediaId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
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
        try {
            return this.apiClient.get(manifestId, mediaId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * List all Video Media
     * 
     * @param manifestId Id of the hls manifest. (required)
     * @return List&lt;VideoMediaInfo&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<VideoMediaInfo> list(String manifestId) throws BitmovinException {
        try {
            return this.apiClient.list(manifestId, new HashMap<String, Object>()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
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
        try {
            return this.apiClient.list(manifestId, queryParams).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
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
