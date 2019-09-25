package com.bitmovin.api.sdk.analytics.ads.queries.percentile;

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
     * @param adAnalyticsPercentileQueryRequest Analytics Query Object (required)
     * @return AnalyticsResponse
     * @throws BitmovinException if fails to make API call
     */
    public AnalyticsResponse create(AdAnalyticsPercentileQueryRequest adAnalyticsPercentileQueryRequest) throws BitmovinException {
        try {
            return this.apiClient.create(adAnalyticsPercentileQueryRequest).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    interface PercentileApiClient {
    
        @RequestLine("POST /analytics/ads/queries/percentile")
        ResponseEnvelope<AnalyticsResponse> create(AdAnalyticsPercentileQueryRequest adAnalyticsPercentileQueryRequest) throws BitmovinException;
    }
}
