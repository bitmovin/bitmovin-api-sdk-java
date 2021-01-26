package com.bitmovin.api.sdk.encoding.encodings.muxings.packedAudio;

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
import com.bitmovin.api.sdk.encoding.encodings.muxings.packedAudio.customdata.CustomdataApi;
import com.bitmovin.api.sdk.encoding.encodings.muxings.packedAudio.information.InformationApi;

public class PackedAudioApi {
    public final CustomdataApi customdata;
    public final InformationApi information;

    private final PackedAudioApiClient apiClient;

    public PackedAudioApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(PackedAudioApiClient.class);

        this.customdata = new CustomdataApi(clientFactory);
        this.information = new InformationApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of PackedAudioApi
     */
    public static BitmovinApiBuilder<PackedAudioApi> builder() {
        return new BitmovinApiBuilder<>(PackedAudioApi.class);
    }
    
    /**
     * Add Packed Audio muxing
     * 
     * @param encodingId Id of the encoding. (required)
     * @param packedAudioMuxing The Packed Audio muxing to be created (required)
     * @return PackedAudioMuxing
     * @throws BitmovinException if fails to make API call
     */
    public PackedAudioMuxing create(String encodingId, PackedAudioMuxing packedAudioMuxing) throws BitmovinException {
        try {
            return this.apiClient.create(encodingId, packedAudioMuxing).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * Delete Packed Audio muxing
     * 
     * @param encodingId Id of the encoding. (required)
     * @param muxingId Id of the Packed Audio muxing (required)
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
     * Packed Audio muxing details
     * 
     * @param encodingId Id of the encoding. (required)
     * @param muxingId Id of the Packed Audio muxing (required)
     * @return PackedAudioMuxing
     * @throws BitmovinException if fails to make API call
     */
    public PackedAudioMuxing get(String encodingId, String muxingId) throws BitmovinException {
        try {
            return this.apiClient.get(encodingId, muxingId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * List Packed Audio muxings
     * 
     * @param encodingId Id of the encoding. (required)
     * @return List&lt;PackedAudioMuxing&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<PackedAudioMuxing> list(String encodingId) throws BitmovinException {
        try {
            return this.apiClient.list(encodingId, new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * List Packed Audio muxings
     * 
     * @param encodingId Id of the encoding. (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;PackedAudioMuxing&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<PackedAudioMuxing> list(String encodingId, PackedAudioMuxingListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(encodingId, new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    interface PackedAudioApiClient {
    
        @RequestLine("POST /encoding/encodings/{encoding_id}/muxings/packed-audio")
        ResponseEnvelope<PackedAudioMuxing> create(@Param(value = "encoding_id") String encodingId, PackedAudioMuxing packedAudioMuxing) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/encodings/{encoding_id}/muxings/packed-audio/{muxing_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "encoding_id") String encodingId, @Param(value = "muxing_id") String muxingId) throws BitmovinException;
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/muxings/packed-audio/{muxing_id}")
        ResponseEnvelope<PackedAudioMuxing> get(@Param(value = "encoding_id") String encodingId, @Param(value = "muxing_id") String muxingId) throws BitmovinException;
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/muxings/packed-audio")
        ResponseEnvelope<PaginationResponse<PackedAudioMuxing>> list(@Param(value = "encoding_id") String encodingId, @QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    }
}
