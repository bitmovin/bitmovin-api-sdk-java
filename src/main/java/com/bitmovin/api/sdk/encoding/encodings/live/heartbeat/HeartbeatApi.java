package com.bitmovin.api.sdk.encoding.encodings.live.heartbeat;

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

public class HeartbeatApi {

    private final HeartbeatApiClient apiClient;

    public HeartbeatApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(HeartbeatApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of HeartbeatApi
     */
    public static BitmovinApiBuilder<HeartbeatApi> builder() {
        return new BitmovinApiBuilder<>(HeartbeatApi.class);
    }
    /**
     * Live Encoding Heartbeat
     * 
     * @param encodingId Id of the encoding. (required)
     * @return LiveEncodingHeartbeat
     * @throws BitmovinException if fails to make API call
     */
    public LiveEncodingHeartbeat get(String encodingId) throws BitmovinException {
        try {
            return this.apiClient.get(encodingId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface HeartbeatApiClient { 
        @RequestLine("GET /encoding/encodings/{encoding_id}/live/heartbeat")
        ResponseEnvelope<LiveEncodingHeartbeat> get(@Param(value = "encoding_id") String encodingId) throws BitmovinException;
    }
}
