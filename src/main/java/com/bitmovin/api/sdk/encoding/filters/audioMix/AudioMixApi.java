package com.bitmovin.api.sdk.encoding.filters.audioMix;

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
import com.bitmovin.api.sdk.encoding.filters.audioMix.customdata.CustomdataApi;

public class AudioMixApi {
    public final CustomdataApi customdata;

    private final AudioMixApiClient apiClient;

    public AudioMixApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(AudioMixApiClient.class);

        this.customdata = new CustomdataApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of AudioMixApi
     */
    public static BitmovinApiBuilder<AudioMixApi> builder() {
        return new BitmovinApiBuilder<>(AudioMixApi.class);
    }
    
    /**
     * Create Audio Mix Filter
     * 
     * @param audioMixFilter  (optional)
     * @return AudioMixFilter
     * @throws BitmovinException if fails to make API call
     */
    public AudioMixFilter create(AudioMixFilter audioMixFilter) throws BitmovinException {
        return this.apiClient.create(audioMixFilter).getData().getResult();
    }
    
    /**
     * Delete Audio Mix Filter
     * 
     * @param filterId Id of the Audio Mix configuration. (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse delete(String filterId) throws BitmovinException {
        return this.apiClient.delete(filterId).getData().getResult();
    }
    
    /**
     * Audio Mix Filter Details
     * 
     * @param filterId Id of the Audio Mix configuration. (required)
     * @return AudioMixFilter
     * @throws BitmovinException if fails to make API call
     */
    public AudioMixFilter get(String filterId) throws BitmovinException {
        return this.apiClient.get(filterId).getData().getResult();
    }
    
    /**
     * List Audio Mix Filters
     * 
     * @return List&lt;AudioMixFilter&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<AudioMixFilter> list() throws BitmovinException {
        return this.apiClient.list(new HashMap<String, Object>()).getData().getResult();
    }
    /**
     * List Audio Mix Filters
     * 
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;AudioMixFilter&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<AudioMixFilter> list(AudioMixFilterListQueryParams queryParams) throws BitmovinException {
        return this.apiClient.list(queryParams).getData().getResult();
    }
    
    interface AudioMixApiClient {
    
        @RequestLine("POST /encoding/filters/audio-mix")
        ResponseEnvelope<AudioMixFilter> create(AudioMixFilter audioMixFilter) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/filters/audio-mix/{filter_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "filter_id") String filterId) throws BitmovinException;
    
        @RequestLine("GET /encoding/filters/audio-mix/{filter_id}")
        ResponseEnvelope<AudioMixFilter> get(@Param(value = "filter_id") String filterId) throws BitmovinException;
    
        @RequestLine("GET /encoding/filters/audio-mix")
        ResponseEnvelope<PaginationResponse<AudioMixFilter>> list(@QueryMap Map<String, Object> queryParams) throws BitmovinException;
    }
}
