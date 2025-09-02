package com.bitmovin.api.sdk.aiSceneAnalysis.analyses.byEncodingId.adPlacements;

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

public class AdPlacementsApi {

    private final AdPlacementsApiClient apiClient;

    public AdPlacementsApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(AdPlacementsApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of AdPlacementsApi
     */
    public static BitmovinApiBuilder<AdPlacementsApi> builder() {
        return new BitmovinApiBuilder<>(AdPlacementsApi.class);
    }
    /**
     * Get AI scene analysis ad placements by encoding ID
     * Returns ad placements from AI scene analysis for a given encoding.
     * @param encodingId The encoding ID (required)
     * @return SceneAnalysisAdPlacementMetadataResponse
     * @throws BitmovinException if fails to make API call
     */
    public SceneAnalysisAdPlacementMetadataResponse get(String encodingId) throws BitmovinException {
        try {
            return this.apiClient.get(encodingId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface AdPlacementsApiClient { 
        @RequestLine("GET /ai-scene-analysis/analyses/by-encoding-id/{encoding_id}/ad-placements")
        ResponseEnvelope<SceneAnalysisAdPlacementMetadataResponse> get(@Param(value = "encoding_id") String encodingId) throws BitmovinException;
    }
}
