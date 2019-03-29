package com.bitmovin.api.sdk.notifications.webhooks;

import com.bitmovin.api.sdk.common.BitmovinApiBuilder;
import com.bitmovin.api.sdk.common.BitmovinApiClientFactory;
import com.bitmovin.api.sdk.notifications.webhooks.encoding.EncodingApi;

public class WebhooksApi {
    public final EncodingApi encoding;

    public WebhooksApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.encoding = new EncodingApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of WebhooksApi
     */
    public static BitmovinApiBuilder<WebhooksApi> builder() {
        return new BitmovinApiBuilder<>(WebhooksApi.class);
    }
    
    
}
