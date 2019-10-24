package com.bitmovin.api.sdk.encoding.encodings.inputStreams;

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
import com.bitmovin.api.sdk.encoding.encodings.inputStreams.type.TypeApi;
import com.bitmovin.api.sdk.encoding.encodings.inputStreams.audioMix.AudioMixApi;
import com.bitmovin.api.sdk.encoding.encodings.inputStreams.ingest.IngestApi;
import com.bitmovin.api.sdk.encoding.encodings.inputStreams.sidecar.SidecarApi;
import com.bitmovin.api.sdk.encoding.encodings.inputStreams.concatenation.ConcatenationApi;
import com.bitmovin.api.sdk.encoding.encodings.inputStreams.file.FileApi;
import com.bitmovin.api.sdk.encoding.encodings.inputStreams.trimming.TrimmingApi;
import com.bitmovin.api.sdk.encoding.encodings.inputStreams.subtitles.SubtitlesApi;
import com.bitmovin.api.sdk.encoding.encodings.inputStreams.captions.CaptionsApi;

public class InputStreamsApi {
    public final TypeApi type;
    public final AudioMixApi audioMix;
    public final IngestApi ingest;
    public final SidecarApi sidecar;
    public final ConcatenationApi concatenation;
    public final FileApi file;
    public final TrimmingApi trimming;
    public final SubtitlesApi subtitles;
    public final CaptionsApi captions;

    private final InputStreamsApiClient apiClient;

    public InputStreamsApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(InputStreamsApiClient.class);

        this.type = new TypeApi(clientFactory);
        this.audioMix = new AudioMixApi(clientFactory);
        this.ingest = new IngestApi(clientFactory);
        this.sidecar = new SidecarApi(clientFactory);
        this.concatenation = new ConcatenationApi(clientFactory);
        this.file = new FileApi(clientFactory);
        this.trimming = new TrimmingApi(clientFactory);
        this.subtitles = new SubtitlesApi(clientFactory);
        this.captions = new CaptionsApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of InputStreamsApi
     */
    public static BitmovinApiBuilder<InputStreamsApi> builder() {
        return new BitmovinApiBuilder<>(InputStreamsApi.class);
    }
    
    /**
     * Input Stream Details
     * 
     * @param encodingId Id of the encoding. (required)
     * @param inputStreamId Id of the input stream. (required)
     * @return InputStream
     * @throws BitmovinException if fails to make API call
     */
    public InputStream get(String encodingId, String inputStreamId) throws BitmovinException {
        try {
            return this.apiClient.get(encodingId, inputStreamId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * List All Input Streams
     * 
     * @param encodingId Id of the encoding. (required)
     * @return List&lt;InputStream&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<InputStream> list(String encodingId) throws BitmovinException {
        try {
            return this.apiClient.list(encodingId, new HashMap<String, Object>()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * List All Input Streams
     * 
     * @param encodingId Id of the encoding. (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;InputStream&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<InputStream> list(String encodingId, InputStreamListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(encodingId, queryParams).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    interface InputStreamsApiClient {
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/input-streams/{input_stream_id}")
        ResponseEnvelope<InputStream> get(@Param(value = "encoding_id") String encodingId, @Param(value = "input_stream_id") String inputStreamId) throws BitmovinException;
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/input-streams")
        ResponseEnvelope<PaginationResponse<InputStream>> list(@Param(value = "encoding_id") String encodingId, @QueryMap Map<String, Object> queryParams) throws BitmovinException;
    }
}
