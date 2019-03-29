package com.bitmovin.api.sdk.encoding.encodings.muxings.mp4.drm.marlin;

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
import com.bitmovin.api.sdk.encoding.encodings.muxings.mp4.drm.marlin.customdata.CustomdataApi;

public class MarlinApi {
    public final CustomdataApi customdata;

    private final MarlinApiClient apiClient;

    public MarlinApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(MarlinApiClient.class);

        this.customdata = new CustomdataApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of MarlinApi
     */
    public static BitmovinApiBuilder<MarlinApi> builder() {
        return new BitmovinApiBuilder<>(MarlinApi.class);
    }
    
    /**
     * Add Marlin DRM to MP4
     * 
     * @param encodingId Id of the encoding. (required)
     * @param muxingId Id of the MP4 muxing. (required)
     * @param marlinDrm  (optional)
     * @return MarlinDrm
     * @throws BitmovinException if fails to make API call
     */
    public MarlinDrm create(String encodingId, String muxingId, MarlinDrm marlinDrm) throws BitmovinException {
        return this.apiClient.create(encodingId, muxingId, marlinDrm).getData().getResult();
    }
    
    /**
     * Delete Marlin DRM from MP4
     * 
     * @param encodingId Id of the encoding. (required)
     * @param muxingId Id of the mp4. (required)
     * @param drmId Id of the Marlin DRM configuration. (required)
     * @return MarlinDrm
     * @throws BitmovinException if fails to make API call
     */
    public MarlinDrm delete(String encodingId, String muxingId, String drmId) throws BitmovinException {
        return this.apiClient.delete(encodingId, muxingId, drmId).getData().getResult();
    }
    
    /**
     * Marlin DRM Details of MP4
     * 
     * @param encodingId Id of the encoding. (required)
     * @param muxingId Id of the mp4. (required)
     * @param drmId Id of the Marlin DRM configuration. (required)
     * @return MarlinDrm
     * @throws BitmovinException if fails to make API call
     */
    public MarlinDrm get(String encodingId, String muxingId, String drmId) throws BitmovinException {
        return this.apiClient.get(encodingId, muxingId, drmId).getData().getResult();
    }
    
    /**
     * List Marlin DRMs of MP4
     * 
     * @param encodingId Id of the encoding. (required)
     * @param muxingId Id of the mp4. (required)
     * @return List&lt;MarlinDrm&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<MarlinDrm> list(String encodingId, String muxingId) throws BitmovinException {
        return this.apiClient.list(encodingId, muxingId, new HashMap<String, Object>()).getData().getResult();
    }
    /**
     * List Marlin DRMs of MP4
     * 
     * @param encodingId Id of the encoding. (required)
     * @param muxingId Id of the mp4. (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;MarlinDrm&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<MarlinDrm> list(String encodingId, String muxingId, MarlinDrmListQueryParams queryParams) throws BitmovinException {
        return this.apiClient.list(encodingId, muxingId, queryParams).getData().getResult();
    }
    
    interface MarlinApiClient {
    
        @RequestLine("POST /encoding/encodings/{encoding_id}/muxings/mp4/{muxing_id}/drm/marlin")
        ResponseEnvelope<MarlinDrm> create(@Param(value = "encoding_id") String encodingId, @Param(value = "muxing_id") String muxingId, MarlinDrm marlinDrm) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/encodings/{encoding_id}/muxings/mp4/{muxing_id}/drm/marlin/{drm_id}")
        ResponseEnvelope<MarlinDrm> delete(@Param(value = "encoding_id") String encodingId, @Param(value = "muxing_id") String muxingId, @Param(value = "drm_id") String drmId) throws BitmovinException;
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/muxings/mp4/{muxing_id}/drm/marlin/{drm_id}")
        ResponseEnvelope<MarlinDrm> get(@Param(value = "encoding_id") String encodingId, @Param(value = "muxing_id") String muxingId, @Param(value = "drm_id") String drmId) throws BitmovinException;
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/muxings/mp4/{muxing_id}/drm/marlin")
        ResponseEnvelope<PaginationResponse<MarlinDrm>> list(@Param(value = "encoding_id") String encodingId, @Param(value = "muxing_id") String muxingId, @QueryMap Map<String, Object> queryParams) throws BitmovinException;
    }
}
