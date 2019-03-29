package com.bitmovin.api.sdk.encoding.manifests.dash.periods.adaptationsets.custom;

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

public class CustomApi {

    private final CustomApiClient apiClient;

    public CustomApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(CustomApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of CustomApi
     */
    public static BitmovinApiBuilder<CustomApi> builder() {
        return new BitmovinApiBuilder<>(CustomApi.class);
    }
    
    /**
     * Add Custom AdaptationSet
     * 
     * @param manifestId Id of the manifest (required)
     * @param periodId Id of the period (required)
     * @param adaptationSet The custom adaptation set to be added to the period (optional)
     * @return AdaptationSet
     * @throws BitmovinException if fails to make API call
     */
    public AdaptationSet create(String manifestId, String periodId, AdaptationSet adaptationSet) throws BitmovinException {
        return this.apiClient.create(manifestId, periodId, adaptationSet).getData().getResult();
    }
    
    /**
     * Delete Custom AdaptationSet
     * 
     * @param manifestId Id of the manifest (required)
     * @param periodId Id of the period (required)
     * @param adaptationsetId Id of the custom adaptation set to be deleted (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse delete(String manifestId, String periodId, String adaptationsetId) throws BitmovinException {
        return this.apiClient.delete(manifestId, periodId, adaptationsetId).getData().getResult();
    }
    
    /**
     * Custom AdaptationSet Details
     * 
     * @param manifestId Id of the manifest (required)
     * @param periodId Id of the period (required)
     * @param adaptationsetId Id of the custom adaptation set (required)
     * @return AdaptationSet
     * @throws BitmovinException if fails to make API call
     */
    public AdaptationSet get(String manifestId, String periodId, String adaptationsetId) throws BitmovinException {
        return this.apiClient.get(manifestId, periodId, adaptationsetId).getData().getResult();
    }
    
    /**
     * List all Custom AdaptationSets
     * 
     * @param manifestId Id of the manifest (required)
     * @param periodId Id of the period (required)
     * @return List&lt;AdaptationSet&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<AdaptationSet> list(String manifestId, String periodId) throws BitmovinException {
        return this.apiClient.list(manifestId, periodId, new HashMap<String, Object>()).getData().getResult();
    }
    /**
     * List all Custom AdaptationSets
     * 
     * @param manifestId Id of the manifest (required)
     * @param periodId Id of the period (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;AdaptationSet&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<AdaptationSet> list(String manifestId, String periodId, AdaptationSetListQueryParams queryParams) throws BitmovinException {
        return this.apiClient.list(manifestId, periodId, queryParams).getData().getResult();
    }
    
    interface CustomApiClient {
    
        @RequestLine("POST /encoding/manifests/dash/{manifest_id}/periods/{period_id}/adaptationsets/custom")
        ResponseEnvelope<AdaptationSet> create(@Param(value = "manifest_id") String manifestId, @Param(value = "period_id") String periodId, AdaptationSet adaptationSet) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/manifests/dash/{manifest_id}/periods/{period_id}/adaptationsets/custom/{adaptationset_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "manifest_id") String manifestId, @Param(value = "period_id") String periodId, @Param(value = "adaptationset_id") String adaptationsetId) throws BitmovinException;
    
        @RequestLine("GET /encoding/manifests/dash/{manifest_id}/periods/{period_id}/adaptationsets/custom/{adaptationset_id}")
        ResponseEnvelope<AdaptationSet> get(@Param(value = "manifest_id") String manifestId, @Param(value = "period_id") String periodId, @Param(value = "adaptationset_id") String adaptationsetId) throws BitmovinException;
    
        @RequestLine("GET /encoding/manifests/dash/{manifest_id}/periods/{period_id}/adaptationsets/custom")
        ResponseEnvelope<PaginationResponse<AdaptationSet>> list(@Param(value = "manifest_id") String manifestId, @Param(value = "period_id") String periodId, @QueryMap Map<String, Object> queryParams) throws BitmovinException;
    }
}
