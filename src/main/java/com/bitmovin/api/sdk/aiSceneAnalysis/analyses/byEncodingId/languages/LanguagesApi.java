package com.bitmovin.api.sdk.aiSceneAnalysis.analyses.byEncodingId.languages;

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

public class LanguagesApi {

    private final LanguagesApiClient apiClient;

    public LanguagesApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(LanguagesApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of LanguagesApi
     */
    public static BitmovinApiBuilder<LanguagesApi> builder() {
        return new BitmovinApiBuilder<>(LanguagesApi.class);
    }
    /**
     * Get AI scene analysis languages by encoding ID
     * Returns list of languages from AI scene analysis for a given encoding.
     * @param encodingId The encoding ID (required)
     * @return SceneAnalysisLanguagesResponse
     * @throws BitmovinException if fails to make API call
     */
    public SceneAnalysisLanguagesResponse get(String encodingId) throws BitmovinException {
        try {
            return this.apiClient.get(encodingId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface LanguagesApiClient { 
        @RequestLine("GET /ai-scene-analysis/analyses/by-encoding-id/{encoding_id}/languages")
        ResponseEnvelope<SceneAnalysisLanguagesResponse> get(@Param(value = "encoding_id") String encodingId) throws BitmovinException;
    }
}
