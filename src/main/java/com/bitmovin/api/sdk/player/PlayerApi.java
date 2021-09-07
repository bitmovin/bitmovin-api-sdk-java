package com.bitmovin.api.sdk.player;

import com.bitmovin.api.sdk.common.BitmovinApiBuilder;
import com.bitmovin.api.sdk.common.BitmovinApiClientFactory;
import com.bitmovin.api.sdk.player.channels.ChannelsApi;
import com.bitmovin.api.sdk.player.licenses.LicensesApi;
import com.bitmovin.api.sdk.player.customBuilds.CustomBuildsApi;

public class PlayerApi {
    public final ChannelsApi channels;
    public final LicensesApi licenses;
    public final CustomBuildsApi customBuilds;

    public PlayerApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.channels = new ChannelsApi(clientFactory);
        this.licenses = new LicensesApi(clientFactory);
        this.customBuilds = new CustomBuildsApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of PlayerApi
     */
    public static BitmovinApiBuilder<PlayerApi> builder() {
        return new BitmovinApiBuilder<>(PlayerApi.class);
    }

    
}
