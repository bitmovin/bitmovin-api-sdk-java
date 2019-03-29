package com.bitmovin.api.sdk.encoding.statistics;

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
import com.bitmovin.api.sdk.encoding.statistics.daily.DailyApi;
import com.bitmovin.api.sdk.encoding.statistics.encodings.EncodingsApi;
import com.bitmovin.api.sdk.encoding.statistics.labels.LabelsApi;

public class StatisticsApi {
    public final DailyApi daily;
    public final EncodingsApi encodings;
    public final LabelsApi labels;

    private final StatisticsApiClient apiClient;

    public StatisticsApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(StatisticsApiClient.class);

        this.daily = new DailyApi(clientFactory);
        this.encodings = new EncodingsApi(clientFactory);
        this.labels = new LabelsApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of StatisticsApi
     */
    public static BitmovinApiBuilder<StatisticsApi> builder() {
        return new BitmovinApiBuilder<>(StatisticsApi.class);
    }
    
    /**
     * Show Overall Statistics
     * 
     * @return Statistics
     * @throws BitmovinException if fails to make API call
     */
    public Statistics get() throws BitmovinException {
        return this.apiClient.get().getData().getResult();
    }
    
    /**
     * Show Overall Statistics Within Specific Dates
     * 
     * @param from Start date, format: yyyy-MM-dd (required)
     * @param to End date, format: yyyy-MM-dd (required)
     * @return List&lt;Statistics&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<Statistics> list(Date from, Date to) throws BitmovinException {
        return this.apiClient.list(from, to, new HashMap<String, Object>()).getData().getResult();
    }
    /**
     * Show Overall Statistics Within Specific Dates
     * 
     * @param from Start date, format: yyyy-MM-dd (required)
     * @param to End date, format: yyyy-MM-dd (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;Statistics&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<Statistics> list(Date from, Date to, StatisticsListQueryParams queryParams) throws BitmovinException {
        return this.apiClient.list(from, to, queryParams).getData().getResult();
    }
    
    interface StatisticsApiClient {
    
        @RequestLine("GET /encoding/statistics")
        ResponseEnvelope<Statistics> get() throws BitmovinException;
    
        @RequestLine("GET /encoding/statistics/{from}/{to}")
        ResponseEnvelope<PaginationResponse<Statistics>> list(@Param(value = "from", expander = BitmovinDateExpander.class) Date from, @Param(value = "to", expander = BitmovinDateExpander.class) Date to, @QueryMap Map<String, Object> queryParams) throws BitmovinException;
    }
}
