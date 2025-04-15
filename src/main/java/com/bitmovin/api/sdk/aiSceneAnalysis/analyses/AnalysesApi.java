package com.bitmovin.api.sdk.aiSceneAnalysis.analyses;

import com.bitmovin.api.sdk.common.BitmovinApiBuilder;
import com.bitmovin.api.sdk.common.BitmovinApiClientFactory;
import com.bitmovin.api.sdk.aiSceneAnalysis.analyses.byEncodingId.ByEncodingIdApi;

public class AnalysesApi {
    public final ByEncodingIdApi byEncodingId;

    public AnalysesApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.byEncodingId = new ByEncodingIdApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of AnalysesApi
     */
    public static BitmovinApiBuilder<AnalysesApi> builder() {
        return new BitmovinApiBuilder<>(AnalysesApi.class);
    }

}
