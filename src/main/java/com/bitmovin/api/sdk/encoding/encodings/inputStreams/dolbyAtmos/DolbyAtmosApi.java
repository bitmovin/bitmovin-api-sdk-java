package com.bitmovin.api.sdk.encoding.encodings.inputStreams.dolbyAtmos;

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

public class DolbyAtmosApi {

    private final DolbyAtmosApiClient apiClient;

    public DolbyAtmosApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(DolbyAtmosApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of DolbyAtmosApi
     */
    public static BitmovinApiBuilder<DolbyAtmosApi> builder() {
        return new BitmovinApiBuilder<>(DolbyAtmosApi.class);
    }

    /**
     * Add Dolby Atmos input stream
     * 
     * @param encodingId Id of the encoding (required)
     * @param dolbyAtmosIngestInputStream The Dolby Atmos input stream to be created (required)
     * @return DolbyAtmosIngestInputStream
     * @throws BitmovinException if fails to make API call
     */
    public DolbyAtmosIngestInputStream create(String encodingId, DolbyAtmosIngestInputStream dolbyAtmosIngestInputStream) throws BitmovinException {
        try {
            return this.apiClient.create(encodingId, dolbyAtmosIngestInputStream).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * Delete Dolby Atmos input stream
     * 
     * @param encodingId Id of the encoding (required)
     * @param inputStreamId Id of the Dolby Atmos input stream (required)
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
     * Dolby Atmos input stream details
     * 
     * @param encodingId Id of the encoding (required)
     * @param inputStreamId Id of the Dolby Atmos input stream (required)
     * @return DolbyAtmosIngestInputStream
     * @throws BitmovinException if fails to make API call
     */
    public DolbyAtmosIngestInputStream get(String encodingId, String inputStreamId) throws BitmovinException {
        try {
            return this.apiClient.get(encodingId, inputStreamId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * List Dolby Atmos input streams
     * 
     * @param encodingId Id of the encoding (required)
     * @return List&lt;DolbyAtmosIngestInputStream&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<DolbyAtmosIngestInputStream> list(String encodingId) throws BitmovinException {
        try {
            return this.apiClient.list(encodingId, new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * List Dolby Atmos input streams
     * 
     * @param encodingId Id of the encoding (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;DolbyAtmosIngestInputStream&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<DolbyAtmosIngestInputStream> list(String encodingId, DolbyAtmosIngestInputStreamListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(encodingId, new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface DolbyAtmosApiClient {

        @RequestLine("POST /encoding/encodings/{encoding_id}/input-streams/dolby-atmos")
        ResponseEnvelope<DolbyAtmosIngestInputStream> create(@Param(value = "encoding_id") String encodingId, DolbyAtmosIngestInputStream dolbyAtmosIngestInputStream) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/encodings/{encoding_id}/input-streams/dolby-atmos/{input_stream_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "encoding_id") String encodingId, @Param(value = "input_stream_id") String inputStreamId) throws BitmovinException;
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/input-streams/dolby-atmos/{input_stream_id}")
        ResponseEnvelope<DolbyAtmosIngestInputStream> get(@Param(value = "encoding_id") String encodingId, @Param(value = "input_stream_id") String inputStreamId) throws BitmovinException;
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/input-streams/dolby-atmos")
        ResponseEnvelope<PaginationResponse<DolbyAtmosIngestInputStream>> list(@Param(value = "encoding_id") String encodingId, @QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    }
}
