package com.bitmovin.api.sdk.encoding.infrastructure.oci.regions;

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
     * Add OCI account region settings
     * 
     * @param infrastructureId Id of the OCI account (required)
     * @param region OCI region (required)
     * @param ociAccountRegionSettings The OCI account region settings to be added (required)
     * @return OciAccountRegionSettings
     * @throws BitmovinException if fails to make API call
     */
    public OciAccountRegionSettings create(String infrastructureId, OciCloudRegion region, OciAccountRegionSettings ociAccountRegionSettings) throws BitmovinException {
        try {
            return this.apiClient.create(infrastructureId, region, ociAccountRegionSettings).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * Delete OCI account region settings
     * 
     * @param infrastructureId Id of the OCI account (required)
     * @param region OCI region (required)
     * @return OciAccountRegionSettings
     * @throws BitmovinException if fails to make API call
     */
    public OciAccountRegionSettings delete(String infrastructureId, OciCloudRegion region) throws BitmovinException {
        try {
            return this.apiClient.delete(infrastructureId, region).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * OCI account region settings details
     * 
     * @param infrastructureId Id of the OCI account (required)
     * @param region OCI region (required)
     * @return OciAccountRegionSettings
     * @throws BitmovinException if fails to make API call
     */
    public OciAccountRegionSettings get(String infrastructureId, OciCloudRegion region) throws BitmovinException {
        try {
            return this.apiClient.get(infrastructureId, region).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * List OCI account region settings
     * 
     * @param infrastructureId Id of the OCI account (required)
     * @return List&lt;OciAccountRegionSettings&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<OciAccountRegionSettings> list(String infrastructureId) throws BitmovinException {
        try {
            return this.apiClient.list(infrastructureId, new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * List OCI account region settings
     * 
     * @param infrastructureId Id of the OCI account (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;OciAccountRegionSettings&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<OciAccountRegionSettings> list(String infrastructureId, OciAccountRegionSettingsListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(infrastructureId, new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface RegionsApiClient { 
        @RequestLine("POST /encoding/infrastructure/oci/{infrastructure_id}/regions/{region}")
        ResponseEnvelope<OciAccountRegionSettings> create(@Param(value = "infrastructure_id") String infrastructureId, @Param(value = "region") OciCloudRegion region, OciAccountRegionSettings ociAccountRegionSettings) throws BitmovinException;
   
        @RequestLine("DELETE /encoding/infrastructure/oci/{infrastructure_id}/regions/{region}")
        ResponseEnvelope<OciAccountRegionSettings> delete(@Param(value = "infrastructure_id") String infrastructureId, @Param(value = "region") OciCloudRegion region) throws BitmovinException;
   
        @RequestLine("GET /encoding/infrastructure/oci/{infrastructure_id}/regions/{region}")
        ResponseEnvelope<OciAccountRegionSettings> get(@Param(value = "infrastructure_id") String infrastructureId, @Param(value = "region") OciCloudRegion region) throws BitmovinException;
   
        @RequestLine("GET /encoding/infrastructure/oci/{infrastructure_id}/regions")
        ResponseEnvelope<PaginationResponse<OciAccountRegionSettings>> list(@Param(value = "infrastructure_id") String infrastructureId, @QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    }
}
