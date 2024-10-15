package com.bitmovin.api.sdk.encoding.encodings.muxings.webm;

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
import com.bitmovin.api.sdk.encoding.encodings.muxings.webm.customdata.CustomdataApi;
import com.bitmovin.api.sdk.encoding.encodings.muxings.webm.drm.DrmApi;

public class WebmApi {
    public final CustomdataApi customdata;
    public final DrmApi drm;

    private final WebmApiClient apiClient;

    public WebmApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(WebmApiClient.class);

        this.customdata = new CustomdataApi(clientFactory);
        this.drm = new DrmApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of WebmApi
     */
    public static BitmovinApiBuilder<WebmApi> builder() {
        return new BitmovinApiBuilder<>(WebmApi.class);
    }
    /**
     * Add WebM muxing
     * 
     * @param encodingId Id of the encoding. (required)
     * @param webmMuxing The WebM muxing to be created (required)
     * @return WebmMuxing
     * @throws BitmovinException if fails to make API call
     */
    public WebmMuxing create(String encodingId, WebmMuxing webmMuxing) throws BitmovinException {
        try {
            return this.apiClient.create(encodingId, webmMuxing).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * Delete WebM muxing
     * 
     * @param encodingId Id of the encoding. (required)
     * @param muxingId Id of the WebM muxing (required)
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
     * WebM muxing details
     * 
     * @param encodingId Id of the encoding. (required)
     * @param muxingId Id of the WebM muxing (required)
     * @return WebmMuxing
     * @throws BitmovinException if fails to make API call
     */
    public WebmMuxing get(String encodingId, String muxingId) throws BitmovinException {
        try {
            return this.apiClient.get(encodingId, muxingId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * List WebM muxings
     * 
     * @param encodingId Id of the encoding. (required)
     * @return List&lt;WebmMuxing&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<WebmMuxing> list(String encodingId) throws BitmovinException {
        try {
            return this.apiClient.list(encodingId, new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * List WebM muxings
     * 
     * @param encodingId Id of the encoding. (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;WebmMuxing&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<WebmMuxing> list(String encodingId, WebmMuxingListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(encodingId, new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface WebmApiClient { 
        @RequestLine("POST /encoding/encodings/{encoding_id}/muxings/webm")
        ResponseEnvelope<WebmMuxing> create(@Param(value = "encoding_id") String encodingId, WebmMuxing webmMuxing) throws BitmovinException;
   
        @RequestLine("DELETE /encoding/encodings/{encoding_id}/muxings/webm/{muxing_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "encoding_id") String encodingId, @Param(value = "muxing_id") String muxingId) throws BitmovinException;
   
        @RequestLine("GET /encoding/encodings/{encoding_id}/muxings/webm/{muxing_id}")
        ResponseEnvelope<WebmMuxing> get(@Param(value = "encoding_id") String encodingId, @Param(value = "muxing_id") String muxingId) throws BitmovinException;
   
        @RequestLine("GET /encoding/encodings/{encoding_id}/muxings/webm")
        ResponseEnvelope<PaginationResponse<WebmMuxing>> list(@Param(value = "encoding_id") String encodingId, @QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    }
}
