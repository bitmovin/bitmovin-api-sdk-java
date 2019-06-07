package com.bitmovin.api.sdk.encoding.encodings.muxings.progressiveTs.drm.fairplay;

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
import com.bitmovin.api.sdk.encoding.encodings.muxings.progressiveTs.drm.fairplay.customdata.CustomdataApi;

public class FairplayApi {
    public final CustomdataApi customdata;

    private final FairplayApiClient apiClient;

    public FairplayApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(FairplayApiClient.class);

        this.customdata = new CustomdataApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of FairplayApi
     */
    public static BitmovinApiBuilder<FairplayApi> builder() {
        return new BitmovinApiBuilder<>(FairplayApi.class);
    }
    
    /**
     * Add FairPlay DRM to Progressive TS
     * 
     * @param encodingId Id of the encoding. (required)
     * @param muxingId Id of the progressive TS fragment. (required)
     * @param fairPlayDrm  (required)
     * @return FairPlayDrm
     * @throws BitmovinException if fails to make API call
     */
    public FairPlayDrm create(String encodingId, String muxingId, FairPlayDrm fairPlayDrm) throws BitmovinException {
        return this.apiClient.create(encodingId, muxingId, fairPlayDrm).getData().getResult();
    }
    
    /**
     * Delete FairPlay DRM from Progressive TS
     * 
     * @param encodingId Id of the encoding. (required)
     * @param muxingId Id of the progressive TS fragment. (required)
     * @param drmId Id of the FairPlay DRM configuration. (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse delete(String encodingId, String muxingId, String drmId) throws BitmovinException {
        return this.apiClient.delete(encodingId, muxingId, drmId).getData().getResult();
    }
    
    /**
     * FairPlay DRM Details of Progressive TS
     * 
     * @param encodingId Id of the encoding. (required)
     * @param muxingId Id of the progressive TS fragment. (required)
     * @param drmId Id of the FairPlay DRM configuration. (required)
     * @return FairPlayDrm
     * @throws BitmovinException if fails to make API call
     */
    public FairPlayDrm get(String encodingId, String muxingId, String drmId) throws BitmovinException {
        return this.apiClient.get(encodingId, muxingId, drmId).getData().getResult();
    }
    
    /**
     * List FairPlay DRMs of Progressive TS
     * 
     * @param encodingId Id of the encoding. (required)
     * @param muxingId Id of the progressive TS fragment. (required)
     * @return List&lt;FairPlayDrm&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<FairPlayDrm> list(String encodingId, String muxingId) throws BitmovinException {
        return this.apiClient.list(encodingId, muxingId, new HashMap<String, Object>()).getData().getResult();
    }
    /**
     * List FairPlay DRMs of Progressive TS
     * 
     * @param encodingId Id of the encoding. (required)
     * @param muxingId Id of the progressive TS fragment. (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;FairPlayDrm&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<FairPlayDrm> list(String encodingId, String muxingId, FairPlayDrmListQueryParams queryParams) throws BitmovinException {
        return this.apiClient.list(encodingId, muxingId, queryParams).getData().getResult();
    }
    
    interface FairplayApiClient {
    
        @RequestLine("POST /encoding/encodings/{encoding_id}/muxings/progressive-ts/{muxing_id}/drm/fairplay")
        ResponseEnvelope<FairPlayDrm> create(@Param(value = "encoding_id") String encodingId, @Param(value = "muxing_id") String muxingId, FairPlayDrm fairPlayDrm) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/encodings/{encoding_id}/muxings/progressive-ts/{muxing_id}/drm/fairplay/{drm_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "encoding_id") String encodingId, @Param(value = "muxing_id") String muxingId, @Param(value = "drm_id") String drmId) throws BitmovinException;
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/muxings/progressive-ts/{muxing_id}/drm/fairplay/{drm_id}")
        ResponseEnvelope<FairPlayDrm> get(@Param(value = "encoding_id") String encodingId, @Param(value = "muxing_id") String muxingId, @Param(value = "drm_id") String drmId) throws BitmovinException;
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/muxings/progressive-ts/{muxing_id}/drm/fairplay")
        ResponseEnvelope<PaginationResponse<FairPlayDrm>> list(@Param(value = "encoding_id") String encodingId, @Param(value = "muxing_id") String muxingId, @QueryMap Map<String, Object> queryParams) throws BitmovinException;
    }
}
