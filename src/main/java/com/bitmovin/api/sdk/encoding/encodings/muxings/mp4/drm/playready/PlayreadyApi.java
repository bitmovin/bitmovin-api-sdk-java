package com.bitmovin.api.sdk.encoding.encodings.muxings.mp4.drm.playready;

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
import com.bitmovin.api.sdk.encoding.encodings.muxings.mp4.drm.playready.customdata.CustomdataApi;

public class PlayreadyApi {
    public final CustomdataApi customdata;

    private final PlayreadyApiClient apiClient;

    public PlayreadyApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(PlayreadyApiClient.class);

        this.customdata = new CustomdataApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of PlayreadyApi
     */
    public static BitmovinApiBuilder<PlayreadyApi> builder() {
        return new BitmovinApiBuilder<>(PlayreadyApi.class);
    }
    
    /**
     * Add PlayReady DRM to MP4
     * 
     * @param encodingId Id of the encoding. (required)
     * @param muxingId Id of the MP4 muxing. (required)
     * @param playReadyDrm The PlayReady DRM to be created (required)
     * @return PlayReadyDrm
     * @throws BitmovinException if fails to make API call
     */
    public PlayReadyDrm create(String encodingId, String muxingId, PlayReadyDrm playReadyDrm) throws BitmovinException {
        return this.apiClient.create(encodingId, muxingId, playReadyDrm).getData().getResult();
    }
    
    /**
     * Delete PlayReady DRM from MP4
     * 
     * @param encodingId Id of the encoding. (required)
     * @param muxingId Id of the MP4 muxing. (required)
     * @param drmId Id of the PlayReady DRM configuration. (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse delete(String encodingId, String muxingId, String drmId) throws BitmovinException {
        return this.apiClient.delete(encodingId, muxingId, drmId).getData().getResult();
    }
    
    /**
     * PlayReady DRM Details of MP4
     * 
     * @param encodingId Id of the encoding. (required)
     * @param muxingId Id of the MP4 muxing. (required)
     * @param drmId Id of the PlayReady DRM configuration. (required)
     * @return PlayReadyDrm
     * @throws BitmovinException if fails to make API call
     */
    public PlayReadyDrm get(String encodingId, String muxingId, String drmId) throws BitmovinException {
        return this.apiClient.get(encodingId, muxingId, drmId).getData().getResult();
    }
    
    /**
     * List PlayReady DRMs of MP4
     * 
     * @param encodingId Id of the encoding. (required)
     * @param muxingId Id of the MP4 muxing. (required)
     * @return List&lt;PlayReadyDrm&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<PlayReadyDrm> list(String encodingId, String muxingId) throws BitmovinException {
        return this.apiClient.list(encodingId, muxingId, new HashMap<String, Object>()).getData().getResult();
    }
    /**
     * List PlayReady DRMs of MP4
     * 
     * @param encodingId Id of the encoding. (required)
     * @param muxingId Id of the MP4 muxing. (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;PlayReadyDrm&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<PlayReadyDrm> list(String encodingId, String muxingId, PlayReadyDrmListQueryParams queryParams) throws BitmovinException {
        return this.apiClient.list(encodingId, muxingId, queryParams).getData().getResult();
    }
    
    interface PlayreadyApiClient {
    
        @RequestLine("POST /encoding/encodings/{encoding_id}/muxings/mp4/{muxing_id}/drm/playready")
        ResponseEnvelope<PlayReadyDrm> create(@Param(value = "encoding_id") String encodingId, @Param(value = "muxing_id") String muxingId, PlayReadyDrm playReadyDrm) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/encodings/{encoding_id}/muxings/mp4/{muxing_id}/drm/playready/{drm_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "encoding_id") String encodingId, @Param(value = "muxing_id") String muxingId, @Param(value = "drm_id") String drmId) throws BitmovinException;
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/muxings/mp4/{muxing_id}/drm/playready/{drm_id}")
        ResponseEnvelope<PlayReadyDrm> get(@Param(value = "encoding_id") String encodingId, @Param(value = "muxing_id") String muxingId, @Param(value = "drm_id") String drmId) throws BitmovinException;
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/muxings/mp4/{muxing_id}/drm/playready")
        ResponseEnvelope<PaginationResponse<PlayReadyDrm>> list(@Param(value = "encoding_id") String encodingId, @Param(value = "muxing_id") String muxingId, @QueryMap Map<String, Object> queryParams) throws BitmovinException;
    }
}
