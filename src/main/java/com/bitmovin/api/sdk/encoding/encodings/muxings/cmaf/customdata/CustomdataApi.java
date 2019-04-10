package com.bitmovin.api.sdk.encoding.encodings.muxings.cmaf.customdata;

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

public class CustomdataApi {

    private final CustomdataApiClient apiClient;

    public CustomdataApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(CustomdataApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of CustomdataApi
     */
    public static BitmovinApiBuilder<CustomdataApi> builder() {
        return new BitmovinApiBuilder<>(CustomdataApi.class);
    }
    
    /**
     * CMAF muxing custom data
     * 
     * @param encodingId Id of the encoding. (required)
     * @param muxingId Id of the CMAF muxing (required)
     * @return CustomData
     * @throws BitmovinException if fails to make API call
     */
    public CustomData getCustomData(String encodingId, String muxingId) throws BitmovinException {
        return this.apiClient.getCustomData(encodingId, muxingId).getData().getResult();
    }
    
    interface CustomdataApiClient {
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/muxings/cmaf/{muxing_id}/customData")
        ResponseEnvelope<CustomData> getCustomData(@Param(value = "encoding_id") String encodingId, @Param(value = "muxing_id") String muxingId) throws BitmovinException;
    }
}
