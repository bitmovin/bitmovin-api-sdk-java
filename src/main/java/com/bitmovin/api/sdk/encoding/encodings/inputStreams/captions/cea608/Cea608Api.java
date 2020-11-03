package com.bitmovin.api.sdk.encoding.encodings.inputStreams.captions.cea608;

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

public class Cea608Api {

    private final Cea608ApiClient apiClient;

    public Cea608Api(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(Cea608ApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of Cea608Api
     */
    public static BitmovinApiBuilder<Cea608Api> builder() {
        return new BitmovinApiBuilder<>(Cea608Api.class);
    }
    
    /**
     * Add CEA 608 Input Stream
     * 
     * @param encodingId Id of the encoding. (required)
     * @param cea608CaptionInputStream The CEA 608 Input Stream to be created (required)
     * @return Cea608CaptionInputStream
     * @throws BitmovinException if fails to make API call
     */
    public Cea608CaptionInputStream create(String encodingId, Cea608CaptionInputStream cea608CaptionInputStream) throws BitmovinException {
        try {
            return this.apiClient.create(encodingId, cea608CaptionInputStream).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * Delete CEA 608 Input Stream
     * 
     * @param encodingId Id of the encoding. (required)
     * @param inputStreamId Id of the CEA 608 input stream. (required)
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
     * CEA 608 Input Stream Details
     * 
     * @param encodingId Id of the encoding. (required)
     * @param inputStreamId Id of the CEA 608 input stream. (required)
     * @return Cea608CaptionInputStream
     * @throws BitmovinException if fails to make API call
     */
    public Cea608CaptionInputStream get(String encodingId, String inputStreamId) throws BitmovinException {
        try {
            return this.apiClient.get(encodingId, inputStreamId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * List CEA 608 Input Streams
     * 
     * @param encodingId Id of the encoding. (required)
     * @return List&lt;Cea608CaptionInputStream&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<Cea608CaptionInputStream> list(String encodingId) throws BitmovinException {
        try {
            return this.apiClient.list(encodingId, new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * List CEA 608 Input Streams
     * 
     * @param encodingId Id of the encoding. (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;Cea608CaptionInputStream&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<Cea608CaptionInputStream> list(String encodingId, Cea608CaptionInputStreamListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(encodingId, new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    interface Cea608ApiClient {
    
        @RequestLine("POST /encoding/encodings/{encoding_id}/input-streams/captions/cea608")
        ResponseEnvelope<Cea608CaptionInputStream> create(@Param(value = "encoding_id") String encodingId, Cea608CaptionInputStream cea608CaptionInputStream) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/encodings/{encoding_id}/input-streams/captions/cea608/{input_stream_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "encoding_id") String encodingId, @Param(value = "input_stream_id") String inputStreamId) throws BitmovinException;
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/input-streams/captions/cea608/{input_stream_id}")
        ResponseEnvelope<Cea608CaptionInputStream> get(@Param(value = "encoding_id") String encodingId, @Param(value = "input_stream_id") String inputStreamId) throws BitmovinException;
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/input-streams/captions/cea608")
        ResponseEnvelope<PaginationResponse<Cea608CaptionInputStream>> list(@Param(value = "encoding_id") String encodingId, @QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    }
}
