package com.bitmovin.api.sdk.encoding.encodings.muxings.progressiveWebm;

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
import com.bitmovin.api.sdk.encoding.encodings.muxings.progressiveWebm.customdata.CustomdataApi;
import com.bitmovin.api.sdk.encoding.encodings.muxings.progressiveWebm.information.InformationApi;
import com.bitmovin.api.sdk.encoding.encodings.muxings.progressiveWebm.drm.DrmApi;

public class ProgressiveWebmApi {
    public final CustomdataApi customdata;
    public final InformationApi information;
    public final DrmApi drm;

    private final ProgressiveWebmApiClient apiClient;

    public ProgressiveWebmApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(ProgressiveWebmApiClient.class);

        this.customdata = new CustomdataApi(clientFactory);
        this.information = new InformationApi(clientFactory);
        this.drm = new DrmApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of ProgressiveWebmApi
     */
    public static BitmovinApiBuilder<ProgressiveWebmApi> builder() {
        return new BitmovinApiBuilder<>(ProgressiveWebmApi.class);
    }
    /**
     * Add Progressive WebM muxing
     * 
     * @param encodingId Id of the encoding. (required)
     * @param progressiveWebmMuxing The Progressive WebM muxing to be created (required)
     * @return ProgressiveWebmMuxing
     * @throws BitmovinException if fails to make API call
     */
    public ProgressiveWebmMuxing create(String encodingId, ProgressiveWebmMuxing progressiveWebmMuxing) throws BitmovinException {
        try {
            return this.apiClient.create(encodingId, progressiveWebmMuxing).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * Delete Progressive WebM muxing
     * 
     * @param encodingId Id of the encoding. (required)
     * @param muxingId Id of the Progressive WebM muxing (required)
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
     * Progressive WebM muxing details
     * 
     * @param encodingId Id of the encoding. (required)
     * @param muxingId Id of the Progressive WebM muxing (required)
     * @return ProgressiveWebmMuxing
     * @throws BitmovinException if fails to make API call
     */
    public ProgressiveWebmMuxing get(String encodingId, String muxingId) throws BitmovinException {
        try {
            return this.apiClient.get(encodingId, muxingId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * List Progressive WebM muxings
     * 
     * @param encodingId Id of the encoding. (required)
     * @return List&lt;ProgressiveWebmMuxing&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<ProgressiveWebmMuxing> list(String encodingId) throws BitmovinException {
        try {
            return this.apiClient.list(encodingId, new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * List Progressive WebM muxings
     * 
     * @param encodingId Id of the encoding. (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;ProgressiveWebmMuxing&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<ProgressiveWebmMuxing> list(String encodingId, ProgressiveWebmMuxingListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(encodingId, new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface ProgressiveWebmApiClient { 
        @RequestLine("POST /encoding/encodings/{encoding_id}/muxings/progressive-webm")
        ResponseEnvelope<ProgressiveWebmMuxing> create(@Param(value = "encoding_id") String encodingId, ProgressiveWebmMuxing progressiveWebmMuxing) throws BitmovinException;
   
        @RequestLine("DELETE /encoding/encodings/{encoding_id}/muxings/progressive-webm/{muxing_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "encoding_id") String encodingId, @Param(value = "muxing_id") String muxingId) throws BitmovinException;
   
        @RequestLine("GET /encoding/encodings/{encoding_id}/muxings/progressive-webm/{muxing_id}")
        ResponseEnvelope<ProgressiveWebmMuxing> get(@Param(value = "encoding_id") String encodingId, @Param(value = "muxing_id") String muxingId) throws BitmovinException;
   
        @RequestLine("GET /encoding/encodings/{encoding_id}/muxings/progressive-webm")
        ResponseEnvelope<PaginationResponse<ProgressiveWebmMuxing>> list(@Param(value = "encoding_id") String encodingId, @QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    }
}
