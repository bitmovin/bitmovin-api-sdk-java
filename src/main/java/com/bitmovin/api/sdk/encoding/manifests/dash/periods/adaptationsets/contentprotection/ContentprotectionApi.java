package com.bitmovin.api.sdk.encoding.manifests.dash.periods.adaptationsets.contentprotection;

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
     * Add Content Protection to AdaptationSet
     * 
     * @param manifestId Id of the manifest (required)
     * @param periodId Id of the period (required)
     * @param adaptationsetId Id of the adaptation set (required)
     * @param contentProtection The content protection to be added to the adaptation set (required)
     * @return ContentProtection
     * @throws BitmovinException if fails to make API call
     */
    public ContentProtection create(String manifestId, String periodId, String adaptationsetId, ContentProtection contentProtection) throws BitmovinException {
        try {
            return this.apiClient.create(manifestId, periodId, adaptationsetId, contentProtection).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * Delete AdaptationSet Content Protection
     * 
     * @param manifestId Id of the manifest (required)
     * @param periodId Id of the period (required)
     * @param adaptationsetId Id of the adaptation set (required)
     * @param contentprotectionId Id of the adaptation set content protection to be deleted (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse delete(String manifestId, String periodId, String adaptationsetId, String contentprotectionId) throws BitmovinException {
        try {
            return this.apiClient.delete(manifestId, periodId, adaptationsetId, contentprotectionId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * AdaptationSet Content Protection Details
     * 
     * @param manifestId Id of the manifest (required)
     * @param periodId Id of the period (required)
     * @param adaptationsetId Id of the adaptation set (required)
     * @param contentprotectionId Id of the adaptation set content protection (required)
     * @return ContentProtection
     * @throws BitmovinException if fails to make API call
     */
    public ContentProtection get(String manifestId, String periodId, String adaptationsetId, String contentprotectionId) throws BitmovinException {
        try {
            return this.apiClient.get(manifestId, periodId, adaptationsetId, contentprotectionId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * List all AdaptationSet Content Protections
     * 
     * @param manifestId Id of the manifest (required)
     * @param periodId Id of the period (required)
     * @param adaptationsetId Id of the adaptation set (required)
     * @return List&lt;ContentProtection&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<ContentProtection> list(String manifestId, String periodId, String adaptationsetId) throws BitmovinException {
        try {
            return this.apiClient.list(manifestId, periodId, adaptationsetId, new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * List all AdaptationSet Content Protections
     * 
     * @param manifestId Id of the manifest (required)
     * @param periodId Id of the period (required)
     * @param adaptationsetId Id of the adaptation set (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;ContentProtection&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<ContentProtection> list(String manifestId, String periodId, String adaptationsetId, ContentProtectionListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(manifestId, periodId, adaptationsetId, new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    interface ContentprotectionApiClient {
    
        @RequestLine("POST /encoding/manifests/dash/{manifest_id}/periods/{period_id}/adaptationsets/{adaptationset_id}/contentprotection")
        ResponseEnvelope<ContentProtection> create(@Param(value = "manifest_id") String manifestId, @Param(value = "period_id") String periodId, @Param(value = "adaptationset_id") String adaptationsetId, ContentProtection contentProtection) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/manifests/dash/{manifest_id}/periods/{period_id}/adaptationsets/{adaptationset_id}/contentprotection/{contentprotection_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "manifest_id") String manifestId, @Param(value = "period_id") String periodId, @Param(value = "adaptationset_id") String adaptationsetId, @Param(value = "contentprotection_id") String contentprotectionId) throws BitmovinException;
    
        @RequestLine("GET /encoding/manifests/dash/{manifest_id}/periods/{period_id}/adaptationsets/{adaptationset_id}/contentprotection/{contentprotection_id}")
        ResponseEnvelope<ContentProtection> get(@Param(value = "manifest_id") String manifestId, @Param(value = "period_id") String periodId, @Param(value = "adaptationset_id") String adaptationsetId, @Param(value = "contentprotection_id") String contentprotectionId) throws BitmovinException;
    
        @RequestLine("GET /encoding/manifests/dash/{manifest_id}/periods/{period_id}/adaptationsets/{adaptationset_id}/contentprotection")
        ResponseEnvelope<PaginationResponse<ContentProtection>> list(@Param(value = "manifest_id") String manifestId, @Param(value = "period_id") String periodId, @Param(value = "adaptationset_id") String adaptationsetId, @QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    }
}
