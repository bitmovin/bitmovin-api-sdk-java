package com.bitmovin.api.sdk.analytics.queries.count;

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
import com.bitmovin.api.sdk.common.BitmovinApiBuilder;
import com.bitmovin.api.sdk.common.BitmovinApiClientFactory;

public class CountApi {

    private final CountApiClient apiClient;

    public CountApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(CountApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of CountApi
     */
    public static BitmovinApiBuilder<CountApi> builder() {
        return new BitmovinApiBuilder<>(CountApi.class);
    }
    
    /**
     * Count
     * 
     * @param analyticsCountQueryRequest Analytics Query Object (required)
     * @return AnalyticsResponse
     * @throws BitmovinException if fails to make API call
     */
    public AnalyticsResponse create(AnalyticsCountQueryRequest analyticsCountQueryRequest) throws BitmovinException {
        try {
            return this.apiClient.create(analyticsCountQueryRequest).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    interface CountApiClient {
    
        @RequestLine("POST /analytics/queries/count")
        ResponseEnvelope<AnalyticsResponse> create(AnalyticsCountQueryRequest analyticsCountQueryRequest) throws BitmovinException;
    }
}
