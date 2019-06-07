package com.bitmovin.api.sdk.encoding.outputs.s3;

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
import com.bitmovin.api.sdk.encoding.outputs.s3.customdata.CustomdataApi;

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
     * Create S3 Output
     * 
     * @param s3Output  (required)
     * @return S3Output
     * @throws BitmovinException if fails to make API call
     */
    public S3Output create(S3Output s3Output) throws BitmovinException {
        return this.apiClient.create(s3Output).getData().getResult();
    }
    
    /**
     * Delete S3 Output
     * 
     * @param outputId Id of the output (required)
     * @return S3Output
     * @throws BitmovinException if fails to make API call
     */
    public S3Output delete(String outputId) throws BitmovinException {
        return this.apiClient.delete(outputId).getData().getResult();
    }
    
    /**
     * S3 Output Details
     * 
     * @param outputId Id of the input (required)
     * @return S3Output
     * @throws BitmovinException if fails to make API call
     */
    public S3Output get(String outputId) throws BitmovinException {
        return this.apiClient.get(outputId).getData().getResult();
    }
    
    /**
     * List S3 Outputs
     * 
     * @return List&lt;S3Output&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<S3Output> list() throws BitmovinException {
        return this.apiClient.list(new HashMap<String, Object>()).getData().getResult();
    }
    /**
     * List S3 Outputs
     * 
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;S3Output&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<S3Output> list(S3OutputListQueryParams queryParams) throws BitmovinException {
        return this.apiClient.list(queryParams).getData().getResult();
    }
    
    interface S3ApiClient {
    
        @RequestLine("POST /encoding/outputs/s3")
        ResponseEnvelope<S3Output> create(S3Output s3Output) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/outputs/s3/{output_id}")
        ResponseEnvelope<S3Output> delete(@Param(value = "output_id") String outputId) throws BitmovinException;
    
        @RequestLine("GET /encoding/outputs/s3/{output_id}")
        ResponseEnvelope<S3Output> get(@Param(value = "output_id") String outputId) throws BitmovinException;
    
        @RequestLine("GET /encoding/outputs/s3")
        ResponseEnvelope<PaginationResponse<S3Output>> list(@QueryMap Map<String, Object> queryParams) throws BitmovinException;
    }
}
