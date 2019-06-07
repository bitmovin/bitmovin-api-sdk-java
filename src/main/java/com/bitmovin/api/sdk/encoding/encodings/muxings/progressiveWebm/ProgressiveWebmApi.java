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
import com.bitmovin.api.sdk.common.BitmovinDateExpander;
import com.bitmovin.api.sdk.common.BitmovinApiBuilder;
import com.bitmovin.api.sdk.common.BitmovinApiClientFactory;
import com.bitmovin.api.sdk.encoding.encodings.muxings.progressiveWebm.customdata.CustomdataApi;
import com.bitmovin.api.sdk.encoding.encodings.muxings.progressiveWebm.information.InformationApi;

public class ProgressiveWebmApi {
    public final CustomdataApi customdata;
    public final InformationApi information;

    private final ProgressiveWebmApiClient apiClient;

    public ProgressiveWebmApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(ProgressiveWebmApiClient.class);

        this.customdata = new CustomdataApi(clientFactory);
        this.information = new InformationApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of ProgressiveWebmApi
     */
    public static BitmovinApiBuilder<ProgressiveWebmApi> builder() {
        return new BitmovinApiBuilder<>(ProgressiveWebmApi.class);
    }
    
    /**
     * Add Progressive WebM Muxing
     * 
     * @param encodingId Id of the encoding. (required)
     * @param progressiveWebmMuxing  (required)
     * @return ProgressiveWebmMuxing
     * @throws BitmovinException if fails to make API call
     */
    public ProgressiveWebmMuxing create(String encodingId, ProgressiveWebmMuxing progressiveWebmMuxing) throws BitmovinException {
        return this.apiClient.create(encodingId, progressiveWebmMuxing).getData().getResult();
    }
    
    /**
     * Delete Progressive WebM Muxing
     * 
     * @param encodingId Id of the encoding. (required)
     * @param muxingId Id of the Progressive WebM muxing (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse delete(String encodingId, String muxingId) throws BitmovinException {
        return this.apiClient.delete(encodingId, muxingId).getData().getResult();
    }
    
    /**
     * Progressive WebM Muxing Details
     * 
     * @param encodingId Id of the encoding. (required)
     * @param muxingId Id of the Progressive WebM muxing (required)
     * @return ProgressiveWebmMuxing
     * @throws BitmovinException if fails to make API call
     */
    public ProgressiveWebmMuxing get(String encodingId, String muxingId) throws BitmovinException {
        return this.apiClient.get(encodingId, muxingId).getData().getResult();
    }
    
    /**
     * List Progressive WebM Muxings
     * 
     * @param encodingId Id of the encoding. (required)
     * @return List&lt;ProgressiveWebmMuxing&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<ProgressiveWebmMuxing> list(String encodingId) throws BitmovinException {
        return this.apiClient.list(encodingId, new HashMap<String, Object>()).getData().getResult();
    }
    /**
     * List Progressive WebM Muxings
     * 
     * @param encodingId Id of the encoding. (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;ProgressiveWebmMuxing&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<ProgressiveWebmMuxing> list(String encodingId, ProgressiveWebmMuxingListQueryParams queryParams) throws BitmovinException {
        return this.apiClient.list(encodingId, queryParams).getData().getResult();
    }
    
    interface ProgressiveWebmApiClient {
    
        @RequestLine("POST /encoding/encodings/{encoding_id}/muxings/progressive-webm")
        ResponseEnvelope<ProgressiveWebmMuxing> create(@Param(value = "encoding_id") String encodingId, ProgressiveWebmMuxing progressiveWebmMuxing) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/encodings/{encoding_id}/muxings/progressive-webm/{muxing_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "encoding_id") String encodingId, @Param(value = "muxing_id") String muxingId) throws BitmovinException;
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/muxings/progressive-webm/{muxing_id}")
        ResponseEnvelope<ProgressiveWebmMuxing> get(@Param(value = "encoding_id") String encodingId, @Param(value = "muxing_id") String muxingId) throws BitmovinException;
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/muxings/progressive-webm")
        ResponseEnvelope<PaginationResponse<ProgressiveWebmMuxing>> list(@Param(value = "encoding_id") String encodingId, @QueryMap Map<String, Object> queryParams) throws BitmovinException;
    }
}
