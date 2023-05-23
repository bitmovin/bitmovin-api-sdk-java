package com.bitmovin.api.sdk.encoding.history;

import com.bitmovin.api.sdk.common.BitmovinApiBuilder;
import com.bitmovin.api.sdk.common.BitmovinApiClientFactory;
import com.bitmovin.api.sdk.encoding.history.encodings.EncodingsApi;

public class HistoryApi {
    public final EncodingsApi encodings;

    public HistoryApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.encodings = new EncodingsApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of HistoryApi
     */
    public static BitmovinApiBuilder<HistoryApi> builder() {
        return new BitmovinApiBuilder<>(HistoryApi.class);
    }

    
}
