package com.bitmovin.api.sdk.encoding.encodings.muxings.fmp4;

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
import com.bitmovin.api.sdk.encoding.encodings.muxings.fmp4.customdata.CustomdataApi;
import com.bitmovin.api.sdk.encoding.encodings.muxings.fmp4.drm.DrmApi;

public class Fmp4Api {
    public final CustomdataApi customdata;
    public final DrmApi drm;

    private final Fmp4ApiClient apiClient;

    public Fmp4Api(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(Fmp4ApiClient.class);

        this.customdata = new CustomdataApi(clientFactory);
        this.drm = new DrmApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of Fmp4Api
     */
    public static BitmovinApiBuilder<Fmp4Api> builder() {
        return new BitmovinApiBuilder<>(Fmp4Api.class);
    }
    
    /**
     * Add fMP4 Segment Muxing
     * 
     * @param encodingId Id of the encoding. (required)
     * @param fmp4Muxing  (required)
     * @return Fmp4Muxing
     * @throws BitmovinException if fails to make API call
     */
    public Fmp4Muxing create(String encodingId, Fmp4Muxing fmp4Muxing) throws BitmovinException {
        return this.apiClient.create(encodingId, fmp4Muxing).getData().getResult();
    }
    
    /**
     * Delete fMP4 Muxing
     * 
     * @param encodingId Id of the encoding. (required)
     * @param muxingId Id of the fMP4 muxing (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse delete(String encodingId, String muxingId) throws BitmovinException {
        return this.apiClient.delete(encodingId, muxingId).getData().getResult();
    }
    
    /**
     * fMP4 Segment Muxing Details
     * 
     * @param encodingId Id of the encoding. (required)
     * @param muxingId Id of the fMP4 muxing (required)
     * @return Fmp4Muxing
     * @throws BitmovinException if fails to make API call
     */
    public Fmp4Muxing get(String encodingId, String muxingId) throws BitmovinException {
        return this.apiClient.get(encodingId, muxingId).getData().getResult();
    }
    
    /**
     * List fMP4 Segment Muxings
     * 
     * @param encodingId Id of the encoding. (required)
     * @return List&lt;Fmp4Muxing&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<Fmp4Muxing> list(String encodingId) throws BitmovinException {
        return this.apiClient.list(encodingId, new HashMap<String, Object>()).getData().getResult();
    }
    /**
     * List fMP4 Segment Muxings
     * 
     * @param encodingId Id of the encoding. (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;Fmp4Muxing&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<Fmp4Muxing> list(String encodingId, Fmp4MuxingListQueryParams queryParams) throws BitmovinException {
        return this.apiClient.list(encodingId, queryParams).getData().getResult();
    }
    
    interface Fmp4ApiClient {
    
        @RequestLine("POST /encoding/encodings/{encoding_id}/muxings/fmp4")
        ResponseEnvelope<Fmp4Muxing> create(@Param(value = "encoding_id") String encodingId, Fmp4Muxing fmp4Muxing) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/encodings/{encoding_id}/muxings/fmp4/{muxing_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "encoding_id") String encodingId, @Param(value = "muxing_id") String muxingId) throws BitmovinException;
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/muxings/fmp4/{muxing_id}")
        ResponseEnvelope<Fmp4Muxing> get(@Param(value = "encoding_id") String encodingId, @Param(value = "muxing_id") String muxingId) throws BitmovinException;
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/muxings/fmp4")
        ResponseEnvelope<PaginationResponse<Fmp4Muxing>> list(@Param(value = "encoding_id") String encodingId, @QueryMap Map<String, Object> queryParams) throws BitmovinException;
    }
}
