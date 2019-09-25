package com.bitmovin.api.sdk.analytics.impressions;

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

public class ImpressionsApi {

    private final ImpressionsApiClient apiClient;

    public ImpressionsApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(ImpressionsApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of ImpressionsApi
     */
    public static BitmovinApiBuilder<ImpressionsApi> builder() {
        return new BitmovinApiBuilder<>(ImpressionsApi.class);
    }
    
    /**
     * Impression Details
     * 
     * @param impressionId Impression id (required)
     * @param analyticsLicenseKey Analytics license (required)
     * @return AnalyticsImpressionDetails
     * @throws BitmovinException if fails to make API call
     */
    public AnalyticsImpressionDetails create(String impressionId, AnalyticsLicenseKey analyticsLicenseKey) throws BitmovinException {
        try {
            return this.apiClient.create(impressionId, analyticsLicenseKey).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    interface ImpressionsApiClient {
    
        @RequestLine("POST /analytics/impressions/{impression_id}")
        ResponseEnvelope<AnalyticsImpressionDetails> create(@Param(value = "impression_id") String impressionId, AnalyticsLicenseKey analyticsLicenseKey) throws BitmovinException;
    }
}
