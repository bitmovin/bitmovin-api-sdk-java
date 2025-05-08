package com.bitmovin.api.sdk.encoding.encodings.template;

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

public class TemplateApi {

    private final TemplateApiClient apiClient;

    public TemplateApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(TemplateApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of TemplateApi
     */
    public static BitmovinApiBuilder<TemplateApi> builder() {
        return new BitmovinApiBuilder<>(TemplateApi.class);
    }
    /**
     * Encoding Template URL
     * Retrieve the download URL for the Encoding Template associated with a specific encoding. 
     * @param encodingId Id of the Encoding (required)
     * @return EncodingTemplateUrlResponse
     * @throws BitmovinException if fails to make API call
     */
    public EncodingTemplateUrlResponse get(String encodingId) throws BitmovinException {
        try {
            return this.apiClient.get(encodingId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface TemplateApiClient { 
        @RequestLine("GET /encoding/encodings/{encoding_id}/template")
        ResponseEnvelope<EncodingTemplateUrlResponse> get(@Param(value = "encoding_id") String encodingId) throws BitmovinException;
    }
}
