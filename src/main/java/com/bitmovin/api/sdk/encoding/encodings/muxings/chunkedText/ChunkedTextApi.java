package com.bitmovin.api.sdk.encoding.encodings.muxings.chunkedText;

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
import com.bitmovin.api.sdk.encoding.encodings.muxings.chunkedText.customdata.CustomdataApi;

public class ChunkedTextApi {
    public final CustomdataApi customdata;

    private final ChunkedTextApiClient apiClient;

    public ChunkedTextApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(ChunkedTextApiClient.class);

        this.customdata = new CustomdataApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of ChunkedTextApi
     */
    public static BitmovinApiBuilder<ChunkedTextApi> builder() {
        return new BitmovinApiBuilder<>(ChunkedTextApi.class);
    }
    
    /**
     * Add Chunked Text muxing
     * 
     * @param encodingId Id of the encoding. (required)
     * @param chunkedTextMuxing The Chunked Text muxing to be created (required)
     * @return ChunkedTextMuxing
     * @throws BitmovinException if fails to make API call
     */
    public ChunkedTextMuxing create(String encodingId, ChunkedTextMuxing chunkedTextMuxing) throws BitmovinException {
        try {
            return this.apiClient.create(encodingId, chunkedTextMuxing).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * Delete Chunked Text muxing
     * 
     * @param encodingId Id of the encoding. (required)
     * @param muxingId Id of the Chunked Text muxing (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse delete(String encodingId, String muxingId) throws BitmovinException {
        try {
            return this.apiClient.delete(encodingId, muxingId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * Chunked Text muxing details
     * 
     * @param encodingId Id of the encoding. (required)
     * @param muxingId Id of the Chunked Text muxing (required)
     * @return ChunkedTextMuxing
     * @throws BitmovinException if fails to make API call
     */
    public ChunkedTextMuxing get(String encodingId, String muxingId) throws BitmovinException {
        try {
            return this.apiClient.get(encodingId, muxingId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * List Chunked Text muxings
     * 
     * @param encodingId Id of the encoding. (required)
     * @return List&lt;ChunkedTextMuxing&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<ChunkedTextMuxing> list(String encodingId) throws BitmovinException {
        try {
            return this.apiClient.list(encodingId, new HashMap<String, Object>()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * List Chunked Text muxings
     * 
     * @param encodingId Id of the encoding. (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;ChunkedTextMuxing&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<ChunkedTextMuxing> list(String encodingId, ChunkedTextMuxingListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(encodingId, queryParams).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    interface ChunkedTextApiClient {
    
        @RequestLine("POST /encoding/encodings/{encoding_id}/muxings/chunked-text")
        ResponseEnvelope<ChunkedTextMuxing> create(@Param(value = "encoding_id") String encodingId, ChunkedTextMuxing chunkedTextMuxing) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/encodings/{encoding_id}/muxings/chunked-text/{muxing_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "encoding_id") String encodingId, @Param(value = "muxing_id") String muxingId) throws BitmovinException;
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/muxings/chunked-text/{muxing_id}")
        ResponseEnvelope<ChunkedTextMuxing> get(@Param(value = "encoding_id") String encodingId, @Param(value = "muxing_id") String muxingId) throws BitmovinException;
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/muxings/chunked-text")
        ResponseEnvelope<PaginationResponse<ChunkedTextMuxing>> list(@Param(value = "encoding_id") String encodingId, @QueryMap Map<String, Object> queryParams) throws BitmovinException;
    }
}
