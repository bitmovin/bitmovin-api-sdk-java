package com.bitmovin.api.sdk.encoding.infrastructure.gce.regions;

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
     * Add Google Cloud Region Setting
     * 
     * @param infrastructureId Id of the Google Cloud Connect infrastructure resource (required)
     * @param region Google Cloud Region. (required)
     * @param gceAccountRegionSettings The Google Cloud Region Settings to be added (required)
     * @return GceAccountRegionSettings
     * @throws BitmovinException if fails to make API call
     */
    public GceAccountRegionSettings create(String infrastructureId, GoogleCloudRegion region, GceAccountRegionSettings gceAccountRegionSettings) throws BitmovinException {
        try {
            return this.apiClient.create(infrastructureId, region, gceAccountRegionSettings).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * Delete Google Cloud Region Settings
     * 
     * @param infrastructureId Id of the Google Cloud Connect infrastructure resource (required)
     * @param region Google Cloud Region (required)
     * @return GceAccountRegionSettings
     * @throws BitmovinException if fails to make API call
     */
    public GceAccountRegionSettings delete(String infrastructureId, GoogleCloudRegion region) throws BitmovinException {
        try {
            return this.apiClient.delete(infrastructureId, region).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * Google Cloud Region Settings Details
     * 
     * @param infrastructureId Id of the Google Cloud Connect infrastructure resource (required)
     * @param region Google Cloud region. (required)
     * @return GceAccountRegionSettings
     * @throws BitmovinException if fails to make API call
     */
    public GceAccountRegionSettings get(String infrastructureId, GoogleCloudRegion region) throws BitmovinException {
        try {
            return this.apiClient.get(infrastructureId, region).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * List Google Cloud Region Settings
     * 
     * @param infrastructureId Id of the Google Cloud Connect infrastructure resource (required)
     * @return List&lt;GceAccountRegionSettings&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<GceAccountRegionSettings> list(String infrastructureId) throws BitmovinException {
        try {
            return this.apiClient.list(infrastructureId, new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * List Google Cloud Region Settings
     * 
     * @param infrastructureId Id of the Google Cloud Connect infrastructure resource (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;GceAccountRegionSettings&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<GceAccountRegionSettings> list(String infrastructureId, GceAccountRegionSettingsListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(infrastructureId, new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface RegionsApiClient { 
        @RequestLine("POST /encoding/infrastructure/gce/{infrastructure_id}/regions/{region}")
        ResponseEnvelope<GceAccountRegionSettings> create(@Param(value = "infrastructure_id") String infrastructureId, @Param(value = "region") GoogleCloudRegion region, GceAccountRegionSettings gceAccountRegionSettings) throws BitmovinException;
   
        @RequestLine("DELETE /encoding/infrastructure/gce/{infrastructure_id}/regions/{region}")
        ResponseEnvelope<GceAccountRegionSettings> delete(@Param(value = "infrastructure_id") String infrastructureId, @Param(value = "region") GoogleCloudRegion region) throws BitmovinException;
   
        @RequestLine("GET /encoding/infrastructure/gce/{infrastructure_id}/regions/{region}")
        ResponseEnvelope<GceAccountRegionSettings> get(@Param(value = "infrastructure_id") String infrastructureId, @Param(value = "region") GoogleCloudRegion region) throws BitmovinException;
   
        @RequestLine("GET /encoding/infrastructure/gce/{infrastructure_id}/regions")
        ResponseEnvelope<PaginationResponse<GceAccountRegionSettings>> list(@Param(value = "infrastructure_id") String infrastructureId, @QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    }
}
