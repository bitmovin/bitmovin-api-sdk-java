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
import static com.bitmovin.api.sdk.common.BitmovinExceptionFactory.buildBitmovinException;
import com.bitmovin.api.sdk.common.BitmovinDateExpander;
import com.bitmovin.api.sdk.common.QueryMapWrapper;
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
     * Add ClearKey DRM to an MP4 muxing
     * 
     * @param encodingId Id of the encoding. (required)
     * @param muxingId Id of the MP4 muxing. (required)
     * @param clearKeyDrm The ClearKey DRM to be created (required)
     * @return ClearKeyDrm
     * @throws BitmovinException if fails to make API call
     */
    public ClearKeyDrm create(String encodingId, String muxingId, ClearKeyDrm clearKeyDrm) throws BitmovinException {
        try {
            return this.apiClient.create(encodingId, muxingId, clearKeyDrm).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * Delete ClearKey DRM from an MP4 muxing
     * 
     * @param encodingId Id of the encoding. (required)
     * @param muxingId Id of the mp4. (required)
     * @param drmId Id of the ClearKey DRM configuration. (required)
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
     * ClearKey DRM Details of an MP4 muxing
     * 
     * @param encodingId Id of the encoding. (required)
     * @param muxingId Id of the mp4. (required)
     * @param drmId Id of the ClearKey DRM configuration. (required)
     * @return ClearKeyDrm
     * @throws BitmovinException if fails to make API call
     */
    public ClearKeyDrm get(String encodingId, String muxingId, String drmId) throws BitmovinException {
        try {
            return this.apiClient.get(encodingId, muxingId, drmId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * List ClearKey DRMs of an MP4 muxing
     * 
     * @param encodingId Id of the encoding. (required)
     * @param muxingId Id of the mp4. (required)
     * @return List&lt;ClearKeyDrm&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<ClearKeyDrm> list(String encodingId, String muxingId) throws BitmovinException {
        try {
            return this.apiClient.list(encodingId, muxingId, new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * List ClearKey DRMs of an MP4 muxing
     * 
     * @param encodingId Id of the encoding. (required)
     * @param muxingId Id of the mp4. (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;ClearKeyDrm&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<ClearKeyDrm> list(String encodingId, String muxingId, ClearKeyDrmListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(encodingId, muxingId, new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface ClearkeyApiClient { 
        @RequestLine("POST /encoding/encodings/{encoding_id}/muxings/mp4/{muxing_id}/drm/clearkey")
        ResponseEnvelope<ClearKeyDrm> create(@Param(value = "encoding_id") String encodingId, @Param(value = "muxing_id") String muxingId, ClearKeyDrm clearKeyDrm) throws BitmovinException;
   
        @RequestLine("DELETE /encoding/encodings/{encoding_id}/muxings/mp4/{muxing_id}/drm/clearkey/{drm_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "encoding_id") String encodingId, @Param(value = "muxing_id") String muxingId, @Param(value = "drm_id") String drmId) throws BitmovinException;
   
        @RequestLine("GET /encoding/encodings/{encoding_id}/muxings/mp4/{muxing_id}/drm/clearkey/{drm_id}")
        ResponseEnvelope<ClearKeyDrm> get(@Param(value = "encoding_id") String encodingId, @Param(value = "muxing_id") String muxingId, @Param(value = "drm_id") String drmId) throws BitmovinException;
   
        @RequestLine("GET /encoding/encodings/{encoding_id}/muxings/mp4/{muxing_id}/drm/clearkey")
        ResponseEnvelope<PaginationResponse<ClearKeyDrm>> list(@Param(value = "encoding_id") String encodingId, @Param(value = "muxing_id") String muxingId, @QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    }
}
