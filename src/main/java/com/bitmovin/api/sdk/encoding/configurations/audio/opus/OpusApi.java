package com.bitmovin.api.sdk.encoding.configurations.audio.opus;

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
import com.bitmovin.api.sdk.encoding.configurations.audio.opus.customdata.CustomdataApi;

public class OpusApi {
    public final CustomdataApi customdata;

    private final OpusApiClient apiClient;

    public OpusApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(OpusApiClient.class);

        this.customdata = new CustomdataApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of OpusApi
     */
    public static BitmovinApiBuilder<OpusApi> builder() {
        return new BitmovinApiBuilder<>(OpusApi.class);
    }
    
    /**
     * Create Opus Codec Configuration
     * 
     * @param opusAudioConfiguration The Opus Codec Configuration to be created (required)
     * @return OpusAudioConfiguration
     * @throws BitmovinException if fails to make API call
     */
    public OpusAudioConfiguration create(OpusAudioConfiguration opusAudioConfiguration) throws BitmovinException {
        try {
            return this.apiClient.create(opusAudioConfiguration).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * Delete Opus Codec Configuration
     * 
     * @param configurationId Id of the codec configuration (required)
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
     * Opus Codec Configuration Details
     * 
     * @param configurationId Id of the codec configuration (required)
     * @return OpusAudioConfiguration
     * @throws BitmovinException if fails to make API call
     */
    public OpusAudioConfiguration get(String configurationId) throws BitmovinException {
        try {
            return this.apiClient.get(configurationId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * List Opus Configurations
     * 
     * @return List&lt;OpusAudioConfiguration&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<OpusAudioConfiguration> list() throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * List Opus Configurations
     * 
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;OpusAudioConfiguration&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<OpusAudioConfiguration> list(OpusAudioConfigurationListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    interface OpusApiClient {
    
        @RequestLine("POST /encoding/configurations/audio/opus")
        ResponseEnvelope<OpusAudioConfiguration> create(OpusAudioConfiguration opusAudioConfiguration) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/configurations/audio/opus/{configuration_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "configuration_id") String configurationId) throws BitmovinException;
    
        @RequestLine("GET /encoding/configurations/audio/opus/{configuration_id}")
        ResponseEnvelope<OpusAudioConfiguration> get(@Param(value = "configuration_id") String configurationId) throws BitmovinException;
    
        @RequestLine("GET /encoding/configurations/audio/opus")
        ResponseEnvelope<PaginationResponse<OpusAudioConfiguration>> list(@QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    }
}
