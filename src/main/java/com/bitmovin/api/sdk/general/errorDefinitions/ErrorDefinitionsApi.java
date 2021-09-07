package com.bitmovin.api.sdk.general.errorDefinitions;

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

public class ErrorDefinitionsApi {

    private final ErrorDefinitionsApiClient apiClient;

    public ErrorDefinitionsApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(ErrorDefinitionsApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of ErrorDefinitionsApi
     */
    public static BitmovinApiBuilder<ErrorDefinitionsApi> builder() {
        return new BitmovinApiBuilder<>(ErrorDefinitionsApi.class);
    }

    /**
     * List all possible api error definitions
     * 
     * @return List&lt;ApiErrorDefinition&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<ApiErrorDefinition> list() throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * List all possible api error definitions
     * 
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;ApiErrorDefinition&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<ApiErrorDefinition> list(ApiErrorDefinitionListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface ErrorDefinitionsApiClient {

        @RequestLine("GET /general/error-definitions")
        ResponseEnvelope<PaginationResponse<ApiErrorDefinition>> list(@QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    }
}
