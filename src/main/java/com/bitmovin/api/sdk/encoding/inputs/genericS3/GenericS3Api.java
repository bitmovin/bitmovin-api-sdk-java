package com.bitmovin.api.sdk.encoding.inputs.genericS3;

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
import com.bitmovin.api.sdk.encoding.inputs.genericS3.customdata.CustomdataApi;

public class GenericS3Api {
    public final CustomdataApi customdata;

    private final GenericS3ApiClient apiClient;

    public GenericS3Api(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(GenericS3ApiClient.class);

        this.customdata = new CustomdataApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of GenericS3Api
     */
    public static BitmovinApiBuilder<GenericS3Api> builder() {
        return new BitmovinApiBuilder<>(GenericS3Api.class);
    }
    
    /**
     * Create Generic S3 Input
     * 
     * @param genericS3Input The GenericS3 input to be created (required)
     * @return GenericS3Input
     * @throws BitmovinException if fails to make API call
     */
    public GenericS3Input create(GenericS3Input genericS3Input) throws BitmovinException {
        return this.apiClient.create(genericS3Input).getData().getResult();
    }
    
    /**
     * Delete Generic S3 Input
     * 
     * @param inputId Id of the input (required)
     * @return GenericS3Input
     * @throws BitmovinException if fails to make API call
     */
    public GenericS3Input delete(String inputId) throws BitmovinException {
        return this.apiClient.delete(inputId).getData().getResult();
    }
    
    /**
     * Generic S3 Input Details
     * 
     * @param inputId Id of the input (required)
     * @return GenericS3Input
     * @throws BitmovinException if fails to make API call
     */
    public GenericS3Input get(String inputId) throws BitmovinException {
        return this.apiClient.get(inputId).getData().getResult();
    }
    
    /**
     * List Generic S3 Inputs
     * 
     * @return List&lt;GenericS3Input&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<GenericS3Input> list() throws BitmovinException {
        return this.apiClient.list(new HashMap<String, Object>()).getData().getResult();
    }
    /**
     * List Generic S3 Inputs
     * 
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;GenericS3Input&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<GenericS3Input> list(GenericS3InputListQueryParams queryParams) throws BitmovinException {
        return this.apiClient.list(queryParams).getData().getResult();
    }
    
    interface GenericS3ApiClient {
    
        @RequestLine("POST /encoding/inputs/generic-s3")
        ResponseEnvelope<GenericS3Input> create(GenericS3Input genericS3Input) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/inputs/generic-s3/{input_id}")
        ResponseEnvelope<GenericS3Input> delete(@Param(value = "input_id") String inputId) throws BitmovinException;
    
        @RequestLine("GET /encoding/inputs/generic-s3/{input_id}")
        ResponseEnvelope<GenericS3Input> get(@Param(value = "input_id") String inputId) throws BitmovinException;
    
        @RequestLine("GET /encoding/inputs/generic-s3")
        ResponseEnvelope<PaginationResponse<GenericS3Input>> list(@QueryMap Map<String, Object> queryParams) throws BitmovinException;
    }
}
