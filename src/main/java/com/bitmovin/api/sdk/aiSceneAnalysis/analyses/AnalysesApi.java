package com.bitmovin.api.sdk.aiSceneAnalysis.analyses;

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
import com.bitmovin.api.sdk.aiSceneAnalysis.analyses.byEncodingId.ByEncodingIdApi;

public class AnalysesApi {
    public final ByEncodingIdApi byEncodingId;

    private final AnalysesApiClient apiClient;

    public AnalysesApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(AnalysesApiClient.class);

        this.byEncodingId = new ByEncodingIdApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of AnalysesApi
     */
    public static BitmovinApiBuilder<AnalysesApi> builder() {
        return new BitmovinApiBuilder<>(AnalysesApi.class);
    }
    /**
     * List AI Scene Analyses
     * Returns a paginated list of AI scene analyses. A searchText containing at least one non-whitespace character enables semantic search, must contain between 3 and 100 characters, and uses relevance ordering; each semantic-search result includes the matching scene segment. Omitted, empty, or whitespace-only searchText preserves ordinary list behavior and omits the matching segment.
     * @return List&lt;SceneAnalysisListItem&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<SceneAnalysisListItem> list() throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * List AI Scene Analyses
     * Returns a paginated list of AI scene analyses. A searchText containing at least one non-whitespace character enables semantic search, must contain between 3 and 100 characters, and uses relevance ordering; each semantic-search result includes the matching scene segment. Omitted, empty, or whitespace-only searchText preserves ordinary list behavior and omits the matching segment.
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;SceneAnalysisListItem&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<SceneAnalysisListItem> list(SceneAnalysisListItemListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface AnalysesApiClient { 
        @RequestLine("GET /ai-scene-analysis/analyses")
        ResponseEnvelope<PaginationResponse<SceneAnalysisListItem>> list(@QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    }
}
