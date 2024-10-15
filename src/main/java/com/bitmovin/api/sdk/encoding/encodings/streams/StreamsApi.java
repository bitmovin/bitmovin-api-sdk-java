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
import static com.bitmovin.api.sdk.common.BitmovinExceptionFactory.buildBitmovinException;
import com.bitmovin.api.sdk.common.BitmovinDateExpander;
import com.bitmovin.api.sdk.common.QueryMapWrapper;
import com.bitmovin.api.sdk.common.BitmovinApiBuilder;
import com.bitmovin.api.sdk.common.BitmovinApiClientFactory;
import com.bitmovin.api.sdk.encoding.encodings.streams.customdata.CustomdataApi;
import com.bitmovin.api.sdk.encoding.encodings.streams.input.InputApi;
import com.bitmovin.api.sdk.encoding.encodings.streams.inputs.InputsApi;
import com.bitmovin.api.sdk.encoding.encodings.streams.filters.FiltersApi;
import com.bitmovin.api.sdk.encoding.encodings.streams.burnInSubtitles.BurnInSubtitlesApi;
import com.bitmovin.api.sdk.encoding.encodings.streams.watermarking.WatermarkingApi;
import com.bitmovin.api.sdk.encoding.encodings.streams.captions.CaptionsApi;
import com.bitmovin.api.sdk.encoding.encodings.streams.bifs.BifsApi;
import com.bitmovin.api.sdk.encoding.encodings.streams.hdr.HdrApi;
import com.bitmovin.api.sdk.encoding.encodings.streams.thumbnails.ThumbnailsApi;
import com.bitmovin.api.sdk.encoding.encodings.streams.sprites.SpritesApi;
import com.bitmovin.api.sdk.encoding.encodings.streams.qc.QcApi;

public class StreamsApi {
    public final CustomdataApi customdata;
    public final InputApi input;
    public final InputsApi inputs;
    public final FiltersApi filters;
    public final BurnInSubtitlesApi burnInSubtitles;
    public final WatermarkingApi watermarking;
    public final CaptionsApi captions;
    public final BifsApi bifs;
    public final HdrApi hdr;
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
        this.burnInSubtitles = new BurnInSubtitlesApi(clientFactory);
        this.watermarking = new WatermarkingApi(clientFactory);
        this.captions = new CaptionsApi(clientFactory);
        this.bifs = new BifsApi(clientFactory);
        this.hdr = new HdrApi(clientFactory);
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
     * @param stream The Stream to be created (required)
     * @return Stream
     * @throws BitmovinException if fails to make API call
     */
    public Stream create(String encodingId, Stream stream) throws BitmovinException {
        try {
            return this.apiClient.create(encodingId, stream).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
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
        try {
            return this.apiClient.delete(encodingId, streamId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
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
        try {
            return this.apiClient.get(encodingId, streamId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * List Streams
     * 
     * @param encodingId Id of the encoding. (required)
     * @return List&lt;Stream&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<Stream> list(String encodingId) throws BitmovinException {
        try {
            return this.apiClient.list(encodingId, new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
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
        try {
            return this.apiClient.list(encodingId, new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface StreamsApiClient { 
        @RequestLine("POST /encoding/encodings/{encoding_id}/streams")
        ResponseEnvelope<Stream> create(@Param(value = "encoding_id") String encodingId, Stream stream) throws BitmovinException;
   
        @RequestLine("DELETE /encoding/encodings/{encoding_id}/streams/{stream_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "encoding_id") String encodingId, @Param(value = "stream_id") String streamId) throws BitmovinException;
   
        @RequestLine("GET /encoding/encodings/{encoding_id}/streams/{stream_id}")
        ResponseEnvelope<Stream> get(@Param(value = "encoding_id") String encodingId, @Param(value = "stream_id") String streamId) throws BitmovinException;
   
        @RequestLine("GET /encoding/encodings/{encoding_id}/streams")
        ResponseEnvelope<PaginationResponse<Stream>> list(@Param(value = "encoding_id") String encodingId, @QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    }
}
