package com.bitmovin.api.sdk.encoding.encodings.streams.input;

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

public class InputApi {

    private final InputApiClient apiClient;

    public InputApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(InputApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of InputApi
     */
    public static BitmovinApiBuilder<InputApi> builder() {
        return new BitmovinApiBuilder<>(InputApi.class);
    }
    /**
     * Stream Input Details
     * 
     * @param encodingId Id of the encoding. (required)
     * @param streamId Id of the stream. (required)
     * @return EncodingStreamInputDetails
     * @throws BitmovinException if fails to make API call
     */
    public EncodingStreamInputDetails get(String encodingId, String streamId) throws BitmovinException {
        try {
            return this.apiClient.get(encodingId, streamId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface InputApiClient { 
        @RequestLine("GET /encoding/encodings/{encoding_id}/streams/{stream_id}/input")
        ResponseEnvelope<EncodingStreamInputDetails> get(@Param(value = "encoding_id") String encodingId, @Param(value = "stream_id") String streamId) throws BitmovinException;
    }
}
