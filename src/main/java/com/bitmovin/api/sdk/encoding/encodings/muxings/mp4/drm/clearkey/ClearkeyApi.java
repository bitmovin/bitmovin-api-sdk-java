package com.bitmovin.api.sdk.encoding.encodings.muxings.mp4.drm.clearkey;

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
import com.bitmovin.api.sdk.encoding.encodings.muxings.mp4.drm.clearkey.customdata.CustomdataApi;

public class ClearkeyApi {
    public final CustomdataApi customdata;

    private final ClearkeyApiClient apiClient;

    public ClearkeyApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(ClearkeyApiClient.class);

        this.customdata = new CustomdataApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of ClearkeyApi
     */
    public static BitmovinApiBuilder<ClearkeyApi> builder() {
        return new BitmovinApiBuilder<>(ClearkeyApi.class);
    }
    
    /**
     * Add ClearKey DRM to MP4
     * 
     * @param encodingId Id of the encoding. (required)
     * @param muxingId Id of the MP4 muxing. (required)
     * @param clearKeyDrm  (required)
     * @return ClearKeyDrm
     * @throws BitmovinException if fails to make API call
     */
    public ClearKeyDrm create(String encodingId, String muxingId, ClearKeyDrm clearKeyDrm) throws BitmovinException {
        return this.apiClient.create(encodingId, muxingId, clearKeyDrm).getData().getResult();
    }
    
    /**
     * Delete ClearKey DRM from MP4
     * 
     * @param encodingId Id of the encoding. (required)
     * @param muxingId Id of the mp4. (required)
     * @param drmId Id of the ClearKey DRM configuration. (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse delete(String encodingId, String muxingId, String drmId) throws BitmovinException {
        return this.apiClient.delete(encodingId, muxingId, drmId).getData().getResult();
    }
    
    /**
     * ClearKey DRM Details of MP4
     * 
     * @param encodingId Id of the encoding. (required)
     * @param muxingId Id of the mp4. (required)
     * @param drmId Id of the ClearKey DRM configuration. (required)
     * @return ClearKeyDrm
     * @throws BitmovinException if fails to make API call
     */
    public ClearKeyDrm get(String encodingId, String muxingId, String drmId) throws BitmovinException {
        return this.apiClient.get(encodingId, muxingId, drmId).getData().getResult();
    }
    
    /**
     * List ClearKey DRMs of MP4
     * 
     * @param encodingId Id of the encoding. (required)
     * @param muxingId Id of the mp4. (required)
     * @return List&lt;ClearKeyDrm&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<ClearKeyDrm> list(String encodingId, String muxingId) throws BitmovinException {
        return this.apiClient.list(encodingId, muxingId, new HashMap<String, Object>()).getData().getResult();
    }
    /**
     * List ClearKey DRMs of MP4
     * 
     * @param encodingId Id of the encoding. (required)
     * @param muxingId Id of the mp4. (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;ClearKeyDrm&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<ClearKeyDrm> list(String encodingId, String muxingId, ClearKeyDrmListQueryParams queryParams) throws BitmovinException {
        return this.apiClient.list(encodingId, muxingId, queryParams).getData().getResult();
    }
    
    interface ClearkeyApiClient {
    
        @RequestLine("POST /encoding/encodings/{encoding_id}/muxings/mp4/{muxing_id}/drm/clearkey")
        ResponseEnvelope<ClearKeyDrm> create(@Param(value = "encoding_id") String encodingId, @Param(value = "muxing_id") String muxingId, ClearKeyDrm clearKeyDrm) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/encodings/{encoding_id}/muxings/mp4/{muxing_id}/drm/clearkey/{drm_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "encoding_id") String encodingId, @Param(value = "muxing_id") String muxingId, @Param(value = "drm_id") String drmId) throws BitmovinException;
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/muxings/mp4/{muxing_id}/drm/clearkey/{drm_id}")
        ResponseEnvelope<ClearKeyDrm> get(@Param(value = "encoding_id") String encodingId, @Param(value = "muxing_id") String muxingId, @Param(value = "drm_id") String drmId) throws BitmovinException;
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/muxings/mp4/{muxing_id}/drm/clearkey")
        ResponseEnvelope<PaginationResponse<ClearKeyDrm>> list(@Param(value = "encoding_id") String encodingId, @Param(value = "muxing_id") String muxingId, @QueryMap Map<String, Object> queryParams) throws BitmovinException;
    }
}
