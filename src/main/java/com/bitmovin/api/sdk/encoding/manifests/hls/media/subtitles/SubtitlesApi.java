package com.bitmovin.api.sdk.encoding.manifests.hls.media.subtitles;

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

public class SubtitlesApi {

    private final SubtitlesApiClient apiClient;

    public SubtitlesApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(SubtitlesApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of SubtitlesApi
     */
    public static BitmovinApiBuilder<SubtitlesApi> builder() {
        return new BitmovinApiBuilder<>(SubtitlesApi.class);
    }
    
    /**
     * Add Subtitles Media
     * 
     * @param manifestId Id of the hls manifest. (required)
     * @param subtitlesMediaInfo The Subtitles Media to be added (required)
     * @return SubtitlesMediaInfo
     * @throws BitmovinException if fails to make API call
     */
    public SubtitlesMediaInfo create(String manifestId, SubtitlesMediaInfo subtitlesMediaInfo) throws BitmovinException {
        try {
            return this.apiClient.create(manifestId, subtitlesMediaInfo).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * Delete Subtitles Media
     * 
     * @param manifestId Id of the hls manifest. (required)
     * @param mediaId Id of the subtitles media. (required)
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
     * Subtitles Media Details
     * 
     * @param manifestId Id of the hls manifest. (required)
     * @param mediaId Id of the subtitles media. (required)
     * @return SubtitlesMediaInfo
     * @throws BitmovinException if fails to make API call
     */
    public SubtitlesMediaInfo get(String manifestId, String mediaId) throws BitmovinException {
        try {
            return this.apiClient.get(manifestId, mediaId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * List all Subtitles Media
     * 
     * @param manifestId Id of the hls manifest. (required)
     * @return List&lt;SubtitlesMediaInfo&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<SubtitlesMediaInfo> list(String manifestId) throws BitmovinException {
        try {
            return this.apiClient.list(manifestId, new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * List all Subtitles Media
     * 
     * @param manifestId Id of the hls manifest. (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;SubtitlesMediaInfo&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<SubtitlesMediaInfo> list(String manifestId, SubtitlesMediaInfoListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(manifestId, new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    interface SubtitlesApiClient {
    
        @RequestLine("POST /encoding/manifests/hls/{manifest_id}/media/subtitles")
        ResponseEnvelope<SubtitlesMediaInfo> create(@Param(value = "manifest_id") String manifestId, SubtitlesMediaInfo subtitlesMediaInfo) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/manifests/hls/{manifest_id}/media/subtitles/{media_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "manifest_id") String manifestId, @Param(value = "media_id") String mediaId) throws BitmovinException;
    
        @RequestLine("GET /encoding/manifests/hls/{manifest_id}/media/subtitles/{media_id}")
        ResponseEnvelope<SubtitlesMediaInfo> get(@Param(value = "manifest_id") String manifestId, @Param(value = "media_id") String mediaId) throws BitmovinException;
    
        @RequestLine("GET /encoding/manifests/hls/{manifest_id}/media/subtitles")
        ResponseEnvelope<PaginationResponse<SubtitlesMediaInfo>> list(@Param(value = "manifest_id") String manifestId, @QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    }
}
