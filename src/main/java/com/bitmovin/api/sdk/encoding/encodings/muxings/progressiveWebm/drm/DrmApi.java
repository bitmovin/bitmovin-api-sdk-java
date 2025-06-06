package com.bitmovin.api.sdk.encoding.encodings.muxings.progressiveWebm.drm;

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
import com.bitmovin.api.sdk.encoding.encodings.muxings.progressiveWebm.drm.cenc.CencApi;
import com.bitmovin.api.sdk.encoding.encodings.muxings.progressiveWebm.drm.speke.SpekeApi;

public class DrmApi {
    public final CencApi cenc;
    public final SpekeApi speke;

    private final DrmApiClient apiClient;

    public DrmApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(DrmApiClient.class);

        this.cenc = new CencApi(clientFactory);
        this.speke = new SpekeApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of DrmApi
     */
    public static BitmovinApiBuilder<DrmApi> builder() {
        return new BitmovinApiBuilder<>(DrmApi.class);
    }
    /**
     * DRM Details of a Progressive WEBM muxing
     * 
     * @param encodingId Id of the encoding. (required)
     * @param muxingId Id of the Progressive WEBM muxing (required)
     * @param drmId Id of the DRM. (required)
     * @return Drm
     * @throws BitmovinException if fails to make API call
     */
    public Drm get(String encodingId, String muxingId, String drmId) throws BitmovinException {
        try {
            return this.apiClient.get(encodingId, muxingId, drmId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * List all DRMs of Progressive WEBM muxing
     * 
     * @param encodingId Id of the encoding. (required)
     * @param muxingId Id of the Progressive WEBM muxing (required)
     * @return List&lt;Drm&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<Drm> list(String encodingId, String muxingId) throws BitmovinException {
        try {
            return this.apiClient.list(encodingId, muxingId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface DrmApiClient { 
        @RequestLine("GET /encoding/encodings/{encoding_id}/muxings/progressive-webm/{muxing_id}/drm/{drm_id}")
        ResponseEnvelope<Drm> get(@Param(value = "encoding_id") String encodingId, @Param(value = "muxing_id") String muxingId, @Param(value = "drm_id") String drmId) throws BitmovinException;
   
        @RequestLine("GET /encoding/encodings/{encoding_id}/muxings/progressive-webm/{muxing_id}/drm")
        ResponseEnvelope<PaginationResponse<Drm>> list(@Param(value = "encoding_id") String encodingId, @Param(value = "muxing_id") String muxingId) throws BitmovinException;
    }
}
