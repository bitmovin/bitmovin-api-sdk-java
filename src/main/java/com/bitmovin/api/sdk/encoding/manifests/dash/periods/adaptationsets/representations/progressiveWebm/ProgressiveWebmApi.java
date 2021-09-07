package com.bitmovin.api.sdk.encoding.manifests.dash.periods.adaptationsets.representations.progressiveWebm;

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

public class ProgressiveWebmApi {

    private final ProgressiveWebmApiClient apiClient;

    public ProgressiveWebmApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(ProgressiveWebmApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of ProgressiveWebmApi
     */
    public static BitmovinApiBuilder<ProgressiveWebmApi> builder() {
        return new BitmovinApiBuilder<>(ProgressiveWebmApi.class);
    }

    /**
     * Add Progressive WebM Representation
     * 
     * @param manifestId Id of the manifest (required)
     * @param periodId Id of the period (required)
     * @param adaptationsetId Id of the adaptation set (required)
     * @param dashProgressiveWebmRepresentation The Progressive WebM representation to be added to the adaptation set (required)
     * @return DashProgressiveWebmRepresentation
     * @throws BitmovinException if fails to make API call
     */
    public DashProgressiveWebmRepresentation create(String manifestId, String periodId, String adaptationsetId, DashProgressiveWebmRepresentation dashProgressiveWebmRepresentation) throws BitmovinException {
        try {
            return this.apiClient.create(manifestId, periodId, adaptationsetId, dashProgressiveWebmRepresentation).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * Delete Progressive WebM Representation
     * 
     * @param manifestId Id of the manifest (required)
     * @param periodId Id of the period (required)
     * @param adaptationsetId Id of the adaptation set (required)
     * @param representationId Id of the Progressive WebM representation to be deleted (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse delete(String manifestId, String periodId, String adaptationsetId, String representationId) throws BitmovinException {
        try {
            return this.apiClient.delete(manifestId, periodId, adaptationsetId, representationId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * Progressive WebM Representation Details
     * 
     * @param manifestId Id of the manifest (required)
     * @param periodId Id of the period (required)
     * @param adaptationsetId Id of the adaptation set (required)
     * @param representationId Id of the representation (required)
     * @return DashProgressiveWebmRepresentation
     * @throws BitmovinException if fails to make API call
     */
    public DashProgressiveWebmRepresentation get(String manifestId, String periodId, String adaptationsetId, String representationId) throws BitmovinException {
        try {
            return this.apiClient.get(manifestId, periodId, adaptationsetId, representationId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * List all Progressive WebM Representations
     * 
     * @param manifestId Id of the manifest (required)
     * @param periodId Id of the period (required)
     * @param adaptationsetId Id of the adaptation set (required)
     * @return List&lt;DashProgressiveWebmRepresentation&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<DashProgressiveWebmRepresentation> list(String manifestId, String periodId, String adaptationsetId) throws BitmovinException {
        try {
            return this.apiClient.list(manifestId, periodId, adaptationsetId, new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * List all Progressive WebM Representations
     * 
     * @param manifestId Id of the manifest (required)
     * @param periodId Id of the period (required)
     * @param adaptationsetId Id of the adaptation set (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;DashProgressiveWebmRepresentation&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<DashProgressiveWebmRepresentation> list(String manifestId, String periodId, String adaptationsetId, DashProgressiveWebmRepresentationListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(manifestId, periodId, adaptationsetId, new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface ProgressiveWebmApiClient {

        @RequestLine("POST /encoding/manifests/dash/{manifest_id}/periods/{period_id}/adaptationsets/{adaptationset_id}/representations/progressive-webm")
        ResponseEnvelope<DashProgressiveWebmRepresentation> create(@Param(value = "manifest_id") String manifestId, @Param(value = "period_id") String periodId, @Param(value = "adaptationset_id") String adaptationsetId, DashProgressiveWebmRepresentation dashProgressiveWebmRepresentation) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/manifests/dash/{manifest_id}/periods/{period_id}/adaptationsets/{adaptationset_id}/representations/progressive-webm/{representation_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "manifest_id") String manifestId, @Param(value = "period_id") String periodId, @Param(value = "adaptationset_id") String adaptationsetId, @Param(value = "representation_id") String representationId) throws BitmovinException;
    
        @RequestLine("GET /encoding/manifests/dash/{manifest_id}/periods/{period_id}/adaptationsets/{adaptationset_id}/representations/progressive-webm/{representation_id}")
        ResponseEnvelope<DashProgressiveWebmRepresentation> get(@Param(value = "manifest_id") String manifestId, @Param(value = "period_id") String periodId, @Param(value = "adaptationset_id") String adaptationsetId, @Param(value = "representation_id") String representationId) throws BitmovinException;
    
        @RequestLine("GET /encoding/manifests/dash/{manifest_id}/periods/{period_id}/adaptationsets/{adaptationset_id}/representations/progressive-webm")
        ResponseEnvelope<PaginationResponse<DashProgressiveWebmRepresentation>> list(@Param(value = "manifest_id") String manifestId, @Param(value = "period_id") String periodId, @Param(value = "adaptationset_id") String adaptationsetId, @QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    }
}
