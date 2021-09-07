package com.bitmovin.api.sdk.encoding.infrastructure.prewarmedEncoderPools;

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
import com.bitmovin.api.sdk.encoding.infrastructure.prewarmedEncoderPools.schedules.SchedulesApi;

public class PrewarmedEncoderPoolsApi {
    public final SchedulesApi schedules;

    private final PrewarmedEncoderPoolsApiClient apiClient;

    public PrewarmedEncoderPoolsApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(PrewarmedEncoderPoolsApiClient.class);

        this.schedules = new SchedulesApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of PrewarmedEncoderPoolsApi
     */
    public static BitmovinApiBuilder<PrewarmedEncoderPoolsApi> builder() {
        return new BitmovinApiBuilder<>(PrewarmedEncoderPoolsApi.class);
    }

    /**
     * Create prewarmed encoder pool
     * 
     * @param prewarmedEncoderPool The prewarmed encoder pool to be created (required)
     * @return PrewarmedEncoderPool
     * @throws BitmovinException if fails to make API call
     */
    public PrewarmedEncoderPool create(PrewarmedEncoderPool prewarmedEncoderPool) throws BitmovinException {
        try {
            return this.apiClient.create(prewarmedEncoderPool).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * Delete prewarmed encoder pool
     * 
     * @param poolId Id of the prewarmed encoder pool (required)
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
     * Prewarmed encoder pool details
     * 
     * @param poolId Id of the prewarmed encoder pool (required)
     * @return PrewarmedEncoderPool
     * @throws BitmovinException if fails to make API call
     */
    public PrewarmedEncoderPool get(String poolId) throws BitmovinException {
        try {
            return this.apiClient.get(poolId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * List prewarmed encoder pools
     * 
     * @return List&lt;PrewarmedEncoderPool&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<PrewarmedEncoderPool> list() throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * List prewarmed encoder pools
     * 
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;PrewarmedEncoderPool&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<PrewarmedEncoderPool> list(PrewarmedEncoderPoolListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * Start prewarmed encoder pool
     * 
     * @param poolId Id of the prewarmed encoder pool to be started (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse start(String poolId) throws BitmovinException {
        try {
            return this.apiClient.start(poolId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * Stop prewarmed encoder pool
     * 
     * @param poolId Id of the prewarmed encoder pool to be stopped (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse stop(String poolId) throws BitmovinException {
        try {
            return this.apiClient.stop(poolId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface PrewarmedEncoderPoolsApiClient {

        @RequestLine("POST /encoding/infrastructure/prewarmed-encoder-pools")
        ResponseEnvelope<PrewarmedEncoderPool> create(PrewarmedEncoderPool prewarmedEncoderPool) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/infrastructure/prewarmed-encoder-pools/{pool_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "pool_id") String poolId) throws BitmovinException;
    
        @RequestLine("GET /encoding/infrastructure/prewarmed-encoder-pools/{pool_id}")
        ResponseEnvelope<PrewarmedEncoderPool> get(@Param(value = "pool_id") String poolId) throws BitmovinException;
    
        @RequestLine("GET /encoding/infrastructure/prewarmed-encoder-pools")
        ResponseEnvelope<PaginationResponse<PrewarmedEncoderPool>> list(@QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    
        @RequestLine("POST /encoding/infrastructure/prewarmed-encoder-pools/{pool_id}/start")
        ResponseEnvelope<BitmovinResponse> start(@Param(value = "pool_id") String poolId) throws BitmovinException;
    
        @RequestLine("POST /encoding/infrastructure/prewarmed-encoder-pools/{pool_id}/stop")
        ResponseEnvelope<BitmovinResponse> stop(@Param(value = "pool_id") String poolId) throws BitmovinException;
    }
}
