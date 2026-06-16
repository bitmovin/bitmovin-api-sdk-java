package com.bitmovin.api.sdk.encoding.encodings.live.heartbeatFinal;

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

public class HeartbeatFinalApi {

    private final HeartbeatFinalApiClient apiClient;

    public HeartbeatFinalApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(HeartbeatFinalApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of HeartbeatFinalApi
     */
    public static BitmovinApiBuilder<HeartbeatFinalApi> builder() {
        return new BitmovinApiBuilder<>(HeartbeatFinalApi.class);
    }
    /**
     * Get Final Live Encoding Heartbeat Download URL
     * Returns a presigned S3 URL to download the final heartbeat JSON of a live encoding. The URL is valid for 10 minutes. This endpoint is only available once the encoding has reached a final state; calling it while the encoding is still running will result in a 404 response.
     * @param encodingId Id of the encoding. (required)
     * @return LiveEncodingHeartbeatUrlResponse
     * @throws BitmovinException if fails to make API call
     */
    public LiveEncodingHeartbeatUrlResponse get(String encodingId) throws BitmovinException {
        try {
            return this.apiClient.get(encodingId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface HeartbeatFinalApiClient { 
        @RequestLine("GET /encoding/encodings/{encoding_id}/live/heartbeat-final")
        ResponseEnvelope<LiveEncodingHeartbeatUrlResponse> get(@Param(value = "encoding_id") String encodingId) throws BitmovinException;
    }
}
