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
import static com.bitmovin.api.sdk.common.BitmovinExceptionFactory.buildBitmovinException;
import com.bitmovin.api.sdk.common.BitmovinDateExpander;
import com.bitmovin.api.sdk.common.QueryMapWrapper;
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
     * @param audioMixFilter The Audio Mix Filter to be created (required)
     * @return AudioMixFilter
     * @throws BitmovinException if fails to make API call
     */
    public AudioMixFilter create(AudioMixFilter audioMixFilter) throws BitmovinException {
        try {
            return this.apiClient.create(audioMixFilter).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * Delete Audio Mix Filter
     * 
     * @param filterId Id of the Audio Mix Filter. (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse delete(String filterId) throws BitmovinException {
        try {
            return this.apiClient.delete(filterId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * Audio Mix Filter Details
     * 
     * @param filterId Id of the Audio Mix Filter. (required)
     * @return AudioMixFilter
     * @throws BitmovinException if fails to make API call
     */
    public AudioMixFilter get(String filterId) throws BitmovinException {
        try {
            return this.apiClient.get(filterId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * List Audio Mix Filters
     * 
     * @return List&lt;AudioMixFilter&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<AudioMixFilter> list() throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * List Audio Mix Filters
     * 
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;AudioMixFilter&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<AudioMixFilter> list(AudioMixFilterListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    interface AudioMixApiClient {
    
        @RequestLine("POST /encoding/filters/audio-mix")
        ResponseEnvelope<AudioMixFilter> create(AudioMixFilter audioMixFilter) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/filters/audio-mix/{filter_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "filter_id") String filterId) throws BitmovinException;
    
        @RequestLine("GET /encoding/filters/audio-mix/{filter_id}")
        ResponseEnvelope<AudioMixFilter> get(@Param(value = "filter_id") String filterId) throws BitmovinException;
    
        @RequestLine("GET /encoding/filters/audio-mix")
        ResponseEnvelope<PaginationResponse<AudioMixFilter>> list(@QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    }
}
