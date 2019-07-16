package com.bitmovin.api.sdk.encoding.configurations.audio.mp3;

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
import com.bitmovin.api.sdk.encoding.configurations.audio.mp3.customdata.CustomdataApi;

public class Mp3Api {
    public final CustomdataApi customdata;

    private final Mp3ApiClient apiClient;

    public Mp3Api(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(Mp3ApiClient.class);

        this.customdata = new CustomdataApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of Mp3Api
     */
    public static BitmovinApiBuilder<Mp3Api> builder() {
        return new BitmovinApiBuilder<>(Mp3Api.class);
    }
    
    /**
     * Create MP3 Codec Configuration
     * 
     * @param mp3AudioConfiguration The MP3 Codec Configuration to be created (required)
     * @return Mp3AudioConfiguration
     * @throws BitmovinException if fails to make API call
     */
    public Mp3AudioConfiguration create(Mp3AudioConfiguration mp3AudioConfiguration) throws BitmovinException {
        return this.apiClient.create(mp3AudioConfiguration).getData().getResult();
    }
    
    /**
     * Delete MP3 Codec Configuration
     * 
     * @param configurationId Id of the codec configuration (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse delete(String configurationId) throws BitmovinException {
        return this.apiClient.delete(configurationId).getData().getResult();
    }
    
    /**
     * MP3 Codec Configuration Details
     * 
     * @param configurationId Id of the codec configuration (required)
     * @return Mp3AudioConfiguration
     * @throws BitmovinException if fails to make API call
     */
    public Mp3AudioConfiguration get(String configurationId) throws BitmovinException {
        return this.apiClient.get(configurationId).getData().getResult();
    }
    
    /**
     * List MP3 Configurations
     * 
     * @return List&lt;Mp3AudioConfiguration&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<Mp3AudioConfiguration> list() throws BitmovinException {
        return this.apiClient.list(new HashMap<String, Object>()).getData().getResult();
    }
    /**
     * List MP3 Configurations
     * 
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;Mp3AudioConfiguration&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<Mp3AudioConfiguration> list(Mp3AudioConfigurationListQueryParams queryParams) throws BitmovinException {
        return this.apiClient.list(queryParams).getData().getResult();
    }
    
    interface Mp3ApiClient {
    
        @RequestLine("POST /encoding/configurations/audio/mp3")
        ResponseEnvelope<Mp3AudioConfiguration> create(Mp3AudioConfiguration mp3AudioConfiguration) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/configurations/audio/mp3/{configuration_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "configuration_id") String configurationId) throws BitmovinException;
    
        @RequestLine("GET /encoding/configurations/audio/mp3/{configuration_id}")
        ResponseEnvelope<Mp3AudioConfiguration> get(@Param(value = "configuration_id") String configurationId) throws BitmovinException;
    
        @RequestLine("GET /encoding/configurations/audio/mp3")
        ResponseEnvelope<PaginationResponse<Mp3AudioConfiguration>> list(@QueryMap Map<String, Object> queryParams) throws BitmovinException;
    }
}
