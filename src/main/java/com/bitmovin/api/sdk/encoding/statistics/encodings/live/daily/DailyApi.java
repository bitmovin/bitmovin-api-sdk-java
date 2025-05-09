package com.bitmovin.api.sdk.encoding.statistics.encodings.live.daily;

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
     * List daily live encoding statistics within specific dates
     * 
     * @param from Start date, format: yyyy-MM-dd (required)
     * @param to End date, format: yyyy-MM-dd (required)
     * @return List&lt;EncodingStatisticsLive&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<EncodingStatisticsLive> listByDateRange(Date from, Date to) throws BitmovinException {
        try {
            return this.apiClient.listByDateRange(from, to).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface DailyApiClient { 
        @RequestLine("GET /encoding/statistics/encodings/live/daily/{from}/{to}")
        ResponseEnvelope<PaginationResponse<EncodingStatisticsLive>> listByDateRange(@Param(value = "from", expander = BitmovinDateExpander.class) Date from, @Param(value = "to", expander = BitmovinDateExpander.class) Date to) throws BitmovinException;
    }
}
