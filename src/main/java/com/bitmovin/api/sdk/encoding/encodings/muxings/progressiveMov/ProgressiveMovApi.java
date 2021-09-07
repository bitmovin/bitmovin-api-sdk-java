package com.bitmovin.api.sdk.encoding.encodings.muxings.progressiveMov;

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
import com.bitmovin.api.sdk.encoding.encodings.muxings.progressiveMov.customdata.CustomdataApi;
import com.bitmovin.api.sdk.encoding.encodings.muxings.progressiveMov.information.InformationApi;

public class ProgressiveMovApi {
    public final CustomdataApi customdata;
    public final InformationApi information;

    private final ProgressiveMovApiClient apiClient;

    public ProgressiveMovApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(ProgressiveMovApiClient.class);

        this.customdata = new CustomdataApi(clientFactory);
        this.information = new InformationApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of ProgressiveMovApi
     */
    public static BitmovinApiBuilder<ProgressiveMovApi> builder() {
        return new BitmovinApiBuilder<>(ProgressiveMovApi.class);
    }

    /**
     * Add Progressive MOV muxing
     * 
     * @param encodingId Id of the encoding. (required)
     * @param progressiveMovMuxing The Progressive MOV muxing to be created (required)
     * @return ProgressiveMovMuxing
     * @throws BitmovinException if fails to make API call
     */
    public ProgressiveMovMuxing create(String encodingId, ProgressiveMovMuxing progressiveMovMuxing) throws BitmovinException {
        try {
            return this.apiClient.create(encodingId, progressiveMovMuxing).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * Delete Progressive MOV muxing
     * 
     * @param encodingId Id of the encoding. (required)
     * @param muxingId Id of the Progressive MOV muxing (required)
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
     * Progressive MOV muxing details
     * 
     * @param encodingId Id of the encoding. (required)
     * @param muxingId Id of the Progressive MOV muxing (required)
     * @return ProgressiveMovMuxing
     * @throws BitmovinException if fails to make API call
     */
    public ProgressiveMovMuxing get(String encodingId, String muxingId) throws BitmovinException {
        try {
            return this.apiClient.get(encodingId, muxingId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * List Progressive MOV muxings
     * 
     * @param encodingId Id of the encoding. (required)
     * @return List&lt;ProgressiveMovMuxing&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<ProgressiveMovMuxing> list(String encodingId) throws BitmovinException {
        try {
            return this.apiClient.list(encodingId, new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * List Progressive MOV muxings
     * 
     * @param encodingId Id of the encoding. (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;ProgressiveMovMuxing&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<ProgressiveMovMuxing> list(String encodingId, ProgressiveMovMuxingListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(encodingId, new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface ProgressiveMovApiClient {

        @RequestLine("POST /encoding/encodings/{encoding_id}/muxings/progressive-mov")
        ResponseEnvelope<ProgressiveMovMuxing> create(@Param(value = "encoding_id") String encodingId, ProgressiveMovMuxing progressiveMovMuxing) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/encodings/{encoding_id}/muxings/progressive-mov/{muxing_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "encoding_id") String encodingId, @Param(value = "muxing_id") String muxingId) throws BitmovinException;
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/muxings/progressive-mov/{muxing_id}")
        ResponseEnvelope<ProgressiveMovMuxing> get(@Param(value = "encoding_id") String encodingId, @Param(value = "muxing_id") String muxingId) throws BitmovinException;
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/muxings/progressive-mov")
        ResponseEnvelope<PaginationResponse<ProgressiveMovMuxing>> list(@Param(value = "encoding_id") String encodingId, @QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    }
}
