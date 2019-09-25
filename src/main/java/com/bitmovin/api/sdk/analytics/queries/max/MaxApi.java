package com.bitmovin.api.sdk.analytics.queries.max;

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

public class MaxApi {

    private final MaxApiClient apiClient;

    public MaxApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(MaxApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of MaxApi
     */
    public static BitmovinApiBuilder<MaxApi> builder() {
        return new BitmovinApiBuilder<>(MaxApi.class);
    }
    
    /**
     * Max
     * 
     * @param analyticsMaxQueryRequest Analytics Query Object (required)
     * @return AnalyticsResponse
     * @throws BitmovinException if fails to make API call
     */
    public AnalyticsResponse create(AnalyticsMaxQueryRequest analyticsMaxQueryRequest) throws BitmovinException {
        try {
            return this.apiClient.create(analyticsMaxQueryRequest).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    interface MaxApiClient {
    
        @RequestLine("POST /analytics/queries/max")
        ResponseEnvelope<AnalyticsResponse> create(AnalyticsMaxQueryRequest analyticsMaxQueryRequest) throws BitmovinException;
    }
}
