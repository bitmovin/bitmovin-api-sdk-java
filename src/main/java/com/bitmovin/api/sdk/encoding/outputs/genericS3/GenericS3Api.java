package com.bitmovin.api.sdk.encoding.outputs.genericS3;

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
import com.bitmovin.api.sdk.encoding.outputs.genericS3.customdata.CustomdataApi;

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
     * Create Generic S3 Output
     * 
     * @param genericS3Output  (required)
     * @return GenericS3Output
     * @throws BitmovinException if fails to make API call
     */
    public GenericS3Output create(GenericS3Output genericS3Output) throws BitmovinException {
        return this.apiClient.create(genericS3Output).getData().getResult();
    }
    
    /**
     * Delete Generic S3 Output
     * 
     * @param outputId Id of the output (required)
     * @return GenericS3Output
     * @throws BitmovinException if fails to make API call
     */
    public GenericS3Output delete(String outputId) throws BitmovinException {
        return this.apiClient.delete(outputId).getData().getResult();
    }
    
    /**
     * Generic S3 Output Details
     * 
     * @param outputId Id of the output (required)
     * @return GenericS3Output
     * @throws BitmovinException if fails to make API call
     */
    public GenericS3Output get(String outputId) throws BitmovinException {
        return this.apiClient.get(outputId).getData().getResult();
    }
    
    /**
     * List Generic S3 Outputs
     * 
     * @return List&lt;GenericS3Output&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<GenericS3Output> list() throws BitmovinException {
        return this.apiClient.list(new HashMap<String, Object>()).getData().getResult();
    }
    /**
     * List Generic S3 Outputs
     * 
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;GenericS3Output&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<GenericS3Output> list(GenericS3OutputListQueryParams queryParams) throws BitmovinException {
        return this.apiClient.list(queryParams).getData().getResult();
    }
    
    interface GenericS3ApiClient {
    
        @RequestLine("POST /encoding/outputs/generic-s3")
        ResponseEnvelope<GenericS3Output> create(GenericS3Output genericS3Output) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/outputs/generic-s3/{output_id}")
        ResponseEnvelope<GenericS3Output> delete(@Param(value = "output_id") String outputId) throws BitmovinException;
    
        @RequestLine("GET /encoding/outputs/generic-s3/{output_id}")
        ResponseEnvelope<GenericS3Output> get(@Param(value = "output_id") String outputId) throws BitmovinException;
    
        @RequestLine("GET /encoding/outputs/generic-s3")
        ResponseEnvelope<PaginationResponse<GenericS3Output>> list(@QueryMap Map<String, Object> queryParams) throws BitmovinException;
    }
}
