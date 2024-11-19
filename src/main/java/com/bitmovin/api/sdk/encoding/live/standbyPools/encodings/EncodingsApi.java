package com.bitmovin.api.sdk.encoding.live.standbyPools.encodings;

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

public class EncodingsApi {

    private final EncodingsApiClient apiClient;

    public EncodingsApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(EncodingsApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of EncodingsApi
     */
    public static BitmovinApiBuilder<EncodingsApi> builder() {
        return new BitmovinApiBuilder<>(EncodingsApi.class);
    }
    /**
     * Delete encoding from pool by id
     * 
     * @param poolId Id of the standby pool (required)
     * @param id Id of the standby pool encoding (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse delete(String poolId, String id) throws BitmovinException {
        try {
            return this.apiClient.delete(poolId, id).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * List encodings from a standby pool
     * 
     * @param poolId Id of the standby pool (required)
     * @return List&lt;LiveStandbyPoolEncoding&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<LiveStandbyPoolEncoding> list(String poolId) throws BitmovinException {
        try {
            return this.apiClient.list(poolId, new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * List encodings from a standby pool
     * 
     * @param poolId Id of the standby pool (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;LiveStandbyPoolEncoding&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<LiveStandbyPoolEncoding> list(String poolId, LiveStandbyPoolEncodingListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(poolId, new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface EncodingsApiClient { 
        @RequestLine("DELETE /encoding/live/standby-pools/{pool_id}/encodings/{id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "pool_id") String poolId, @Param(value = "id") String id) throws BitmovinException;
   
        @RequestLine("GET /encoding/live/standby-pools/{pool_id}/encodings")
        ResponseEnvelope<PaginationResponse<LiveStandbyPoolEncoding>> list(@Param(value = "pool_id") String poolId, @QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    }
}
