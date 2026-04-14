package com.bitmovin.api.sdk.agents;

import com.bitmovin.api.sdk.common.BitmovinApiBuilder;
import com.bitmovin.api.sdk.common.BitmovinApiClientFactory;
import com.bitmovin.api.sdk.agents.aisa.AisaApi;
import com.bitmovin.api.sdk.agents.assistant.AssistantApi;

public class AgentsApi {
    public final AisaApi aisa;
    public final AssistantApi assistant;

    public AgentsApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.aisa = new AisaApi(clientFactory);
        this.assistant = new AssistantApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of AgentsApi
     */
    public static BitmovinApiBuilder<AgentsApi> builder() {
        return new BitmovinApiBuilder<>(AgentsApi.class);
    }

}
