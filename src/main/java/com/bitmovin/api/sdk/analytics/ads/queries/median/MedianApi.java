package com.bitmovin.api.sdk.analytics.ads.queries.median;

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

public class MedianApi {

    private final MedianApiClient apiClient;

    public MedianApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(MedianApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of MedianApi
     */
    public static BitmovinApiBuilder<MedianApi> builder() {
        return new BitmovinApiBuilder<>(MedianApi.class);
    }

    /**
     * Median
     * 
     * @param adAnalyticsMedianQueryRequest Analytics Query Object (required)
     * @return AnalyticsResponse
     * @throws BitmovinException if fails to make API call
     */
    public AnalyticsResponse create(AdAnalyticsMedianQueryRequest adAnalyticsMedianQueryRequest) throws BitmovinException {
        try {
            return this.apiClient.create(adAnalyticsMedianQueryRequest).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface MedianApiClient {

        @RequestLine("POST /analytics/ads/queries/median")
        ResponseEnvelope<AnalyticsResponse> create(AdAnalyticsMedianQueryRequest adAnalyticsMedianQueryRequest) throws BitmovinException;
    }
}
