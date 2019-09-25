package com.bitmovin.api.sdk.encoding.configurations.audio.mp2;

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
import com.bitmovin.api.sdk.encoding.configurations.audio.mp2.customdata.CustomdataApi;

public class Mp2Api {
    public final CustomdataApi customdata;

    private final Mp2ApiClient apiClient;

    public Mp2Api(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(Mp2ApiClient.class);

        this.customdata = new CustomdataApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of Mp2Api
     */
    public static BitmovinApiBuilder<Mp2Api> builder() {
        return new BitmovinApiBuilder<>(Mp2Api.class);
    }
    
    /**
     * Create MP2 Codec Configuration
     * 
     * @param mp2AudioConfiguration The MP2 Codec Configuration to be created (required)
     * @return Mp2AudioConfiguration
     * @throws BitmovinException if fails to make API call
     */
    public Mp2AudioConfiguration create(Mp2AudioConfiguration mp2AudioConfiguration) throws BitmovinException {
        try {
            return this.apiClient.create(mp2AudioConfiguration).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * Delete MP2 Codec Configuration
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
     * MP2 Codec Configuration Details
     * 
     * @param configurationId Id of the codec configuration (required)
     * @return Mp2AudioConfiguration
     * @throws BitmovinException if fails to make API call
     */
    public Mp2AudioConfiguration get(String configurationId) throws BitmovinException {
        try {
            return this.apiClient.get(configurationId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    interface Mp2ApiClient {
    
        @RequestLine("POST /encoding/configurations/audio/mp2")
        ResponseEnvelope<Mp2AudioConfiguration> create(Mp2AudioConfiguration mp2AudioConfiguration) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/configurations/audio/mp2/{configuration_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "configuration_id") String configurationId) throws BitmovinException;
    
        @RequestLine("GET /encoding/configurations/audio/mp2/{configuration_id}")
        ResponseEnvelope<Mp2AudioConfiguration> get(@Param(value = "configuration_id") String configurationId) throws BitmovinException;
    }
}
