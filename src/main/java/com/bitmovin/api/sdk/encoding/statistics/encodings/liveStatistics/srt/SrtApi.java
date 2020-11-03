package com.bitmovin.api.sdk.encoding.statistics.encodings.liveStatistics.srt;

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

public class SrtApi {

    private final SrtApiClient apiClient;

    public SrtApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(SrtApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of SrtApi
     */
    public static BitmovinApiBuilder<SrtApi> builder() {
        return new BitmovinApiBuilder<>(SrtApi.class);
    }
    
    /**
     * List Stream Infos of Live Statistics from an Encoding
     * 
     * @param encodingId Id of the encoding. (required)
     * @return List&lt;SrtStatistics&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<SrtStatistics> list(String encodingId) throws BitmovinException {
        try {
            return this.apiClient.list(encodingId, new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * List Stream Infos of Live Statistics from an Encoding
     * 
     * @param encodingId Id of the encoding. (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;SrtStatistics&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<SrtStatistics> list(String encodingId, SrtStatisticsListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(encodingId, new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * List Statistics For SRT Live Stream Input
     * 
     * @param encodingId Id of the encoding. (required)
     * @param srtInputId Id of the SRT input. (required)
     * @return List&lt;SrtStatistics&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<SrtStatistics> listBySrtInputId(String encodingId, String srtInputId) throws BitmovinException {
        try {
            return this.apiClient.listBySrtInputId(encodingId, srtInputId, new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * List Statistics For SRT Live Stream Input
     * 
     * @param encodingId Id of the encoding. (required)
     * @param srtInputId Id of the SRT input. (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;SrtStatistics&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<SrtStatistics> listBySrtInputId(String encodingId, String srtInputId, SrtStatisticsListBySrtInputIdQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.listBySrtInputId(encodingId, srtInputId, new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    interface SrtApiClient {
    
        @RequestLine("GET /encoding/statistics/encodings/{encoding_id}/live-statistics/srt")
        ResponseEnvelope<PaginationResponse<SrtStatistics>> list(@Param(value = "encoding_id") String encodingId, @QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    
        @RequestLine("GET /encoding/statistics/encodings/{encoding_id}/live-statistics/srt/{srt_input_id}")
        ResponseEnvelope<PaginationResponse<SrtStatistics>> listBySrtInputId(@Param(value = "encoding_id") String encodingId, @Param(value = "srt_input_id") String srtInputId, @QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    }
}
