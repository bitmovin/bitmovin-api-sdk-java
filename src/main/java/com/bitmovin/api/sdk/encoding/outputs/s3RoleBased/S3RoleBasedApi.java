package com.bitmovin.api.sdk.encoding.outputs.s3RoleBased;

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
import com.bitmovin.api.sdk.encoding.outputs.s3RoleBased.customdata.CustomdataApi;

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
     * @param s3RoleBasedOutput The S3 Role-based output to be created (required)
     * @return S3RoleBasedOutput
     * @throws BitmovinException if fails to make API call
     */
    public S3RoleBasedOutput create(S3RoleBasedOutput s3RoleBasedOutput) throws BitmovinException {
        return this.apiClient.create(s3RoleBasedOutput).getData().getResult();
    }
    
    /**
     * Delete S3 Role-based Output
     * 
     * @param outputId Id of the output (required)
     * @return S3RoleBasedOutput
     * @throws BitmovinException if fails to make API call
     */
    public S3RoleBasedOutput delete(String outputId) throws BitmovinException {
        return this.apiClient.delete(outputId).getData().getResult();
    }
    
    /**
     * S3 Role-based Output Details
     * 
     * @param outputId Id of the input (required)
     * @return S3RoleBasedOutput
     * @throws BitmovinException if fails to make API call
     */
    public S3RoleBasedOutput get(String outputId) throws BitmovinException {
        return this.apiClient.get(outputId).getData().getResult();
    }
    
    /**
     * List S3 Role-based Outputs
     * 
     * @return List&lt;S3RoleBasedOutput&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<S3RoleBasedOutput> list() throws BitmovinException {
        return this.apiClient.list(new HashMap<String, Object>()).getData().getResult();
    }
    /**
     * List S3 Role-based Outputs
     * 
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;S3RoleBasedOutput&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<S3RoleBasedOutput> list(S3RoleBasedOutputListQueryParams queryParams) throws BitmovinException {
        return this.apiClient.list(queryParams).getData().getResult();
    }
    
    interface S3RoleBasedApiClient {
    
        @RequestLine("POST /encoding/outputs/s3-role-based")
        ResponseEnvelope<S3RoleBasedOutput> create(S3RoleBasedOutput s3RoleBasedOutput) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/outputs/s3-role-based/{output_id}")
        ResponseEnvelope<S3RoleBasedOutput> delete(@Param(value = "output_id") String outputId) throws BitmovinException;
    
        @RequestLine("GET /encoding/outputs/s3-role-based/{output_id}")
        ResponseEnvelope<S3RoleBasedOutput> get(@Param(value = "output_id") String outputId) throws BitmovinException;
    
        @RequestLine("GET /encoding/outputs/s3-role-based")
        ResponseEnvelope<PaginationResponse<S3RoleBasedOutput>> list(@QueryMap Map<String, Object> queryParams) throws BitmovinException;
    }
}
