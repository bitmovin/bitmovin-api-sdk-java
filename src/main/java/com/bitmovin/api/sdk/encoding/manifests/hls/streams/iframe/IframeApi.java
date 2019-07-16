package com.bitmovin.api.sdk.encoding.manifests.hls.streams.iframe;

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
     * Add I-frame playlist to variant stream
     * 
     * @param manifestId Id of the hls manifest. (required)
     * @param streamId Id of the variant stream. (required)
     * @param iframePlaylist The I-frame playlist to be added (required)
     * @return IFramePlaylist
     * @throws BitmovinException if fails to make API call
     */
    public IFramePlaylist create(String manifestId, String streamId, IFramePlaylist iframePlaylist) throws BitmovinException {
        return this.apiClient.create(manifestId, streamId, iframePlaylist).getData().getResult();
    }
    
    /**
     * Delete I-frame playlist
     * 
     * @param manifestId Id of the hls manifest. (required)
     * @param streamId Id of the variant stream. (required)
     * @param iframeId Id of the Iframe-Playlist. (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse delete(String manifestId, String streamId, String iframeId) throws BitmovinException {
        return this.apiClient.delete(manifestId, streamId, iframeId).getData().getResult();
    }
    
    /**
     * I-frame playlist Details
     * 
     * @param manifestId Id of the hls manifest. (required)
     * @param streamId Id of the variant stream. (required)
     * @param iframeId Id of the Iframe-Playlist. (required)
     * @return IFramePlaylist
     * @throws BitmovinException if fails to make API call
     */
    public IFramePlaylist get(String manifestId, String streamId, String iframeId) throws BitmovinException {
        return this.apiClient.get(manifestId, streamId, iframeId).getData().getResult();
    }
    
    /**
     * List all I-frame playlists of a variant stream
     * 
     * @param manifestId Id of the hls manifest. (required)
     * @param streamId Id of the variant stream. (required)
     * @return List&lt;IFramePlaylist&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<IFramePlaylist> list(String manifestId, String streamId) throws BitmovinException {
        return this.apiClient.list(manifestId, streamId, new HashMap<String, Object>()).getData().getResult();
    }
    /**
     * List all I-frame playlists of a variant stream
     * 
     * @param manifestId Id of the hls manifest. (required)
     * @param streamId Id of the variant stream. (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;IFramePlaylist&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<IFramePlaylist> list(String manifestId, String streamId, IFramePlaylistListQueryParams queryParams) throws BitmovinException {
        return this.apiClient.list(manifestId, streamId, queryParams).getData().getResult();
    }
    
    interface IframeApiClient {
    
        @RequestLine("POST /encoding/manifests/hls/{manifest_id}/streams/{stream_id}/iframe")
        ResponseEnvelope<IFramePlaylist> create(@Param(value = "manifest_id") String manifestId, @Param(value = "stream_id") String streamId, IFramePlaylist iframePlaylist) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/manifests/hls/{manifest_id}/streams/{stream_id}/iframe/{iframe_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "manifest_id") String manifestId, @Param(value = "stream_id") String streamId, @Param(value = "iframe_id") String iframeId) throws BitmovinException;
    
        @RequestLine("GET /encoding/manifests/hls/{manifest_id}/streams/{stream_id}/iframe/{iframe_id}")
        ResponseEnvelope<IFramePlaylist> get(@Param(value = "manifest_id") String manifestId, @Param(value = "stream_id") String streamId, @Param(value = "iframe_id") String iframeId) throws BitmovinException;
    
        @RequestLine("GET /encoding/manifests/hls/{manifest_id}/streams/{stream_id}/iframe")
        ResponseEnvelope<PaginationResponse<IFramePlaylist>> list(@Param(value = "manifest_id") String manifestId, @Param(value = "stream_id") String streamId, @QueryMap Map<String, Object> queryParams) throws BitmovinException;
    }
}
