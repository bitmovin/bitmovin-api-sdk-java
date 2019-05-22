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
import com.bitmovin.api.sdk.common.BitmovinDateExpander;
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
        return this.apiClient.list(encodingId, new HashMap<String, Object>()).getData().getResult();
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
        return this.apiClient.list(encodingId, queryParams).getData().getResult();
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
        return this.apiClient.listBySrtInputId(encodingId, srtInputId, new HashMap<String, Object>()).getData().getResult();
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
        return this.apiClient.listBySrtInputId(encodingId, srtInputId, queryParams).getData().getResult();
    }
    
    interface SrtApiClient {
    
        @RequestLine("GET /encoding/statistics/encodings/{encoding_id}/live-statistics/srt")
        ResponseEnvelope<PaginationResponse<SrtStatistics>> list(@Param(value = "encoding_id") String encodingId, @QueryMap Map<String, Object> queryParams) throws BitmovinException;
    
        @RequestLine("GET /encoding/statistics/encodings/{encoding_id}/live-statistics/srt/{srt_input_id}")
        ResponseEnvelope<PaginationResponse<SrtStatistics>> listBySrtInputId(@Param(value = "encoding_id") String encodingId, @Param(value = "srt_input_id") String srtInputId, @QueryMap Map<String, Object> queryParams) throws BitmovinException;
    }
}
