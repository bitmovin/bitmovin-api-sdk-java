package com.bitmovin.api.sdk.encoding.manifests.dash.periods.adaptationsets.subtitle;

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

public class SubtitleApi {

    private final SubtitleApiClient apiClient;

    public SubtitleApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(SubtitleApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of SubtitleApi
     */
    public static BitmovinApiBuilder<SubtitleApi> builder() {
        return new BitmovinApiBuilder<>(SubtitleApi.class);
    }
    /**
     * Add Subtitle AdaptationSet
     * 
     * @param manifestId Id of the manifest (required)
     * @param periodId Id of the period (required)
     * @param subtitleAdaptationSet The subtitle adaptation set to be added to the period (required)
     * @return SubtitleAdaptationSet
     * @throws BitmovinException if fails to make API call
     */
    public SubtitleAdaptationSet create(String manifestId, String periodId, SubtitleAdaptationSet subtitleAdaptationSet) throws BitmovinException {
        try {
            return this.apiClient.create(manifestId, periodId, subtitleAdaptationSet).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * Delete Subtitle AdaptationSet
     * 
     * @param manifestId Id of the manifest (required)
     * @param periodId Id of the period (required)
     * @param adaptationsetId Id of the subtitle adaptation set to be deleted (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse delete(String manifestId, String periodId, String adaptationsetId) throws BitmovinException {
        try {
            return this.apiClient.delete(manifestId, periodId, adaptationsetId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * Subtitle AdaptationSet Details
     * 
     * @param manifestId Id of the manifest (required)
     * @param periodId Id of the period (required)
     * @param adaptationsetId Id of the subtitle adaptation set (required)
     * @return SubtitleAdaptationSet
     * @throws BitmovinException if fails to make API call
     */
    public SubtitleAdaptationSet get(String manifestId, String periodId, String adaptationsetId) throws BitmovinException {
        try {
            return this.apiClient.get(manifestId, periodId, adaptationsetId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * List all Subtitle AdaptationSets
     * 
     * @param manifestId Id of the manifest (required)
     * @param periodId Id of the period (required)
     * @return List&lt;SubtitleAdaptationSet&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<SubtitleAdaptationSet> list(String manifestId, String periodId) throws BitmovinException {
        try {
            return this.apiClient.list(manifestId, periodId, new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * List all Subtitle AdaptationSets
     * 
     * @param manifestId Id of the manifest (required)
     * @param periodId Id of the period (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;SubtitleAdaptationSet&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<SubtitleAdaptationSet> list(String manifestId, String periodId, SubtitleAdaptationSetListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(manifestId, periodId, new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface SubtitleApiClient { 
        @RequestLine("POST /encoding/manifests/dash/{manifest_id}/periods/{period_id}/adaptationsets/subtitle")
        ResponseEnvelope<SubtitleAdaptationSet> create(@Param(value = "manifest_id") String manifestId, @Param(value = "period_id") String periodId, SubtitleAdaptationSet subtitleAdaptationSet) throws BitmovinException;
   
        @RequestLine("DELETE /encoding/manifests/dash/{manifest_id}/periods/{period_id}/adaptationsets/subtitle/{adaptationset_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "manifest_id") String manifestId, @Param(value = "period_id") String periodId, @Param(value = "adaptationset_id") String adaptationsetId) throws BitmovinException;
   
        @RequestLine("GET /encoding/manifests/dash/{manifest_id}/periods/{period_id}/adaptationsets/subtitle/{adaptationset_id}")
        ResponseEnvelope<SubtitleAdaptationSet> get(@Param(value = "manifest_id") String manifestId, @Param(value = "period_id") String periodId, @Param(value = "adaptationset_id") String adaptationsetId) throws BitmovinException;
   
        @RequestLine("GET /encoding/manifests/dash/{manifest_id}/periods/{period_id}/adaptationsets/subtitle")
        ResponseEnvelope<PaginationResponse<SubtitleAdaptationSet>> list(@Param(value = "manifest_id") String manifestId, @Param(value = "period_id") String periodId, @QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    }
}
