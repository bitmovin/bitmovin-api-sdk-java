package com.bitmovin.api.sdk.encoding.configurations.audio.heAacV2;

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
import com.bitmovin.api.sdk.encoding.configurations.audio.heAacV2.customdata.CustomdataApi;

public class HeAacV2Api {
    public final CustomdataApi customdata;

    private final HeAacV2ApiClient apiClient;

    public HeAacV2Api(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(HeAacV2ApiClient.class);

        this.customdata = new CustomdataApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of HeAacV2Api
     */
    public static BitmovinApiBuilder<HeAacV2Api> builder() {
        return new BitmovinApiBuilder<>(HeAacV2Api.class);
    }
    
    /**
     * Create HE-AAC v2 Codec Configuration
     * 
     * @param heAacV2AudioConfiguration The HE-AAC v2 Codec Configuration to be created (required)
     * @return HeAacV2AudioConfiguration
     * @throws BitmovinException if fails to make API call
     */
    public HeAacV2AudioConfiguration create(HeAacV2AudioConfiguration heAacV2AudioConfiguration) throws BitmovinException {
        try {
            return this.apiClient.create(heAacV2AudioConfiguration).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * Delete HE-AAC v2 Codec Configuration
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
     * HE-AAC v2 Codec Configuration Details
     * 
     * @param configurationId Id of the codec configuration (required)
     * @return HeAacV2AudioConfiguration
     * @throws BitmovinException if fails to make API call
     */
    public HeAacV2AudioConfiguration get(String configurationId) throws BitmovinException {
        try {
            return this.apiClient.get(configurationId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * List HE-AAC v2 Configurations
     * 
     * @return List&lt;HeAacV2AudioConfiguration&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<HeAacV2AudioConfiguration> list() throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * List HE-AAC v2 Configurations
     * 
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;HeAacV2AudioConfiguration&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<HeAacV2AudioConfiguration> list(HeAacV2AudioConfigurationListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    interface HeAacV2ApiClient {
    
        @RequestLine("POST /encoding/configurations/audio/he-aac-v2")
        ResponseEnvelope<HeAacV2AudioConfiguration> create(HeAacV2AudioConfiguration heAacV2AudioConfiguration) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/configurations/audio/he-aac-v2/{configuration_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "configuration_id") String configurationId) throws BitmovinException;
    
        @RequestLine("GET /encoding/configurations/audio/he-aac-v2/{configuration_id}")
        ResponseEnvelope<HeAacV2AudioConfiguration> get(@Param(value = "configuration_id") String configurationId) throws BitmovinException;
    
        @RequestLine("GET /encoding/configurations/audio/he-aac-v2")
        ResponseEnvelope<PaginationResponse<HeAacV2AudioConfiguration>> list(@QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    }
}
