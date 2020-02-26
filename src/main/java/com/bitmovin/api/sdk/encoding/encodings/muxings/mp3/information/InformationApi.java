package com.bitmovin.api.sdk.encoding.encodings.muxings.mp3.information;

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
import com.bitmovin.api.sdk.common.BitmovinApiBuilder;
import com.bitmovin.api.sdk.common.BitmovinApiClientFactory;

public class InformationApi {

    private final InformationApiClient apiClient;

    public InformationApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(InformationApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of InformationApi
     */
    public static BitmovinApiBuilder<InformationApi> builder() {
        return new BitmovinApiBuilder<>(InformationApi.class);
    }
    
    /**
     * MP3 muxing Information
     * 
     * @param encodingId ID of the Encoding. (required)
     * @param muxingId ID of the MP3 muxing (required)
     * @return Mp3MuxingInformation
     * @throws BitmovinException if fails to make API call
     */
    public Mp3MuxingInformation get(String encodingId, String muxingId) throws BitmovinException {
        try {
            return this.apiClient.get(encodingId, muxingId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    interface InformationApiClient {
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/muxings/mp3/{muxing_id}/information")
        ResponseEnvelope<Mp3MuxingInformation> get(@Param(value = "encoding_id") String encodingId, @Param(value = "muxing_id") String muxingId) throws BitmovinException;
    }
}
