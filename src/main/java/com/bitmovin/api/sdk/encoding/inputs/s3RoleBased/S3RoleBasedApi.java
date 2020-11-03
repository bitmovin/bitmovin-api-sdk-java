package com.bitmovin.api.sdk.encoding.inputs.s3RoleBased;

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
import com.bitmovin.api.sdk.encoding.inputs.s3RoleBased.customdata.CustomdataApi;

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
     * Create S3 Role-based Input
     * 
     * @param s3RoleBasedInput The S3 Role-based input to be created  The following permissions are required for S3 Role-based input:   * s3:GetObject   * s3:GetBucketLocation,  (required)
     * @return S3RoleBasedInput
     * @throws BitmovinException if fails to make API call
     */
    public S3RoleBasedInput create(S3RoleBasedInput s3RoleBasedInput) throws BitmovinException {
        try {
            return this.apiClient.create(s3RoleBasedInput).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * Delete S3 Role-based Input
     * 
     * @param inputId Id of the input (required)
     * @return S3RoleBasedInput
     * @throws BitmovinException if fails to make API call
     */
    public S3RoleBasedInput delete(String inputId) throws BitmovinException {
        try {
            return this.apiClient.delete(inputId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * S3 Role-based Input Details
     * 
     * @param inputId Id of the input (required)
     * @return S3RoleBasedInput
     * @throws BitmovinException if fails to make API call
     */
    public S3RoleBasedInput get(String inputId) throws BitmovinException {
        try {
            return this.apiClient.get(inputId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * List S3 Role-based Inputs
     * 
     * @return List&lt;S3RoleBasedInput&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<S3RoleBasedInput> list() throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * List S3 Role-based Inputs
     * 
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;S3RoleBasedInput&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<S3RoleBasedInput> list(S3RoleBasedInputListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    interface S3RoleBasedApiClient {
    
        @RequestLine("POST /encoding/inputs/s3-role-based")
        ResponseEnvelope<S3RoleBasedInput> create(S3RoleBasedInput s3RoleBasedInput) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/inputs/s3-role-based/{input_id}")
        ResponseEnvelope<S3RoleBasedInput> delete(@Param(value = "input_id") String inputId) throws BitmovinException;
    
        @RequestLine("GET /encoding/inputs/s3-role-based/{input_id}")
        ResponseEnvelope<S3RoleBasedInput> get(@Param(value = "input_id") String inputId) throws BitmovinException;
    
        @RequestLine("GET /encoding/inputs/s3-role-based")
        ResponseEnvelope<PaginationResponse<S3RoleBasedInput>> list(@QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    }
}
