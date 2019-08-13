package com.bitmovin.api.sdk.analytics.ads;

import com.bitmovin.api.sdk.common.BitmovinApiBuilder;
import com.bitmovin.api.sdk.common.BitmovinApiClientFactory;
import com.bitmovin.api.sdk.analytics.ads.queries.QueriesApi;

public class AdsApi {
    public final QueriesApi queries;

    public AdsApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.queries = new QueriesApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of AdsApi
     */
    public static BitmovinApiBuilder<AdsApi> builder() {
        return new BitmovinApiBuilder<>(AdsApi.class);
    }
    
    
}
