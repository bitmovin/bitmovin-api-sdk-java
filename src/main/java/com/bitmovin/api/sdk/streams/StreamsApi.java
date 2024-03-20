package com.bitmovin.api.sdk.streams;

import com.bitmovin.api.sdk.common.BitmovinApiBuilder;
import com.bitmovin.api.sdk.common.BitmovinApiClientFactory;
import com.bitmovin.api.sdk.streams.video.VideoApi;
import com.bitmovin.api.sdk.streams.live.LiveApi;
import com.bitmovin.api.sdk.streams.config.ConfigApi;
import com.bitmovin.api.sdk.streams.search.SearchApi;
import com.bitmovin.api.sdk.streams.signingKeys.SigningKeysApi;

public class StreamsApi {
    public final VideoApi video;
    public final LiveApi live;
    public final ConfigApi config;
    public final SearchApi search;
    public final SigningKeysApi signingKeys;

    public StreamsApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.video = new VideoApi(clientFactory);
        this.live = new LiveApi(clientFactory);
        this.config = new ConfigApi(clientFactory);
        this.search = new SearchApi(clientFactory);
        this.signingKeys = new SigningKeysApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of StreamsApi
     */
    public static BitmovinApiBuilder<StreamsApi> builder() {
        return new BitmovinApiBuilder<>(StreamsApi.class);
    }

    
}
