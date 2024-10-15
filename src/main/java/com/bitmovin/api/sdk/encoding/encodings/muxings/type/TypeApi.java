package com.bitmovin.api.sdk.encoding.encodings.muxings.type;

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

public class TypeApi {

    private final TypeApiClient apiClient;

    public TypeApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(TypeApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of TypeApi
     */
    public static BitmovinApiBuilder<TypeApi> builder() {
        return new BitmovinApiBuilder<>(TypeApi.class);
    }
    /**
     * Get Muxing type
     * 
     * @param encodingId Id of the encoding. (required)
     * @param muxingId Id of the muxing. (required)
     * @return MuxingTypeResponse
     * @throws BitmovinException if fails to make API call
     */
    public MuxingTypeResponse get(String encodingId, String muxingId) throws BitmovinException {
        try {
            return this.apiClient.get(encodingId, muxingId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface TypeApiClient { 
        @RequestLine("GET /encoding/encodings/{encoding_id}/muxings/{muxing_id}/type")
        ResponseEnvelope<MuxingTypeResponse> get(@Param(value = "encoding_id") String encodingId, @Param(value = "muxing_id") String muxingId) throws BitmovinException;
    }
}
