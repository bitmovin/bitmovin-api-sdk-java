package com.bitmovin.api.sdk.analytics;

import com.bitmovin.api.sdk.common.BitmovinApiBuilder;
import com.bitmovin.api.sdk.common.BitmovinApiClientFactory;
import com.bitmovin.api.sdk.analytics.impressions.ImpressionsApi;
import com.bitmovin.api.sdk.analytics.queries.QueriesApi;
import com.bitmovin.api.sdk.analytics.licenses.LicensesApi;

public class AnalyticsApi {
    public final ImpressionsApi impressions;
    public final QueriesApi queries;
    public final LicensesApi licenses;

    public AnalyticsApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.impressions = new ImpressionsApi(clientFactory);
        this.queries = new QueriesApi(clientFactory);
        this.licenses = new LicensesApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of AnalyticsApi
     */
    public static BitmovinApiBuilder<AnalyticsApi> builder() {
        return new BitmovinApiBuilder<>(AnalyticsApi.class);
    }
    
    
}
