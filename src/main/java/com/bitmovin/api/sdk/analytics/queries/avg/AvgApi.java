package com.bitmovin.api.sdk.analytics.queries.avg;

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

public class AvgApi {

    private final AvgApiClient apiClient;

    public AvgApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(AvgApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of AvgApi
     */
    public static BitmovinApiBuilder<AvgApi> builder() {
        return new BitmovinApiBuilder<>(AvgApi.class);
    }
    
    /**
     * Avg
     * 
     * @param analyticsAvgQueryRequest  (required)
     * @return AnalyticsResponse
     * @throws BitmovinException if fails to make API call
     */
    public AnalyticsResponse create(AnalyticsAvgQueryRequest analyticsAvgQueryRequest) throws BitmovinException {
        return this.apiClient.create(analyticsAvgQueryRequest).getData().getResult();
    }
    
    interface AvgApiClient {
    
        @RequestLine("POST /analytics/queries/avg")
        ResponseEnvelope<AnalyticsResponse> create(AnalyticsAvgQueryRequest analyticsAvgQueryRequest) throws BitmovinException;
    }
}
