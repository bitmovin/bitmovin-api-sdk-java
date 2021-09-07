package com.bitmovin.api.sdk.encoding.outputs.type;

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
     * Get Output Type
     * 
     * @param outputId Id of the wanted output (required)
     * @return OutputTypeResponse
     * @throws BitmovinException if fails to make API call
     */
    public OutputTypeResponse get(String outputId) throws BitmovinException {
        try {
            return this.apiClient.get(outputId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface TypeApiClient {

        @RequestLine("GET /encoding/outputs/{output_id}/type")
        ResponseEnvelope<OutputTypeResponse> get(@Param(value = "output_id") String outputId) throws BitmovinException;
    }
}
