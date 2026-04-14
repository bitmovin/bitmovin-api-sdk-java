package com.bitmovin.api.sdk.agents.assistant;

import com.bitmovin.api.sdk.common.BitmovinApiBuilder;
import com.bitmovin.api.sdk.common.BitmovinApiClientFactory;
import com.bitmovin.api.sdk.agents.assistant.sessions.SessionsApi;

public class AssistantApi {
    public final SessionsApi sessions;

    public AssistantApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.sessions = new SessionsApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of AssistantApi
     */
    public static BitmovinApiBuilder<AssistantApi> builder() {
        return new BitmovinApiBuilder<>(AssistantApi.class);
    }

}
