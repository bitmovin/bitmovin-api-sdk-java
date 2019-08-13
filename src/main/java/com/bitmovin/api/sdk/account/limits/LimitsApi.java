package com.bitmovin.api.sdk.account.limits;

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

public class LimitsApi {

    private final LimitsApiClient apiClient;

    public LimitsApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(LimitsApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of LimitsApi
     */
    public static BitmovinApiBuilder<LimitsApi> builder() {
        return new BitmovinApiBuilder<>(LimitsApi.class);
    }
    
    /**
     * Organization Limits
     * 
     * @return List&lt;ResourceLimitContainer&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<ResourceLimitContainer> list() throws BitmovinException {
        return this.apiClient.list().getData().getResult();
    }
    
    interface LimitsApiClient {
    
        @RequestLine("GET /account/limits")
        ResponseEnvelope<PaginationResponse<ResourceLimitContainer>> list() throws BitmovinException;
    }
}
