package com.bitmovin.api.sdk.encoding.statistics.encodings.live.options;

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

public class OptionsApi {

    private final OptionsApiClient apiClient;

    public OptionsApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(OptionsApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of OptionsApi
     */
    public static BitmovinApiBuilder<OptionsApi> builder() {
        return new BitmovinApiBuilder<>(OptionsApi.class);
    }
    /**
     * List live options encoding statistics for a given encoding
     * 
     * @param encodingId Id of the encoding (required)
     * @return LiveEncodingOptionsStatistics
     * @throws BitmovinException if fails to make API call
     */
    public LiveEncodingOptionsStatistics get(String encodingId) throws BitmovinException {
        try {
            return this.apiClient.get(encodingId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * List live options encoding statistics within specific dates
     * 
     * @return LiveOptionsStatistics
     * @throws BitmovinException if fails to make API call
     */
    public LiveOptionsStatistics listByDateRange() throws BitmovinException {
        try {
            return this.apiClient.listByDateRange(new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * List live options encoding statistics within specific dates
     * 
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return LiveOptionsStatistics
     * @throws BitmovinException if fails to make API call
     */
    public LiveOptionsStatistics listByDateRange(LiveOptionsStatisticsListByDateRangeQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.listByDateRange(new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface OptionsApiClient { 
        @RequestLine("GET /encoding/statistics/encodings/live/{encoding_id}/options")
        ResponseEnvelope<LiveEncodingOptionsStatistics> get(@Param(value = "encoding_id") String encodingId) throws BitmovinException;
   
        @RequestLine("GET /encoding/statistics/encodings/live/options")
        ResponseEnvelope<LiveOptionsStatistics> listByDateRange(@QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    }
}
