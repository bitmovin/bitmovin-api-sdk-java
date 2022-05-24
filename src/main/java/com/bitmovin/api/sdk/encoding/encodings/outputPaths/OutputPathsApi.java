package com.bitmovin.api.sdk.encoding.encodings.outputPaths;

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

public class OutputPathsApi {

    private final OutputPathsApiClient apiClient;

    public OutputPathsApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(OutputPathsApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of OutputPathsApi
     */
    public static BitmovinApiBuilder<OutputPathsApi> builder() {
        return new BitmovinApiBuilder<>(OutputPathsApi.class);
    }

    /**
     * Encoding Output Paths Retrieval
     * 
     * @param encodingId Id of the encoding (required)
     * @return List&lt;EncodingOutputPaths&gt;
     * @throws BitmovinException if fails to make API call
     */
    public List<EncodingOutputPaths> get(String encodingId) throws BitmovinException {
        try {
            return this.apiClient.get(encodingId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface OutputPathsApiClient {

        @RequestLine("GET /encoding/encodings/{encoding_id}/output-paths")
        ResponseEnvelope<List<EncodingOutputPaths>> get(@Param(value = "encoding_id") String encodingId) throws BitmovinException;
    }
}
