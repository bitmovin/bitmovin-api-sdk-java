package com.bitmovin.api.sdk.encoding.encodings.muxings.progressiveWebm.drm.cenc;

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
import com.bitmovin.api.sdk.encoding.encodings.muxings.progressiveWebm.drm.cenc.customdata.CustomdataApi;

public class CencApi {
    public final CustomdataApi customdata;

    private final CencApiClient apiClient;

    public CencApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(CencApiClient.class);

        this.customdata = new CustomdataApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of CencApi
     */
    public static BitmovinApiBuilder<CencApi> builder() {
        return new BitmovinApiBuilder<>(CencApi.class);
    }
    
    /**
     * Add CENC DRM to Progressive WebM
     * 
     * @param encodingId Id of the encoding. (required)
     * @param muxingId Id of the Progressive WebM muxing. (required)
     * @param cencDrm The CENC DRM to be created (required)
     * @return CencDrm
     * @throws BitmovinException if fails to make API call
     */
    public CencDrm create(String encodingId, String muxingId, CencDrm cencDrm) throws BitmovinException {
        try {
            return this.apiClient.create(encodingId, muxingId, cencDrm).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * Delete CENC DRM from Progressive WebM
     * 
     * @param encodingId Id of the encoding. (required)
     * @param muxingId Id of the Progressive WebM muxing (required)
     * @param drmId Id of the CENC DRM. (required)
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
     * CENC DRM Details of Progressive WebM
     * 
     * @param encodingId Id of the encoding. (required)
     * @param muxingId Id of the Progressive WebM muxing. (required)
     * @param drmId Id of the CENC DRM. (required)
     * @return CencDrm
     * @throws BitmovinException if fails to make API call
     */
    public CencDrm get(String encodingId, String muxingId, String drmId) throws BitmovinException {
        try {
            return this.apiClient.get(encodingId, muxingId, drmId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * List CENC DRM configurations of Progressive WebM muxing
     * 
     * @param encodingId Id of the encoding. (required)
     * @param muxingId Id of the Progressive WebM muxing. (required)
     * @return List&lt;CencDrm&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<CencDrm> list(String encodingId, String muxingId) throws BitmovinException {
        try {
            return this.apiClient.list(encodingId, muxingId, new HashMap<String, Object>()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * List CENC DRM configurations of Progressive WebM muxing
     * 
     * @param encodingId Id of the encoding. (required)
     * @param muxingId Id of the Progressive WebM muxing. (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;CencDrm&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<CencDrm> list(String encodingId, String muxingId, CencDrmListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(encodingId, muxingId, queryParams).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    interface CencApiClient {
    
        @RequestLine("POST /encoding/encodings/{encoding_id}/muxings/progressive-webm/{muxing_id}/drm/cenc")
        ResponseEnvelope<CencDrm> create(@Param(value = "encoding_id") String encodingId, @Param(value = "muxing_id") String muxingId, CencDrm cencDrm) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/encodings/{encoding_id}/muxings/progressive-webm/{muxing_id}/drm/cenc/{drm_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "encoding_id") String encodingId, @Param(value = "muxing_id") String muxingId, @Param(value = "drm_id") String drmId) throws BitmovinException;
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/muxings/progressive-webm/{muxing_id}/drm/cenc/{drm_id}")
        ResponseEnvelope<CencDrm> get(@Param(value = "encoding_id") String encodingId, @Param(value = "muxing_id") String muxingId, @Param(value = "drm_id") String drmId) throws BitmovinException;
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/muxings/progressive-webm/{muxing_id}/drm/cenc")
        ResponseEnvelope<PaginationResponse<CencDrm>> list(@Param(value = "encoding_id") String encodingId, @Param(value = "muxing_id") String muxingId, @QueryMap Map<String, Object> queryParams) throws BitmovinException;
    }
}
