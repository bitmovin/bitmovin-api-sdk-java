package com.bitmovin.api.sdk.analytics.queries;

import com.bitmovin.api.sdk.common.BitmovinApiBuilder;
import com.bitmovin.api.sdk.common.BitmovinApiClientFactory;
import com.bitmovin.api.sdk.analytics.queries.count.CountApi;
import com.bitmovin.api.sdk.analytics.queries.sum.SumApi;
import com.bitmovin.api.sdk.analytics.queries.avg.AvgApi;
import com.bitmovin.api.sdk.analytics.queries.min.MinApi;
import com.bitmovin.api.sdk.analytics.queries.max.MaxApi;
import com.bitmovin.api.sdk.analytics.queries.stddev.StddevApi;
import com.bitmovin.api.sdk.analytics.queries.percentile.PercentileApi;
import com.bitmovin.api.sdk.analytics.queries.variance.VarianceApi;
import com.bitmovin.api.sdk.analytics.queries.median.MedianApi;

public class QueriesApi {
    public final CountApi count;
    public final SumApi sum;
    public final AvgApi avg;
    public final MinApi min;
    public final MaxApi max;
    public final StddevApi stddev;
    public final PercentileApi percentile;
    public final VarianceApi variance;
    public final MedianApi median;

    public QueriesApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.count = new CountApi(clientFactory);
        this.sum = new SumApi(clientFactory);
        this.avg = new AvgApi(clientFactory);
        this.min = new MinApi(clientFactory);
        this.max = new MaxApi(clientFactory);
        this.stddev = new StddevApi(clientFactory);
        this.percentile = new PercentileApi(clientFactory);
        this.variance = new VarianceApi(clientFactory);
        this.median = new MedianApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of QueriesApi
     */
    public static BitmovinApiBuilder<QueriesApi> builder() {
        return new BitmovinApiBuilder<>(QueriesApi.class);
    }

}
