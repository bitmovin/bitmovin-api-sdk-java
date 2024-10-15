package com.bitmovin.api.sdk.encoding.templates;

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

public class TemplatesApi {

    private final TemplatesApiClient apiClient;

    public TemplatesApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(TemplatesApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of TemplatesApi
     */
    public static BitmovinApiBuilder<TemplatesApi> builder() {
        return new BitmovinApiBuilder<>(TemplatesApi.class);
    }
    /**
     * BETA: Start an Encoding defined with an Encoding Template
     * 
     * @param encodingTemplateRequest The Encoding Template to start an Encoding from (required)
     * @return EncodingTemplateStartResponse
     * @throws BitmovinException if fails to make API call
     */
    public EncodingTemplateStartResponse start(Object encodingTemplateRequest) throws BitmovinException {
        try {
            return this.apiClient.start(encodingTemplateRequest).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface TemplatesApiClient { 
        @RequestLine("POST /encoding/templates/start")
        ResponseEnvelope<EncodingTemplateStartResponse> start(Object encodingTemplateRequest) throws BitmovinException;
    }
}
