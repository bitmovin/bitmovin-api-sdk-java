package com.bitmovin.api.sdk.streams.config;

import com.bitmovin.api.sdk.common.BitmovinApiBuilder;
import com.bitmovin.api.sdk.common.BitmovinApiClientFactory;
import com.bitmovin.api.sdk.streams.config.domainRestriction.DomainRestrictionApi;

public class ConfigApi {
    public final DomainRestrictionApi domainRestriction;

    public ConfigApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.domainRestriction = new DomainRestrictionApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of ConfigApi
     */
    public static BitmovinApiBuilder<ConfigApi> builder() {
        return new BitmovinApiBuilder<>(ConfigApi.class);
    }

    
}
