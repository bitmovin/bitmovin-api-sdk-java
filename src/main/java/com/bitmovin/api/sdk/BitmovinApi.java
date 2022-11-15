package com.bitmovin.api.sdk;

import com.bitmovin.api.sdk.common.BitmovinApiBuilder;
import com.bitmovin.api.sdk.common.BitmovinApiClientFactory;
import com.bitmovin.api.sdk.account.AccountApi;
import com.bitmovin.api.sdk.analytics.AnalyticsApi;
import com.bitmovin.api.sdk.encoding.EncodingApi;
import com.bitmovin.api.sdk.general.GeneralApi;
import com.bitmovin.api.sdk.notifications.NotificationsApi;
import com.bitmovin.api.sdk.player.PlayerApi;
import com.bitmovin.api.sdk.streams.StreamsApi;

public class BitmovinApi {
    public final AccountApi account;
    public final AnalyticsApi analytics;
    public final EncodingApi encoding;
    public final GeneralApi general;
    public final NotificationsApi notifications;
    public final PlayerApi player;
    public final StreamsApi streams;

    public BitmovinApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.account = new AccountApi(clientFactory);
        this.analytics = new AnalyticsApi(clientFactory);
        this.encoding = new EncodingApi(clientFactory);
        this.general = new GeneralApi(clientFactory);
        this.notifications = new NotificationsApi(clientFactory);
        this.player = new PlayerApi(clientFactory);
        this.streams = new StreamsApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of BitmovinApi
     */
    public static BitmovinApiBuilder<BitmovinApi> builder() {
        return new BitmovinApiBuilder<>(BitmovinApi.class);
    }

    
}
