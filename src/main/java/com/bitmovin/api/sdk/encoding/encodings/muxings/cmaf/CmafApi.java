package com.bitmovin.api.sdk.encoding.encodings.muxings.cmaf;

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
import com.bitmovin.api.sdk.encoding.encodings.muxings.cmaf.customdata.CustomdataApi;

public class CmafApi {
    public final CustomdataApi customdata;

    private final CmafApiClient apiClient;

    public CmafApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(CmafApiClient.class);

        this.customdata = new CustomdataApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of CmafApi
     */
    public static BitmovinApiBuilder<CmafApi> builder() {
        return new BitmovinApiBuilder<>(CmafApi.class);
    }
    
    /**
     * Add CMAF muxing
     * 
     * @param encodingId Id of the encoding. (required)
     * @param cmafMuxing The CMAF muxing to be created (required)
     * @return CmafMuxing
     * @throws BitmovinException if fails to make API call
     */
    public CmafMuxing create(String encodingId, CmafMuxing cmafMuxing) throws BitmovinException {
        try {
            return this.apiClient.create(encodingId, cmafMuxing).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * Delete CMAF muxing
     * 
     * @param encodingId Id of the encoding. (required)
     * @param muxingId Id of the CMAF muxing (required)
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
     * CMAF muxing details
     * 
     * @param encodingId Id of the encoding. (required)
     * @param muxingId Id of the CMAF muxing (required)
     * @return CmafMuxing
     * @throws BitmovinException if fails to make API call
     */
    public CmafMuxing get(String encodingId, String muxingId) throws BitmovinException {
        try {
            return this.apiClient.get(encodingId, muxingId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * List CMAF muxings
     * 
     * @param encodingId Id of the encoding. (required)
     * @return List&lt;CmafMuxing&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<CmafMuxing> list(String encodingId) throws BitmovinException {
        try {
            return this.apiClient.list(encodingId, new HashMap<String, Object>()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * List CMAF muxings
     * 
     * @param encodingId Id of the encoding. (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;CmafMuxing&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<CmafMuxing> list(String encodingId, CmafMuxingListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(encodingId, queryParams).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    interface CmafApiClient {
    
        @RequestLine("POST /encoding/encodings/{encoding_id}/muxings/cmaf")
        ResponseEnvelope<CmafMuxing> create(@Param(value = "encoding_id") String encodingId, CmafMuxing cmafMuxing) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/encodings/{encoding_id}/muxings/cmaf/{muxing_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "encoding_id") String encodingId, @Param(value = "muxing_id") String muxingId) throws BitmovinException;
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/muxings/cmaf/{muxing_id}")
        ResponseEnvelope<CmafMuxing> get(@Param(value = "encoding_id") String encodingId, @Param(value = "muxing_id") String muxingId) throws BitmovinException;
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/muxings/cmaf")
        ResponseEnvelope<PaginationResponse<CmafMuxing>> list(@Param(value = "encoding_id") String encodingId, @QueryMap Map<String, Object> queryParams) throws BitmovinException;
    }
}
