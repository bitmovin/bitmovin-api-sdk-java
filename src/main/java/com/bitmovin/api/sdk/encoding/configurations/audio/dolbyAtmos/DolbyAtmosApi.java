package com.bitmovin.api.sdk.encoding.configurations.audio.dolbyAtmos;

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
import com.bitmovin.api.sdk.encoding.configurations.audio.dolbyAtmos.customdata.CustomdataApi;

public class DolbyAtmosApi {
    public final CustomdataApi customdata;

    private final DolbyAtmosApiClient apiClient;

    public DolbyAtmosApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(DolbyAtmosApiClient.class);

        this.customdata = new CustomdataApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of DolbyAtmosApi
     */
    public static BitmovinApiBuilder<DolbyAtmosApi> builder() {
        return new BitmovinApiBuilder<>(DolbyAtmosApi.class);
    }
    /**
     * Create Dolby Atmos Configuration
     * 
     * @param dolbyAtmosAudioConfiguration The Dolby Atmos Codec Configuration to be created (required)
     * @return DolbyAtmosAudioConfiguration
     * @throws BitmovinException if fails to make API call
     */
    public DolbyAtmosAudioConfiguration create(DolbyAtmosAudioConfiguration dolbyAtmosAudioConfiguration) throws BitmovinException {
        try {
            return this.apiClient.create(dolbyAtmosAudioConfiguration).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * Delete Dolby Atmos Codec Configuration
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
     * Dolby Atmos Codec Configuration Details
     * 
     * @param configurationId Id of the codec configuration (required)
     * @return DolbyAtmosAudioConfiguration
     * @throws BitmovinException if fails to make API call
     */
    public DolbyAtmosAudioConfiguration get(String configurationId) throws BitmovinException {
        try {
            return this.apiClient.get(configurationId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * List Dolby Atmos Configurations
     * 
     * @return List&lt;DolbyAtmosAudioConfiguration&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<DolbyAtmosAudioConfiguration> list() throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * List Dolby Atmos Configurations
     * 
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;DolbyAtmosAudioConfiguration&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<DolbyAtmosAudioConfiguration> list(DolbyAtmosAudioConfigurationListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface DolbyAtmosApiClient { 
        @RequestLine("POST /encoding/configurations/audio/dolby-atmos")
        ResponseEnvelope<DolbyAtmosAudioConfiguration> create(DolbyAtmosAudioConfiguration dolbyAtmosAudioConfiguration) throws BitmovinException;
   
        @RequestLine("DELETE /encoding/configurations/audio/dolby-atmos/{configuration_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "configuration_id") String configurationId) throws BitmovinException;
   
        @RequestLine("GET /encoding/configurations/audio/dolby-atmos/{configuration_id}")
        ResponseEnvelope<DolbyAtmosAudioConfiguration> get(@Param(value = "configuration_id") String configurationId) throws BitmovinException;
   
        @RequestLine("GET /encoding/configurations/audio/dolby-atmos")
        ResponseEnvelope<PaginationResponse<DolbyAtmosAudioConfiguration>> list(@QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    }
}
