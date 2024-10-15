package com.bitmovin.api.sdk.encoding.manifests.dash.periods.adaptationsets.representations.webm;

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
import com.bitmovin.api.sdk.encoding.manifests.dash.periods.adaptationsets.representations.webm.contentprotection.ContentprotectionApi;

public class WebmApi {
    public final ContentprotectionApi contentprotection;

    private final WebmApiClient apiClient;

    public WebmApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(WebmApiClient.class);

        this.contentprotection = new ContentprotectionApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of WebmApi
     */
    public static BitmovinApiBuilder<WebmApi> builder() {
        return new BitmovinApiBuilder<>(WebmApi.class);
    }
    /**
     * Add WebM Representation
     * 
     * @param manifestId Id of the manifest (required)
     * @param periodId Id of the period (required)
     * @param adaptationsetId Id of the adaptation set (required)
     * @param dashWebmRepresentation The WebM representation to be added to the adaptation set (required)
     * @return DashWebmRepresentation
     * @throws BitmovinException if fails to make API call
     */
    public DashWebmRepresentation create(String manifestId, String periodId, String adaptationsetId, DashWebmRepresentation dashWebmRepresentation) throws BitmovinException {
        try {
            return this.apiClient.create(manifestId, periodId, adaptationsetId, dashWebmRepresentation).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * Delete WebM Representation
     * 
     * @param manifestId Id of the manifest (required)
     * @param periodId Id of the period (required)
     * @param adaptationsetId Id of the adaptation set (required)
     * @param representationId Id of the WebM representation to be deleted (required)
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
     * WebM Representation Details
     * 
     * @param manifestId Id of the manifest (required)
     * @param periodId Id of the period (required)
     * @param adaptationsetId Id of the adaptation set (required)
     * @param representationId Id of the representation (required)
     * @return DashWebmRepresentation
     * @throws BitmovinException if fails to make API call
     */
    public DashWebmRepresentation get(String manifestId, String periodId, String adaptationsetId, String representationId) throws BitmovinException {
        try {
            return this.apiClient.get(manifestId, periodId, adaptationsetId, representationId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * List all WebM Representations
     * 
     * @param manifestId Id of the manifest (required)
     * @param periodId Id of the period (required)
     * @param adaptationsetId Id of the adaptation set (required)
     * @return List&lt;DashWebmRepresentation&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<DashWebmRepresentation> list(String manifestId, String periodId, String adaptationsetId) throws BitmovinException {
        try {
            return this.apiClient.list(manifestId, periodId, adaptationsetId, new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * List all WebM Representations
     * 
     * @param manifestId Id of the manifest (required)
     * @param periodId Id of the period (required)
     * @param adaptationsetId Id of the adaptation set (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;DashWebmRepresentation&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<DashWebmRepresentation> list(String manifestId, String periodId, String adaptationsetId, DashWebmRepresentationListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(manifestId, periodId, adaptationsetId, new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface WebmApiClient { 
        @RequestLine("POST /encoding/manifests/dash/{manifest_id}/periods/{period_id}/adaptationsets/{adaptationset_id}/representations/webm")
        ResponseEnvelope<DashWebmRepresentation> create(@Param(value = "manifest_id") String manifestId, @Param(value = "period_id") String periodId, @Param(value = "adaptationset_id") String adaptationsetId, DashWebmRepresentation dashWebmRepresentation) throws BitmovinException;
   
        @RequestLine("DELETE /encoding/manifests/dash/{manifest_id}/periods/{period_id}/adaptationsets/{adaptationset_id}/representations/webm/{representation_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "manifest_id") String manifestId, @Param(value = "period_id") String periodId, @Param(value = "adaptationset_id") String adaptationsetId, @Param(value = "representation_id") String representationId) throws BitmovinException;
   
        @RequestLine("GET /encoding/manifests/dash/{manifest_id}/periods/{period_id}/adaptationsets/{adaptationset_id}/representations/webm/{representation_id}")
        ResponseEnvelope<DashWebmRepresentation> get(@Param(value = "manifest_id") String manifestId, @Param(value = "period_id") String periodId, @Param(value = "adaptationset_id") String adaptationsetId, @Param(value = "representation_id") String representationId) throws BitmovinException;
   
        @RequestLine("GET /encoding/manifests/dash/{manifest_id}/periods/{period_id}/adaptationsets/{adaptationset_id}/representations/webm")
        ResponseEnvelope<PaginationResponse<DashWebmRepresentation>> list(@Param(value = "manifest_id") String manifestId, @Param(value = "period_id") String periodId, @Param(value = "adaptationset_id") String adaptationsetId, @QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    }
}
