package com.bitmovin.api.sdk.streams.search;

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

public class SearchApi {

    private final SearchApiClient apiClient;

    public SearchApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(SearchApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of SearchApi
     */
    public static BitmovinApiBuilder<SearchApi> builder() {
        return new BitmovinApiBuilder<>(SearchApi.class);
    }

    /**
     * Get paginated search results of VOD and Live streams
     * 
     * @return List&lt;StreamsSearchResponse&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<StreamsSearchResponse> list() throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * Get paginated search results of VOD and Live streams
     * 
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;StreamsSearchResponse&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<StreamsSearchResponse> list(StreamsSearchResponseListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface SearchApiClient {

        @RequestLine("GET /streams/search")
        ResponseEnvelope<PaginationResponse<StreamsSearchResponse>> list(@QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    }
}
