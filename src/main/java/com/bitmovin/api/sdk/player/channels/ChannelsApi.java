package com.bitmovin.api.sdk.player.channels;

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
import com.bitmovin.api.sdk.player.channels.versions.VersionsApi;

public class ChannelsApi {
    public final VersionsApi versions;

    private final ChannelsApiClient apiClient;

    public ChannelsApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(ChannelsApiClient.class);

        this.versions = new VersionsApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of ChannelsApi
     */
    public static BitmovinApiBuilder<ChannelsApi> builder() {
        return new BitmovinApiBuilder<>(ChannelsApi.class);
    }
    
    /**
     * List Player Channels
     * 
     * @return List&lt;PlayerChannel&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<PlayerChannel> list() throws BitmovinException {
        try {
            return this.apiClient.list().getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    interface ChannelsApiClient {
    
        @RequestLine("GET /player/channels")
        ResponseEnvelope<PaginationResponse<PlayerChannel>> list() throws BitmovinException;
    }
}
