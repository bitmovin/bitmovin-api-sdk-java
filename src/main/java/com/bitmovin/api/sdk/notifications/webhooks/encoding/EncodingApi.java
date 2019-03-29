package com.bitmovin.api.sdk.notifications.webhooks.encoding;

import com.bitmovin.api.sdk.common.BitmovinApiBuilder;
import com.bitmovin.api.sdk.common.BitmovinApiClientFactory;
import com.bitmovin.api.sdk.notifications.webhooks.encoding.encodings.EncodingsApi;

public class EncodingApi {
    public final EncodingsApi encodings;

    public EncodingApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.encodings = new EncodingsApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of EncodingApi
     */
    public static BitmovinApiBuilder<EncodingApi> builder() {
        return new BitmovinApiBuilder<>(EncodingApi.class);
    }
    
    
}
