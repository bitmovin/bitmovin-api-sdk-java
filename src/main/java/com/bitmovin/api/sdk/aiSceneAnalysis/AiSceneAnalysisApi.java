package com.bitmovin.api.sdk.aiSceneAnalysis;

import com.bitmovin.api.sdk.common.BitmovinApiBuilder;
import com.bitmovin.api.sdk.common.BitmovinApiClientFactory;
import com.bitmovin.api.sdk.aiSceneAnalysis.analyses.AnalysesApi;
import com.bitmovin.api.sdk.aiSceneAnalysis.liveAnalyses.LiveAnalysesApi;

public class AiSceneAnalysisApi {
    public final AnalysesApi analyses;
    public final LiveAnalysesApi liveAnalyses;

    public AiSceneAnalysisApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.analyses = new AnalysesApi(clientFactory);
        this.liveAnalyses = new LiveAnalysesApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of AiSceneAnalysisApi
     */
    public static BitmovinApiBuilder<AiSceneAnalysisApi> builder() {
        return new BitmovinApiBuilder<>(AiSceneAnalysisApi.class);
    }

}
