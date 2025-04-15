package com.bitmovin.api.sdk.aiSceneAnalysis.analyses.byEncodingId;

import com.bitmovin.api.sdk.common.BitmovinApiBuilder;
import com.bitmovin.api.sdk.common.BitmovinApiClientFactory;
import com.bitmovin.api.sdk.aiSceneAnalysis.analyses.byEncodingId.details.DetailsApi;

public class ByEncodingIdApi {
    public final DetailsApi details;

    public ByEncodingIdApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.details = new DetailsApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of ByEncodingIdApi
     */
    public static BitmovinApiBuilder<ByEncodingIdApi> builder() {
        return new BitmovinApiBuilder<>(ByEncodingIdApi.class);
    }

}
