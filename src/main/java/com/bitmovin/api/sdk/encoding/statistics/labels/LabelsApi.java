package com.bitmovin.api.sdk.encoding.statistics.labels;

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
import com.bitmovin.api.sdk.encoding.statistics.labels.daily.DailyApi;

public class LabelsApi {
    public final DailyApi daily;

    private final LabelsApiClient apiClient;

    public LabelsApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(LabelsApiClient.class);

        this.daily = new DailyApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of LabelsApi
     */
    public static BitmovinApiBuilder<LabelsApi> builder() {
        return new BitmovinApiBuilder<>(LabelsApi.class);
    }
    
    /**
     * Get Statistics per Label
     * 
     * @return List&lt;StatisticsPerLabel&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<StatisticsPerLabel> list() throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * Get Statistics per Label
     * 
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;StatisticsPerLabel&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<StatisticsPerLabel> list(StatisticsPerLabelListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * Get statistics per label within specific dates
     * 
     * @param from Start date. Format: yyyy-MM-dd (required)
     * @param to End date. Format: yyyy-MM-dd (required)
     * @return List&lt;StatisticsPerLabel&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<StatisticsPerLabel> listByDateRange(Date from, Date to) throws BitmovinException {
        try {
            return this.apiClient.listByDateRange(from, to, new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * Get statistics per label within specific dates
     * 
     * @param from Start date. Format: yyyy-MM-dd (required)
     * @param to End date. Format: yyyy-MM-dd (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;StatisticsPerLabel&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<StatisticsPerLabel> listByDateRange(Date from, Date to, StatisticsPerLabelListByDateRangeQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.listByDateRange(from, to, new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    interface LabelsApiClient {
    
        @RequestLine("GET /encoding/statistics/labels")
        ResponseEnvelope<PaginationResponse<StatisticsPerLabel>> list(@QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    
        @RequestLine("GET /encoding/statistics/labels/{from}/{to}")
        ResponseEnvelope<PaginationResponse<StatisticsPerLabel>> listByDateRange(@Param(value = "from", expander = BitmovinDateExpander.class) Date from, @Param(value = "to", expander = BitmovinDateExpander.class) Date to, @QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    }
}
