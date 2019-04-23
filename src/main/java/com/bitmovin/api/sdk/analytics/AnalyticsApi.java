package com.bitmovin.api.sdk.analytics;

import com.bitmovin.api.sdk.common.BitmovinApiBuilder;
import com.bitmovin.api.sdk.common.BitmovinApiClientFactory;
import com.bitmovin.api.sdk.analytics.exports.ExportsApi;
import com.bitmovin.api.sdk.analytics.impressions.ImpressionsApi;
import com.bitmovin.api.sdk.analytics.queries.QueriesApi;
import com.bitmovin.api.sdk.analytics.licenses.LicensesApi;
import com.bitmovin.api.sdk.analytics.outputs.OutputsApi;

public class AnalyticsApi {
    public final ExportsApi exports;
    public final ImpressionsApi impressions;
    public final QueriesApi queries;
    public final LicensesApi licenses;
    public final OutputsApi outputs;

    public AnalyticsApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.exports = new ExportsApi(clientFactory);
        this.impressions = new ImpressionsApi(clientFactory);
        this.queries = new QueriesApi(clientFactory);
        this.licenses = new LicensesApi(clientFactory);
        this.outputs = new OutputsApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of AnalyticsApi
     */
    public static BitmovinApiBuilder<AnalyticsApi> builder() {
        return new BitmovinApiBuilder<>(AnalyticsApi.class);
    }
    
    
}
