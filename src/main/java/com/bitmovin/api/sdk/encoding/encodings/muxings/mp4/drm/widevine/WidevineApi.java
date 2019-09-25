package com.bitmovin.api.sdk.encoding.encodings.muxings.mp4.drm.widevine;

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
import com.bitmovin.api.sdk.encoding.encodings.muxings.mp4.drm.widevine.customdata.CustomdataApi;

public class WidevineApi {
    public final CustomdataApi customdata;

    private final WidevineApiClient apiClient;

    public WidevineApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(WidevineApiClient.class);

        this.customdata = new CustomdataApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of WidevineApi
     */
    public static BitmovinApiBuilder<WidevineApi> builder() {
        return new BitmovinApiBuilder<>(WidevineApi.class);
    }
    
    /**
     * Add Widevine DRM to MP4
     * 
     * @param encodingId Id of the encoding. (required)
     * @param muxingId Id of the MP4 muxing. (required)
     * @param widevineDrm The Widevine DRM to be created (required)
     * @return WidevineDrm
     * @throws BitmovinException if fails to make API call
     */
    public WidevineDrm create(String encodingId, String muxingId, WidevineDrm widevineDrm) throws BitmovinException {
        try {
            return this.apiClient.create(encodingId, muxingId, widevineDrm).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * Delete Widevine DRM from MP4
     * 
     * @param encodingId Id of the encoding. (required)
     * @param muxingId Id of the MP4 muxing (required)
     * @param drmId Id of the widevine drm. (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse delete(String encodingId, String muxingId, String drmId) throws BitmovinException {
        try {
            return this.apiClient.delete(encodingId, muxingId, drmId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * Widevine DRM Details of MP4
     * 
     * @param encodingId Id of the encoding. (required)
     * @param muxingId Id of the MP4 muxing. (required)
     * @param drmId Id of the widevine drm. (required)
     * @return WidevineDrm
     * @throws BitmovinException if fails to make API call
     */
    public WidevineDrm get(String encodingId, String muxingId, String drmId) throws BitmovinException {
        try {
            return this.apiClient.get(encodingId, muxingId, drmId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * List Widevine DRMs of MP4
     * 
     * @param encodingId Id of the encoding. (required)
     * @param muxingId Id of the mp4 fragment. (required)
     * @return List&lt;WidevineDrm&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<WidevineDrm> list(String encodingId, String muxingId) throws BitmovinException {
        try {
            return this.apiClient.list(encodingId, muxingId, new HashMap<String, Object>()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * List Widevine DRMs of MP4
     * 
     * @param encodingId Id of the encoding. (required)
     * @param muxingId Id of the mp4 fragment. (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;WidevineDrm&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<WidevineDrm> list(String encodingId, String muxingId, WidevineDrmListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(encodingId, muxingId, queryParams).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    interface WidevineApiClient {
    
        @RequestLine("POST /encoding/encodings/{encoding_id}/muxings/mp4/{muxing_id}/drm/widevine")
        ResponseEnvelope<WidevineDrm> create(@Param(value = "encoding_id") String encodingId, @Param(value = "muxing_id") String muxingId, WidevineDrm widevineDrm) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/encodings/{encoding_id}/muxings/mp4/{muxing_id}/drm/widevine/{drm_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "encoding_id") String encodingId, @Param(value = "muxing_id") String muxingId, @Param(value = "drm_id") String drmId) throws BitmovinException;
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/muxings/mp4/{muxing_id}/drm/widevine/{drm_id}")
        ResponseEnvelope<WidevineDrm> get(@Param(value = "encoding_id") String encodingId, @Param(value = "muxing_id") String muxingId, @Param(value = "drm_id") String drmId) throws BitmovinException;
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/muxings/mp4/{muxing_id}/drm/widevine")
        ResponseEnvelope<PaginationResponse<WidevineDrm>> list(@Param(value = "encoding_id") String encodingId, @Param(value = "muxing_id") String muxingId, @QueryMap Map<String, Object> queryParams) throws BitmovinException;
    }
}
