package com.bitmovin.api.sdk.encoding.configurations.audio.dolbyDigital;

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
import com.bitmovin.api.sdk.encoding.configurations.audio.dolbyDigital.customdata.CustomdataApi;

public class DolbyDigitalApi {
    public final CustomdataApi customdata;

    private final DolbyDigitalApiClient apiClient;

    public DolbyDigitalApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(DolbyDigitalApiClient.class);

        this.customdata = new CustomdataApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of DolbyDigitalApi
     */
    public static BitmovinApiBuilder<DolbyDigitalApi> builder() {
        return new BitmovinApiBuilder<>(DolbyDigitalApi.class);
    }
    /**
     * Create Dolby Digital Codec Configuration
     * 
     * @param dolbyDigitalAudioConfiguration The Dolby Digital Codec Configuration to be created (Dolby Encoder v3.17) (required)
     * @return DolbyDigitalAudioConfiguration
     * @throws BitmovinException if fails to make API call
     */
    public DolbyDigitalAudioConfiguration create(DolbyDigitalAudioConfiguration dolbyDigitalAudioConfiguration) throws BitmovinException {
        try {
            return this.apiClient.create(dolbyDigitalAudioConfiguration).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * Delete Dolby Digital Codec Configuration
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
     * Dolby Digital Codec Configuration Details
     * 
     * @param configurationId Id of the codec configuration (required)
     * @return DolbyDigitalAudioConfiguration
     * @throws BitmovinException if fails to make API call
     */
    public DolbyDigitalAudioConfiguration get(String configurationId) throws BitmovinException {
        try {
            return this.apiClient.get(configurationId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * List Dolby Digital Codec Configurations
     * 
     * @return List&lt;DolbyDigitalAudioConfiguration&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<DolbyDigitalAudioConfiguration> list() throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * List Dolby Digital Codec Configurations
     * 
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;DolbyDigitalAudioConfiguration&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<DolbyDigitalAudioConfiguration> list(DolbyDigitalAudioConfigurationListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface DolbyDigitalApiClient { 
        @RequestLine("POST /encoding/configurations/audio/dolby-digital")
        ResponseEnvelope<DolbyDigitalAudioConfiguration> create(DolbyDigitalAudioConfiguration dolbyDigitalAudioConfiguration) throws BitmovinException;
   
        @RequestLine("DELETE /encoding/configurations/audio/dolby-digital/{configuration_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "configuration_id") String configurationId) throws BitmovinException;
   
        @RequestLine("GET /encoding/configurations/audio/dolby-digital/{configuration_id}")
        ResponseEnvelope<DolbyDigitalAudioConfiguration> get(@Param(value = "configuration_id") String configurationId) throws BitmovinException;
   
        @RequestLine("GET /encoding/configurations/audio/dolby-digital")
        ResponseEnvelope<PaginationResponse<DolbyDigitalAudioConfiguration>> list(@QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    }
}
