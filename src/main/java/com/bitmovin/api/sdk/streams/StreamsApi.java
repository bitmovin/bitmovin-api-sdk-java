package com.bitmovin.api.sdk.streams;

import com.bitmovin.api.sdk.common.BitmovinApiBuilder;
import com.bitmovin.api.sdk.common.BitmovinApiClientFactory;
import com.bitmovin.api.sdk.streams.search.SearchApi;
import com.bitmovin.api.sdk.streams.video.VideoApi;
import com.bitmovin.api.sdk.streams.live.LiveApi;

public class StreamsApi {
    public final SearchApi search;
    public final VideoApi video;
    public final LiveApi live;

    public StreamsApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.search = new SearchApi(clientFactory);
        this.video = new VideoApi(clientFactory);
        this.live = new LiveApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of StreamsApi
     */
    public static BitmovinApiBuilder<StreamsApi> builder() {
        return new BitmovinApiBuilder<>(StreamsApi.class);
    }

    
}
