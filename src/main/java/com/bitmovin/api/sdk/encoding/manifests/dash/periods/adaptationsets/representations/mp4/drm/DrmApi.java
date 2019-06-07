package com.bitmovin.api.sdk.encoding.manifests.dash.periods.adaptationsets.representations.mp4.drm;

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

public class DrmApi {

    private final DrmApiClient apiClient;

    public DrmApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(DrmApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of DrmApi
     */
    public static BitmovinApiBuilder<DrmApi> builder() {
        return new BitmovinApiBuilder<>(DrmApi.class);
    }
    
    /**
     * Add DRM MP4 Representation
     * 
     * @param manifestId Id of the manifest (required)
     * @param periodId Id of the period (required)
     * @param adaptationsetId Id of the adaptation set (required)
     * @param dashMp4DrmRepresentation The DRM MP4 representation to be added to the adaptation set (required)
     * @return DashMp4DrmRepresentation
     * @throws BitmovinException if fails to make API call
     */
    public DashMp4DrmRepresentation create(String manifestId, String periodId, String adaptationsetId, DashMp4DrmRepresentation dashMp4DrmRepresentation) throws BitmovinException {
        return this.apiClient.create(manifestId, periodId, adaptationsetId, dashMp4DrmRepresentation).getData().getResult();
    }
    
    /**
     * Delete DRM MP4 Representation
     * 
     * @param manifestId Id of the manifest (required)
     * @param periodId Id of the period (required)
     * @param adaptationsetId Id of the adaptation set (required)
     * @param representationId Id of the DRM MP4 representation to be deleted (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse delete(String manifestId, String periodId, String adaptationsetId, String representationId) throws BitmovinException {
        return this.apiClient.delete(manifestId, periodId, adaptationsetId, representationId).getData().getResult();
    }
    
    /**
     * DRM MP4 Representation Details
     * 
     * @param manifestId Id of the manifest (required)
     * @param periodId Id of the period (required)
     * @param adaptationsetId Id of the adaptation set (required)
     * @param representationId Id of the representation (required)
     * @return DashMp4DrmRepresentation
     * @throws BitmovinException if fails to make API call
     */
    public DashMp4DrmRepresentation get(String manifestId, String periodId, String adaptationsetId, String representationId) throws BitmovinException {
        return this.apiClient.get(manifestId, periodId, adaptationsetId, representationId).getData().getResult();
    }
    
    /**
     * List all DRM MP4 Representations
     * 
     * @param manifestId Id of the manifest (required)
     * @param periodId Id of the period (required)
     * @param adaptationsetId Id of the adaptation set (required)
     * @return List&lt;DashMp4DrmRepresentation&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<DashMp4DrmRepresentation> list(String manifestId, String periodId, String adaptationsetId) throws BitmovinException {
        return this.apiClient.list(manifestId, periodId, adaptationsetId, new HashMap<String, Object>()).getData().getResult();
    }
    /**
     * List all DRM MP4 Representations
     * 
     * @param manifestId Id of the manifest (required)
     * @param periodId Id of the period (required)
     * @param adaptationsetId Id of the adaptation set (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;DashMp4DrmRepresentation&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<DashMp4DrmRepresentation> list(String manifestId, String periodId, String adaptationsetId, DashMp4DrmRepresentationListQueryParams queryParams) throws BitmovinException {
        return this.apiClient.list(manifestId, periodId, adaptationsetId, queryParams).getData().getResult();
    }
    
    interface DrmApiClient {
    
        @RequestLine("POST /encoding/manifests/dash/{manifest_id}/periods/{period_id}/adaptationsets/{adaptationset_id}/representations/mp4/drm")
        ResponseEnvelope<DashMp4DrmRepresentation> create(@Param(value = "manifest_id") String manifestId, @Param(value = "period_id") String periodId, @Param(value = "adaptationset_id") String adaptationsetId, DashMp4DrmRepresentation dashMp4DrmRepresentation) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/manifests/dash/{manifest_id}/periods/{period_id}/adaptationsets/{adaptationset_id}/representations/mp4/drm/{representation_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "manifest_id") String manifestId, @Param(value = "period_id") String periodId, @Param(value = "adaptationset_id") String adaptationsetId, @Param(value = "representation_id") String representationId) throws BitmovinException;
    
        @RequestLine("GET /encoding/manifests/dash/{manifest_id}/periods/{period_id}/adaptationsets/{adaptationset_id}/representations/mp4/drm/{representation_id}")
        ResponseEnvelope<DashMp4DrmRepresentation> get(@Param(value = "manifest_id") String manifestId, @Param(value = "period_id") String periodId, @Param(value = "adaptationset_id") String adaptationsetId, @Param(value = "representation_id") String representationId) throws BitmovinException;
    
        @RequestLine("GET /encoding/manifests/dash/{manifest_id}/periods/{period_id}/adaptationsets/{adaptationset_id}/representations/mp4/drm")
        ResponseEnvelope<PaginationResponse<DashMp4DrmRepresentation>> list(@Param(value = "manifest_id") String manifestId, @Param(value = "period_id") String periodId, @Param(value = "adaptationset_id") String adaptationsetId, @QueryMap Map<String, Object> queryParams) throws BitmovinException;
    }
}
