package com.bitmovin.api.sdk.player.channels.versions.latest;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import feign.Param;
import feign.QueryMap;
import feign.RequestLine;
import feign.Body;
import feign.Headers;

import com.bitmovin.api.sdk.model.*;
import com.bitmovin.api.sdk.common.BitmovinException;
import static com.bitmovin.api.sdk.common.BitmovinExceptionFactory.buildBitmovinException;
import com.bitmovin.api.sdk.common.BitmovinDateExpander;
import com.bitmovin.api.sdk.common.QueryMapWrapper;
import com.bitmovin.api.sdk.common.BitmovinApiBuilder;
import com.bitmovin.api.sdk.common.BitmovinApiClientFactory;

public class LatestApi {

    private final LatestApiClient apiClient;

    public LatestApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(LatestApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of LatestApi
     */
    public static BitmovinApiBuilder<LatestApi> builder() {
        return new BitmovinApiBuilder<>(LatestApi.class);
    }
    
    /**
     * Get Latest Player Version for Channel
     * 
     * @param channelName Name of the channel to get the player versions for. (required)
     * @return PlayerVersion
     * @throws BitmovinException if fails to make API call
     */
    public PlayerVersion get(String channelName) throws BitmovinException {
        try {
            return this.apiClient.get(channelName).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    interface LatestApiClient {
    
        @RequestLine("GET /player/channels/{channel_name}/versions/latest")
        ResponseEnvelope<PlayerVersion> get(@Param(value = "channel_name") String channelName) throws BitmovinException;
    }
}
