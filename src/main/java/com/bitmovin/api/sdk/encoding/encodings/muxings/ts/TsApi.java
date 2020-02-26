package com.bitmovin.api.sdk.encoding.encodings.muxings.ts;

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
import com.bitmovin.api.sdk.encoding.encodings.muxings.ts.customdata.CustomdataApi;
import com.bitmovin.api.sdk.encoding.encodings.muxings.ts.drm.DrmApi;

public class TsApi {
    public final CustomdataApi customdata;
    public final DrmApi drm;

    private final TsApiClient apiClient;

    public TsApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(TsApiClient.class);

        this.customdata = new CustomdataApi(clientFactory);
        this.drm = new DrmApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of TsApi
     */
    public static BitmovinApiBuilder<TsApi> builder() {
        return new BitmovinApiBuilder<>(TsApi.class);
    }
    
    /**
     * Add TS muxing
     * 
     * @param encodingId Id of the encoding. (required)
     * @param tsMuxing The TS muxing to be created (required)
     * @return TsMuxing
     * @throws BitmovinException if fails to make API call
     */
    public TsMuxing create(String encodingId, TsMuxing tsMuxing) throws BitmovinException {
        try {
            return this.apiClient.create(encodingId, tsMuxing).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * Delete TS muxing
     * 
     * @param encodingId Id of the encoding. (required)
     * @param muxingId Id of the TS muxing (required)
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
     * TS muxing details
     * 
     * @param encodingId Id of the encoding. (required)
     * @param muxingId Id of the TS muxing (required)
     * @return TsMuxing
     * @throws BitmovinException if fails to make API call
     */
    public TsMuxing get(String encodingId, String muxingId) throws BitmovinException {
        try {
            return this.apiClient.get(encodingId, muxingId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * List TS muxings
     * 
     * @param encodingId Id of the encoding. (required)
     * @return List&lt;TsMuxing&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<TsMuxing> list(String encodingId) throws BitmovinException {
        try {
            return this.apiClient.list(encodingId, new HashMap<String, Object>()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * List TS muxings
     * 
     * @param encodingId Id of the encoding. (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;TsMuxing&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<TsMuxing> list(String encodingId, TsMuxingListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(encodingId, queryParams).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    interface TsApiClient {
    
        @RequestLine("POST /encoding/encodings/{encoding_id}/muxings/ts")
        ResponseEnvelope<TsMuxing> create(@Param(value = "encoding_id") String encodingId, TsMuxing tsMuxing) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/encodings/{encoding_id}/muxings/ts/{muxing_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "encoding_id") String encodingId, @Param(value = "muxing_id") String muxingId) throws BitmovinException;
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/muxings/ts/{muxing_id}")
        ResponseEnvelope<TsMuxing> get(@Param(value = "encoding_id") String encodingId, @Param(value = "muxing_id") String muxingId) throws BitmovinException;
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/muxings/ts")
        ResponseEnvelope<PaginationResponse<TsMuxing>> list(@Param(value = "encoding_id") String encodingId, @QueryMap Map<String, Object> queryParams) throws BitmovinException;
    }
}
