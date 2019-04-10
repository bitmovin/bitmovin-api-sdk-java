package com.bitmovin.api.sdk.encoding.manifests.dash.periods.adaptationsets.representations.cmaf;

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
import com.bitmovin.api.sdk.encoding.manifests.dash.periods.adaptationsets.representations.cmaf.drm.DrmApi;
import com.bitmovin.api.sdk.encoding.manifests.dash.periods.adaptationsets.representations.cmaf.contentprotection.ContentprotectionApi;

public class CmafApi {
    public final DrmApi drm;
    public final ContentprotectionApi contentprotection;

    private final CmafApiClient apiClient;

    public CmafApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(CmafApiClient.class);

        this.drm = new DrmApi(clientFactory);
        this.contentprotection = new ContentprotectionApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of CmafApi
     */
    public static BitmovinApiBuilder<CmafApi> builder() {
        return new BitmovinApiBuilder<>(CmafApi.class);
    }
    
    /**
     * Add CMAF Representation
     * 
     * @param manifestId Id of the manifest (required)
     * @param periodId Id of the period (required)
     * @param adaptationsetId Id of the adaptation set (required)
     * @param dashCmafRepresentation The CMAF representation to be added to the adaptation set (optional)
     * @return DashCmafRepresentation
     * @throws BitmovinException if fails to make API call
     */
    public DashCmafRepresentation create(String manifestId, String periodId, String adaptationsetId, DashCmafRepresentation dashCmafRepresentation) throws BitmovinException {
        return this.apiClient.create(manifestId, periodId, adaptationsetId, dashCmafRepresentation).getData().getResult();
    }
    
    /**
     * Delete CMAF Representation
     * 
     * @param manifestId Id of the manifest (required)
     * @param periodId Id of the period (required)
     * @param adaptationsetId Id of the adaptation set (required)
     * @param representationId Id of the CMAF representation to be deleted (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse delete(String manifestId, String periodId, String adaptationsetId, String representationId) throws BitmovinException {
        return this.apiClient.delete(manifestId, periodId, adaptationsetId, representationId).getData().getResult();
    }
    
    /**
     * CMAF Representation Details
     * 
     * @param manifestId Id of the manifest (required)
     * @param periodId Id of the period (required)
     * @param adaptationsetId Id of the adaptation set (required)
     * @param representationId Id of the representation (required)
     * @return DashCmafRepresentation
     * @throws BitmovinException if fails to make API call
     */
    public DashCmafRepresentation get(String manifestId, String periodId, String adaptationsetId, String representationId) throws BitmovinException {
        return this.apiClient.get(manifestId, periodId, adaptationsetId, representationId).getData().getResult();
    }
    
    /**
     * List all CMAF Representations
     * 
     * @param manifestId Id of the manifest (required)
     * @param periodId Id of the period (required)
     * @param adaptationsetId Id of the adaptation set (required)
     * @return List&lt;DashCmafRepresentation&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<DashCmafRepresentation> list(String manifestId, String periodId, String adaptationsetId) throws BitmovinException {
        return this.apiClient.list(manifestId, periodId, adaptationsetId, new HashMap<String, Object>()).getData().getResult();
    }
    /**
     * List all CMAF Representations
     * 
     * @param manifestId Id of the manifest (required)
     * @param periodId Id of the period (required)
     * @param adaptationsetId Id of the adaptation set (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;DashCmafRepresentation&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<DashCmafRepresentation> list(String manifestId, String periodId, String adaptationsetId, DashCmafRepresentationListQueryParams queryParams) throws BitmovinException {
        return this.apiClient.list(manifestId, periodId, adaptationsetId, queryParams).getData().getResult();
    }
    
    interface CmafApiClient {
    
        @RequestLine("POST /encoding/manifests/dash/{manifest_id}/periods/{period_id}/adaptationsets/{adaptationset_id}/representations/cmaf")
        ResponseEnvelope<DashCmafRepresentation> create(@Param(value = "manifest_id") String manifestId, @Param(value = "period_id") String periodId, @Param(value = "adaptationset_id") String adaptationsetId, DashCmafRepresentation dashCmafRepresentation) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/manifests/dash/{manifest_id}/periods/{period_id}/adaptationsets/{adaptationset_id}/representations/cmaf/{representation_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "manifest_id") String manifestId, @Param(value = "period_id") String periodId, @Param(value = "adaptationset_id") String adaptationsetId, @Param(value = "representation_id") String representationId) throws BitmovinException;
    
        @RequestLine("GET /encoding/manifests/dash/{manifest_id}/periods/{period_id}/adaptationsets/{adaptationset_id}/representations/cmaf/{representation_id}")
        ResponseEnvelope<DashCmafRepresentation> get(@Param(value = "manifest_id") String manifestId, @Param(value = "period_id") String periodId, @Param(value = "adaptationset_id") String adaptationsetId, @Param(value = "representation_id") String representationId) throws BitmovinException;
    
        @RequestLine("GET /encoding/manifests/dash/{manifest_id}/periods/{period_id}/adaptationsets/{adaptationset_id}/representations/cmaf")
        ResponseEnvelope<PaginationResponse<DashCmafRepresentation>> list(@Param(value = "manifest_id") String manifestId, @Param(value = "period_id") String periodId, @Param(value = "adaptationset_id") String adaptationsetId, @QueryMap Map<String, Object> queryParams) throws BitmovinException;
    }
}
