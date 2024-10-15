package com.bitmovin.api.sdk.encoding.infrastructure.azure.regions;

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
     * Add Azure Region Setting
     * 
     * @param infrastructureId Id of the Azure account (required)
     * @param region Azure region. (required)
     * @param azureAccountRegionSettings The Azure Region Settings to be added (required)
     * @return AzureAccountRegionSettings
     * @throws BitmovinException if fails to make API call
     */
    public AzureAccountRegionSettings create(String infrastructureId, AzureCloudRegion region, AzureAccountRegionSettings azureAccountRegionSettings) throws BitmovinException {
        try {
            return this.apiClient.create(infrastructureId, region, azureAccountRegionSettings).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * Delete Azure Region Settings
     * 
     * @param infrastructureId Id of the Azure account (required)
     * @param region Azure region. (required)
     * @return AzureAccountRegionSettings
     * @throws BitmovinException if fails to make API call
     */
    public AzureAccountRegionSettings delete(String infrastructureId, AzureCloudRegion region) throws BitmovinException {
        try {
            return this.apiClient.delete(infrastructureId, region).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * Azure Region Settings Details
     * 
     * @param infrastructureId Id of the Azure account (required)
     * @param region Azure region. (required)
     * @return AzureAccountRegionSettings
     * @throws BitmovinException if fails to make API call
     */
    public AzureAccountRegionSettings get(String infrastructureId, AzureCloudRegion region) throws BitmovinException {
        try {
            return this.apiClient.get(infrastructureId, region).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * List Azure Region Settings
     * 
     * @param infrastructureId Id of the Azure account (required)
     * @return List&lt;AzureAccountRegionSettings&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<AzureAccountRegionSettings> list(String infrastructureId) throws BitmovinException {
        try {
            return this.apiClient.list(infrastructureId, new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * List Azure Region Settings
     * 
     * @param infrastructureId Id of the Azure account (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;AzureAccountRegionSettings&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<AzureAccountRegionSettings> list(String infrastructureId, AzureAccountRegionSettingsListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(infrastructureId, new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface RegionsApiClient { 
        @RequestLine("POST /encoding/infrastructure/azure/{infrastructure_id}/regions/{region}")
        ResponseEnvelope<AzureAccountRegionSettings> create(@Param(value = "infrastructure_id") String infrastructureId, @Param(value = "region") AzureCloudRegion region, AzureAccountRegionSettings azureAccountRegionSettings) throws BitmovinException;
   
        @RequestLine("DELETE /encoding/infrastructure/azure/{infrastructure_id}/regions/{region}")
        ResponseEnvelope<AzureAccountRegionSettings> delete(@Param(value = "infrastructure_id") String infrastructureId, @Param(value = "region") AzureCloudRegion region) throws BitmovinException;
   
        @RequestLine("GET /encoding/infrastructure/azure/{infrastructure_id}/regions/{region}")
        ResponseEnvelope<AzureAccountRegionSettings> get(@Param(value = "infrastructure_id") String infrastructureId, @Param(value = "region") AzureCloudRegion region) throws BitmovinException;
   
        @RequestLine("GET /encoding/infrastructure/azure/{infrastructure_id}/regions")
        ResponseEnvelope<PaginationResponse<AzureAccountRegionSettings>> list(@Param(value = "infrastructure_id") String infrastructureId, @QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    }
}
