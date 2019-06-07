package com.bitmovin.api.sdk.analytics.queries.sum;

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

public class SumApi {

    private final SumApiClient apiClient;

    public SumApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(SumApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of SumApi
     */
    public static BitmovinApiBuilder<SumApi> builder() {
        return new BitmovinApiBuilder<>(SumApi.class);
    }
    
    /**
     * Sum
     * 
     * @param analyticsSumQueryRequest  (required)
     * @return AnalyticsResponse
     * @throws BitmovinException if fails to make API call
     */
    public AnalyticsResponse create(AnalyticsSumQueryRequest analyticsSumQueryRequest) throws BitmovinException {
        return this.apiClient.create(analyticsSumQueryRequest).getData().getResult();
    }
    
    interface SumApiClient {
    
        @RequestLine("POST /analytics/queries/sum")
        ResponseEnvelope<AnalyticsResponse> create(AnalyticsSumQueryRequest analyticsSumQueryRequest) throws BitmovinException;
    }
}
