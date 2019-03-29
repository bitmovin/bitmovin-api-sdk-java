package com.bitmovin.api.sdk.encoding.encodings.streams.inputs;

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
import com.bitmovin.api.sdk.common.BitmovinDateExpander;
import com.bitmovin.api.sdk.common.BitmovinApiBuilder;
import com.bitmovin.api.sdk.common.BitmovinApiClientFactory;

public class InputsApi {

    private final InputsApiClient apiClient;

    public InputsApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(InputsApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of InputsApi
     */
    public static BitmovinApiBuilder<InputsApi> builder() {
        return new BitmovinApiBuilder<>(InputsApi.class);
    }
    
    /**
     * Stream Input Analysis Details
     * 
     * @param encodingId Id of the encoding. (required)
     * @param streamId Id of the stream. (required)
     * @return List&lt;StreamDetails&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<StreamDetails> list(String encodingId, String streamId) throws BitmovinException {
        return this.apiClient.list(encodingId, streamId).getData().getResult();
    }
    
    interface InputsApiClient {
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/streams/{stream_id}/inputs")
        ResponseEnvelope<PaginationResponse<StreamDetails>> list(@Param(value = "encoding_id") String encodingId, @Param(value = "stream_id") String streamId) throws BitmovinException;
    }
}
