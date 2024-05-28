package com.bitmovin.api.sdk.encoding.configurations.audio.passthrough;

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

public class PassthroughApi {

    private final PassthroughApiClient apiClient;

    public PassthroughApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(PassthroughApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of PassthroughApi
     */
    public static BitmovinApiBuilder<PassthroughApi> builder() {
        return new BitmovinApiBuilder<>(PassthroughApi.class);
    }

    /**
     * Create Audio Passthrough Configuration
     * 
     * @param passthroughAudioConfiguration The Audio Passthrough Configuration to be created (required)
     * @return PassthroughAudioConfiguration
     * @throws BitmovinException if fails to make API call
     */
    public PassthroughAudioConfiguration create(PassthroughAudioConfiguration passthroughAudioConfiguration) throws BitmovinException {
        try {
            return this.apiClient.create(passthroughAudioConfiguration).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * Delete Audio Passthrough Codec Configuration
     * 
     * @param configurationId Id of the audio configuration (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse delete(String configurationId) throws BitmovinException {
        try {
            return this.apiClient.delete(configurationId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * Audio Passthrough Configuration Details
     * 
     * @param configurationId Id of the audio configuration (required)
     * @return PassthroughAudioConfiguration
     * @throws BitmovinException if fails to make API call
     */
    public PassthroughAudioConfiguration get(String configurationId) throws BitmovinException {
        try {
            return this.apiClient.get(configurationId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * List Audio Passthrough Configurations
     * 
     * @return List&lt;PassthroughAudioConfiguration&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<PassthroughAudioConfiguration> list() throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * List Audio Passthrough Configurations
     * 
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;PassthroughAudioConfiguration&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<PassthroughAudioConfiguration> list(PassthroughAudioConfigurationListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface PassthroughApiClient {

        @RequestLine("POST /encoding/configurations/audio/passthrough")
        ResponseEnvelope<PassthroughAudioConfiguration> create(PassthroughAudioConfiguration passthroughAudioConfiguration) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/configurations/audio/passthrough/{configuration_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "configuration_id") String configurationId) throws BitmovinException;
    
        @RequestLine("GET /encoding/configurations/audio/passthrough/{configuration_id}")
        ResponseEnvelope<PassthroughAudioConfiguration> get(@Param(value = "configuration_id") String configurationId) throws BitmovinException;
    
        @RequestLine("GET /encoding/configurations/audio/passthrough")
        ResponseEnvelope<PaginationResponse<PassthroughAudioConfiguration>> list(@QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    }
}
