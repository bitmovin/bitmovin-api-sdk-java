package com.bitmovin.api.sdk.encoding.infrastructure.aws.regions;

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

public class RegionsApi {

    private final RegionsApiClient apiClient;

    public RegionsApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(RegionsApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of RegionsApi
     */
    public static BitmovinApiBuilder<RegionsApi> builder() {
        return new BitmovinApiBuilder<>(RegionsApi.class);
    }

    /**
     * Add AWS Region Setting
     * 
     * @param infrastructureId Id of the AWS account (required)
     * @param region AWS region. (required)
     * @param awsAccountRegionSettings The AWS Region Settings to be added (required)
     * @return AwsAccountRegionSettings
     * @throws BitmovinException if fails to make API call
     */
    public AwsAccountRegionSettings create(String infrastructureId, AwsCloudRegion region, AwsAccountRegionSettings awsAccountRegionSettings) throws BitmovinException {
        try {
            return this.apiClient.create(infrastructureId, region, awsAccountRegionSettings).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * Delete AWS Region Settings
     * 
     * @param infrastructureId Id of the AWS account (required)
     * @param region AWS region. (required)
     * @return AwsAccountRegionSettings
     * @throws BitmovinException if fails to make API call
     */
    public AwsAccountRegionSettings delete(String infrastructureId, AwsCloudRegion region) throws BitmovinException {
        try {
            return this.apiClient.delete(infrastructureId, region).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * AWS Region Settings Details
     * 
     * @param infrastructureId Id of the AWS account (required)
     * @param region AWS region. (required)
     * @return AwsAccountRegionSettings
     * @throws BitmovinException if fails to make API call
     */
    public AwsAccountRegionSettings get(String infrastructureId, AwsCloudRegion region) throws BitmovinException {
        try {
            return this.apiClient.get(infrastructureId, region).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * List AWS Region Settings
     * 
     * @param infrastructureId Id of the AWS account (required)
     * @return List&lt;AwsAccountRegionSettings&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<AwsAccountRegionSettings> list(String infrastructureId) throws BitmovinException {
        try {
            return this.apiClient.list(infrastructureId, new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * List AWS Region Settings
     * 
     * @param infrastructureId Id of the AWS account (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;AwsAccountRegionSettings&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<AwsAccountRegionSettings> list(String infrastructureId, AwsAccountRegionSettingsListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(infrastructureId, new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface RegionsApiClient {

        @RequestLine("POST /encoding/infrastructure/aws/{infrastructure_id}/regions/{region}")
        ResponseEnvelope<AwsAccountRegionSettings> create(@Param(value = "infrastructure_id") String infrastructureId, @Param(value = "region") AwsCloudRegion region, AwsAccountRegionSettings awsAccountRegionSettings) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/infrastructure/aws/{infrastructure_id}/regions/{region}")
        ResponseEnvelope<AwsAccountRegionSettings> delete(@Param(value = "infrastructure_id") String infrastructureId, @Param(value = "region") AwsCloudRegion region) throws BitmovinException;
    
        @RequestLine("GET /encoding/infrastructure/aws/{infrastructure_id}/regions/{region}")
        ResponseEnvelope<AwsAccountRegionSettings> get(@Param(value = "infrastructure_id") String infrastructureId, @Param(value = "region") AwsCloudRegion region) throws BitmovinException;
    
        @RequestLine("GET /encoding/infrastructure/aws/{infrastructure_id}/regions")
        ResponseEnvelope<PaginationResponse<AwsAccountRegionSettings>> list(@Param(value = "infrastructure_id") String infrastructureId, @QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    }
}
