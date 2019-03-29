package com.bitmovin.api.sdk.encoding.encodings.streams.thumbnails;

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
import com.bitmovin.api.sdk.encoding.encodings.streams.thumbnails.customdata.CustomdataApi;

public class ThumbnailsApi {
    public final CustomdataApi customdata;

    private final ThumbnailsApiClient apiClient;

    public ThumbnailsApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(ThumbnailsApiClient.class);

        this.customdata = new CustomdataApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of ThumbnailsApi
     */
    public static BitmovinApiBuilder<ThumbnailsApi> builder() {
        return new BitmovinApiBuilder<>(ThumbnailsApi.class);
    }
    
    /**
     * Add Thumbnail
     * 
     * @param encodingId Id of the encoding. (required)
     * @param streamId Id of the stream. (required)
     * @param thumbnail  (optional)
     * @return Thumbnail
     * @throws BitmovinException if fails to make API call
     */
    public Thumbnail create(String encodingId, String streamId, Thumbnail thumbnail) throws BitmovinException {
        return this.apiClient.create(encodingId, streamId, thumbnail).getData().getResult();
    }
    
    /**
     * Delete Thumbnail
     * 
     * @param encodingId Id of the encoding. (required)
     * @param streamId Id of the stream. (required)
     * @param thumbnailId Id of the thumbnail. (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse delete(String encodingId, String streamId, String thumbnailId) throws BitmovinException {
        return this.apiClient.delete(encodingId, streamId, thumbnailId).getData().getResult();
    }
    
    /**
     * Thumbnail Details
     * 
     * @param encodingId Id of the encoding. (required)
     * @param streamId Id of the stream. (required)
     * @param thumbnailId Id of the thumbnail. (required)
     * @return Thumbnail
     * @throws BitmovinException if fails to make API call
     */
    public Thumbnail get(String encodingId, String streamId, String thumbnailId) throws BitmovinException {
        return this.apiClient.get(encodingId, streamId, thumbnailId).getData().getResult();
    }
    
    /**
     * List Thumbnails
     * 
     * @param encodingId Id of the encoding. (required)
     * @param streamId Id of the stream. (required)
     * @return List&lt;Thumbnail&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<Thumbnail> list(String encodingId, String streamId) throws BitmovinException {
        return this.apiClient.list(encodingId, streamId, new HashMap<String, Object>()).getData().getResult();
    }
    /**
     * List Thumbnails
     * 
     * @param encodingId Id of the encoding. (required)
     * @param streamId Id of the stream. (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;Thumbnail&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<Thumbnail> list(String encodingId, String streamId, ThumbnailListQueryParams queryParams) throws BitmovinException {
        return this.apiClient.list(encodingId, streamId, queryParams).getData().getResult();
    }
    
    interface ThumbnailsApiClient {
    
        @RequestLine("POST /encoding/encodings/{encoding_id}/streams/{stream_id}/thumbnails")
        ResponseEnvelope<Thumbnail> create(@Param(value = "encoding_id") String encodingId, @Param(value = "stream_id") String streamId, Thumbnail thumbnail) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/encodings/{encoding_id}/streams/{stream_id}/thumbnails/{thumbnail_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "encoding_id") String encodingId, @Param(value = "stream_id") String streamId, @Param(value = "thumbnail_id") String thumbnailId) throws BitmovinException;
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/streams/{stream_id}/thumbnails/{thumbnail_id}")
        ResponseEnvelope<Thumbnail> get(@Param(value = "encoding_id") String encodingId, @Param(value = "stream_id") String streamId, @Param(value = "thumbnail_id") String thumbnailId) throws BitmovinException;
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/streams/{stream_id}/thumbnails")
        ResponseEnvelope<PaginationResponse<Thumbnail>> list(@Param(value = "encoding_id") String encodingId, @Param(value = "stream_id") String streamId, @QueryMap Map<String, Object> queryParams) throws BitmovinException;
    }
}
