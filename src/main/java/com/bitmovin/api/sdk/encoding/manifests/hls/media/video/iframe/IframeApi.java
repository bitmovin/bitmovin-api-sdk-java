package com.bitmovin.api.sdk.encoding.manifests.hls.media.video.iframe;

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

public class IframeApi {

    private final IframeApiClient apiClient;

    public IframeApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(IframeApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of IframeApi
     */
    public static BitmovinApiBuilder<IframeApi> builder() {
        return new BitmovinApiBuilder<>(IframeApi.class);
    }
    
    /**
     * Add I-frame playlist to video media
     * 
     * @param manifestId Id of the hls manifest (required)
     * @param mediaId Id of the video media (required)
     * @param iframePlaylist  (optional)
     * @return IFramePlaylist
     * @throws BitmovinException if fails to make API call
     */
    public IFramePlaylist create(String manifestId, String mediaId, IFramePlaylist iframePlaylist) throws BitmovinException {
        return this.apiClient.create(manifestId, mediaId, iframePlaylist).getData().getResult();
    }
    
    /**
     * Delete I-frame playlist
     * 
     * @param manifestId Id of the hls manifest (required)
     * @param mediaId Id of the video media (required)
     * @param iframeId Id of the Iframe-Playlist (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse delete(String manifestId, String mediaId, String iframeId) throws BitmovinException {
        return this.apiClient.delete(manifestId, mediaId, iframeId).getData().getResult();
    }
    
    /**
     * I-frame playlist Details
     * 
     * @param manifestId Id of the hls manifest (required)
     * @param mediaId Id of the video media (required)
     * @param iframeId Id of the Iframe-Playlist (required)
     * @return IFramePlaylist
     * @throws BitmovinException if fails to make API call
     */
    public IFramePlaylist get(String manifestId, String mediaId, String iframeId) throws BitmovinException {
        return this.apiClient.get(manifestId, mediaId, iframeId).getData().getResult();
    }
    
    /**
     * List all I-frame playlists of a video media
     * 
     * @param manifestId Id of the hls manifest (required)
     * @param mediaId Id of the video media (required)
     * @return List&lt;IFramePlaylist&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<IFramePlaylist> list(String manifestId, String mediaId) throws BitmovinException {
        return this.apiClient.list(manifestId, mediaId, new HashMap<String, Object>()).getData().getResult();
    }
    /**
     * List all I-frame playlists of a video media
     * 
     * @param manifestId Id of the hls manifest (required)
     * @param mediaId Id of the video media (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;IFramePlaylist&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<IFramePlaylist> list(String manifestId, String mediaId, IFramePlaylistListQueryParams queryParams) throws BitmovinException {
        return this.apiClient.list(manifestId, mediaId, queryParams).getData().getResult();
    }
    
    interface IframeApiClient {
    
        @RequestLine("POST /encoding/manifests/hls/{manifest_id}/media/video/{media_id}/iframe")
        ResponseEnvelope<IFramePlaylist> create(@Param(value = "manifest_id") String manifestId, @Param(value = "media_id") String mediaId, IFramePlaylist iframePlaylist) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/manifests/hls/{manifest_id}/media/video/{media_id}/iframe/{iframe_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "manifest_id") String manifestId, @Param(value = "media_id") String mediaId, @Param(value = "iframe_id") String iframeId) throws BitmovinException;
    
        @RequestLine("GET /encoding/manifests/hls/{manifest_id}/media/video/{media_id}/iframe/{iframe_id}")
        ResponseEnvelope<IFramePlaylist> get(@Param(value = "manifest_id") String manifestId, @Param(value = "media_id") String mediaId, @Param(value = "iframe_id") String iframeId) throws BitmovinException;
    
        @RequestLine("GET /encoding/manifests/hls/{manifest_id}/media/video/{media_id}/iframe")
        ResponseEnvelope<PaginationResponse<IFramePlaylist>> list(@Param(value = "manifest_id") String manifestId, @Param(value = "media_id") String mediaId, @QueryMap Map<String, Object> queryParams) throws BitmovinException;
    }
}
