package com.bitmovin.api.sdk.streams.live.start;

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

public class StartApi {

    private final StartApiClient apiClient;

    public StartApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(StartApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of StartApi
     */
    public static BitmovinApiBuilder<StartApi> builder() {
        return new BitmovinApiBuilder<>(StartApi.class);
    }

    /**
     * Start live stream by id
     * 
     * @param streamId Id of the stream. (required)
     * @throws BitmovinException if fails to make API call
     */
    public void update(String streamId) throws BitmovinException {
        try {
            this.apiClient.update(streamId);
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface StartApiClient {

        @RequestLine("PUT /streams/live/{stream_id}/start")
        void update(@Param(value = "stream_id") String streamId) throws BitmovinException;
    }
}
