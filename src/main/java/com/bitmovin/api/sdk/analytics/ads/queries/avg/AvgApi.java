package com.bitmovin.api.sdk.analytics.ads.queries.avg;

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
     * @param adAnalyticsAvgQueryRequest Analytics Query Object (required)
     * @return AnalyticsResponse
     * @throws BitmovinException if fails to make API call
     */
    public AnalyticsResponse create(AdAnalyticsAvgQueryRequest adAnalyticsAvgQueryRequest) throws BitmovinException {
        try {
            return this.apiClient.create(adAnalyticsAvgQueryRequest).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    interface AvgApiClient {
    
        @RequestLine("POST /analytics/ads/queries/avg")
        ResponseEnvelope<AnalyticsResponse> create(AdAnalyticsAvgQueryRequest adAnalyticsAvgQueryRequest) throws BitmovinException;
    }
}
