package com.bitmovin.api.sdk.analytics.metrics.maxConcurrentviewers;

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

public class MaxConcurrentviewersApi {

    private final MaxConcurrentviewersApiClient apiClient;

    public MaxConcurrentviewersApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(MaxConcurrentviewersApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of MaxConcurrentviewersApi
     */
    public static BitmovinApiBuilder<MaxConcurrentviewersApi> builder() {
        return new BitmovinApiBuilder<>(MaxConcurrentviewersApi.class);
    }
    
    /**
     * Get metrics data
     * 
     * @param analyticsMetricsQueryRequest Analytics metrics query object (required)
     * @return AnalyticsMaxConcurrentViewersResponse
     * @throws BitmovinException if fails to make API call
     */
    public AnalyticsMaxConcurrentViewersResponse create(AnalyticsMetricsQueryRequest analyticsMetricsQueryRequest) throws BitmovinException {
        try {
            return this.apiClient.create(analyticsMetricsQueryRequest).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    interface MaxConcurrentviewersApiClient {
    
        @RequestLine("POST /analytics/metrics/max-concurrentviewers")
        ResponseEnvelope<AnalyticsMaxConcurrentViewersResponse> create(AnalyticsMetricsQueryRequest analyticsMetricsQueryRequest) throws BitmovinException;
    }
}
