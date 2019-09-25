package com.bitmovin.api.sdk.encoding.encodings.muxings.mp4;

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
import com.bitmovin.api.sdk.encoding.encodings.muxings.mp4.customdata.CustomdataApi;
import com.bitmovin.api.sdk.encoding.encodings.muxings.mp4.information.InformationApi;
import com.bitmovin.api.sdk.encoding.encodings.muxings.mp4.drm.DrmApi;

public class Mp4Api {
    public final CustomdataApi customdata;
    public final InformationApi information;
    public final DrmApi drm;

    private final Mp4ApiClient apiClient;

    public Mp4Api(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(Mp4ApiClient.class);

        this.customdata = new CustomdataApi(clientFactory);
        this.information = new InformationApi(clientFactory);
        this.drm = new DrmApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of Mp4Api
     */
    public static BitmovinApiBuilder<Mp4Api> builder() {
        return new BitmovinApiBuilder<>(Mp4Api.class);
    }
    
    /**
     * Add MP4 Muxing
     * 
     * @param encodingId Id of the encoding. (required)
     * @param mp4Muxing The MP4 Muxing to be created (required)
     * @return Mp4Muxing
     * @throws BitmovinException if fails to make API call
     */
    public Mp4Muxing create(String encodingId, Mp4Muxing mp4Muxing) throws BitmovinException {
        try {
            return this.apiClient.create(encodingId, mp4Muxing).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * Delete MP4 Muxing
     * 
     * @param encodingId Id of the encoding. (required)
     * @param muxingId Id of the MP4 muxing (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse delete(String encodingId, String muxingId) throws BitmovinException {
        try {
            return this.apiClient.delete(encodingId, muxingId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * MP4 Segment Muxing Details
     * 
     * @param encodingId Id of the encoding. (required)
     * @param muxingId Id of the MP4 muxing (required)
     * @return Mp4Muxing
     * @throws BitmovinException if fails to make API call
     */
    public Mp4Muxing get(String encodingId, String muxingId) throws BitmovinException {
        try {
            return this.apiClient.get(encodingId, muxingId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * List MP4 Muxings
     * 
     * @param encodingId Id of the encoding. (required)
     * @return List&lt;Mp4Muxing&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<Mp4Muxing> list(String encodingId) throws BitmovinException {
        try {
            return this.apiClient.list(encodingId, new HashMap<String, Object>()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * List MP4 Muxings
     * 
     * @param encodingId Id of the encoding. (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;Mp4Muxing&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<Mp4Muxing> list(String encodingId, Mp4MuxingListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(encodingId, queryParams).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    interface Mp4ApiClient {
    
        @RequestLine("POST /encoding/encodings/{encoding_id}/muxings/mp4")
        ResponseEnvelope<Mp4Muxing> create(@Param(value = "encoding_id") String encodingId, Mp4Muxing mp4Muxing) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/encodings/{encoding_id}/muxings/mp4/{muxing_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "encoding_id") String encodingId, @Param(value = "muxing_id") String muxingId) throws BitmovinException;
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/muxings/mp4/{muxing_id}")
        ResponseEnvelope<Mp4Muxing> get(@Param(value = "encoding_id") String encodingId, @Param(value = "muxing_id") String muxingId) throws BitmovinException;
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/muxings/mp4")
        ResponseEnvelope<PaginationResponse<Mp4Muxing>> list(@Param(value = "encoding_id") String encodingId, @QueryMap Map<String, Object> queryParams) throws BitmovinException;
    }
}
