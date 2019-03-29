package com.bitmovin.api.sdk.encoding.manifests.dash.periods.adaptationsets.representations.sidecar;

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

public class SidecarApi {

    private final SidecarApiClient apiClient;

    public SidecarApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(SidecarApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of SidecarApi
     */
    public static BitmovinApiBuilder<SidecarApi> builder() {
        return new BitmovinApiBuilder<>(SidecarApi.class);
    }
    
    /**
     * Add Sidecar Representation
     * 
     * @param manifestId Id of the manifest (required)
     * @param periodId Id of the period (required)
     * @param adaptationsetId Id of the adaptation set (required)
     * @param dashSidecarRepresentation The sidecar representation to be added to the adaptation set (optional)
     * @return DashSidecarRepresentation
     * @throws BitmovinException if fails to make API call
     */
    public DashSidecarRepresentation create(String manifestId, String periodId, String adaptationsetId, DashSidecarRepresentation dashSidecarRepresentation) throws BitmovinException {
        return this.apiClient.create(manifestId, periodId, adaptationsetId, dashSidecarRepresentation).getData().getResult();
    }
    
    /**
     * Delete Sidecar Representation
     * 
     * @param manifestId Id of the manifest (required)
     * @param periodId Id of the period (required)
     * @param adaptationsetId Id of the adaptation set (required)
     * @param representationId Id of the Sidecar representation to be deleted (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse delete(String manifestId, String periodId, String adaptationsetId, String representationId) throws BitmovinException {
        return this.apiClient.delete(manifestId, periodId, adaptationsetId, representationId).getData().getResult();
    }
    
    /**
     * Sidecar Representation Details
     * 
     * @param manifestId Id of the manifest (required)
     * @param periodId Id of the period (required)
     * @param adaptationsetId Id of the adaptation set (required)
     * @param representationId Id of the representation (required)
     * @return DashSidecarRepresentation
     * @throws BitmovinException if fails to make API call
     */
    public DashSidecarRepresentation get(String manifestId, String periodId, String adaptationsetId, String representationId) throws BitmovinException {
        return this.apiClient.get(manifestId, periodId, adaptationsetId, representationId).getData().getResult();
    }
    
    /**
     * List all Sidecar Representations
     * 
     * @param manifestId Id of the manifest (required)
     * @param periodId Id of the period (required)
     * @param adaptationsetId Id of the adaptation set (required)
     * @return List&lt;DashSidecarRepresentation&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<DashSidecarRepresentation> list(String manifestId, String periodId, String adaptationsetId) throws BitmovinException {
        return this.apiClient.list(manifestId, periodId, adaptationsetId, new HashMap<String, Object>()).getData().getResult();
    }
    /**
     * List all Sidecar Representations
     * 
     * @param manifestId Id of the manifest (required)
     * @param periodId Id of the period (required)
     * @param adaptationsetId Id of the adaptation set (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;DashSidecarRepresentation&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<DashSidecarRepresentation> list(String manifestId, String periodId, String adaptationsetId, DashSidecarRepresentationListQueryParams queryParams) throws BitmovinException {
        return this.apiClient.list(manifestId, periodId, adaptationsetId, queryParams).getData().getResult();
    }
    
    interface SidecarApiClient {
    
        @RequestLine("POST /encoding/manifests/dash/{manifest_id}/periods/{period_id}/adaptationsets/{adaptationset_id}/representations/sidecar")
        ResponseEnvelope<DashSidecarRepresentation> create(@Param(value = "manifest_id") String manifestId, @Param(value = "period_id") String periodId, @Param(value = "adaptationset_id") String adaptationsetId, DashSidecarRepresentation dashSidecarRepresentation) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/manifests/dash/{manifest_id}/periods/{period_id}/adaptationsets/{adaptationset_id}/representations/sidecar/{representation_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "manifest_id") String manifestId, @Param(value = "period_id") String periodId, @Param(value = "adaptationset_id") String adaptationsetId, @Param(value = "representation_id") String representationId) throws BitmovinException;
    
        @RequestLine("GET /encoding/manifests/dash/{manifest_id}/periods/{period_id}/adaptationsets/{adaptationset_id}/representations/sidecar/{representation_id}")
        ResponseEnvelope<DashSidecarRepresentation> get(@Param(value = "manifest_id") String manifestId, @Param(value = "period_id") String periodId, @Param(value = "adaptationset_id") String adaptationsetId, @Param(value = "representation_id") String representationId) throws BitmovinException;
    
        @RequestLine("GET /encoding/manifests/dash/{manifest_id}/periods/{period_id}/adaptationsets/{adaptationset_id}/representations/sidecar")
        ResponseEnvelope<PaginationResponse<DashSidecarRepresentation>> list(@Param(value = "manifest_id") String manifestId, @Param(value = "period_id") String periodId, @Param(value = "adaptationset_id") String adaptationsetId, @QueryMap Map<String, Object> queryParams) throws BitmovinException;
    }
}
