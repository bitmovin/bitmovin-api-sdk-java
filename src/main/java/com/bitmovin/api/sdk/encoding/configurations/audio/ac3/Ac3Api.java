package com.bitmovin.api.sdk.encoding.configurations.audio.ac3;

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
import com.bitmovin.api.sdk.encoding.configurations.audio.ac3.customdata.CustomdataApi;

public class Ac3Api {
    public final CustomdataApi customdata;

    private final Ac3ApiClient apiClient;

    public Ac3Api(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(Ac3ApiClient.class);

        this.customdata = new CustomdataApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of Ac3Api
     */
    public static BitmovinApiBuilder<Ac3Api> builder() {
        return new BitmovinApiBuilder<>(Ac3Api.class);
    }
    
    /**
     * Create AC3 Codec Configuration
     * 
     * @param ac3AudioConfiguration  (optional)
     * @return Ac3AudioConfiguration
     * @throws BitmovinException if fails to make API call
     */
    public Ac3AudioConfiguration create(Ac3AudioConfiguration ac3AudioConfiguration) throws BitmovinException {
        return this.apiClient.create(ac3AudioConfiguration).getData().getResult();
    }
    
    /**
     * Delete AC3 Codec Configuration
     * 
     * @param configurationId Id of the codec configuration (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse delete(String configurationId) throws BitmovinException {
        return this.apiClient.delete(configurationId).getData().getResult();
    }
    
    /**
     * AC3 Codec Configuration Details
     * 
     * @param configurationId Id of the codec configuration (required)
     * @return Ac3AudioConfiguration
     * @throws BitmovinException if fails to make API call
     */
    public Ac3AudioConfiguration get(String configurationId) throws BitmovinException {
        return this.apiClient.get(configurationId).getData().getResult();
    }
    
    /**
     * List AC3 Configurations
     * 
     * @return List&lt;Ac3AudioConfiguration&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<Ac3AudioConfiguration> list() throws BitmovinException {
        return this.apiClient.list(new HashMap<String, Object>()).getData().getResult();
    }
    /**
     * List AC3 Configurations
     * 
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;Ac3AudioConfiguration&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<Ac3AudioConfiguration> list(Ac3AudioConfigurationListQueryParams queryParams) throws BitmovinException {
        return this.apiClient.list(queryParams).getData().getResult();
    }
    
    interface Ac3ApiClient {
    
        @RequestLine("POST /encoding/configurations/audio/ac3")
        ResponseEnvelope<Ac3AudioConfiguration> create(Ac3AudioConfiguration ac3AudioConfiguration) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/configurations/audio/ac3/{configuration_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "configuration_id") String configurationId) throws BitmovinException;
    
        @RequestLine("GET /encoding/configurations/audio/ac3/{configuration_id}")
        ResponseEnvelope<Ac3AudioConfiguration> get(@Param(value = "configuration_id") String configurationId) throws BitmovinException;
    
        @RequestLine("GET /encoding/configurations/audio/ac3")
        ResponseEnvelope<PaginationResponse<Ac3AudioConfiguration>> list(@QueryMap Map<String, Object> queryParams) throws BitmovinException;
    }
}
