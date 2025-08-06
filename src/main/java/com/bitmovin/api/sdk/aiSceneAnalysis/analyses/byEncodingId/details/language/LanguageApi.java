package com.bitmovin.api.sdk.aiSceneAnalysis.analyses.byEncodingId.details.language;

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

public class LanguageApi {

    private final LanguageApiClient apiClient;

    public LanguageApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(LanguageApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of LanguageApi
     */
    public static BitmovinApiBuilder<LanguageApi> builder() {
        return new BitmovinApiBuilder<>(LanguageApi.class);
    }
    /**
     * Get translated AI scene analysis details by encoding ID and language code
     * Returns detailed translated AI scene analysis for a given encoding.
     * @param encodingId The encoding ID (required)
     * @param languageCode The language code (required)
     * @return SceneAnalysisDetailsResponse
     * @throws BitmovinException if fails to make API call
     */
    public SceneAnalysisDetailsResponse get(String encodingId, String languageCode) throws BitmovinException {
        try {
            return this.apiClient.get(encodingId, languageCode).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface LanguageApiClient { 
        @RequestLine("GET /ai-scene-analysis/analyses/by-encoding-id/{encoding_id}/details/language/{language_code}")
        ResponseEnvelope<SceneAnalysisDetailsResponse> get(@Param(value = "encoding_id") String encodingId, @Param(value = "language_code") String languageCode) throws BitmovinException;
    }
}
