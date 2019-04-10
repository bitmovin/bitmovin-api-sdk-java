package com.bitmovin.api.sdk.encoding.encodings.streams;

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
import com.bitmovin.api.sdk.encoding.encodings.streams.customdata.CustomdataApi;
import com.bitmovin.api.sdk.encoding.encodings.streams.input.InputApi;
import com.bitmovin.api.sdk.encoding.encodings.streams.inputs.InputsApi;
import com.bitmovin.api.sdk.encoding.encodings.streams.filters.FiltersApi;
import com.bitmovin.api.sdk.encoding.encodings.streams.subtitles.SubtitlesApi;
import com.bitmovin.api.sdk.encoding.encodings.streams.burnInSubtitles.BurnInSubtitlesApi;
import com.bitmovin.api.sdk.encoding.encodings.streams.captions.CaptionsApi;
import com.bitmovin.api.sdk.encoding.encodings.streams.thumbnails.ThumbnailsApi;
import com.bitmovin.api.sdk.encoding.encodings.streams.sprites.SpritesApi;
import com.bitmovin.api.sdk.encoding.encodings.streams.qc.QcApi;

public class StreamsApi {
    public final CustomdataApi customdata;
    public final InputApi input;
    public final InputsApi inputs;
    public final FiltersApi filters;
    public final SubtitlesApi subtitles;
    public final BurnInSubtitlesApi burnInSubtitles;
    public final CaptionsApi captions;
    public final ThumbnailsApi thumbnails;
    public final SpritesApi sprites;
    public final QcApi qc;

    private final StreamsApiClient apiClient;

    public StreamsApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(StreamsApiClient.class);

        this.customdata = new CustomdataApi(clientFactory);
        this.input = new InputApi(clientFactory);
        this.inputs = new InputsApi(clientFactory);
        this.filters = new FiltersApi(clientFactory);
        this.subtitles = new SubtitlesApi(clientFactory);
        this.burnInSubtitles = new BurnInSubtitlesApi(clientFactory);
        this.captions = new CaptionsApi(clientFactory);
        this.thumbnails = new ThumbnailsApi(clientFactory);
        this.sprites = new SpritesApi(clientFactory);
        this.qc = new QcApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of StreamsApi
     */
    public static BitmovinApiBuilder<StreamsApi> builder() {
        return new BitmovinApiBuilder<>(StreamsApi.class);
    }
    
    /**
     * Add Stream
     * 
     * @param encodingId Id of the encoding. (required)
     * @param stream  (optional)
     * @return Stream
     * @throws BitmovinException if fails to make API call
     */
    public Stream create(String encodingId, Stream stream) throws BitmovinException {
        return this.apiClient.create(encodingId, stream).getData().getResult();
    }
    
    /**
     * Delete Stream
     * 
     * @param encodingId Id of the encoding. (required)
     * @param streamId Id of the stream. (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse delete(String encodingId, String streamId) throws BitmovinException {
        return this.apiClient.delete(encodingId, streamId).getData().getResult();
    }
    
    /**
     * Stream Details
     * 
     * @param encodingId Id of the encoding. (required)
     * @param streamId Id of the stream. (required)
     * @return Stream
     * @throws BitmovinException if fails to make API call
     */
    public Stream get(String encodingId, String streamId) throws BitmovinException {
        return this.apiClient.get(encodingId, streamId).getData().getResult();
    }
    
    /**
     * List Streams
     * 
     * @param encodingId Id of the encoding. (required)
     * @return List&lt;Stream&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<Stream> list(String encodingId) throws BitmovinException {
        return this.apiClient.list(encodingId, new HashMap<String, Object>()).getData().getResult();
    }
    /**
     * List Streams
     * 
     * @param encodingId Id of the encoding. (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;Stream&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<Stream> list(String encodingId, StreamListQueryParams queryParams) throws BitmovinException {
        return this.apiClient.list(encodingId, queryParams).getData().getResult();
    }
    
    interface StreamsApiClient {
    
        @RequestLine("POST /encoding/encodings/{encoding_id}/streams")
        ResponseEnvelope<Stream> create(@Param(value = "encoding_id") String encodingId, Stream stream) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/encodings/{encoding_id}/streams/{stream_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "encoding_id") String encodingId, @Param(value = "stream_id") String streamId) throws BitmovinException;
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/streams/{stream_id}")
        ResponseEnvelope<Stream> get(@Param(value = "encoding_id") String encodingId, @Param(value = "stream_id") String streamId) throws BitmovinException;
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/streams")
        ResponseEnvelope<PaginationResponse<Stream>> list(@Param(value = "encoding_id") String encodingId, @QueryMap Map<String, Object> queryParams) throws BitmovinException;
    }
}
