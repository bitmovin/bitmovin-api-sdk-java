package com.bitmovin.api.sdk.analytics.queries.stddev;

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

public class StddevApi {

    private final StddevApiClient apiClient;

    public StddevApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(StddevApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of StddevApi
     */
    public static BitmovinApiBuilder<StddevApi> builder() {
        return new BitmovinApiBuilder<>(StddevApi.class);
    }
    /**
     * Stddev
     * 
     * @param analyticsStddevQueryRequest Analytics Query Object (required)
     * @return AnalyticsResponse
     * @throws BitmovinException if fails to make API call
     */
    public AnalyticsResponse create(AnalyticsStddevQueryRequest analyticsStddevQueryRequest) throws BitmovinException {
        try {
            return this.apiClient.create(analyticsStddevQueryRequest).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface StddevApiClient { 
        @RequestLine("POST /analytics/queries/stddev")
        ResponseEnvelope<AnalyticsResponse> create(AnalyticsStddevQueryRequest analyticsStddevQueryRequest) throws BitmovinException;
    }
}
