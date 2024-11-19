package com.bitmovin.api.sdk.encoding.live.standbyPools.logs;

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

public class LogsApi {

    private final LogsApiClient apiClient;

    public LogsApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(LogsApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of LogsApi
     */
    public static BitmovinApiBuilder<LogsApi> builder() {
        return new BitmovinApiBuilder<>(LogsApi.class);
    }
    /**
     * List event logs for a standby pool
     * 
     * @param poolId Id of the standby pool (required)
     * @return List&lt;LiveStandbyPoolEventLog&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<LiveStandbyPoolEventLog> list(String poolId) throws BitmovinException {
        try {
            return this.apiClient.list(poolId, new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * List event logs for a standby pool
     * 
     * @param poolId Id of the standby pool (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;LiveStandbyPoolEventLog&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<LiveStandbyPoolEventLog> list(String poolId, LiveStandbyPoolEventLogListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(poolId, new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface LogsApiClient { 
        @RequestLine("GET /encoding/live/standby-pools/{pool_id}/logs")
        ResponseEnvelope<PaginationResponse<LiveStandbyPoolEventLog>> list(@Param(value = "pool_id") String poolId, @QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    }
}
