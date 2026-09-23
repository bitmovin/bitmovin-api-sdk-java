package com.bitmovin.api.sdk.aiSceneAnalysis.liveAnalyses;

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
import com.bitmovin.api.sdk.aiSceneAnalysis.liveAnalyses.results.ResultsApi;

public class LiveAnalysesApi {
    public final ResultsApi results;

    private final LiveAnalysesApiClient apiClient;

    public LiveAnalysesApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(LiveAnalysesApiClient.class);

        this.results = new ResultsApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of LiveAnalysesApi
     */
    public static BitmovinApiBuilder<LiveAnalysesApi> builder() {
        return new BitmovinApiBuilder<>(LiveAnalysesApi.class);
    }
    /**
     * Create Live Analysis
     * Creates a Live Analysis. Start the Analysis using the start operation. If creation fails after an Analysis resource has been created, the error response includes a &#x60;Location&#x60; header identifying the Analysis so its failure details can be retrieved. 
     * @param aiSceneAnalysisLiveCreateRequest Live Analysis configuration (required)
     * @return AiSceneAnalysisLiveResponse
     * @throws BitmovinException if fails to make API call
     */
    public AiSceneAnalysisLiveResponse create(AiSceneAnalysisLiveCreateRequest aiSceneAnalysisLiveCreateRequest) throws BitmovinException {
        try {
            return this.apiClient.create(aiSceneAnalysisLiveCreateRequest).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * Delete Live Analysis
     * Deletes a Live Analysis. This is allowed only from &#x60;CREATED&#x60;, &#x60;FINISHED&#x60;, &#x60;CANCELED&#x60;, &#x60;ERROR&#x60;, or &#x60;TRANSFER_ERROR&#x60;. Output resources and files in your storage are not deleted. 
     * @param analysisId ID of the Live Analysis (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse delete(String analysisId) throws BitmovinException {
        try {
            return this.apiClient.delete(analysisId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * Get Live Analysis details
     * Returns the details and current status of a Live Analysis. While the Live Analysis is &#x60;RUNNING&#x60;, the response includes current RTMP ingest details. In all other states, &#x60;ingest&#x60; is omitted. 
     * @param analysisId ID of the Live Analysis (required)
     * @return AiSceneAnalysisLiveResponse
     * @throws BitmovinException if fails to make API call
     */
    public AiSceneAnalysisLiveResponse get(String analysisId) throws BitmovinException {
        try {
            return this.apiClient.get(analysisId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * List Live Analyses
     * Returns a paginated list of Live Analyses for the effective organization.
     * @return List&lt;AiSceneAnalysisLiveResponse&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<AiSceneAnalysisLiveResponse> list() throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * List Live Analyses
     * Returns a paginated list of Live Analyses for the effective organization.
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;AiSceneAnalysisLiveResponse&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<AiSceneAnalysisLiveResponse> list(AiSceneAnalysisLiveResponseListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * Start Live Analysis
     * Starts a &#x60;CREATED&#x60; Live Analysis. Repeated calls while it is &#x60;QUEUED&#x60; or &#x60;RUNNING&#x60; reconcile and return the existing resource without launching it again. Poll Get Live Analysis details until the Live Analysis reaches &#x60;RUNNING&#x60;; that response then includes current RTMP ingest details. 
     * @param analysisId ID of the Live Analysis (required)
     * @return AiSceneAnalysisLiveResponse
     * @throws BitmovinException if fails to make API call
     */
    public AiSceneAnalysisLiveResponse start(String analysisId) throws BitmovinException {
        try {
            return this.apiClient.start(analysisId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * Stop Live Analysis
     * Requests a stop for a &#x60;QUEUED&#x60; or &#x60;RUNNING&#x60; Live Analysis. Queued cancellation becomes &#x60;CANCELED&#x60;; a graceful running stop becomes &#x60;FINISHED&#x60; only after final required result delivery and usage persistence complete. 
     * @param analysisId ID of the Live Analysis (required)
     * @return AiSceneAnalysisLiveResponse
     * @throws BitmovinException if fails to make API call
     */
    public AiSceneAnalysisLiveResponse stop(String analysisId) throws BitmovinException {
        try {
            return this.apiClient.stop(analysisId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface LiveAnalysesApiClient { 
        @RequestLine("POST /ai-scene-analysis/live-analyses")
        ResponseEnvelope<AiSceneAnalysisLiveResponse> create(AiSceneAnalysisLiveCreateRequest aiSceneAnalysisLiveCreateRequest) throws BitmovinException;
   
        @RequestLine("DELETE /ai-scene-analysis/live-analyses/{analysis_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "analysis_id") String analysisId) throws BitmovinException;
   
        @RequestLine("GET /ai-scene-analysis/live-analyses/{analysis_id}")
        ResponseEnvelope<AiSceneAnalysisLiveResponse> get(@Param(value = "analysis_id") String analysisId) throws BitmovinException;
   
        @RequestLine("GET /ai-scene-analysis/live-analyses")
        ResponseEnvelope<PaginationResponse<AiSceneAnalysisLiveResponse>> list(@QueryMap QueryMapWrapper queryParams) throws BitmovinException;
   
        @RequestLine("POST /ai-scene-analysis/live-analyses/{analysis_id}/start")
        ResponseEnvelope<AiSceneAnalysisLiveResponse> start(@Param(value = "analysis_id") String analysisId) throws BitmovinException;
   
        @RequestLine("POST /ai-scene-analysis/live-analyses/{analysis_id}/stop")
        ResponseEnvelope<AiSceneAnalysisLiveResponse> stop(@Param(value = "analysis_id") String analysisId) throws BitmovinException;
    }
}
