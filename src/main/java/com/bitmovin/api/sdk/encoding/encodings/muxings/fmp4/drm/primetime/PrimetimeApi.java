package com.bitmovin.api.sdk.encoding.encodings.muxings.fmp4.drm.primetime;

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
import com.bitmovin.api.sdk.encoding.encodings.muxings.fmp4.drm.primetime.customdata.CustomdataApi;

public class PrimetimeApi {
    public final CustomdataApi customdata;

    private final PrimetimeApiClient apiClient;

    public PrimetimeApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(PrimetimeApiClient.class);

        this.customdata = new CustomdataApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of PrimetimeApi
     */
    public static BitmovinApiBuilder<PrimetimeApi> builder() {
        return new BitmovinApiBuilder<>(PrimetimeApi.class);
    }
    
    /**
     * Add PrimeTime DRM to fMP4
     * 
     * @param encodingId Id of the encoding. (required)
     * @param muxingId Id of the fMP4 muxing. (required)
     * @param primeTimeDrm  (required)
     * @return PrimeTimeDrm
     * @throws BitmovinException if fails to make API call
     */
    public PrimeTimeDrm create(String encodingId, String muxingId, PrimeTimeDrm primeTimeDrm) throws BitmovinException {
        return this.apiClient.create(encodingId, muxingId, primeTimeDrm).getData().getResult();
    }
    
    /**
     * Delete PrimeTime DRM from fMP4
     * 
     * @param encodingId Id of the encoding. (required)
     * @param muxingId Id of the fMP4 muxing (required)
     * @param drmId Id of the PrimeTime DRM configuration. (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse delete(String encodingId, String muxingId, String drmId) throws BitmovinException {
        return this.apiClient.delete(encodingId, muxingId, drmId).getData().getResult();
    }
    
    /**
     * PrimeTime DRM Details of fMP4
     * 
     * @param encodingId Id of the encoding. (required)
     * @param muxingId Id of the fMP4 muxing (required)
     * @param drmId Id of the PrimeTime DRM configuration. (required)
     * @return PrimeTimeDrm
     * @throws BitmovinException if fails to make API call
     */
    public PrimeTimeDrm get(String encodingId, String muxingId, String drmId) throws BitmovinException {
        return this.apiClient.get(encodingId, muxingId, drmId).getData().getResult();
    }
    
    /**
     * List PrimeTime DRMs of fMP4
     * 
     * @param encodingId Id of the encoding. (required)
     * @param muxingId Id of the fMP4 muxing (required)
     * @return List&lt;PrimeTimeDrm&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<PrimeTimeDrm> list(String encodingId, String muxingId) throws BitmovinException {
        return this.apiClient.list(encodingId, muxingId, new HashMap<String, Object>()).getData().getResult();
    }
    /**
     * List PrimeTime DRMs of fMP4
     * 
     * @param encodingId Id of the encoding. (required)
     * @param muxingId Id of the fMP4 muxing (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;PrimeTimeDrm&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<PrimeTimeDrm> list(String encodingId, String muxingId, PrimeTimeDrmListQueryParams queryParams) throws BitmovinException {
        return this.apiClient.list(encodingId, muxingId, queryParams).getData().getResult();
    }
    
    interface PrimetimeApiClient {
    
        @RequestLine("POST /encoding/encodings/{encoding_id}/muxings/fmp4/{muxing_id}/drm/primetime")
        ResponseEnvelope<PrimeTimeDrm> create(@Param(value = "encoding_id") String encodingId, @Param(value = "muxing_id") String muxingId, PrimeTimeDrm primeTimeDrm) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/encodings/{encoding_id}/muxings/fmp4/{muxing_id}/drm/primetime/{drm_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "encoding_id") String encodingId, @Param(value = "muxing_id") String muxingId, @Param(value = "drm_id") String drmId) throws BitmovinException;
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/muxings/fmp4/{muxing_id}/drm/primetime/{drm_id}")
        ResponseEnvelope<PrimeTimeDrm> get(@Param(value = "encoding_id") String encodingId, @Param(value = "muxing_id") String muxingId, @Param(value = "drm_id") String drmId) throws BitmovinException;
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/muxings/fmp4/{muxing_id}/drm/primetime")
        ResponseEnvelope<PaginationResponse<PrimeTimeDrm>> list(@Param(value = "encoding_id") String encodingId, @Param(value = "muxing_id") String muxingId, @QueryMap Map<String, Object> queryParams) throws BitmovinException;
    }
}
