package com.bitmovin.api.sdk.aiSceneAnalysis.analyses.byEncodingId;

import com.bitmovin.api.sdk.common.BitmovinApiBuilder;
import com.bitmovin.api.sdk.common.BitmovinApiClientFactory;
import com.bitmovin.api.sdk.aiSceneAnalysis.analyses.byEncodingId.details.DetailsApi;
import com.bitmovin.api.sdk.aiSceneAnalysis.analyses.byEncodingId.languages.LanguagesApi;

public class ByEncodingIdApi {
    public final DetailsApi details;
    public final LanguagesApi languages;

    public ByEncodingIdApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.details = new DetailsApi(clientFactory);
        this.languages = new LanguagesApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of ByEncodingIdApi
     */
    public static BitmovinApiBuilder<ByEncodingIdApi> builder() {
        return new BitmovinApiBuilder<>(ByEncodingIdApi.class);
    }

}
