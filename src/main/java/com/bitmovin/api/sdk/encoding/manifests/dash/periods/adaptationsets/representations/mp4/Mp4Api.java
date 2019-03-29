package com.bitmovin.api.sdk.encoding.manifests.dash.periods.adaptationsets.representations.mp4;

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
import com.bitmovin.api.sdk.encoding.manifests.dash.periods.adaptationsets.representations.mp4.drm.DrmApi;

public class Mp4Api {
    public final DrmApi drm;

    private final Mp4ApiClient apiClient;

    public Mp4Api(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(Mp4ApiClient.class);

        this.drm = new DrmApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of Mp4Api
     */
    public static BitmovinApiBuilder<Mp4Api> builder() {
        return new BitmovinApiBuilder<>(Mp4Api.class);
    }
    
    /**
     * Add MP4 Representation
     * 
     * @param manifestId Id of the manifest (required)
     * @param periodId Id of the period (required)
     * @param adaptationsetId Id of the adaptation set (required)
     * @param dashMp4Representation The MP4 representation to be added to the adaptation set (optional)
     * @return DashMp4Representation
     * @throws BitmovinException if fails to make API call
     */
    public DashMp4Representation create(String manifestId, String periodId, String adaptationsetId, DashMp4Representation dashMp4Representation) throws BitmovinException {
        return this.apiClient.create(manifestId, periodId, adaptationsetId, dashMp4Representation).getData().getResult();
    }
    
    /**
     * Delete MP4 Representation
     * 
     * @param manifestId Id of the manifest (required)
     * @param periodId Id of the period (required)
     * @param adaptationsetId Id of the adaptation set (required)
     * @param representationId Id of the MP4 representation to be deleted (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse delete(String manifestId, String periodId, String adaptationsetId, String representationId) throws BitmovinException {
        return this.apiClient.delete(manifestId, periodId, adaptationsetId, representationId).getData().getResult();
    }
    
    /**
     * MP4 Representation Details
     * 
     * @param manifestId Id of the manifest (required)
     * @param periodId Id of the period (required)
     * @param adaptationsetId Id of the adaptation set (required)
     * @param representationId Id of the representation (required)
     * @return DashMp4Representation
     * @throws BitmovinException if fails to make API call
     */
    public DashMp4Representation get(String manifestId, String periodId, String adaptationsetId, String representationId) throws BitmovinException {
        return this.apiClient.get(manifestId, periodId, adaptationsetId, representationId).getData().getResult();
    }
    
    /**
     * List all MP4 Representations
     * 
     * @param manifestId Id of the manifest (required)
     * @param periodId Id of the period (required)
     * @param adaptationsetId Id of the adaptation set (required)
     * @return List&lt;DashMp4Representation&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<DashMp4Representation> list(String manifestId, String periodId, String adaptationsetId) throws BitmovinException {
        return this.apiClient.list(manifestId, periodId, adaptationsetId, new HashMap<String, Object>()).getData().getResult();
    }
    /**
     * List all MP4 Representations
     * 
     * @param manifestId Id of the manifest (required)
     * @param periodId Id of the period (required)
     * @param adaptationsetId Id of the adaptation set (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;DashMp4Representation&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<DashMp4Representation> list(String manifestId, String periodId, String adaptationsetId, DashMp4RepresentationListQueryParams queryParams) throws BitmovinException {
        return this.apiClient.list(manifestId, periodId, adaptationsetId, queryParams).getData().getResult();
    }
    
    interface Mp4ApiClient {
    
        @RequestLine("POST /encoding/manifests/dash/{manifest_id}/periods/{period_id}/adaptationsets/{adaptationset_id}/representations/mp4")
        ResponseEnvelope<DashMp4Representation> create(@Param(value = "manifest_id") String manifestId, @Param(value = "period_id") String periodId, @Param(value = "adaptationset_id") String adaptationsetId, DashMp4Representation dashMp4Representation) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/manifests/dash/{manifest_id}/periods/{period_id}/adaptationsets/{adaptationset_id}/representations/mp4/{representation_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "manifest_id") String manifestId, @Param(value = "period_id") String periodId, @Param(value = "adaptationset_id") String adaptationsetId, @Param(value = "representation_id") String representationId) throws BitmovinException;
    
        @RequestLine("GET /encoding/manifests/dash/{manifest_id}/periods/{period_id}/adaptationsets/{adaptationset_id}/representations/mp4/{representation_id}")
        ResponseEnvelope<DashMp4Representation> get(@Param(value = "manifest_id") String manifestId, @Param(value = "period_id") String periodId, @Param(value = "adaptationset_id") String adaptationsetId, @Param(value = "representation_id") String representationId) throws BitmovinException;
    
        @RequestLine("GET /encoding/manifests/dash/{manifest_id}/periods/{period_id}/adaptationsets/{adaptationset_id}/representations/mp4")
        ResponseEnvelope<PaginationResponse<DashMp4Representation>> list(@Param(value = "manifest_id") String manifestId, @Param(value = "period_id") String periodId, @Param(value = "adaptationset_id") String adaptationsetId, @QueryMap Map<String, Object> queryParams) throws BitmovinException;
    }
}
