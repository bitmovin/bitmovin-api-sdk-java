package com.bitmovin.api.sdk.player.channels.versions;

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
import com.bitmovin.api.sdk.player.channels.versions.latest.LatestApi;

public class VersionsApi {
    public final LatestApi latest;

    private final VersionsApiClient apiClient;

    public VersionsApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(VersionsApiClient.class);

        this.latest = new LatestApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of VersionsApi
     */
    public static BitmovinApiBuilder<VersionsApi> builder() {
        return new BitmovinApiBuilder<>(VersionsApi.class);
    }

    /**
     * List Player Versions for Channel
     * 
     * @param channelName Name of the channel to get the player versions for. (required)
     * @return List&lt;PlayerVersion&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<PlayerVersion> list(String channelName) throws BitmovinException {
        try {
            return this.apiClient.list(channelName).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface VersionsApiClient {

        @RequestLine("GET /player/channels/{channel_name}/versions")
        ResponseEnvelope<PaginationResponse<PlayerVersion>> list(@Param(value = "channel_name") String channelName) throws BitmovinException;
    }
}
