package com.bitmovin.api.sdk.analytics.impressions.ads;

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

public class AdsApi {

    private final AdsApiClient apiClient;

    public AdsApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(AdsApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of AdsApi
     */
    public static BitmovinApiBuilder<AdsApi> builder() {
        return new BitmovinApiBuilder<>(AdsApi.class);
    }
    
    /**
     * Ads Impressions
     * 
     * @param impressionId Impression id (required)
     * @param analyticsLicenseKey Analytics license (required)
     * @return AnalyticsAdsImpressionsResponse
     * @throws BitmovinException if fails to make API call
     */
    public AnalyticsAdsImpressionsResponse create(String impressionId, AnalyticsLicenseKey analyticsLicenseKey) throws BitmovinException {
        try {
            return this.apiClient.create(impressionId, analyticsLicenseKey).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    interface AdsApiClient {
    
        @RequestLine("POST /analytics/impressions/{impression_id}/ads")
        ResponseEnvelope<AnalyticsAdsImpressionsResponse> create(@Param(value = "impression_id") String impressionId, AnalyticsLicenseKey analyticsLicenseKey) throws BitmovinException;
    }
}
