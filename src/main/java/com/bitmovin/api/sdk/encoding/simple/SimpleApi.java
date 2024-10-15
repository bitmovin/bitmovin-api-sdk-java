package com.bitmovin.api.sdk.encoding.simple;

import com.bitmovin.api.sdk.common.BitmovinApiBuilder;
import com.bitmovin.api.sdk.common.BitmovinApiClientFactory;
import com.bitmovin.api.sdk.encoding.simple.jobs.JobsApi;

public class SimpleApi {
    public final JobsApi jobs;

    public SimpleApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.jobs = new JobsApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of SimpleApi
     */
    public static BitmovinApiBuilder<SimpleApi> builder() {
        return new BitmovinApiBuilder<>(SimpleApi.class);
    }

}
