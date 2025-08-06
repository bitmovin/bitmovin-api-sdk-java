package com.bitmovin.api.sdk.aiSceneAnalysis.analyses.byEncodingId.details;

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
import com.bitmovin.api.sdk.aiSceneAnalysis.analyses.byEncodingId.details.language.LanguageApi;

public class DetailsApi {
    public final LanguageApi language;

    private final DetailsApiClient apiClient;

    public DetailsApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(DetailsApiClient.class);

        this.language = new LanguageApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of DetailsApi
     */
    public static BitmovinApiBuilder<DetailsApi> builder() {
        return new BitmovinApiBuilder<>(DetailsApi.class);
    }
    /**
     * Get AI scene analysis details by encoding ID
     * Returns detailed AI scene analysis for a given encoding.
     * @param encodingId The encoding ID (required)
     * @return SceneAnalysisDetailsResponse
     * @throws BitmovinException if fails to make API call
     */
    public SceneAnalysisDetailsResponse get(String encodingId) throws BitmovinException {
        try {
            return this.apiClient.get(encodingId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface DetailsApiClient { 
        @RequestLine("GET /ai-scene-analysis/analyses/by-encoding-id/{encoding_id}/details")
        ResponseEnvelope<SceneAnalysisDetailsResponse> get(@Param(value = "encoding_id") String encodingId) throws BitmovinException;
    }
}
