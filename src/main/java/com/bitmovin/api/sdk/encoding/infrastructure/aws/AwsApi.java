package com.bitmovin.api.sdk.encoding.infrastructure.aws;

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
import com.bitmovin.api.sdk.encoding.infrastructure.aws.regions.RegionsApi;

public class AwsApi {
    public final RegionsApi regions;

    private final AwsApiClient apiClient;

    public AwsApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(AwsApiClient.class);

        this.regions = new RegionsApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of AwsApi
     */
    public static BitmovinApiBuilder<AwsApi> builder() {
        return new BitmovinApiBuilder<>(AwsApi.class);
    }
    /**
     * Add AWS Account
     * 
     * @param awsAccount The AWS Account to be added (required)
     * @return AwsAccount
     * @throws BitmovinException if fails to make API call
     */
    public AwsAccount create(AwsAccount awsAccount) throws BitmovinException {
        try {
            return this.apiClient.create(awsAccount).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * Delete AWS Account
     * 
     * @param infrastructureId Id of the AWS account (required)
     * @return AwsAccount
     * @throws BitmovinException if fails to make API call
     */
    public AwsAccount delete(String infrastructureId) throws BitmovinException {
        try {
            return this.apiClient.delete(infrastructureId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * AWS Account Details
     * 
     * @param infrastructureId Id of the AWS account (required)
     * @return AwsAccount
     * @throws BitmovinException if fails to make API call
     */
    public AwsAccount get(String infrastructureId) throws BitmovinException {
        try {
            return this.apiClient.get(infrastructureId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * List AWS Accounts
     * 
     * @return List&lt;AwsAccount&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<AwsAccount> list() throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * List AWS Accounts
     * 
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;AwsAccount&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<AwsAccount> list(AwsAccountListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface AwsApiClient { 
        @RequestLine("POST /encoding/infrastructure/aws")
        ResponseEnvelope<AwsAccount> create(AwsAccount awsAccount) throws BitmovinException;
   
        @RequestLine("DELETE /encoding/infrastructure/aws/{infrastructure_id}")
        ResponseEnvelope<AwsAccount> delete(@Param(value = "infrastructure_id") String infrastructureId) throws BitmovinException;
   
        @RequestLine("GET /encoding/infrastructure/aws/{infrastructure_id}")
        ResponseEnvelope<AwsAccount> get(@Param(value = "infrastructure_id") String infrastructureId) throws BitmovinException;
   
        @RequestLine("GET /encoding/infrastructure/aws")
        ResponseEnvelope<PaginationResponse<AwsAccount>> list(@QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    }
}
