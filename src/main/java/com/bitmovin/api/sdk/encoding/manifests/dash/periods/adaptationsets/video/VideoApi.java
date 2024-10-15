package com.bitmovin.api.sdk.encoding.manifests.dash.periods.adaptationsets.video;

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

public class VideoApi {

    private final VideoApiClient apiClient;

    public VideoApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(VideoApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of VideoApi
     */
    public static BitmovinApiBuilder<VideoApi> builder() {
        return new BitmovinApiBuilder<>(VideoApi.class);
    }
    /**
     * Add Video AdaptationSet
     * 
     * @param manifestId Id of the manifest (required)
     * @param periodId Id of the period (required)
     * @param videoAdaptationSet The video adaptation set to be added to the period (required)
     * @return VideoAdaptationSet
     * @throws BitmovinException if fails to make API call
     */
    public VideoAdaptationSet create(String manifestId, String periodId, VideoAdaptationSet videoAdaptationSet) throws BitmovinException {
        try {
            return this.apiClient.create(manifestId, periodId, videoAdaptationSet).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * Delete Video AdaptationSet
     * 
     * @param manifestId Id of the manifest (required)
     * @param periodId Id of the period (required)
     * @param adaptationsetId Id of the video adaptation set to be deleted (required)
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
     * Video AdaptationSet Details
     * 
     * @param manifestId Id of the manifest (required)
     * @param periodId Id of the period (required)
     * @param adaptationsetId Id of the video adaptation set (required)
     * @return VideoAdaptationSet
     * @throws BitmovinException if fails to make API call
     */
    public VideoAdaptationSet get(String manifestId, String periodId, String adaptationsetId) throws BitmovinException {
        try {
            return this.apiClient.get(manifestId, periodId, adaptationsetId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * List all Video AdaptationSets
     * 
     * @param manifestId Id of the manifest (required)
     * @param periodId Id of the period (required)
     * @return List&lt;VideoAdaptationSet&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<VideoAdaptationSet> list(String manifestId, String periodId) throws BitmovinException {
        try {
            return this.apiClient.list(manifestId, periodId, new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * List all Video AdaptationSets
     * 
     * @param manifestId Id of the manifest (required)
     * @param periodId Id of the period (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;VideoAdaptationSet&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<VideoAdaptationSet> list(String manifestId, String periodId, VideoAdaptationSetListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(manifestId, periodId, new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface VideoApiClient { 
        @RequestLine("POST /encoding/manifests/dash/{manifest_id}/periods/{period_id}/adaptationsets/video")
        ResponseEnvelope<VideoAdaptationSet> create(@Param(value = "manifest_id") String manifestId, @Param(value = "period_id") String periodId, VideoAdaptationSet videoAdaptationSet) throws BitmovinException;
   
        @RequestLine("DELETE /encoding/manifests/dash/{manifest_id}/periods/{period_id}/adaptationsets/video/{adaptationset_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "manifest_id") String manifestId, @Param(value = "period_id") String periodId, @Param(value = "adaptationset_id") String adaptationsetId) throws BitmovinException;
   
        @RequestLine("GET /encoding/manifests/dash/{manifest_id}/periods/{period_id}/adaptationsets/video/{adaptationset_id}")
        ResponseEnvelope<VideoAdaptationSet> get(@Param(value = "manifest_id") String manifestId, @Param(value = "period_id") String periodId, @Param(value = "adaptationset_id") String adaptationsetId) throws BitmovinException;
   
        @RequestLine("GET /encoding/manifests/dash/{manifest_id}/periods/{period_id}/adaptationsets/video")
        ResponseEnvelope<PaginationResponse<VideoAdaptationSet>> list(@Param(value = "manifest_id") String manifestId, @Param(value = "period_id") String periodId, @QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    }
}
