package com.bitmovin.api.sdk.encoding.live.encodings;

import com.bitmovin.api.sdk.common.BitmovinApiBuilder;
import com.bitmovin.api.sdk.common.BitmovinApiClientFactory;
import com.bitmovin.api.sdk.encoding.live.encodings.actions.ActionsApi;
import com.bitmovin.api.sdk.encoding.live.encodings.dnsMappings.DnsMappingsApi;

public class EncodingsApi {
    public final ActionsApi actions;
    public final DnsMappingsApi dnsMappings;

    public EncodingsApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.actions = new ActionsApi(clientFactory);
        this.dnsMappings = new DnsMappingsApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of EncodingsApi
     */
    public static BitmovinApiBuilder<EncodingsApi> builder() {
        return new BitmovinApiBuilder<>(EncodingsApi.class);
    }

}
