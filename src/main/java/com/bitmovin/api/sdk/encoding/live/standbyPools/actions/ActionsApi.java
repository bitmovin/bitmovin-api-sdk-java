package com.bitmovin.api.sdk.encoding.live.standbyPools.actions;

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

public class ActionsApi {

    private final ActionsApiClient apiClient;

    public ActionsApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(ActionsApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of ActionsApi
     */
    public static BitmovinApiBuilder<ActionsApi> builder() {
        return new BitmovinApiBuilder<>(ActionsApi.class);
    }
    /**
     * Acquire an encoding from a standby pool
     * 
     * @param poolId Id of the standby pool (required)
     * @return LiveStandbyPoolEncoding
     * @throws BitmovinException if fails to make API call
     */
    public LiveStandbyPoolEncoding acquireEncoding(String poolId) throws BitmovinException {
        try {
            return this.apiClient.acquireEncoding(poolId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * Delete error encodings from the standby pool
     * 
     * @param poolId Id of the standby pool (required)
     * @return LiveStandbyPoolEncoding
     * @throws BitmovinException if fails to make API call
     */
    public LiveStandbyPoolEncoding deleteErrorEncodings(String poolId) throws BitmovinException {
        try {
            return this.apiClient.deleteErrorEncodings(poolId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface ActionsApiClient { 
        @RequestLine("POST /encoding/live/standby-pools/{pool_id}/actions/acquire-encoding")
        ResponseEnvelope<LiveStandbyPoolEncoding> acquireEncoding(@Param(value = "pool_id") String poolId) throws BitmovinException;
   
        @RequestLine("POST /encoding/live/standby-pools/{pool_id}/actions/delete-error-encodings")
        ResponseEnvelope<LiveStandbyPoolEncoding> deleteErrorEncodings(@Param(value = "pool_id") String poolId) throws BitmovinException;
    }
}
