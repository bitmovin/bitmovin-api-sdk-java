package com.bitmovin.api.sdk.encoding.simple.jobs.vod;

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

public class VodApi {

    private final VodApiClient apiClient;

    public VodApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(VodApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of VodApi
     */
    public static BitmovinApiBuilder<VodApi> builder() {
        return new BitmovinApiBuilder<>(VodApi.class);
    }

    /**
     * Create a Simple Encoding VOD Job
     * Deprecation notice: use the more capable full API instead. Get started at https://developer.bitmovin.com/encoding/docs/java-sdk 
     * @param simpleEncodingVodJobRequest The Simple Encoding VOD Job to be created. (required)
     * @return SimpleEncodingVodJobResponse
     * @throws BitmovinException if fails to make API call
     * @deprecated
     */
    @Deprecated
    public SimpleEncodingVodJobResponse create(SimpleEncodingVodJobRequest simpleEncodingVodJobRequest) throws BitmovinException {
        try {
            return this.apiClient.create(simpleEncodingVodJobRequest).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * Simple Encoding VOD Job details
     * Get the details of a Simple VOD Encoding Job. Deprecation notice: use the more capable full API instead. Get started at https://developer.bitmovin.com/encoding/docs/java-sdk 
     * @param simpleEncodingJobId Id of the Simple Encoding VOD Job (required)
     * @return SimpleEncodingVodJobResponse
     * @throws BitmovinException if fails to make API call
     * @deprecated
     */
    @Deprecated
    public SimpleEncodingVodJobResponse get(String simpleEncodingJobId) throws BitmovinException {
        try {
            return this.apiClient.get(simpleEncodingJobId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * List all Simple Encoding VOD Jobs
     * Deprecation notice: use the more capable full API instead. Get started at https://developer.bitmovin.com/encoding/docs/java-sdk 
     * @return List&lt;SimpleEncodingVodJobResponse&gt;
     * @throws BitmovinException if fails to make API call
     * @deprecated
     */
    @Deprecated
    public PaginationResponse<SimpleEncodingVodJobResponse> list() throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * List all Simple Encoding VOD Jobs
     * Deprecation notice: use the more capable full API instead. Get started at https://developer.bitmovin.com/encoding/docs/java-sdk 
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;SimpleEncodingVodJobResponse&gt;
     * @throws BitmovinException if fails to make API call
     * @deprecated
     */
    @Deprecated
    public PaginationResponse<SimpleEncodingVodJobResponse> list(SimpleEncodingVodJobResponseListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface VodApiClient {

        @RequestLine("POST /encoding/simple/jobs/vod")
        ResponseEnvelope<SimpleEncodingVodJobResponse> create(SimpleEncodingVodJobRequest simpleEncodingVodJobRequest) throws BitmovinException;
    
        @RequestLine("GET /encoding/simple/jobs/vod/{simple_encoding_job_id}")
        ResponseEnvelope<SimpleEncodingVodJobResponse> get(@Param(value = "simple_encoding_job_id") String simpleEncodingJobId) throws BitmovinException;
    
        @RequestLine("GET /encoding/simple/jobs/vod")
        ResponseEnvelope<PaginationResponse<SimpleEncodingVodJobResponse>> list(@QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    }
}
