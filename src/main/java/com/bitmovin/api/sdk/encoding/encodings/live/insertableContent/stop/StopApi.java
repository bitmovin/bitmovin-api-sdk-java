package com.bitmovin.api.sdk.encoding.encodings.live.insertableContent.stop;

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
     * Stops Currently Running Inserted Content
     * 
     * @param encodingId Id of the encoding. (required)
     * @throws BitmovinException if fails to make API call
     */
    public void create(String encodingId) throws BitmovinException {
        try {
            this.apiClient.create(encodingId);
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    interface StopApiClient {
    
        @Headers("Content-Type: text/plain")
        @Body(" ")
        @RequestLine("POST /encoding/encodings/{encoding_id}/live/insertable-content/stop")
        void create(@Param(value = "encoding_id") String encodingId) throws BitmovinException;
    }
}
