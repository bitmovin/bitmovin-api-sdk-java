package com.bitmovin.api.sdk.encoding.simple.jobs.live;

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

public class LiveApi {

    private final LiveApiClient apiClient;

    public LiveApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(LiveApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of LiveApi
     */
    public static BitmovinApiBuilder<LiveApi> builder() {
        return new BitmovinApiBuilder<>(LiveApi.class);
    }

    /**
     * Create a Simple Encoding Live Job
     * Deprecation notice: use the more capable full API instead. Get started at https://developer.bitmovin.com/encoding/docs/java-sdk 
     * @param simpleEncodingLiveJobRequest The Simple Encoding Live Job to be created. (required)
     * @return SimpleEncodingLiveJobResponse
     * @throws BitmovinException if fails to make API call
     * @deprecated
     */
    @Deprecated
    public SimpleEncodingLiveJobResponse create(SimpleEncodingLiveJobRequest simpleEncodingLiveJobRequest) throws BitmovinException {
        try {
            return this.apiClient.create(simpleEncodingLiveJobRequest).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * Simple Encoding Live Job details
     * Get the details of a Simple Live Encoding Job. Deprecation notice: use the more capable full API instead. Get started at https://developer.bitmovin.com/encoding/docs/java-sdk 
     * @param simpleEncodingJobId Id of the Simple Encoding Live Job (required)
     * @return SimpleEncodingLiveJobResponse
     * @throws BitmovinException if fails to make API call
     * @deprecated
     */
    @Deprecated
    public SimpleEncodingLiveJobResponse get(String simpleEncodingJobId) throws BitmovinException {
        try {
            return this.apiClient.get(simpleEncodingJobId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface LiveApiClient {

        @RequestLine("POST /encoding/simple/jobs/live")
        ResponseEnvelope<SimpleEncodingLiveJobResponse> create(SimpleEncodingLiveJobRequest simpleEncodingLiveJobRequest) throws BitmovinException;
    
        @RequestLine("GET /encoding/simple/jobs/live/{simple_encoding_job_id}")
        ResponseEnvelope<SimpleEncodingLiveJobResponse> get(@Param(value = "simple_encoding_job_id") String simpleEncodingJobId) throws BitmovinException;
    }
}
