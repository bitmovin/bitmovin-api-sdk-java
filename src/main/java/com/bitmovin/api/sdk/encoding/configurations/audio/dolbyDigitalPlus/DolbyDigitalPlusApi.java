package com.bitmovin.api.sdk.encoding.configurations.audio.dolbyDigitalPlus;

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
import com.bitmovin.api.sdk.encoding.configurations.audio.dolbyDigitalPlus.customdata.CustomdataApi;

public class DolbyDigitalPlusApi {
    public final CustomdataApi customdata;

    private final DolbyDigitalPlusApiClient apiClient;

    public DolbyDigitalPlusApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(DolbyDigitalPlusApiClient.class);

        this.customdata = new CustomdataApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of DolbyDigitalPlusApi
     */
    public static BitmovinApiBuilder<DolbyDigitalPlusApi> builder() {
        return new BitmovinApiBuilder<>(DolbyDigitalPlusApi.class);
    }

    /**
     * Create Dolby Digital Plus Codec Configuration
     * 
     * @param dolbyDigitalPlusAudioConfiguration The Dolby Digital Plus Codec Configuration to be created (Dolby Encoder v3.17).  Dolby Digital Plus enables high-resolution multichannel audio at lower bit rates than with Dolby Digital.  (required)
     * @return DolbyDigitalPlusAudioConfiguration
     * @throws BitmovinException if fails to make API call
     */
    public DolbyDigitalPlusAudioConfiguration create(DolbyDigitalPlusAudioConfiguration dolbyDigitalPlusAudioConfiguration) throws BitmovinException {
        try {
            return this.apiClient.create(dolbyDigitalPlusAudioConfiguration).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * Delete Dolby Digital Plus Codec Configuration
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
     * Dolby Digital Plus Codec Configuration Details
     * 
     * @param configurationId Id of the codec configuration (required)
     * @return DolbyDigitalPlusAudioConfiguration
     * @throws BitmovinException if fails to make API call
     */
    public DolbyDigitalPlusAudioConfiguration get(String configurationId) throws BitmovinException {
        try {
            return this.apiClient.get(configurationId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * List Dolby Digital Plus Codec Configurations
     * 
     * @return List&lt;DolbyDigitalPlusAudioConfiguration&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<DolbyDigitalPlusAudioConfiguration> list() throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * List Dolby Digital Plus Codec Configurations
     * 
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;DolbyDigitalPlusAudioConfiguration&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<DolbyDigitalPlusAudioConfiguration> list(DolbyDigitalPlusAudioConfigurationListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface DolbyDigitalPlusApiClient {

        @RequestLine("POST /encoding/configurations/audio/dolby-digital-plus")
        ResponseEnvelope<DolbyDigitalPlusAudioConfiguration> create(DolbyDigitalPlusAudioConfiguration dolbyDigitalPlusAudioConfiguration) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/configurations/audio/dolby-digital-plus/{configuration_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "configuration_id") String configurationId) throws BitmovinException;
    
        @RequestLine("GET /encoding/configurations/audio/dolby-digital-plus/{configuration_id}")
        ResponseEnvelope<DolbyDigitalPlusAudioConfiguration> get(@Param(value = "configuration_id") String configurationId) throws BitmovinException;
    
        @RequestLine("GET /encoding/configurations/audio/dolby-digital-plus")
        ResponseEnvelope<PaginationResponse<DolbyDigitalPlusAudioConfiguration>> list(@QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    }
}
