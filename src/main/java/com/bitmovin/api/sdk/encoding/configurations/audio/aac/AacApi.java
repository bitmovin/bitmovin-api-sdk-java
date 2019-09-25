package com.bitmovin.api.sdk.encoding.configurations.audio.aac;

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
import com.bitmovin.api.sdk.common.BitmovinApiBuilder;
import com.bitmovin.api.sdk.common.BitmovinApiClientFactory;
import com.bitmovin.api.sdk.encoding.configurations.audio.aac.customdata.CustomdataApi;

public class AacApi {
    public final CustomdataApi customdata;

    private final AacApiClient apiClient;

    public AacApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(AacApiClient.class);

        this.customdata = new CustomdataApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of AacApi
     */
    public static BitmovinApiBuilder<AacApi> builder() {
        return new BitmovinApiBuilder<>(AacApi.class);
    }
    
    /**
     * Create AAC Codec Configuration
     * 
     * @param aacAudioConfiguration The AAC Codec Configuration to be created (required)
     * @return AacAudioConfiguration
     * @throws BitmovinException if fails to make API call
     */
    public AacAudioConfiguration create(AacAudioConfiguration aacAudioConfiguration) throws BitmovinException {
        try {
            return this.apiClient.create(aacAudioConfiguration).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * Delete AAC Codec Configuration
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
     * AAC Codec Configuration Details
     * 
     * @param configurationId Id of the codec configuration (required)
     * @return AacAudioConfiguration
     * @throws BitmovinException if fails to make API call
     */
    public AacAudioConfiguration get(String configurationId) throws BitmovinException {
        try {
            return this.apiClient.get(configurationId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * List AAC Configurations
     * 
     * @return List&lt;AacAudioConfiguration&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<AacAudioConfiguration> list() throws BitmovinException {
        try {
            return this.apiClient.list(new HashMap<String, Object>()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * List AAC Configurations
     * 
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;AacAudioConfiguration&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<AacAudioConfiguration> list(AacAudioConfigurationListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(queryParams).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    interface AacApiClient {
    
        @RequestLine("POST /encoding/configurations/audio/aac")
        ResponseEnvelope<AacAudioConfiguration> create(AacAudioConfiguration aacAudioConfiguration) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/configurations/audio/aac/{configuration_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "configuration_id") String configurationId) throws BitmovinException;
    
        @RequestLine("GET /encoding/configurations/audio/aac/{configuration_id}")
        ResponseEnvelope<AacAudioConfiguration> get(@Param(value = "configuration_id") String configurationId) throws BitmovinException;
    
        @RequestLine("GET /encoding/configurations/audio/aac")
        ResponseEnvelope<PaginationResponse<AacAudioConfiguration>> list(@QueryMap Map<String, Object> queryParams) throws BitmovinException;
    }
}
