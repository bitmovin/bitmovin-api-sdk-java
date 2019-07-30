package com.bitmovin.api.sdk.encoding.encodings.live.stopInsertedContent;

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

public class StopInsertedContentApi {

    private final StopInsertedContentApiClient apiClient;

    public StopInsertedContentApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(StopInsertedContentApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of StopInsertedContentApi
     */
    public static BitmovinApiBuilder<StopInsertedContentApi> builder() {
        return new BitmovinApiBuilder<>(StopInsertedContentApi.class);
    }
    
    /**
     * Stop Currently Running Inserted Content
     * 
     * @param encodingId Id of the encoding. (required)
     * @throws BitmovinException if fails to make API call
     */
    public void create(String encodingId) throws BitmovinException {
        this.apiClient.create(encodingId);
    }
    
    interface StopInsertedContentApiClient {
    
        @Headers("Content-Type: text/plain")
        @Body(" ")
        @RequestLine("POST /encoding/encodings/{encoding_id}/live/stop-inserted-content")
        void create(@Param(value = "encoding_id") String encodingId) throws BitmovinException;
    }
}
