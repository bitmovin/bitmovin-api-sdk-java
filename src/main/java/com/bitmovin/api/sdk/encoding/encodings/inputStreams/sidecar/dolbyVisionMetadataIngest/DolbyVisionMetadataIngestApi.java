package com.bitmovin.api.sdk.encoding.encodings.inputStreams.sidecar.dolbyVisionMetadataIngest;

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

public class DolbyVisionMetadataIngestApi {

    private final DolbyVisionMetadataIngestApiClient apiClient;

    public DolbyVisionMetadataIngestApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(DolbyVisionMetadataIngestApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of DolbyVisionMetadataIngestApi
     */
    public static BitmovinApiBuilder<DolbyVisionMetadataIngestApi> builder() {
        return new BitmovinApiBuilder<>(DolbyVisionMetadataIngestApi.class);
    }

    /**
     * Add Dolby Vision Metadata Ingest Input Stream
     * 
     * @param encodingId Id of the encoding. (required)
     * @param dolbyVisionMetadataIngestInputStream The Dolby Vision Metadata Ingest Input Stream to be created (required)
     * @return DolbyVisionMetadataIngestInputStream
     * @throws BitmovinException if fails to make API call
     */
    public DolbyVisionMetadataIngestInputStream create(String encodingId, DolbyVisionMetadataIngestInputStream dolbyVisionMetadataIngestInputStream) throws BitmovinException {
        try {
            return this.apiClient.create(encodingId, dolbyVisionMetadataIngestInputStream).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * Delete Dolby Vision Metadata Ingest Input Stream
     * 
     * @param encodingId Id of the encoding. (required)
     * @param inputStreamId Id of the Dolby Vision Metadata Ingest input stream. (required)
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
     * Dolby Vision Metadata Ingest Input Stream Details
     * 
     * @param encodingId Id of the encoding. (required)
     * @param inputStreamId Id of the Dolby Vision Metadata Ingest input stream. (required)
     * @return DolbyVisionMetadataIngestInputStream
     * @throws BitmovinException if fails to make API call
     */
    public DolbyVisionMetadataIngestInputStream get(String encodingId, String inputStreamId) throws BitmovinException {
        try {
            return this.apiClient.get(encodingId, inputStreamId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * List Dolby Vision Metadata Ingest Input Streams
     * 
     * @param encodingId Id of the encoding. (required)
     * @return List&lt;DolbyVisionMetadataIngestInputStream&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<DolbyVisionMetadataIngestInputStream> list(String encodingId) throws BitmovinException {
        try {
            return this.apiClient.list(encodingId, new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * List Dolby Vision Metadata Ingest Input Streams
     * 
     * @param encodingId Id of the encoding. (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;DolbyVisionMetadataIngestInputStream&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<DolbyVisionMetadataIngestInputStream> list(String encodingId, DolbyVisionMetadataIngestInputStreamListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(encodingId, new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface DolbyVisionMetadataIngestApiClient {

        @RequestLine("POST /encoding/encodings/{encoding_id}/input-streams/sidecar/dolby-vision-metadata-ingest")
        ResponseEnvelope<DolbyVisionMetadataIngestInputStream> create(@Param(value = "encoding_id") String encodingId, DolbyVisionMetadataIngestInputStream dolbyVisionMetadataIngestInputStream) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/encodings/{encoding_id}/input-streams/sidecar/dolby-vision-metadata-ingest/{input_stream_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "encoding_id") String encodingId, @Param(value = "input_stream_id") String inputStreamId) throws BitmovinException;
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/input-streams/sidecar/dolby-vision-metadata-ingest/{input_stream_id}")
        ResponseEnvelope<DolbyVisionMetadataIngestInputStream> get(@Param(value = "encoding_id") String encodingId, @Param(value = "input_stream_id") String inputStreamId) throws BitmovinException;
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/input-streams/sidecar/dolby-vision-metadata-ingest")
        ResponseEnvelope<PaginationResponse<DolbyVisionMetadataIngestInputStream>> list(@Param(value = "encoding_id") String encodingId, @QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    }
}
