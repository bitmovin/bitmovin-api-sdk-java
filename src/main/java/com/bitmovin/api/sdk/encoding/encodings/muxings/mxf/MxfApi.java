package com.bitmovin.api.sdk.encoding.encodings.muxings.mxf;

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
import com.bitmovin.api.sdk.encoding.encodings.muxings.mxf.customdata.CustomdataApi;

public class MxfApi {
    public final CustomdataApi customdata;

    private final MxfApiClient apiClient;

    public MxfApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(MxfApiClient.class);

        this.customdata = new CustomdataApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of MxfApi
     */
    public static BitmovinApiBuilder<MxfApi> builder() {
        return new BitmovinApiBuilder<>(MxfApi.class);
    }

    /**
     * Add MXF muxing
     * 
     * @param encodingId Id of the encoding. (required)
     * @param mxfMuxing The MXF muxing to be created (required)
     * @return MxfMuxing
     * @throws BitmovinException if fails to make API call
     */
    public MxfMuxing create(String encodingId, MxfMuxing mxfMuxing) throws BitmovinException {
        try {
            return this.apiClient.create(encodingId, mxfMuxing).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * Delete MXF muxing
     * 
     * @param encodingId Id of the encoding. (required)
     * @param muxingId Id of the MXF muxing (required)
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
     * MXF muxing details
     * 
     * @param encodingId Id of the encoding. (required)
     * @param muxingId Id of the MXF muxing (required)
     * @return MxfMuxing
     * @throws BitmovinException if fails to make API call
     */
    public MxfMuxing get(String encodingId, String muxingId) throws BitmovinException {
        try {
            return this.apiClient.get(encodingId, muxingId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * List MXF muxings
     * 
     * @param encodingId Id of the encoding. (required)
     * @return List&lt;MxfMuxing&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<MxfMuxing> list(String encodingId) throws BitmovinException {
        try {
            return this.apiClient.list(encodingId, new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * List MXF muxings
     * 
     * @param encodingId Id of the encoding. (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;MxfMuxing&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<MxfMuxing> list(String encodingId, MxfMuxingListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(encodingId, new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface MxfApiClient {

        @RequestLine("POST /encoding/encodings/{encoding_id}/muxings/mxf")
        ResponseEnvelope<MxfMuxing> create(@Param(value = "encoding_id") String encodingId, MxfMuxing mxfMuxing) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/encodings/{encoding_id}/muxings/mxf/{muxing_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "encoding_id") String encodingId, @Param(value = "muxing_id") String muxingId) throws BitmovinException;
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/muxings/mxf/{muxing_id}")
        ResponseEnvelope<MxfMuxing> get(@Param(value = "encoding_id") String encodingId, @Param(value = "muxing_id") String muxingId) throws BitmovinException;
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/muxings/mxf")
        ResponseEnvelope<PaginationResponse<MxfMuxing>> list(@Param(value = "encoding_id") String encodingId, @QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    }
}
