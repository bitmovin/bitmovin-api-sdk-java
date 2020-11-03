package com.bitmovin.api.sdk.analytics;

import com.bitmovin.api.sdk.common.BitmovinApiBuilder;
import com.bitmovin.api.sdk.common.BitmovinApiClientFactory;
import com.bitmovin.api.sdk.analytics.exports.ExportsApi;
import com.bitmovin.api.sdk.analytics.impressions.ImpressionsApi;
import com.bitmovin.api.sdk.analytics.insights.InsightsApi;
import com.bitmovin.api.sdk.analytics.metrics.MetricsApi;
import com.bitmovin.api.sdk.analytics.ads.AdsApi;
import com.bitmovin.api.sdk.analytics.queries.QueriesApi;
import com.bitmovin.api.sdk.analytics.licenses.LicensesApi;
import com.bitmovin.api.sdk.analytics.outputs.OutputsApi;
import com.bitmovin.api.sdk.analytics.alerting.AlertingApi;

public class AnalyticsApi {
    public final ExportsApi exports;
    public final ImpressionsApi impressions;
    public final InsightsApi insights;
    public final MetricsApi metrics;
    public final AdsApi ads;
    public final QueriesApi queries;
    public final LicensesApi licenses;
    public final OutputsApi outputs;
    public final AlertingApi alerting;

    public AnalyticsApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.exports = new ExportsApi(clientFactory);
        this.impressions = new ImpressionsApi(clientFactory);
        this.insights = new InsightsApi(clientFactory);
        this.metrics = new MetricsApi(clientFactory);
        this.ads = new AdsApi(clientFactory);
        this.queries = new QueriesApi(clientFactory);
        this.licenses = new LicensesApi(clientFactory);
        this.outputs = new OutputsApi(clientFactory);
        this.alerting = new AlertingApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of AnalyticsApi
     */
    public static BitmovinApiBuilder<AnalyticsApi> builder() {
        return new BitmovinApiBuilder<>(AnalyticsApi.class);
    }
    
    
}
