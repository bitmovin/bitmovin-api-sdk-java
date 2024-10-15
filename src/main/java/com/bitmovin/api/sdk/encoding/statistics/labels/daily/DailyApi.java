package com.bitmovin.api.sdk.encoding.statistics.labels.daily;

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
     * Get Daily Statistics per Label
     * 
     * @return List&lt;DailyStatisticsPerLabel&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<DailyStatisticsPerLabel> list() throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * Get Daily Statistics per Label
     * 
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;DailyStatisticsPerLabel&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<DailyStatisticsPerLabel> list(DailyStatisticsPerLabelListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * Get daily statistics per label within specific dates
     * 
     * @param from Start date. Format: yyyy-MM-dd (required)
     * @param to End date. Format: yyyy-MM-dd (required)
     * @return List&lt;DailyStatisticsPerLabel&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<DailyStatisticsPerLabel> listByDateRange(Date from, Date to) throws BitmovinException {
        try {
            return this.apiClient.listByDateRange(from, to, new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * Get daily statistics per label within specific dates
     * 
     * @param from Start date. Format: yyyy-MM-dd (required)
     * @param to End date. Format: yyyy-MM-dd (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;DailyStatisticsPerLabel&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<DailyStatisticsPerLabel> listByDateRange(Date from, Date to, DailyStatisticsPerLabelListByDateRangeQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.listByDateRange(from, to, new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface DailyApiClient { 
        @RequestLine("GET /encoding/statistics/labels/daily")
        ResponseEnvelope<PaginationResponse<DailyStatisticsPerLabel>> list(@QueryMap QueryMapWrapper queryParams) throws BitmovinException;
   
        @RequestLine("GET /encoding/statistics/labels/daily/{from}/{to}")
        ResponseEnvelope<PaginationResponse<DailyStatisticsPerLabel>> listByDateRange(@Param(value = "from", expander = BitmovinDateExpander.class) Date from, @Param(value = "to", expander = BitmovinDateExpander.class) Date to, @QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    }
}
