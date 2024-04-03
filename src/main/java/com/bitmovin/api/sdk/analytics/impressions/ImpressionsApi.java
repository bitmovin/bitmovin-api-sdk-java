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
import com.bitmovin.api.sdk.common.QueryMapWrapper;
import com.bitmovin.api.sdk.common.BitmovinApiBuilder;
import com.bitmovin.api.sdk.common.BitmovinApiClientFactory;
import com.bitmovin.api.sdk.analytics.impressions.ads.AdsApi;
import com.bitmovin.api.sdk.analytics.impressions.errors.ErrorsApi;

public class ImpressionsApi {
    public final AdsApi ads;
    public final ErrorsApi errors;

    private final ImpressionsApiClient apiClient;

    public ImpressionsApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(ImpressionsApiClient.class);

        this.ads = new AdsApi(clientFactory);
        this.errors = new ErrorsApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of ImpressionsApi
     */
    public static BitmovinApiBuilder<ImpressionsApi> builder() {
        return new BitmovinApiBuilder<>(ImpressionsApi.class);
    }

    /**
     * List impressions
     * 
     * @param analyticsImpressionsQuery Analytics impressions query object (required)
     * @return AnalyticsImpressionsResponse
     * @throws BitmovinException if fails to make API call
     */
    public AnalyticsImpressionsResponse getImpressions(AnalyticsImpressionsQuery analyticsImpressionsQuery) throws BitmovinException {
        try {
            return this.apiClient.getImpressions(analyticsImpressionsQuery).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface ImpressionsApiClient {

        @RequestLine("POST /analytics/impressions")
        ResponseEnvelope<AnalyticsImpressionsResponse> getImpressions(AnalyticsImpressionsQuery analyticsImpressionsQuery) throws BitmovinException;
    }
}
