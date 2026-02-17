package com.bitmovin.api.sdk.encoding.live;

import com.bitmovin.api.sdk.common.BitmovinApiBuilder;
import com.bitmovin.api.sdk.common.BitmovinApiClientFactory;
import com.bitmovin.api.sdk.encoding.live.encodings.EncodingsApi;
import com.bitmovin.api.sdk.encoding.live.dnsMappings.DnsMappingsApi;
import com.bitmovin.api.sdk.encoding.live.streamKeys.StreamKeysApi;
import com.bitmovin.api.sdk.encoding.live.standbyPools.StandbyPoolsApi;

public class LiveApi {
    public final EncodingsApi encodings;
    public final DnsMappingsApi dnsMappings;
    public final StreamKeysApi streamKeys;
    public final StandbyPoolsApi standbyPools;

    public LiveApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.encodings = new EncodingsApi(clientFactory);
        this.dnsMappings = new DnsMappingsApi(clientFactory);
        this.streamKeys = new StreamKeysApi(clientFactory);
        this.standbyPools = new StandbyPoolsApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of LiveApi
     */
    public static BitmovinApiBuilder<LiveApi> builder() {
        return new BitmovinApiBuilder<>(LiveApi.class);
    }

}
