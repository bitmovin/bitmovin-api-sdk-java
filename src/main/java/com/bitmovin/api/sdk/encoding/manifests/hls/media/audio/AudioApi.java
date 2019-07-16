package com.bitmovin.api.sdk.encoding.manifests.hls.media.audio;

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

public class AudioApi {

    private final AudioApiClient apiClient;

    public AudioApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(AudioApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of AudioApi
     */
    public static BitmovinApiBuilder<AudioApi> builder() {
        return new BitmovinApiBuilder<>(AudioApi.class);
    }
    
    /**
     * Add Audio Media
     * 
     * @param manifestId Id of the hls manifest. (required)
     * @param audioMediaInfo The Audio Media to be added (required)
     * @return AudioMediaInfo
     * @throws BitmovinException if fails to make API call
     */
    public AudioMediaInfo create(String manifestId, AudioMediaInfo audioMediaInfo) throws BitmovinException {
        return this.apiClient.create(manifestId, audioMediaInfo).getData().getResult();
    }
    
    /**
     * Delete Audio Media
     * 
     * @param manifestId Id of the hls manifest. (required)
     * @param mediaId Id of the audio media. (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse delete(String manifestId, String mediaId) throws BitmovinException {
        return this.apiClient.delete(manifestId, mediaId).getData().getResult();
    }
    
    /**
     * Audio Media Details
     * 
     * @param manifestId Id of the hls manifest. (required)
     * @param mediaId Id of the audio media. (required)
     * @return AudioMediaInfo
     * @throws BitmovinException if fails to make API call
     */
    public AudioMediaInfo get(String manifestId, String mediaId) throws BitmovinException {
        return this.apiClient.get(manifestId, mediaId).getData().getResult();
    }
    
    /**
     * List all Audio Media
     * 
     * @param manifestId Id of the hls manifest. (required)
     * @return List&lt;AudioMediaInfo&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<AudioMediaInfo> list(String manifestId) throws BitmovinException {
        return this.apiClient.list(manifestId, new HashMap<String, Object>()).getData().getResult();
    }
    /**
     * List all Audio Media
     * 
     * @param manifestId Id of the hls manifest. (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;AudioMediaInfo&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<AudioMediaInfo> list(String manifestId, AudioMediaInfoListQueryParams queryParams) throws BitmovinException {
        return this.apiClient.list(manifestId, queryParams).getData().getResult();
    }
    
    interface AudioApiClient {
    
        @RequestLine("POST /encoding/manifests/hls/{manifest_id}/media/audio")
        ResponseEnvelope<AudioMediaInfo> create(@Param(value = "manifest_id") String manifestId, AudioMediaInfo audioMediaInfo) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/manifests/hls/{manifest_id}/media/audio/{media_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "manifest_id") String manifestId, @Param(value = "media_id") String mediaId) throws BitmovinException;
    
        @RequestLine("GET /encoding/manifests/hls/{manifest_id}/media/audio/{media_id}")
        ResponseEnvelope<AudioMediaInfo> get(@Param(value = "manifest_id") String manifestId, @Param(value = "media_id") String mediaId) throws BitmovinException;
    
        @RequestLine("GET /encoding/manifests/hls/{manifest_id}/media/audio")
        ResponseEnvelope<PaginationResponse<AudioMediaInfo>> list(@Param(value = "manifest_id") String manifestId, @QueryMap Map<String, Object> queryParams) throws BitmovinException;
    }
}
