package com.bitmovin.api.sdk.analytics.metrics;

import com.bitmovin.api.sdk.common.BitmovinApiBuilder;
import com.bitmovin.api.sdk.common.BitmovinApiClientFactory;
import com.bitmovin.api.sdk.analytics.metrics.maxConcurrentviewers.MaxConcurrentviewersApi;
import com.bitmovin.api.sdk.analytics.metrics.avgConcurrentviewers.AvgConcurrentviewersApi;
import com.bitmovin.api.sdk.analytics.metrics.avgDroppedFrames.AvgDroppedFramesApi;

public class MetricsApi {
    public final MaxConcurrentviewersApi maxConcurrentviewers;
    public final AvgConcurrentviewersApi avgConcurrentviewers;
    public final AvgDroppedFramesApi avgDroppedFrames;

    public MetricsApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.maxConcurrentviewers = new MaxConcurrentviewersApi(clientFactory);
        this.avgConcurrentviewers = new AvgConcurrentviewersApi(clientFactory);
        this.avgDroppedFrames = new AvgDroppedFramesApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of MetricsApi
     */
    public static BitmovinApiBuilder<MetricsApi> builder() {
        return new BitmovinApiBuilder<>(MetricsApi.class);
    }

    
}
