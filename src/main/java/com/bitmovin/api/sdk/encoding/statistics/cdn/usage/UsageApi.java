package com.bitmovin.api.sdk.encoding.statistics.cdn.usage;

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

public class UsageApi {

    private final UsageApiClient apiClient;

    public UsageApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(UsageApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of UsageApi
     */
    public static BitmovinApiBuilder<UsageApi> builder() {
        return new BitmovinApiBuilder<>(UsageApi.class);
    }
    /**
     * List CDN usage statistics within specific dates.
     * 
     * @return CdnUsageStatistics
     * @throws BitmovinException if fails to make API call
     */
    public CdnUsageStatistics get() throws BitmovinException {
        try {
            return this.apiClient.get(new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * List CDN usage statistics within specific dates.
     * 
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return CdnUsageStatistics
     * @throws BitmovinException if fails to make API call
     */
    public CdnUsageStatistics get(CdnUsageStatisticsGetQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.get(new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface UsageApiClient { 
        @RequestLine("GET /encoding/statistics/cdn/usage")
        ResponseEnvelope<CdnUsageStatistics> get(@QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    }
}
