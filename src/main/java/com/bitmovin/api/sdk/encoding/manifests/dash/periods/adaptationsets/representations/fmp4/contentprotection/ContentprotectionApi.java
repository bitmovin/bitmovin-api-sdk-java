package com.bitmovin.api.sdk.encoding.manifests.dash.periods.adaptationsets.representations.fmp4.contentprotection;

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

public class ContentprotectionApi {

    private final ContentprotectionApiClient apiClient;

    public ContentprotectionApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(ContentprotectionApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of ContentprotectionApi
     */
    public static BitmovinApiBuilder<ContentprotectionApi> builder() {
        return new BitmovinApiBuilder<>(ContentprotectionApi.class);
    }
    /**
     * Add Content Protection to fMP4 Representation
     * 
     * @param manifestId Id of the manifest (required)
     * @param periodId Id of the period (required)
     * @param adaptationsetId Id of the adaptation set (required)
     * @param representationId Id of the representation (required)
     * @param contentProtection The content protection to be added to the fMP4 representation (required)
     * @return ContentProtection
     * @throws BitmovinException if fails to make API call
     */
    public ContentProtection create(String manifestId, String periodId, String adaptationsetId, String representationId, ContentProtection contentProtection) throws BitmovinException {
        try {
            return this.apiClient.create(manifestId, periodId, adaptationsetId, representationId, contentProtection).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * Delete fMP4 Representation Content Protection
     * 
     * @param manifestId Id of the manifest (required)
     * @param periodId Id of the period (required)
     * @param adaptationsetId Id of the adaptation set (required)
     * @param representationId Id of the representation (required)
     * @param contentprotectionId Id of the DRM fMP4 content protection to be deleted (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse delete(String manifestId, String periodId, String adaptationsetId, String representationId, String contentprotectionId) throws BitmovinException {
        try {
            return this.apiClient.delete(manifestId, periodId, adaptationsetId, representationId, contentprotectionId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * fMP4 Representation Content Protection Details
     * 
     * @param manifestId Id of the manifest (required)
     * @param periodId Id of the period (required)
     * @param adaptationsetId Id of the adaptation set (required)
     * @param representationId Id of the representation (required)
     * @param contentprotectionId Id of the DRM fMP4 content protection (required)
     * @return ContentProtection
     * @throws BitmovinException if fails to make API call
     */
    public ContentProtection get(String manifestId, String periodId, String adaptationsetId, String representationId, String contentprotectionId) throws BitmovinException {
        try {
            return this.apiClient.get(manifestId, periodId, adaptationsetId, representationId, contentprotectionId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * List all fMP4 Representation Content Protections
     * 
     * @param manifestId Id of the manifest (required)
     * @param periodId Id of the period (required)
     * @param adaptationsetId Id of the adaptation set (required)
     * @param representationId Id of the representation (required)
     * @return List&lt;ContentProtection&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<ContentProtection> list(String manifestId, String periodId, String adaptationsetId, String representationId) throws BitmovinException {
        try {
            return this.apiClient.list(manifestId, periodId, adaptationsetId, representationId, new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * List all fMP4 Representation Content Protections
     * 
     * @param manifestId Id of the manifest (required)
     * @param periodId Id of the period (required)
     * @param adaptationsetId Id of the adaptation set (required)
     * @param representationId Id of the representation (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;ContentProtection&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<ContentProtection> list(String manifestId, String periodId, String adaptationsetId, String representationId, ContentProtectionListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(manifestId, periodId, adaptationsetId, representationId, new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface ContentprotectionApiClient { 
        @RequestLine("POST /encoding/manifests/dash/{manifest_id}/periods/{period_id}/adaptationsets/{adaptationset_id}/representations/fmp4/{representation_id}/contentprotection")
        ResponseEnvelope<ContentProtection> create(@Param(value = "manifest_id") String manifestId, @Param(value = "period_id") String periodId, @Param(value = "adaptationset_id") String adaptationsetId, @Param(value = "representation_id") String representationId, ContentProtection contentProtection) throws BitmovinException;
   
        @RequestLine("DELETE /encoding/manifests/dash/{manifest_id}/periods/{period_id}/adaptationsets/{adaptationset_id}/representations/fmp4/{representation_id}/contentprotection/{contentprotection_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "manifest_id") String manifestId, @Param(value = "period_id") String periodId, @Param(value = "adaptationset_id") String adaptationsetId, @Param(value = "representation_id") String representationId, @Param(value = "contentprotection_id") String contentprotectionId) throws BitmovinException;
   
        @RequestLine("GET /encoding/manifests/dash/{manifest_id}/periods/{period_id}/adaptationsets/{adaptationset_id}/representations/fmp4/{representation_id}/contentprotection/{contentprotection_id}")
        ResponseEnvelope<ContentProtection> get(@Param(value = "manifest_id") String manifestId, @Param(value = "period_id") String periodId, @Param(value = "adaptationset_id") String adaptationsetId, @Param(value = "representation_id") String representationId, @Param(value = "contentprotection_id") String contentprotectionId) throws BitmovinException;
   
        @RequestLine("GET /encoding/manifests/dash/{manifest_id}/periods/{period_id}/adaptationsets/{adaptationset_id}/representations/fmp4/{representation_id}/contentprotection")
        ResponseEnvelope<PaginationResponse<ContentProtection>> list(@Param(value = "manifest_id") String manifestId, @Param(value = "period_id") String periodId, @Param(value = "adaptationset_id") String adaptationsetId, @Param(value = "representation_id") String representationId, @QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    }
}
