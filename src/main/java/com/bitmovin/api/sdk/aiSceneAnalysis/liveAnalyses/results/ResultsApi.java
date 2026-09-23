package com.bitmovin.api.sdk.aiSceneAnalysis.liveAnalyses.results;

import com.bitmovin.api.sdk.common.BitmovinApiBuilder;
import com.bitmovin.api.sdk.common.BitmovinApiClientFactory;
import com.bitmovin.api.sdk.aiSceneAnalysis.liveAnalyses.results.latest.LatestApi;

public class ResultsApi {
    public final LatestApi latest;

    public ResultsApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.latest = new LatestApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of ResultsApi
     */
    public static BitmovinApiBuilder<ResultsApi> builder() {
        return new BitmovinApiBuilder<>(ResultsApi.class);
    }

}
