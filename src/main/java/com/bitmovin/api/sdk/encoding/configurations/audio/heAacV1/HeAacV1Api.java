package com.bitmovin.api.sdk.encoding.configurations.audio.heAacV1;

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
import com.bitmovin.api.sdk.encoding.configurations.audio.heAacV1.customdata.CustomdataApi;

public class HeAacV1Api {
    public final CustomdataApi customdata;

    private final HeAacV1ApiClient apiClient;

    public HeAacV1Api(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(HeAacV1ApiClient.class);

        this.customdata = new CustomdataApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of HeAacV1Api
     */
    public static BitmovinApiBuilder<HeAacV1Api> builder() {
        return new BitmovinApiBuilder<>(HeAacV1Api.class);
    }
    
    /**
     * Create HE-AAC v1 Codec Configuration
     * 
     * @param heAacV1AudioConfiguration The HE-AAC Codec Configuration to be created (required)
     * @return HeAacV1AudioConfiguration
     * @throws BitmovinException if fails to make API call
     */
    public HeAacV1AudioConfiguration create(HeAacV1AudioConfiguration heAacV1AudioConfiguration) throws BitmovinException {
        return this.apiClient.create(heAacV1AudioConfiguration).getData().getResult();
    }
    
    /**
     * Delete HE-AAC v1 Codec Configuration
     * 
     * @param configurationId Id of the codec configuration (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse delete(String configurationId) throws BitmovinException {
        return this.apiClient.delete(configurationId).getData().getResult();
    }
    
    /**
     * HE-AAC v1 Codec Configuration Details
     * 
     * @param configurationId Id of the codec configuration (required)
     * @return HeAacV1AudioConfiguration
     * @throws BitmovinException if fails to make API call
     */
    public HeAacV1AudioConfiguration get(String configurationId) throws BitmovinException {
        return this.apiClient.get(configurationId).getData().getResult();
    }
    
    /**
     * List HE-AAC v1 Configurations
     * 
     * @return List&lt;HeAacV1AudioConfiguration&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<HeAacV1AudioConfiguration> list() throws BitmovinException {
        return this.apiClient.list(new HashMap<String, Object>()).getData().getResult();
    }
    /**
     * List HE-AAC v1 Configurations
     * 
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;HeAacV1AudioConfiguration&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<HeAacV1AudioConfiguration> list(HeAacV1AudioConfigurationListQueryParams queryParams) throws BitmovinException {
        return this.apiClient.list(queryParams).getData().getResult();
    }
    
    interface HeAacV1ApiClient {
    
        @RequestLine("POST /encoding/configurations/audio/he-aac-v1")
        ResponseEnvelope<HeAacV1AudioConfiguration> create(HeAacV1AudioConfiguration heAacV1AudioConfiguration) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/configurations/audio/he-aac-v1/{configuration_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "configuration_id") String configurationId) throws BitmovinException;
    
        @RequestLine("GET /encoding/configurations/audio/he-aac-v1/{configuration_id}")
        ResponseEnvelope<HeAacV1AudioConfiguration> get(@Param(value = "configuration_id") String configurationId) throws BitmovinException;
    
        @RequestLine("GET /encoding/configurations/audio/he-aac-v1")
        ResponseEnvelope<PaginationResponse<HeAacV1AudioConfiguration>> list(@QueryMap Map<String, Object> queryParams) throws BitmovinException;
    }
}
