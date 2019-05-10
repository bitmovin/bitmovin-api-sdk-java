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
import com.bitmovin.api.sdk.common.BitmovinDateExpander;
import com.bitmovin.api.sdk.common.BitmovinApiBuilder;
import com.bitmovin.api.sdk.common.BitmovinApiClientFactory;
import com.bitmovin.api.sdk.encoding.encodings.inputStreams.type.TypeApi;
import com.bitmovin.api.sdk.encoding.encodings.inputStreams.audioMix.AudioMixApi;
import com.bitmovin.api.sdk.encoding.encodings.inputStreams.ingest.IngestApi;
import com.bitmovin.api.sdk.encoding.encodings.inputStreams.concatenation.ConcatenationApi;
import com.bitmovin.api.sdk.encoding.encodings.inputStreams.trimming.TrimmingApi;

public class InputStreamsApi {
    public final TypeApi type;
    public final AudioMixApi audioMix;
    public final IngestApi ingest;
    public final ConcatenationApi concatenation;
    public final TrimmingApi trimming;

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
        this.concatenation = new ConcatenationApi(clientFactory);
        this.trimming = new TrimmingApi(clientFactory);
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
        return this.apiClient.get(encodingId, inputStreamId).getData().getResult();
    }
    
    /**
     * List All Input Streams
     * 
     * @param encodingId Id of the encoding. (required)
     * @return List&lt;InputStream&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<InputStream> list(String encodingId) throws BitmovinException {
        return this.apiClient.list(encodingId, new HashMap<String, Object>()).getData().getResult();
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
        return this.apiClient.list(encodingId, queryParams).getData().getResult();
    }
    
    interface InputStreamsApiClient {
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/input-streams/{input_stream_id}")
        ResponseEnvelope<InputStream> get(@Param(value = "encoding_id") String encodingId, @Param(value = "input_stream_id") String inputStreamId) throws BitmovinException;
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/input-streams")
        ResponseEnvelope<PaginationResponse<InputStream>> list(@Param(value = "encoding_id") String encodingId, @QueryMap Map<String, Object> queryParams) throws BitmovinException;
    }
}
