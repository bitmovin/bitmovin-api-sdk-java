package com.bitmovin.api.sdk.encoding.filters.audioVolume;

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
import com.bitmovin.api.sdk.encoding.filters.audioVolume.customdata.CustomdataApi;

public class AudioVolumeApi {
    public final CustomdataApi customdata;

    private final AudioVolumeApiClient apiClient;

    public AudioVolumeApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(AudioVolumeApiClient.class);

        this.customdata = new CustomdataApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of AudioVolumeApi
     */
    public static BitmovinApiBuilder<AudioVolumeApi> builder() {
        return new BitmovinApiBuilder<>(AudioVolumeApi.class);
    }
    
    /**
     * Create Audio Volume Filter
     * 
     * @param audioVolumeFilter The Audio Volume Filter to be created (required)
     * @return AudioVolumeFilter
     * @throws BitmovinException if fails to make API call
     */
    public AudioVolumeFilter create(AudioVolumeFilter audioVolumeFilter) throws BitmovinException {
        return this.apiClient.create(audioVolumeFilter).getData().getResult();
    }
    
    /**
     * Delete Audio Volume Filter
     * 
     * @param filterId Id of the Audio volume configuration. (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse delete(String filterId) throws BitmovinException {
        return this.apiClient.delete(filterId).getData().getResult();
    }
    
    /**
     * Audio Volume Filter Details
     * 
     * @param filterId Id of the audio volume configuration. (required)
     * @return AudioVolumeFilter
     * @throws BitmovinException if fails to make API call
     */
    public AudioVolumeFilter get(String filterId) throws BitmovinException {
        return this.apiClient.get(filterId).getData().getResult();
    }
    
    /**
     * List Audio Volume Filters
     * 
     * @return List&lt;AudioVolumeFilter&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<AudioVolumeFilter> list() throws BitmovinException {
        return this.apiClient.list(new HashMap<String, Object>()).getData().getResult();
    }
    /**
     * List Audio Volume Filters
     * 
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;AudioVolumeFilter&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<AudioVolumeFilter> list(AudioVolumeFilterListQueryParams queryParams) throws BitmovinException {
        return this.apiClient.list(queryParams).getData().getResult();
    }
    
    interface AudioVolumeApiClient {
    
        @RequestLine("POST /encoding/filters/audio-volume")
        ResponseEnvelope<AudioVolumeFilter> create(AudioVolumeFilter audioVolumeFilter) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/filters/audio-volume/{filter_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "filter_id") String filterId) throws BitmovinException;
    
        @RequestLine("GET /encoding/filters/audio-volume/{filter_id}")
        ResponseEnvelope<AudioVolumeFilter> get(@Param(value = "filter_id") String filterId) throws BitmovinException;
    
        @RequestLine("GET /encoding/filters/audio-volume")
        ResponseEnvelope<PaginationResponse<AudioVolumeFilter>> list(@QueryMap Map<String, Object> queryParams) throws BitmovinException;
    }
}
