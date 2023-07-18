package com.bitmovin.api.sdk.encoding.statistics.encodings.live;

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
import com.bitmovin.api.sdk.encoding.statistics.encodings.live.daily.DailyApi;
import com.bitmovin.api.sdk.encoding.statistics.encodings.live.options.OptionsApi;

public class LiveApi {
    public final DailyApi daily;
    public final OptionsApi options;

    private final LiveApiClient apiClient;

    public LiveApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(LiveApiClient.class);

        this.daily = new DailyApi(clientFactory);
        this.options = new OptionsApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of LiveApi
     */
    public static BitmovinApiBuilder<LiveApi> builder() {
        return new BitmovinApiBuilder<>(LiveApi.class);
    }

    /**
     * List Live Encoding Statistics
     * 
     * @return List&lt;EncodingStatisticsLive&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<EncodingStatisticsLive> list() throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * List Live Encoding Statistics
     * 
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;EncodingStatisticsLive&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<EncodingStatisticsLive> list(EncodingStatisticsLiveListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * List live encoding statistics within specific dates
     * 
     * @param from Start date, format: yyyy-MM-dd (required)
     * @param to End date, format: yyyy-MM-dd (required)
     * @return List&lt;EncodingStatisticsLive&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<EncodingStatisticsLive> listByDateRange(Date from, Date to) throws BitmovinException {
        try {
            return this.apiClient.listByDateRange(from, to, new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * List live encoding statistics within specific dates
     * 
     * @param from Start date, format: yyyy-MM-dd (required)
     * @param to End date, format: yyyy-MM-dd (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;EncodingStatisticsLive&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<EncodingStatisticsLive> listByDateRange(Date from, Date to, EncodingStatisticsLiveListByDateRangeQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.listByDateRange(from, to, new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface LiveApiClient {

        @RequestLine("GET /encoding/statistics/encodings/live")
        ResponseEnvelope<PaginationResponse<EncodingStatisticsLive>> list(@QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    
        @RequestLine("GET /encoding/statistics/encodings/live/{from}/{to}")
        ResponseEnvelope<PaginationResponse<EncodingStatisticsLive>> listByDateRange(@Param(value = "from", expander = BitmovinDateExpander.class) Date from, @Param(value = "to", expander = BitmovinDateExpander.class) Date to, @QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    }
}
