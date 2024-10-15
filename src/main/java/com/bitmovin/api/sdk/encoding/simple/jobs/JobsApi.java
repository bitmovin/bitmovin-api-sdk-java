package com.bitmovin.api.sdk.encoding.simple.jobs;

import com.bitmovin.api.sdk.common.BitmovinApiBuilder;
import com.bitmovin.api.sdk.common.BitmovinApiClientFactory;
import com.bitmovin.api.sdk.encoding.simple.jobs.vod.VodApi;
import com.bitmovin.api.sdk.encoding.simple.jobs.live.LiveApi;

public class JobsApi {
    public final VodApi vod;
    public final LiveApi live;

    public JobsApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.vod = new VodApi(clientFactory);
        this.live = new LiveApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of JobsApi
     */
    public static BitmovinApiBuilder<JobsApi> builder() {
        return new BitmovinApiBuilder<>(JobsApi.class);
    }

}
