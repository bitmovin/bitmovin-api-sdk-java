package com.bitmovin.api.sdk.streams.live.stop;

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

public class StopApi {

    private final StopApiClient apiClient;

    public StopApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(StopApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of StopApi
     */
    public static BitmovinApiBuilder<StopApi> builder() {
        return new BitmovinApiBuilder<>(StopApi.class);
    }

    /**
     * Stop live stream by id
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

    interface StopApiClient {

        @RequestLine("PUT /streams/live/{stream_id}/stop")
        void update(@Param(value = "stream_id") String streamId) throws BitmovinException;
    }
}
