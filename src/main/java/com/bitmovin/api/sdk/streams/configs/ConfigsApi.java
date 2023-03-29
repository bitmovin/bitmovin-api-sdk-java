package com.bitmovin.api.sdk.streams.configs;

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

public class ConfigsApi {

    private final ConfigsApiClient apiClient;

    public ConfigsApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(ConfigsApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of ConfigsApi
     */
    public static BitmovinApiBuilder<ConfigsApi> builder() {
        return new BitmovinApiBuilder<>(ConfigsApi.class);
    }

    /**
     * Update stream config by id
     * 
     * @param configId Id of the stream config. (required)
     * @param streamsConfigUpdateRequest The updated stream config object. (required)
     * @return StreamsConfigResponse
     * @throws BitmovinException if fails to make API call
     */
    public StreamsConfigResponse patchStreamConfig(String configId, StreamsConfigUpdateRequest streamsConfigUpdateRequest) throws BitmovinException {
        try {
            return this.apiClient.patchStreamConfig(configId, streamsConfigUpdateRequest).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface ConfigsApiClient {

        @RequestLine("PATCH /streams/configs/{config_id}")
        ResponseEnvelope<StreamsConfigResponse> patchStreamConfig(@Param(value = "config_id") String configId, StreamsConfigUpdateRequest streamsConfigUpdateRequest) throws BitmovinException;
    }
}
