package com.bitmovin.api.sdk.encoding.inputs.s3;

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
import com.bitmovin.api.sdk.encoding.inputs.s3.customdata.CustomdataApi;

public class S3Api {
    public final CustomdataApi customdata;

    private final S3ApiClient apiClient;

    public S3Api(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(S3ApiClient.class);

        this.customdata = new CustomdataApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of S3Api
     */
    public static BitmovinApiBuilder<S3Api> builder() {
        return new BitmovinApiBuilder<>(S3Api.class);
    }
    
    /**
     * Create S3 Input
     * 
     * @param s3Input The S3 input to be created (optional)
     * @return S3Input
     * @throws BitmovinException if fails to make API call
     */
    public S3Input create(S3Input s3Input) throws BitmovinException {
        return this.apiClient.create(s3Input).getData().getResult();
    }
    
    /**
     * Delete S3 Input
     * 
     * @param inputId Id of the input (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse delete(String inputId) throws BitmovinException {
        return this.apiClient.delete(inputId).getData().getResult();
    }
    
    /**
     * S3 Input Details
     * 
     * @param inputId Id of the input (required)
     * @return S3Input
     * @throws BitmovinException if fails to make API call
     */
    public S3Input get(String inputId) throws BitmovinException {
        return this.apiClient.get(inputId).getData().getResult();
    }
    
    /**
     * List S3 Inputs
     * 
     * @return List&lt;S3Input&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<S3Input> list() throws BitmovinException {
        return this.apiClient.list(new HashMap<String, Object>()).getData().getResult();
    }
    /**
     * List S3 Inputs
     * 
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;S3Input&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<S3Input> list(S3InputListQueryParams queryParams) throws BitmovinException {
        return this.apiClient.list(queryParams).getData().getResult();
    }
    
    interface S3ApiClient {
    
        @RequestLine("POST /encoding/inputs/s3")
        ResponseEnvelope<S3Input> create(S3Input s3Input) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/inputs/s3/{input_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "input_id") String inputId) throws BitmovinException;
    
        @RequestLine("GET /encoding/inputs/s3/{input_id}")
        ResponseEnvelope<S3Input> get(@Param(value = "input_id") String inputId) throws BitmovinException;
    
        @RequestLine("GET /encoding/inputs/s3")
        ResponseEnvelope<PaginationResponse<S3Input>> list(@QueryMap Map<String, Object> queryParams) throws BitmovinException;
    }
}
