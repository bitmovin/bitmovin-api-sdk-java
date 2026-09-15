package com.bitmovin.api.sdk.player.testing.codecCompatibility;

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

public class CodecCompatibilityApi {

    private final CodecCompatibilityApiClient apiClient;

    public CodecCompatibilityApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(CodecCompatibilityApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of CodecCompatibilityApi
     */
    public static BitmovinApiBuilder<CodecCompatibilityApi> builder() {
        return new BitmovinApiBuilder<>(CodecCompatibilityApi.class);
    }
    /**
     * Get Codec Compatibility Report
     * 
     * @return PccReport
     * @throws BitmovinException if fails to make API call
     */
    public PccReport get() throws BitmovinException {
        try {
            return this.apiClient.get(new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * Get Codec Compatibility Report
     * 
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return PccReport
     * @throws BitmovinException if fails to make API call
     */
    public PccReport get(PccReportGetQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.get(new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface CodecCompatibilityApiClient { 
        @RequestLine("GET /player/testing/codec-compatibility")
        ResponseEnvelope<PccReport> get(@QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    }
}
