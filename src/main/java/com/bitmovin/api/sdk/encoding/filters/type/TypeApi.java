package com.bitmovin.api.sdk.encoding.filters.type;

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
import com.bitmovin.api.sdk.common.BitmovinDateExpander;
import com.bitmovin.api.sdk.common.BitmovinApiBuilder;
import com.bitmovin.api.sdk.common.BitmovinApiClientFactory;

public class TypeApi {

    private final TypeApiClient apiClient;

    public TypeApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(TypeApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of TypeApi
     */
    public static BitmovinApiBuilder<TypeApi> builder() {
        return new BitmovinApiBuilder<>(TypeApi.class);
    }
    
    /**
     * Get Filter Type
     * 
     * @param filterId Id of the filter (required)
     * @return FilterTypeResponse
     * @throws BitmovinException if fails to make API call
     */
    public FilterTypeResponse get(String filterId) throws BitmovinException {
        return this.apiClient.get(filterId).getData().getResult();
    }
    
    interface TypeApiClient {
    
        @RequestLine("GET /encoding/filters/{filter_id}/type")
        ResponseEnvelope<FilterTypeResponse> get(@Param(value = "filter_id") String filterId) throws BitmovinException;
    }
}
