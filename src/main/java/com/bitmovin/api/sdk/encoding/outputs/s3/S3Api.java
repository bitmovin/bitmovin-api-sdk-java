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
import static com.bitmovin.api.sdk.common.BitmovinExceptionFactory.buildBitmovinException;
import com.bitmovin.api.sdk.common.BitmovinDateExpander;
import com.bitmovin.api.sdk.common.QueryMapWrapper;
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
     * @param s3Output The S3 output to be created  The following permissions are required for S3 output:  * s3:PutObject  * s3:PutObjectAcl  * s3:ListBucket  * s3:GetBucketLocation  (required)
     * @return S3Output
     * @throws BitmovinException if fails to make API call
     */
    public S3Output create(S3Output s3Output) throws BitmovinException {
        try {
            return this.apiClient.create(s3Output).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * Delete S3 Output
     * 
     * @param outputId Id of the output (required)
     * @return S3Output
     * @throws BitmovinException if fails to make API call
     */
    public S3Output delete(String outputId) throws BitmovinException {
        try {
            return this.apiClient.delete(outputId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * S3 Output Details
     * 
     * @param outputId Id of the input (required)
     * @return S3Output
     * @throws BitmovinException if fails to make API call
     */
    public S3Output get(String outputId) throws BitmovinException {
        try {
            return this.apiClient.get(outputId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * List S3 Outputs
     * 
     * @return List&lt;S3Output&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<S3Output> list() throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * List S3 Outputs
     * 
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;S3Output&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<S3Output> list(S3OutputListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface S3ApiClient { 
        @RequestLine("POST /encoding/outputs/s3")
        ResponseEnvelope<S3Output> create(S3Output s3Output) throws BitmovinException;
   
        @RequestLine("DELETE /encoding/outputs/s3/{output_id}")
        ResponseEnvelope<S3Output> delete(@Param(value = "output_id") String outputId) throws BitmovinException;
   
        @RequestLine("GET /encoding/outputs/s3/{output_id}")
        ResponseEnvelope<S3Output> get(@Param(value = "output_id") String outputId) throws BitmovinException;
   
        @RequestLine("GET /encoding/outputs/s3")
        ResponseEnvelope<PaginationResponse<S3Output>> list(@QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    }
}
