package com.bitmovin.api.sdk.encoding.statistics.daily;

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

public class DailyApi {

    private final DailyApiClient apiClient;

    public DailyApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(DailyApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of DailyApi
     */
    public static BitmovinApiBuilder<DailyApi> builder() {
        return new BitmovinApiBuilder<>(DailyApi.class);
    }
    
    /**
     * List Daily Statistics
     * 
     * @return List&lt;DailyStatistics&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<DailyStatistics> list() throws BitmovinException {
        return this.apiClient.list(new HashMap<String, Object>()).getData().getResult();
    }
    /**
     * List Daily Statistics
     * 
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;DailyStatistics&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<DailyStatistics> list(DailyStatisticsListQueryParams queryParams) throws BitmovinException {
        return this.apiClient.list(queryParams).getData().getResult();
    }
    
    /**
     * List daily statistics within specific dates
     * 
     * @param from Start date, format: yyyy-MM-dd (required)
     * @param to End date, format: yyyy-MM-dd (required)
     * @return List&lt;DailyStatistics&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<DailyStatistics> listByDateRange(Date from, Date to) throws BitmovinException {
        return this.apiClient.listByDateRange(from, to, new HashMap<String, Object>()).getData().getResult();
    }
    /**
     * List daily statistics within specific dates
     * 
     * @param from Start date, format: yyyy-MM-dd (required)
     * @param to End date, format: yyyy-MM-dd (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;DailyStatistics&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<DailyStatistics> listByDateRange(Date from, Date to, DailyStatisticsListByDateRangeQueryParams queryParams) throws BitmovinException {
        return this.apiClient.listByDateRange(from, to, queryParams).getData().getResult();
    }
    
    interface DailyApiClient {
    
        @RequestLine("GET /encoding/statistics/daily")
        ResponseEnvelope<PaginationResponse<DailyStatistics>> list(@QueryMap Map<String, Object> queryParams) throws BitmovinException;
    
        @RequestLine("GET /encoding/statistics/daily/{from}/{to}")
        ResponseEnvelope<PaginationResponse<DailyStatistics>> listByDateRange(@Param(value = "from", expander = BitmovinDateExpander.class) Date from, @Param(value = "to", expander = BitmovinDateExpander.class) Date to, @QueryMap Map<String, Object> queryParams) throws BitmovinException;
    }
}
