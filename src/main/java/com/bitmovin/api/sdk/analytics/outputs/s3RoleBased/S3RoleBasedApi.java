package com.bitmovin.api.sdk.analytics.outputs.s3RoleBased;

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
import com.bitmovin.api.sdk.analytics.outputs.s3RoleBased.customdata.CustomdataApi;

public class S3RoleBasedApi {
    public final CustomdataApi customdata;

    private final S3RoleBasedApiClient apiClient;

    public S3RoleBasedApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(S3RoleBasedApiClient.class);

        this.customdata = new CustomdataApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of S3RoleBasedApi
     */
    public static BitmovinApiBuilder<S3RoleBasedApi> builder() {
        return new BitmovinApiBuilder<>(S3RoleBasedApi.class);
    }
    
    /**
     * Create S3 Role-based Output
     * 
     * @param analyticsS3RoleBasedOutput The S3 Role-based output to be created (required)
     * @return AnalyticsS3RoleBasedOutput
     * @throws BitmovinException if fails to make API call
     */
    public AnalyticsS3RoleBasedOutput create(AnalyticsS3RoleBasedOutput analyticsS3RoleBasedOutput) throws BitmovinException {
        try {
            return this.apiClient.create(analyticsS3RoleBasedOutput).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * Delete S3 Role-based Output
     * 
     * @param outputId Id of the output (required)
     * @return S3RoleBasedOutput
     * @throws BitmovinException if fails to make API call
     */
    public S3RoleBasedOutput delete(String outputId) throws BitmovinException {
        try {
            return this.apiClient.delete(outputId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * S3 Role-based Output Details
     * 
     * @param outputId Id of the input (required)
     * @return S3RoleBasedOutput
     * @throws BitmovinException if fails to make API call
     */
    public S3RoleBasedOutput get(String outputId) throws BitmovinException {
        try {
            return this.apiClient.get(outputId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * List S3 Role-based Outputs
     * 
     * @return List&lt;AnalyticsS3RoleBasedOutput&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<AnalyticsS3RoleBasedOutput> list() throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * List S3 Role-based Outputs
     * 
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;AnalyticsS3RoleBasedOutput&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<AnalyticsS3RoleBasedOutput> list(AnalyticsS3RoleBasedOutputListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    interface S3RoleBasedApiClient {
    
        @RequestLine("POST /analytics/outputs/s3-role-based")
        ResponseEnvelope<AnalyticsS3RoleBasedOutput> create(AnalyticsS3RoleBasedOutput analyticsS3RoleBasedOutput) throws BitmovinException;
    
        @RequestLine("DELETE /analytics/outputs/s3-role-based/{output_id}")
        ResponseEnvelope<S3RoleBasedOutput> delete(@Param(value = "output_id") String outputId) throws BitmovinException;
    
        @RequestLine("GET /analytics/outputs/s3-role-based/{output_id}")
        ResponseEnvelope<S3RoleBasedOutput> get(@Param(value = "output_id") String outputId) throws BitmovinException;
    
        @RequestLine("GET /analytics/outputs/s3-role-based")
        ResponseEnvelope<PaginationResponse<AnalyticsS3RoleBasedOutput>> list(@QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    }
}
