package com.bitmovin.api.sdk.encoding.infrastructure.akamai.regions;

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
     * Add Akamai account region settings
     * 
     * @param infrastructureId Id of the Akamai account (required)
     * @param region Akamai region (required)
     * @param akamaiAccountRegionSettings The Akamai account region settings to be added (required)
     * @return AkamaiAccountRegionSettings
     * @throws BitmovinException if fails to make API call
     */
    public AkamaiAccountRegionSettings create(String infrastructureId, AkamaiCloudRegion region, AkamaiAccountRegionSettings akamaiAccountRegionSettings) throws BitmovinException {
        try {
            return this.apiClient.create(infrastructureId, region, akamaiAccountRegionSettings).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * Delete Akamai account region settings
     * 
     * @param infrastructureId Id of the Akamai account (required)
     * @param region Akamai region (required)
     * @return AkamaiAccountRegionSettings
     * @throws BitmovinException if fails to make API call
     */
    public AkamaiAccountRegionSettings delete(String infrastructureId, AkamaiCloudRegion region) throws BitmovinException {
        try {
            return this.apiClient.delete(infrastructureId, region).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * Akamai account region settings details
     * 
     * @param infrastructureId Id of the Akamai account (required)
     * @param region Akamai region (required)
     * @return AkamaiAccountRegionSettings
     * @throws BitmovinException if fails to make API call
     */
    public AkamaiAccountRegionSettings get(String infrastructureId, AkamaiCloudRegion region) throws BitmovinException {
        try {
            return this.apiClient.get(infrastructureId, region).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * List Akamai account region settings
     * 
     * @param infrastructureId Id of the Akamai account (required)
     * @return List&lt;AkamaiAccountRegionSettings&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<AkamaiAccountRegionSettings> list(String infrastructureId) throws BitmovinException {
        try {
            return this.apiClient.list(infrastructureId, new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * List Akamai account region settings
     * 
     * @param infrastructureId Id of the Akamai account (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;AkamaiAccountRegionSettings&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<AkamaiAccountRegionSettings> list(String infrastructureId, AkamaiAccountRegionSettingsListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(infrastructureId, new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface RegionsApiClient { 
        @RequestLine("POST /encoding/infrastructure/akamai/{infrastructure_id}/regions/{region}")
        ResponseEnvelope<AkamaiAccountRegionSettings> create(@Param(value = "infrastructure_id") String infrastructureId, @Param(value = "region") AkamaiCloudRegion region, AkamaiAccountRegionSettings akamaiAccountRegionSettings) throws BitmovinException;
   
        @RequestLine("DELETE /encoding/infrastructure/akamai/{infrastructure_id}/regions/{region}")
        ResponseEnvelope<AkamaiAccountRegionSettings> delete(@Param(value = "infrastructure_id") String infrastructureId, @Param(value = "region") AkamaiCloudRegion region) throws BitmovinException;
   
        @RequestLine("GET /encoding/infrastructure/akamai/{infrastructure_id}/regions/{region}")
        ResponseEnvelope<AkamaiAccountRegionSettings> get(@Param(value = "infrastructure_id") String infrastructureId, @Param(value = "region") AkamaiCloudRegion region) throws BitmovinException;
   
        @RequestLine("GET /encoding/infrastructure/akamai/{infrastructure_id}/regions")
        ResponseEnvelope<PaginationResponse<AkamaiAccountRegionSettings>> list(@Param(value = "infrastructure_id") String infrastructureId, @QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    }
}
