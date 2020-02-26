package com.bitmovin.api.sdk.encoding.encodings.muxings.segmentedRaw;

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
import com.bitmovin.api.sdk.encoding.encodings.muxings.segmentedRaw.customdata.CustomdataApi;

public class SegmentedRawApi {
    public final CustomdataApi customdata;

    private final SegmentedRawApiClient apiClient;

    public SegmentedRawApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(SegmentedRawApiClient.class);

        this.customdata = new CustomdataApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of SegmentedRawApi
     */
    public static BitmovinApiBuilder<SegmentedRawApi> builder() {
        return new BitmovinApiBuilder<>(SegmentedRawApi.class);
    }
    
    /**
     * Add Segmented RAW muxing
     * 
     * @param encodingId Id of the encoding. (required)
     * @param segmentedRawMuxing The Segmented RAW muxing to be created (required)
     * @return SegmentedRawMuxing
     * @throws BitmovinException if fails to make API call
     */
    public SegmentedRawMuxing create(String encodingId, SegmentedRawMuxing segmentedRawMuxing) throws BitmovinException {
        try {
            return this.apiClient.create(encodingId, segmentedRawMuxing).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * Delete Segmented RAW muxing
     * 
     * @param encodingId Id of the encoding. (required)
     * @param muxingId Id of the Segmented RAW muxing (required)
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
     * Segmented RAW muxing details
     * 
     * @param encodingId Id of the encoding. (required)
     * @param muxingId Id of the Segmented RAW muxing (required)
     * @return SegmentedRawMuxing
     * @throws BitmovinException if fails to make API call
     */
    public SegmentedRawMuxing get(String encodingId, String muxingId) throws BitmovinException {
        try {
            return this.apiClient.get(encodingId, muxingId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * List Segmented RAW muxings
     * 
     * @param encodingId Id of the encoding. (required)
     * @return List&lt;SegmentedRawMuxing&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<SegmentedRawMuxing> list(String encodingId) throws BitmovinException {
        try {
            return this.apiClient.list(encodingId, new HashMap<String, Object>()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * List Segmented RAW muxings
     * 
     * @param encodingId Id of the encoding. (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;SegmentedRawMuxing&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<SegmentedRawMuxing> list(String encodingId, SegmentedRawMuxingListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(encodingId, queryParams).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    interface SegmentedRawApiClient {
    
        @RequestLine("POST /encoding/encodings/{encoding_id}/muxings/segmented-raw")
        ResponseEnvelope<SegmentedRawMuxing> create(@Param(value = "encoding_id") String encodingId, SegmentedRawMuxing segmentedRawMuxing) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/encodings/{encoding_id}/muxings/segmented-raw/{muxing_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "encoding_id") String encodingId, @Param(value = "muxing_id") String muxingId) throws BitmovinException;
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/muxings/segmented-raw/{muxing_id}")
        ResponseEnvelope<SegmentedRawMuxing> get(@Param(value = "encoding_id") String encodingId, @Param(value = "muxing_id") String muxingId) throws BitmovinException;
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/muxings/segmented-raw")
        ResponseEnvelope<PaginationResponse<SegmentedRawMuxing>> list(@Param(value = "encoding_id") String encodingId, @QueryMap Map<String, Object> queryParams) throws BitmovinException;
    }
}
