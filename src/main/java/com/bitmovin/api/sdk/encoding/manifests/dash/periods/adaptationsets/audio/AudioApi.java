package com.bitmovin.api.sdk.encoding.manifests.dash.periods.adaptationsets.audio;

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

public class AudioApi {

    private final AudioApiClient apiClient;

    public AudioApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(AudioApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of AudioApi
     */
    public static BitmovinApiBuilder<AudioApi> builder() {
        return new BitmovinApiBuilder<>(AudioApi.class);
    }
    
    /**
     * Add Audio AdaptationSet
     * 
     * @param manifestId Id of the manifest (required)
     * @param periodId Id of the period (required)
     * @param audioAdaptationSet The audio adaptation set to be added to the period (required)
     * @return AudioAdaptationSet
     * @throws BitmovinException if fails to make API call
     */
    public AudioAdaptationSet create(String manifestId, String periodId, AudioAdaptationSet audioAdaptationSet) throws BitmovinException {
        try {
            return this.apiClient.create(manifestId, periodId, audioAdaptationSet).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * Delete Audio AdaptationSet
     * 
     * @param manifestId Id of the manifest (required)
     * @param periodId Id of the period (required)
     * @param adaptationsetId Id of the audio adaptation set to be deleted (required)
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
     * Audio AdaptationSet Details
     * 
     * @param manifestId Id of the manifest (required)
     * @param periodId Id of the period (required)
     * @param adaptationsetId Id of the audio adaptation set (required)
     * @return AudioAdaptationSet
     * @throws BitmovinException if fails to make API call
     */
    public AudioAdaptationSet get(String manifestId, String periodId, String adaptationsetId) throws BitmovinException {
        try {
            return this.apiClient.get(manifestId, periodId, adaptationsetId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * List all Audio AdaptationSets
     * 
     * @param manifestId Id of the manifest (required)
     * @param periodId Id of the period (required)
     * @return List&lt;AudioAdaptationSet&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<AudioAdaptationSet> list(String manifestId, String periodId) throws BitmovinException {
        try {
            return this.apiClient.list(manifestId, periodId, new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * List all Audio AdaptationSets
     * 
     * @param manifestId Id of the manifest (required)
     * @param periodId Id of the period (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;AudioAdaptationSet&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<AudioAdaptationSet> list(String manifestId, String periodId, AudioAdaptationSetListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(manifestId, periodId, new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    interface AudioApiClient {
    
        @RequestLine("POST /encoding/manifests/dash/{manifest_id}/periods/{period_id}/adaptationsets/audio")
        ResponseEnvelope<AudioAdaptationSet> create(@Param(value = "manifest_id") String manifestId, @Param(value = "period_id") String periodId, AudioAdaptationSet audioAdaptationSet) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/manifests/dash/{manifest_id}/periods/{period_id}/adaptationsets/audio/{adaptationset_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "manifest_id") String manifestId, @Param(value = "period_id") String periodId, @Param(value = "adaptationset_id") String adaptationsetId) throws BitmovinException;
    
        @RequestLine("GET /encoding/manifests/dash/{manifest_id}/periods/{period_id}/adaptationsets/audio/{adaptationset_id}")
        ResponseEnvelope<AudioAdaptationSet> get(@Param(value = "manifest_id") String manifestId, @Param(value = "period_id") String periodId, @Param(value = "adaptationset_id") String adaptationsetId) throws BitmovinException;
    
        @RequestLine("GET /encoding/manifests/dash/{manifest_id}/periods/{period_id}/adaptationsets/audio")
        ResponseEnvelope<PaginationResponse<AudioAdaptationSet>> list(@Param(value = "manifest_id") String manifestId, @Param(value = "period_id") String periodId, @QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    }
}
