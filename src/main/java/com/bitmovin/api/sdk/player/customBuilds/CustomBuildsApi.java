package com.bitmovin.api.sdk.player.customBuilds;

import com.bitmovin.api.sdk.common.BitmovinApiBuilder;
import com.bitmovin.api.sdk.common.BitmovinApiClientFactory;
import com.bitmovin.api.sdk.player.customBuilds.web.WebApi;

public class CustomBuildsApi {
    public final WebApi web;

    public CustomBuildsApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.web = new WebApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of CustomBuildsApi
     */
    public static BitmovinApiBuilder<CustomBuildsApi> builder() {
        return new BitmovinApiBuilder<>(CustomBuildsApi.class);
    }
    
    
}
