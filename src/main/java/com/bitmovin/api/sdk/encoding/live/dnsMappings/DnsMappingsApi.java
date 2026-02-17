package com.bitmovin.api.sdk.encoding.live.dnsMappings;

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

public class DnsMappingsApi {

    private final DnsMappingsApiClient apiClient;

    public DnsMappingsApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(DnsMappingsApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of DnsMappingsApi
     */
    public static BitmovinApiBuilder<DnsMappingsApi> builder() {
        return new BitmovinApiBuilder<>(DnsMappingsApi.class);
    }
    /**
     * List DNS Mappings
     * 
     * @return List&lt;DnsMappingResponse&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<DnsMappingResponse> list() throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * List DNS Mappings
     * 
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;DnsMappingResponse&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<DnsMappingResponse> list(DnsMappingResponseListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface DnsMappingsApiClient { 
        @RequestLine("GET /encoding/live/dns-mappings")
        ResponseEnvelope<PaginationResponse<DnsMappingResponse>> list(@QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    }
}
