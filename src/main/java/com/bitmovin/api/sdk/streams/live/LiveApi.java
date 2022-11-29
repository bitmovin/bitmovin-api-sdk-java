package com.bitmovin.api.sdk.streams.live;

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

public class LiveApi {

    private final LiveApiClient apiClient;

    public LiveApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(LiveApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of LiveApi
     */
    public static BitmovinApiBuilder<LiveApi> builder() {
        return new BitmovinApiBuilder<>(LiveApi.class);
    }

    /**
     * Update stream by id
     * 
     * @param streamId Id of the stream. (required)
     * @param streamsLiveUpdateRequest Stream fields to update. (required)
     * @return StreamsLiveUpdateRequest
     * @throws BitmovinException if fails to make API call
     */
    public StreamsLiveUpdateRequest patchStreamsLive(String streamId, StreamsLiveUpdateRequest streamsLiveUpdateRequest) throws BitmovinException {
        try {
            return this.apiClient.patchStreamsLive(streamId, streamsLiveUpdateRequest).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface LiveApiClient {

        @RequestLine("PATCH /streams/live/{stream_id}")
        ResponseEnvelope<StreamsLiveUpdateRequest> patchStreamsLive(@Param(value = "stream_id") String streamId, StreamsLiveUpdateRequest streamsLiveUpdateRequest) throws BitmovinException;
    }
}
