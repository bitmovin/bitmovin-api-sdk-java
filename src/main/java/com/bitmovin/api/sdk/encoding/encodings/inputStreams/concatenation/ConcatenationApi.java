package com.bitmovin.api.sdk.encoding.encodings.inputStreams.concatenation;

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

public class ConcatenationApi {

    private final ConcatenationApiClient apiClient;

    public ConcatenationApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(ConcatenationApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of ConcatenationApi
     */
    public static BitmovinApiBuilder<ConcatenationApi> builder() {
        return new BitmovinApiBuilder<>(ConcatenationApi.class);
    }
    /**
     * Add Concatenation Input Stream
     * 
     * @param encodingId Id of the encoding. (required)
     * @param concatenationInputStream The Concatenation Input Stream to be created (required)
     * @return ConcatenationInputStream
     * @throws BitmovinException if fails to make API call
     */
    public ConcatenationInputStream create(String encodingId, ConcatenationInputStream concatenationInputStream) throws BitmovinException {
        try {
            return this.apiClient.create(encodingId, concatenationInputStream).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * Delete Concatenation Input Stream
     * 
     * @param encodingId Id of the encoding. (required)
     * @param inputStreamId Id of the Concatenation input stream. (required)
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
     * Concatenation Input Stream Details
     * 
     * @param encodingId Id of the encoding. (required)
     * @param inputStreamId Id of the concatenation input stream. (required)
     * @return ConcatenationInputStream
     * @throws BitmovinException if fails to make API call
     */
    public ConcatenationInputStream get(String encodingId, String inputStreamId) throws BitmovinException {
        try {
            return this.apiClient.get(encodingId, inputStreamId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * List Concatenation Input Streams
     * 
     * @param encodingId Id of the encoding. (required)
     * @return List&lt;ConcatenationInputStream&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<ConcatenationInputStream> list(String encodingId) throws BitmovinException {
        try {
            return this.apiClient.list(encodingId, new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * List Concatenation Input Streams
     * 
     * @param encodingId Id of the encoding. (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;ConcatenationInputStream&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<ConcatenationInputStream> list(String encodingId, ConcatenationInputStreamListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(encodingId, new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface ConcatenationApiClient { 
        @RequestLine("POST /encoding/encodings/{encoding_id}/input-streams/concatenation")
        ResponseEnvelope<ConcatenationInputStream> create(@Param(value = "encoding_id") String encodingId, ConcatenationInputStream concatenationInputStream) throws BitmovinException;
   
        @RequestLine("DELETE /encoding/encodings/{encoding_id}/input-streams/concatenation/{input_stream_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "encoding_id") String encodingId, @Param(value = "input_stream_id") String inputStreamId) throws BitmovinException;
   
        @RequestLine("GET /encoding/encodings/{encoding_id}/input-streams/concatenation/{input_stream_id}")
        ResponseEnvelope<ConcatenationInputStream> get(@Param(value = "encoding_id") String encodingId, @Param(value = "input_stream_id") String inputStreamId) throws BitmovinException;
   
        @RequestLine("GET /encoding/encodings/{encoding_id}/input-streams/concatenation")
        ResponseEnvelope<PaginationResponse<ConcatenationInputStream>> list(@Param(value = "encoding_id") String encodingId, @QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    }
}
