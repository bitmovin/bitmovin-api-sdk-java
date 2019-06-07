package com.bitmovin.api.sdk.encoding.manifests.dash.periods.adaptationsets.representations.cmaf.drm;

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
import com.bitmovin.api.sdk.encoding.manifests.dash.periods.adaptationsets.representations.cmaf.drm.contentprotection.ContentprotectionApi;

public class DrmApi {
    public final ContentprotectionApi contentprotection;

    private final DrmApiClient apiClient;

    public DrmApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(DrmApiClient.class);

        this.contentprotection = new ContentprotectionApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of DrmApi
     */
    public static BitmovinApiBuilder<DrmApi> builder() {
        return new BitmovinApiBuilder<>(DrmApi.class);
    }
    
    /**
     * Add DRM CMAF Representation
     * 
     * @param manifestId Id of the manifest (required)
     * @param periodId Id of the period (required)
     * @param adaptationsetId Id of the adaptation set (required)
     * @param dashCmafDrmRepresentation The DRM CMAF representation to be added to the adaptation set (required)
     * @return DashCmafDrmRepresentation
     * @throws BitmovinException if fails to make API call
     */
    public DashCmafDrmRepresentation create(String manifestId, String periodId, String adaptationsetId, DashCmafDrmRepresentation dashCmafDrmRepresentation) throws BitmovinException {
        return this.apiClient.create(manifestId, periodId, adaptationsetId, dashCmafDrmRepresentation).getData().getResult();
    }
    
    /**
     * Delete DRM CMAF Representation
     * 
     * @param manifestId Id of the manifest (required)
     * @param periodId Id of the period (required)
     * @param adaptationsetId Id of the adaptation set (required)
     * @param representationId Id of the DRM CMAF representation to be deleted (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse delete(String manifestId, String periodId, String adaptationsetId, String representationId) throws BitmovinException {
        return this.apiClient.delete(manifestId, periodId, adaptationsetId, representationId).getData().getResult();
    }
    
    /**
     * DRM CMAF Representation Details
     * 
     * @param manifestId Id of the manifest (required)
     * @param periodId Id of the period (required)
     * @param adaptationsetId Id of the adaptation set (required)
     * @param representationId Id of the representation (required)
     * @return DashCmafDrmRepresentation
     * @throws BitmovinException if fails to make API call
     */
    public DashCmafDrmRepresentation get(String manifestId, String periodId, String adaptationsetId, String representationId) throws BitmovinException {
        return this.apiClient.get(manifestId, periodId, adaptationsetId, representationId).getData().getResult();
    }
    
    /**
     * List all DRM CMAF Representations
     * 
     * @param manifestId Id of the manifest (required)
     * @param periodId Id of the period (required)
     * @param adaptationsetId Id of the adaptation set (required)
     * @return List&lt;DashCmafDrmRepresentation&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<DashCmafDrmRepresentation> list(String manifestId, String periodId, String adaptationsetId) throws BitmovinException {
        return this.apiClient.list(manifestId, periodId, adaptationsetId, new HashMap<String, Object>()).getData().getResult();
    }
    /**
     * List all DRM CMAF Representations
     * 
     * @param manifestId Id of the manifest (required)
     * @param periodId Id of the period (required)
     * @param adaptationsetId Id of the adaptation set (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;DashCmafDrmRepresentation&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<DashCmafDrmRepresentation> list(String manifestId, String periodId, String adaptationsetId, DashCmafDrmRepresentationListQueryParams queryParams) throws BitmovinException {
        return this.apiClient.list(manifestId, periodId, adaptationsetId, queryParams).getData().getResult();
    }
    
    interface DrmApiClient {
    
        @RequestLine("POST /encoding/manifests/dash/{manifest_id}/periods/{period_id}/adaptationsets/{adaptationset_id}/representations/cmaf/drm")
        ResponseEnvelope<DashCmafDrmRepresentation> create(@Param(value = "manifest_id") String manifestId, @Param(value = "period_id") String periodId, @Param(value = "adaptationset_id") String adaptationsetId, DashCmafDrmRepresentation dashCmafDrmRepresentation) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/manifests/dash/{manifest_id}/periods/{period_id}/adaptationsets/{adaptationset_id}/representations/cmaf/drm/{representation_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "manifest_id") String manifestId, @Param(value = "period_id") String periodId, @Param(value = "adaptationset_id") String adaptationsetId, @Param(value = "representation_id") String representationId) throws BitmovinException;
    
        @RequestLine("GET /encoding/manifests/dash/{manifest_id}/periods/{period_id}/adaptationsets/{adaptationset_id}/representations/cmaf/drm/{representation_id}")
        ResponseEnvelope<DashCmafDrmRepresentation> get(@Param(value = "manifest_id") String manifestId, @Param(value = "period_id") String periodId, @Param(value = "adaptationset_id") String adaptationsetId, @Param(value = "representation_id") String representationId) throws BitmovinException;
    
        @RequestLine("GET /encoding/manifests/dash/{manifest_id}/periods/{period_id}/adaptationsets/{adaptationset_id}/representations/cmaf/drm")
        ResponseEnvelope<PaginationResponse<DashCmafDrmRepresentation>> list(@Param(value = "manifest_id") String manifestId, @Param(value = "period_id") String periodId, @Param(value = "adaptationset_id") String adaptationsetId, @QueryMap Map<String, Object> queryParams) throws BitmovinException;
    }
}
