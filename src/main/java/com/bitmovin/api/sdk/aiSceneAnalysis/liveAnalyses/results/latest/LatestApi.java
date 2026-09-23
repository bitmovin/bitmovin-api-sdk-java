package com.bitmovin.api.sdk.aiSceneAnalysis.liveAnalyses.results.latest;

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

public class LatestApi {

    private final LatestApiClient apiClient;

    public LatestApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(LatestApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of LatestApi
     */
    public static BitmovinApiBuilder<LatestApi> builder() {
        return new BitmovinApiBuilder<>(LatestApi.class);
    }
    /**
     * Get Live Analysis Latest Result
     * Returns the latest cumulative AI analysis results. 
     * @param analysisId ID of the Live Analysis (required)
     * @return AiSceneAnalysisLiveResult
     * @throws BitmovinException if fails to make API call
     */
    public AiSceneAnalysisLiveResult get(String analysisId) throws BitmovinException {
        try {
            return this.apiClient.get(analysisId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface LatestApiClient { 
        @RequestLine("GET /ai-scene-analysis/live-analyses/{analysis_id}/results/latest")
        ResponseEnvelope<AiSceneAnalysisLiveResult> get(@Param(value = "analysis_id") String analysisId) throws BitmovinException;
    }
}
