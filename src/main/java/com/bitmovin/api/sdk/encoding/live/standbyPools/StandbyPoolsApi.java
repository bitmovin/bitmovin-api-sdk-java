package com.bitmovin.api.sdk.encoding.live.standbyPools;

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
import com.bitmovin.api.sdk.encoding.live.standbyPools.actions.ActionsApi;
import com.bitmovin.api.sdk.encoding.live.standbyPools.encodings.EncodingsApi;
import com.bitmovin.api.sdk.encoding.live.standbyPools.logs.LogsApi;

public class StandbyPoolsApi {
    public final ActionsApi actions;
    public final EncodingsApi encodings;
    public final LogsApi logs;

    private final StandbyPoolsApiClient apiClient;

    public StandbyPoolsApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(StandbyPoolsApiClient.class);

        this.actions = new ActionsApi(clientFactory);
        this.encodings = new EncodingsApi(clientFactory);
        this.logs = new LogsApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of StandbyPoolsApi
     */
    public static BitmovinApiBuilder<StandbyPoolsApi> builder() {
        return new BitmovinApiBuilder<>(StandbyPoolsApi.class);
    }
    /**
     * Create new standby pool
     * 
     * @param liveStandbyPoolRequest The pool to be created (required)
     * @return LiveStandbyPoolDetails
     * @throws BitmovinException if fails to make API call
     */
    public LiveStandbyPoolDetails create(LiveStandbyPoolRequest liveStandbyPoolRequest) throws BitmovinException {
        try {
            return this.apiClient.create(liveStandbyPoolRequest).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * Delete standby pool by id
     * 
     * @param poolId Id of the standby pool (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse delete(String poolId) throws BitmovinException {
        try {
            return this.apiClient.delete(poolId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * Get details of a standby pool by id
     * 
     * @param poolId Id of the standby pool (required)
     * @return LiveStandbyPoolDetails
     * @throws BitmovinException if fails to make API call
     */
    public LiveStandbyPoolDetails get(String poolId) throws BitmovinException {
        try {
            return this.apiClient.get(poolId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * List Standby pools
     * 
     * @return List&lt;LiveStandbyPoolResponse&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<LiveStandbyPoolResponse> list() throws BitmovinException {
        try {
            return this.apiClient.list().getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * Partially update standby pool by id
     * 
     * @param poolId Id of the standby pool (required)
     * @param liveStandbyPoolUpdate The updated standby pool object. (required)
     * @return LiveStandbyPoolDetails
     * @throws BitmovinException if fails to make API call
     */
    public LiveStandbyPoolDetails patch(String poolId, LiveStandbyPoolUpdate liveStandbyPoolUpdate) throws BitmovinException {
        try {
            return this.apiClient.patch(poolId, liveStandbyPoolUpdate).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface StandbyPoolsApiClient { 
        @RequestLine("POST /encoding/live/standby-pools")
        ResponseEnvelope<LiveStandbyPoolDetails> create(LiveStandbyPoolRequest liveStandbyPoolRequest) throws BitmovinException;
   
        @RequestLine("DELETE /encoding/live/standby-pools/{pool_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "pool_id") String poolId) throws BitmovinException;
   
        @RequestLine("GET /encoding/live/standby-pools/{pool_id}")
        ResponseEnvelope<LiveStandbyPoolDetails> get(@Param(value = "pool_id") String poolId) throws BitmovinException;
   
        @RequestLine("GET /encoding/live/standby-pools")
        ResponseEnvelope<PaginationResponse<LiveStandbyPoolResponse>> list() throws BitmovinException;
   
        @RequestLine("PATCH /encoding/live/standby-pools/{pool_id}")
        ResponseEnvelope<LiveStandbyPoolDetails> patch(@Param(value = "pool_id") String poolId, LiveStandbyPoolUpdate liveStandbyPoolUpdate) throws BitmovinException;
    }
}
