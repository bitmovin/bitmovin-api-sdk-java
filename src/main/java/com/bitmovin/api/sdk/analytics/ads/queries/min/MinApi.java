package com.bitmovin.api.sdk.analytics.ads.queries.min;

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

public class MinApi {

    private final MinApiClient apiClient;

    public MinApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(MinApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of MinApi
     */
    public static BitmovinApiBuilder<MinApi> builder() {
        return new BitmovinApiBuilder<>(MinApi.class);
    }
    /**
     * Min
     * 
     * @param adAnalyticsMinQueryRequest Analytics Query Object (required)
     * @return AnalyticsResponse
     * @throws BitmovinException if fails to make API call
     */
    public AnalyticsResponse create(AdAnalyticsMinQueryRequest adAnalyticsMinQueryRequest) throws BitmovinException {
        try {
            return this.apiClient.create(adAnalyticsMinQueryRequest).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface MinApiClient { 
        @RequestLine("POST /analytics/ads/queries/min")
        ResponseEnvelope<AnalyticsResponse> create(AdAnalyticsMinQueryRequest adAnalyticsMinQueryRequest) throws BitmovinException;
    }
}
