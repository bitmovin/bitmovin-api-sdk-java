package com.bitmovin.api.sdk.encoding.encodings.live.hd;

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

public class HdApi {

    private final HdApiClient apiClient;

    public HdApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(HdApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of HdApi
     */
    public static BitmovinApiBuilder<HdApi> builder() {
        return new BitmovinApiBuilder<>(HdApi.class);
    }

    /**
     * Live Encoding Start Details
     * 
     * @param encodingId Id of the encoding (required)
     * @return StartLiveChannelEncodingRequest
     * @throws BitmovinException if fails to make API call
     */
    public StartLiveChannelEncodingRequest getStartRequest(String encodingId) throws BitmovinException {
        try {
            return this.apiClient.getStartRequest(encodingId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * Start Live Encoding
     * 
     * @param encodingId Id of the encoding (required)
     * @param startLiveChannelEncodingRequest Live Encoding startup options (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse start(String encodingId, StartLiveChannelEncodingRequest startLiveChannelEncodingRequest) throws BitmovinException {
        try {
            return this.apiClient.start(encodingId, startLiveChannelEncodingRequest).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface HdApiClient {

        @RequestLine("GET /encoding/encodings/{encoding_id}/live/hd/start")
        ResponseEnvelope<StartLiveChannelEncodingRequest> getStartRequest(@Param(value = "encoding_id") String encodingId) throws BitmovinException;
    
        @RequestLine("POST /encoding/encodings/{encoding_id}/live/hd/start")
        ResponseEnvelope<BitmovinResponse> start(@Param(value = "encoding_id") String encodingId, StartLiveChannelEncodingRequest startLiveChannelEncodingRequest) throws BitmovinException;
    }
}
