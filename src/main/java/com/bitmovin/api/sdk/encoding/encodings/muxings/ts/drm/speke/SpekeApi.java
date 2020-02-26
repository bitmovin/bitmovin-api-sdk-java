package com.bitmovin.api.sdk.encoding.encodings.muxings.ts.drm.speke;

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
import com.bitmovin.api.sdk.encoding.encodings.muxings.ts.drm.speke.customdata.CustomdataApi;

public class SpekeApi {
    public final CustomdataApi customdata;

    private final SpekeApiClient apiClient;

    public SpekeApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(SpekeApiClient.class);

        this.customdata = new CustomdataApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of SpekeApi
     */
    public static BitmovinApiBuilder<SpekeApi> builder() {
        return new BitmovinApiBuilder<>(SpekeApi.class);
    }
    
    /**
     * Add SPEKE DRM key provider to TS muxing
     * 
     * @param encodingId Id of the encoding. (required)
     * @param muxingId Id of the TS muxing (required)
     * @param spekeDrm The SPEKE DRM key provider to be created (required)
     * @return SpekeDrm
     * @throws BitmovinException if fails to make API call
     */
    public SpekeDrm create(String encodingId, String muxingId, SpekeDrm spekeDrm) throws BitmovinException {
        try {
            return this.apiClient.create(encodingId, muxingId, spekeDrm).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * Delete SPEKE DRM from TS muxing
     * 
     * @param encodingId Id of the encoding. (required)
     * @param muxingId Id of the TS muxing (required)
     * @param drmId Id of the SPEKE DRM. (required)
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
     * SPEKE DRM Details of TS muxing
     * 
     * @param encodingId Id of the encoding. (required)
     * @param muxingId Id of the TS muxing (required)
     * @param drmId Id of the SPEKE DRM. (required)
     * @return SpekeDrm
     * @throws BitmovinException if fails to make API call
     */
    public SpekeDrm get(String encodingId, String muxingId, String drmId) throws BitmovinException {
        try {
            return this.apiClient.get(encodingId, muxingId, drmId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * List SPEKE DRM of TS muxing
     * 
     * @param encodingId Id of the encoding. (required)
     * @param muxingId Id of the TS muxing (required)
     * @return List&lt;SpekeDrm&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<SpekeDrm> list(String encodingId, String muxingId) throws BitmovinException {
        try {
            return this.apiClient.list(encodingId, muxingId, new HashMap<String, Object>()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * List SPEKE DRM of TS muxing
     * 
     * @param encodingId Id of the encoding. (required)
     * @param muxingId Id of the TS muxing (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;SpekeDrm&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<SpekeDrm> list(String encodingId, String muxingId, SpekeDrmListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(encodingId, muxingId, queryParams).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    interface SpekeApiClient {
    
        @RequestLine("POST /encoding/encodings/{encoding_id}/muxings/ts/{muxing_id}/drm/speke")
        ResponseEnvelope<SpekeDrm> create(@Param(value = "encoding_id") String encodingId, @Param(value = "muxing_id") String muxingId, SpekeDrm spekeDrm) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/encodings/{encoding_id}/muxings/ts/{muxing_id}/drm/speke/{drm_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "encoding_id") String encodingId, @Param(value = "muxing_id") String muxingId, @Param(value = "drm_id") String drmId) throws BitmovinException;
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/muxings/ts/{muxing_id}/drm/speke/{drm_id}")
        ResponseEnvelope<SpekeDrm> get(@Param(value = "encoding_id") String encodingId, @Param(value = "muxing_id") String muxingId, @Param(value = "drm_id") String drmId) throws BitmovinException;
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/muxings/ts/{muxing_id}/drm/speke")
        ResponseEnvelope<PaginationResponse<SpekeDrm>> list(@Param(value = "encoding_id") String encodingId, @Param(value = "muxing_id") String muxingId, @QueryMap Map<String, Object> queryParams) throws BitmovinException;
    }
}
