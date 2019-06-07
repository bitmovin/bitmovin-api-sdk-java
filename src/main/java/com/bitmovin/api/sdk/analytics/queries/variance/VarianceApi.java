package com.bitmovin.api.sdk.analytics.queries.variance;

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

public class VarianceApi {

    private final VarianceApiClient apiClient;

    public VarianceApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(VarianceApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of VarianceApi
     */
    public static BitmovinApiBuilder<VarianceApi> builder() {
        return new BitmovinApiBuilder<>(VarianceApi.class);
    }
    
    /**
     * Variance
     * 
     * @param analyticsVarianceQueryRequest  (required)
     * @return AnalyticsResponse
     * @throws BitmovinException if fails to make API call
     */
    public AnalyticsResponse create(AnalyticsVarianceQueryRequest analyticsVarianceQueryRequest) throws BitmovinException {
        return this.apiClient.create(analyticsVarianceQueryRequest).getData().getResult();
    }
    
    interface VarianceApiClient {
    
        @RequestLine("POST /analytics/queries/variance")
        ResponseEnvelope<AnalyticsResponse> create(AnalyticsVarianceQueryRequest analyticsVarianceQueryRequest) throws BitmovinException;
    }
}
