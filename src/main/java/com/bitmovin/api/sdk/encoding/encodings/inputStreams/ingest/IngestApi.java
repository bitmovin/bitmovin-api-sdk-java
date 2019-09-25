package com.bitmovin.api.sdk.encoding.encodings.inputStreams.ingest;

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

public class IngestApi {

    private final IngestApiClient apiClient;

    public IngestApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(IngestApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of IngestApi
     */
    public static BitmovinApiBuilder<IngestApi> builder() {
        return new BitmovinApiBuilder<>(IngestApi.class);
    }
    
    /**
     * Add Ingest Input Stream
     * 
     * @param encodingId Id of the encoding. (required)
     * @param ingestInputStream The Ingest Input Stream to be created (required)
     * @return IngestInputStream
     * @throws BitmovinException if fails to make API call
     */
    public IngestInputStream create(String encodingId, IngestInputStream ingestInputStream) throws BitmovinException {
        try {
            return this.apiClient.create(encodingId, ingestInputStream).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * Delete Ingest Input Stream
     * 
     * @param encodingId Id of the encoding. (required)
     * @param inputStreamId Id of the ingest input stream. (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse delete(String encodingId, String inputStreamId) throws BitmovinException {
        try {
            return this.apiClient.delete(encodingId, inputStreamId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * Ingest Input Stream Details
     * 
     * @param encodingId Id of the encoding. (required)
     * @param inputStreamId Id of the ingest input stream. (required)
     * @return IngestInputStream
     * @throws BitmovinException if fails to make API call
     */
    public IngestInputStream get(String encodingId, String inputStreamId) throws BitmovinException {
        try {
            return this.apiClient.get(encodingId, inputStreamId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * List Ingest Input Streams
     * 
     * @param encodingId Id of the encoding. (required)
     * @return List&lt;IngestInputStream&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<IngestInputStream> list(String encodingId) throws BitmovinException {
        try {
            return this.apiClient.list(encodingId, new HashMap<String, Object>()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * List Ingest Input Streams
     * 
     * @param encodingId Id of the encoding. (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;IngestInputStream&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<IngestInputStream> list(String encodingId, IngestInputStreamListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(encodingId, queryParams).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    interface IngestApiClient {
    
        @RequestLine("POST /encoding/encodings/{encoding_id}/input-streams/ingest")
        ResponseEnvelope<IngestInputStream> create(@Param(value = "encoding_id") String encodingId, IngestInputStream ingestInputStream) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/encodings/{encoding_id}/input-streams/ingest/{input_stream_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "encoding_id") String encodingId, @Param(value = "input_stream_id") String inputStreamId) throws BitmovinException;
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/input-streams/ingest/{input_stream_id}")
        ResponseEnvelope<IngestInputStream> get(@Param(value = "encoding_id") String encodingId, @Param(value = "input_stream_id") String inputStreamId) throws BitmovinException;
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/input-streams/ingest")
        ResponseEnvelope<PaginationResponse<IngestInputStream>> list(@Param(value = "encoding_id") String encodingId, @QueryMap Map<String, Object> queryParams) throws BitmovinException;
    }
}
