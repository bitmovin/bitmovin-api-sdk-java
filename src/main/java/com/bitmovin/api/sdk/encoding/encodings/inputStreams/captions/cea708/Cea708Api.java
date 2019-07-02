package com.bitmovin.api.sdk.encoding.encodings.inputStreams.captions.cea708;

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

public class Cea708Api {

    private final Cea708ApiClient apiClient;

    public Cea708Api(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(Cea708ApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of Cea708Api
     */
    public static BitmovinApiBuilder<Cea708Api> builder() {
        return new BitmovinApiBuilder<>(Cea708Api.class);
    }
    
    /**
     * Add CEA 708 Input Stream
     * 
     * @param encodingId Id of the encoding. (required)
     * @param cea708CaptionInputStream  (required)
     * @return Cea708CaptionInputStream
     * @throws BitmovinException if fails to make API call
     */
    public Cea708CaptionInputStream create(String encodingId, Cea708CaptionInputStream cea708CaptionInputStream) throws BitmovinException {
        return this.apiClient.create(encodingId, cea708CaptionInputStream).getData().getResult();
    }
    
    /**
     * Delete CEA 708 Input Stream
     * 
     * @param encodingId Id of the Encoding (required)
     * @param inputStreamId Id of the CEA 708 input stream. (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse delete(String encodingId, String inputStreamId) throws BitmovinException {
        return this.apiClient.delete(encodingId, inputStreamId).getData().getResult();
    }
    
    /**
     * CEA 708 Input Stream Details
     * 
     * @param encodingId Id of the encoding. (required)
     * @param inputStreamId Id of the CEA 708 input stream. (required)
     * @return Cea708CaptionInputStream
     * @throws BitmovinException if fails to make API call
     */
    public Cea708CaptionInputStream get(String encodingId, String inputStreamId) throws BitmovinException {
        return this.apiClient.get(encodingId, inputStreamId).getData().getResult();
    }
    
    /**
     * List CEA 708 Input Streams
     * 
     * @param encodingId Id of the encoding. (required)
     * @return List&lt;Cea708CaptionInputStream&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<Cea708CaptionInputStream> list(String encodingId) throws BitmovinException {
        return this.apiClient.list(encodingId, new HashMap<String, Object>()).getData().getResult();
    }
    /**
     * List CEA 708 Input Streams
     * 
     * @param encodingId Id of the encoding. (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;Cea708CaptionInputStream&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<Cea708CaptionInputStream> list(String encodingId, Cea708CaptionInputStreamListQueryParams queryParams) throws BitmovinException {
        return this.apiClient.list(encodingId, queryParams).getData().getResult();
    }
    
    interface Cea708ApiClient {
    
        @RequestLine("POST /encoding/encodings/{encoding_id}/input-streams/captions/cea708")
        ResponseEnvelope<Cea708CaptionInputStream> create(@Param(value = "encoding_id") String encodingId, Cea708CaptionInputStream cea708CaptionInputStream) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/encodings/{encoding_id}/input-streams/captions/cea708/{input_stream_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "encoding_id") String encodingId, @Param(value = "input_stream_id") String inputStreamId) throws BitmovinException;
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/input-streams/captions/cea708/{input_stream_id}")
        ResponseEnvelope<Cea708CaptionInputStream> get(@Param(value = "encoding_id") String encodingId, @Param(value = "input_stream_id") String inputStreamId) throws BitmovinException;
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/input-streams/captions/cea708")
        ResponseEnvelope<PaginationResponse<Cea708CaptionInputStream>> list(@Param(value = "encoding_id") String encodingId, @QueryMap Map<String, Object> queryParams) throws BitmovinException;
    }
}
