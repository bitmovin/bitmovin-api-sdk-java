package com.bitmovin.api.sdk.encoding.manifests.hls.streams;

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
import com.bitmovin.api.sdk.encoding.manifests.hls.streams.customTags.CustomTagsApi;
import com.bitmovin.api.sdk.encoding.manifests.hls.streams.iframe.IframeApi;

public class StreamsApi {
    public final CustomTagsApi customTags;
    public final IframeApi iframe;

    private final StreamsApiClient apiClient;

    public StreamsApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(StreamsApiClient.class);

        this.customTags = new CustomTagsApi(clientFactory);
        this.iframe = new IframeApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of StreamsApi
     */
    public static BitmovinApiBuilder<StreamsApi> builder() {
        return new BitmovinApiBuilder<>(StreamsApi.class);
    }
    
    /**
     * Add Variant Stream
     * 
     * @param manifestId Id of the hls manifest. (required)
     * @param streamInfo The Variant Stream to be added (required)
     * @return StreamInfo
     * @throws BitmovinException if fails to make API call
     */
    public StreamInfo create(String manifestId, StreamInfo streamInfo) throws BitmovinException {
        return this.apiClient.create(manifestId, streamInfo).getData().getResult();
    }
    
    /**
     * Delete Variant Stream
     * 
     * @param manifestId Id of the hls manifest. (required)
     * @param streamId Id of the variant stream. (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse delete(String manifestId, String streamId) throws BitmovinException {
        return this.apiClient.delete(manifestId, streamId).getData().getResult();
    }
    
    /**
     * Variant Stream Details
     * 
     * @param manifestId Id of the hls manifest. (required)
     * @param streamId Id of the variant stream. (required)
     * @return StreamInfo
     * @throws BitmovinException if fails to make API call
     */
    public StreamInfo get(String manifestId, String streamId) throws BitmovinException {
        return this.apiClient.get(manifestId, streamId).getData().getResult();
    }
    
    /**
     * List all Variant Streams
     * 
     * @param manifestId Id of the hls manifest. (required)
     * @return List&lt;StreamInfo&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<StreamInfo> list(String manifestId) throws BitmovinException {
        return this.apiClient.list(manifestId, new HashMap<String, Object>()).getData().getResult();
    }
    /**
     * List all Variant Streams
     * 
     * @param manifestId Id of the hls manifest. (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;StreamInfo&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<StreamInfo> list(String manifestId, StreamInfoListQueryParams queryParams) throws BitmovinException {
        return this.apiClient.list(manifestId, queryParams).getData().getResult();
    }
    
    interface StreamsApiClient {
    
        @RequestLine("POST /encoding/manifests/hls/{manifest_id}/streams")
        ResponseEnvelope<StreamInfo> create(@Param(value = "manifest_id") String manifestId, StreamInfo streamInfo) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/manifests/hls/{manifest_id}/streams/{stream_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "manifest_id") String manifestId, @Param(value = "stream_id") String streamId) throws BitmovinException;
    
        @RequestLine("GET /encoding/manifests/hls/{manifest_id}/streams/{stream_id}")
        ResponseEnvelope<StreamInfo> get(@Param(value = "manifest_id") String manifestId, @Param(value = "stream_id") String streamId) throws BitmovinException;
    
        @RequestLine("GET /encoding/manifests/hls/{manifest_id}/streams")
        ResponseEnvelope<PaginationResponse<StreamInfo>> list(@Param(value = "manifest_id") String manifestId, @QueryMap Map<String, Object> queryParams) throws BitmovinException;
    }
}
