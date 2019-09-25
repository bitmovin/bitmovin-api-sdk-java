package com.bitmovin.api.sdk.encoding.encodings.streams.bifs;

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
import com.bitmovin.api.sdk.encoding.encodings.streams.bifs.customdata.CustomdataApi;

public class BifsApi {
    public final CustomdataApi customdata;

    private final BifsApiClient apiClient;

    public BifsApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(BifsApiClient.class);

        this.customdata = new CustomdataApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of BifsApi
     */
    public static BitmovinApiBuilder<BifsApi> builder() {
        return new BitmovinApiBuilder<>(BifsApi.class);
    }
    
    /**
     * Add a Roku Bif file
     * 
     * @param encodingId Id of the encoding. (required)
     * @param streamId Id of the stream. (required)
     * @param bif The Roku Bif file to be added (required)
     * @return Bif
     * @throws BitmovinException if fails to make API call
     */
    public Bif create(String encodingId, String streamId, Bif bif) throws BitmovinException {
        try {
            return this.apiClient.create(encodingId, streamId, bif).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * Delete Bif
     * 
     * @param encodingId Id of the encoding. (required)
     * @param streamId Id of the stream. (required)
     * @param bifId Id of the Bif. (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse delete(String encodingId, String streamId, String bifId) throws BitmovinException {
        try {
            return this.apiClient.delete(encodingId, streamId, bifId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * Bif Details
     * 
     * @param encodingId Id of the encoding. (required)
     * @param streamId Id of the stream. (required)
     * @param bifId Id of the Bif configuration. (required)
     * @return Bif
     * @throws BitmovinException if fails to make API call
     */
    public Bif get(String encodingId, String streamId, String bifId) throws BitmovinException {
        try {
            return this.apiClient.get(encodingId, streamId, bifId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * List Bifs
     * 
     * @param encodingId Id of the encoding. (required)
     * @param streamId Id of the stream. (required)
     * @return List&lt;Bif&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<Bif> list(String encodingId, String streamId) throws BitmovinException {
        try {
            return this.apiClient.list(encodingId, streamId, new HashMap<String, Object>()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * List Bifs
     * 
     * @param encodingId Id of the encoding. (required)
     * @param streamId Id of the stream. (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;Bif&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<Bif> list(String encodingId, String streamId, BifListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(encodingId, streamId, queryParams).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    interface BifsApiClient {
    
        @RequestLine("POST /encoding/encodings/{encoding_id}/streams/{stream_id}/bifs")
        ResponseEnvelope<Bif> create(@Param(value = "encoding_id") String encodingId, @Param(value = "stream_id") String streamId, Bif bif) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/encodings/{encoding_id}/streams/{stream_id}/bifs/{bif_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "encoding_id") String encodingId, @Param(value = "stream_id") String streamId, @Param(value = "bif_id") String bifId) throws BitmovinException;
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/streams/{stream_id}/bifs/{bif_id}")
        ResponseEnvelope<Bif> get(@Param(value = "encoding_id") String encodingId, @Param(value = "stream_id") String streamId, @Param(value = "bif_id") String bifId) throws BitmovinException;
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/streams/{stream_id}/bifs")
        ResponseEnvelope<PaginationResponse<Bif>> list(@Param(value = "encoding_id") String encodingId, @Param(value = "stream_id") String streamId, @QueryMap Map<String, Object> queryParams) throws BitmovinException;
    }
}
