package com.bitmovin.api.sdk.encoding.configurations.audio.vorbis;

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
import com.bitmovin.api.sdk.encoding.configurations.audio.vorbis.customdata.CustomdataApi;

public class VorbisApi {
    public final CustomdataApi customdata;

    private final VorbisApiClient apiClient;

    public VorbisApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(VorbisApiClient.class);

        this.customdata = new CustomdataApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of VorbisApi
     */
    public static BitmovinApiBuilder<VorbisApi> builder() {
        return new BitmovinApiBuilder<>(VorbisApi.class);
    }
    
    /**
     * Create Vorbis Codec Configuration
     * 
     * @param vorbisAudioConfiguration  (optional)
     * @return VorbisAudioConfiguration
     * @throws BitmovinException if fails to make API call
     */
    public VorbisAudioConfiguration create(VorbisAudioConfiguration vorbisAudioConfiguration) throws BitmovinException {
        return this.apiClient.create(vorbisAudioConfiguration).getData().getResult();
    }
    
    /**
     * Delete Vorbis Codec Configuration
     * 
     * @param configurationId Id of the codec configuration (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse delete(String configurationId) throws BitmovinException {
        return this.apiClient.delete(configurationId).getData().getResult();
    }
    
    /**
     * Vorbis Codec Configuration Details
     * 
     * @param configurationId Id of the codec configuration (required)
     * @return VorbisAudioConfiguration
     * @throws BitmovinException if fails to make API call
     */
    public VorbisAudioConfiguration get(String configurationId) throws BitmovinException {
        return this.apiClient.get(configurationId).getData().getResult();
    }
    
    /**
     * List Vorbis Configurations
     * 
     * @return List&lt;VorbisAudioConfiguration&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<VorbisAudioConfiguration> list() throws BitmovinException {
        return this.apiClient.list(new HashMap<String, Object>()).getData().getResult();
    }
    /**
     * List Vorbis Configurations
     * 
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;VorbisAudioConfiguration&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<VorbisAudioConfiguration> list(VorbisAudioConfigurationListQueryParams queryParams) throws BitmovinException {
        return this.apiClient.list(queryParams).getData().getResult();
    }
    
    interface VorbisApiClient {
    
        @RequestLine("POST /encoding/configurations/audio/vorbis")
        ResponseEnvelope<VorbisAudioConfiguration> create(VorbisAudioConfiguration vorbisAudioConfiguration) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/configurations/audio/vorbis/{configuration_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "configuration_id") String configurationId) throws BitmovinException;
    
        @RequestLine("GET /encoding/configurations/audio/vorbis/{configuration_id}")
        ResponseEnvelope<VorbisAudioConfiguration> get(@Param(value = "configuration_id") String configurationId) throws BitmovinException;
    
        @RequestLine("GET /encoding/configurations/audio/vorbis")
        ResponseEnvelope<PaginationResponse<VorbisAudioConfiguration>> list(@QueryMap Map<String, Object> queryParams) throws BitmovinException;
    }
}
