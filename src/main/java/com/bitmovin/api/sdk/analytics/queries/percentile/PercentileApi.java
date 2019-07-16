package com.bitmovin.api.sdk.analytics.queries.percentile;

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

public class PercentileApi {

    private final PercentileApiClient apiClient;

    public PercentileApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(PercentileApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of PercentileApi
     */
    public static BitmovinApiBuilder<PercentileApi> builder() {
        return new BitmovinApiBuilder<>(PercentileApi.class);
    }
    
    /**
     * Percentile
     * 
     * @param analyticsPercentileQueryRequest Analytics Query Object (required)
     * @return AnalyticsResponse
     * @throws BitmovinException if fails to make API call
     */
    public AnalyticsResponse create(AnalyticsPercentileQueryRequest analyticsPercentileQueryRequest) throws BitmovinException {
        return this.apiClient.create(analyticsPercentileQueryRequest).getData().getResult();
    }
    
    interface PercentileApiClient {
    
        @RequestLine("POST /analytics/queries/percentile")
        ResponseEnvelope<AnalyticsResponse> create(AnalyticsPercentileQueryRequest analyticsPercentileQueryRequest) throws BitmovinException;
    }
}
