package com.bitmovin.api.sdk.encoding.infrastructure.prewarmedEncoderPools.schedules;

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

public class SchedulesApi {

    private final SchedulesApiClient apiClient;

    public SchedulesApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(SchedulesApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of SchedulesApi
     */
    public static BitmovinApiBuilder<SchedulesApi> builder() {
        return new BitmovinApiBuilder<>(SchedulesApi.class);
    }

    /**
     * Create prewarmed encoder pool schedule
     * 
     * @param poolId Id of the scheduled encoder pool (required)
     * @param prewarmedEncoderPoolSchedule The prewarmed encoder pool schedule to be created (required)
     * @return PrewarmedEncoderPoolSchedule
     * @throws BitmovinException if fails to make API call
     */
    public PrewarmedEncoderPoolSchedule create(String poolId, PrewarmedEncoderPoolSchedule prewarmedEncoderPoolSchedule) throws BitmovinException {
        try {
            return this.apiClient.create(poolId, prewarmedEncoderPoolSchedule).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * Delete prewarmed encoder pool schedule
     * 
     * @param poolId Id of the scheduled encoder pool (required)
     * @param scheduleId Id of the prewarmed encoder pool schedule (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse delete(String poolId, String scheduleId) throws BitmovinException {
        try {
            return this.apiClient.delete(poolId, scheduleId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * Prewarmed encoder pool schedule details
     * 
     * @param poolId Id of the scheduled encoder pool (required)
     * @param scheduleId Id of the prewarmed encoder pool schedule (required)
     * @return PrewarmedEncoderPoolSchedule
     * @throws BitmovinException if fails to make API call
     */
    public PrewarmedEncoderPoolSchedule get(String poolId, String scheduleId) throws BitmovinException {
        try {
            return this.apiClient.get(poolId, scheduleId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * List prewarmed encoder pool schedules
     * 
     * @param poolId Id of the scheduled encoder pool (required)
     * @return List&lt;PrewarmedEncoderPoolSchedule&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<PrewarmedEncoderPoolSchedule> list(String poolId) throws BitmovinException {
        try {
            return this.apiClient.list(poolId, new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * List prewarmed encoder pool schedules
     * 
     * @param poolId Id of the scheduled encoder pool (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;PrewarmedEncoderPoolSchedule&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<PrewarmedEncoderPoolSchedule> list(String poolId, PrewarmedEncoderPoolScheduleListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(poolId, new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface SchedulesApiClient {

        @RequestLine("POST /encoding/infrastructure/prewarmed-encoder-pools/{pool_id}/schedules")
        ResponseEnvelope<PrewarmedEncoderPoolSchedule> create(@Param(value = "pool_id") String poolId, PrewarmedEncoderPoolSchedule prewarmedEncoderPoolSchedule) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/infrastructure/prewarmed-encoder-pools/{pool_id}/schedules/{schedule_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "pool_id") String poolId, @Param(value = "schedule_id") String scheduleId) throws BitmovinException;
    
        @RequestLine("GET /encoding/infrastructure/prewarmed-encoder-pools/{pool_id}/schedules/{schedule_id}")
        ResponseEnvelope<PrewarmedEncoderPoolSchedule> get(@Param(value = "pool_id") String poolId, @Param(value = "schedule_id") String scheduleId) throws BitmovinException;
    
        @RequestLine("GET /encoding/infrastructure/prewarmed-encoder-pools/{pool_id}/schedules")
        ResponseEnvelope<PaginationResponse<PrewarmedEncoderPoolSchedule>> list(@Param(value = "pool_id") String poolId, @QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    }
}
