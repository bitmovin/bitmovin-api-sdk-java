package com.bitmovin.api.sdk.player.customBuilds.web.status;

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

public class StatusApi {

    private final StatusApiClient apiClient;

    public StatusApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(StatusApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of StatusApi
     */
    public static BitmovinApiBuilder<StatusApi> builder() {
        return new BitmovinApiBuilder<>(StatusApi.class);
    }
    /**
     * Custom Web Player Build Status
     * 
     * @param customBuildId Id of the custom player build (required)
     * @return CustomPlayerBuildStatus
     * @throws BitmovinException if fails to make API call
     */
    public CustomPlayerBuildStatus get(String customBuildId) throws BitmovinException {
        try {
            return this.apiClient.get(customBuildId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface StatusApiClient { 
        @RequestLine("GET /player/custom-builds/web/{custom_build_id}/status")
        ResponseEnvelope<CustomPlayerBuildStatus> get(@Param(value = "custom_build_id") String customBuildId) throws BitmovinException;
    }
}
