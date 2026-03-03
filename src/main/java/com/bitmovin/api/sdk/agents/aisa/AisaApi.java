package com.bitmovin.api.sdk.agents.aisa;

import com.bitmovin.api.sdk.common.BitmovinApiBuilder;
import com.bitmovin.api.sdk.common.BitmovinApiClientFactory;
import com.bitmovin.api.sdk.agents.aisa.sessions.SessionsApi;

public class AisaApi {
    public final SessionsApi sessions;

    public AisaApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.sessions = new SessionsApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of AisaApi
     */
    public static BitmovinApiBuilder<AisaApi> builder() {
        return new BitmovinApiBuilder<>(AisaApi.class);
    }

}
