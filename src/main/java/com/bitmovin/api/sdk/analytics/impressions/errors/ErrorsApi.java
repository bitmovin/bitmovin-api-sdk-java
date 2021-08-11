package com.bitmovin.api.sdk.analytics.impressions.errors;

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

public class ErrorsApi {

    private final ErrorsApiClient apiClient;

    public ErrorsApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(ErrorsApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of ErrorsApi
     */
    public static BitmovinApiBuilder<ErrorsApi> builder() {
        return new BitmovinApiBuilder<>(ErrorsApi.class);
    }
    
    /**
     * Impression Error Details
     * 
     * @param impressionId Impression id (required)
     * @param analyticsLicenseKey Analytics license (required)
     * @return AnalyticsErrorDetailsResponse
     * @throws BitmovinException if fails to make API call
     */
    public AnalyticsErrorDetailsResponse create(String impressionId, AnalyticsLicenseKey analyticsLicenseKey) throws BitmovinException {
        try {
            return this.apiClient.create(impressionId, analyticsLicenseKey).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    interface ErrorsApiClient {
    
        @RequestLine("POST /analytics/impressions/{impression_id}/errors")
        ResponseEnvelope<AnalyticsErrorDetailsResponse> create(@Param(value = "impression_id") String impressionId, AnalyticsLicenseKey analyticsLicenseKey) throws BitmovinException;
    }
}
