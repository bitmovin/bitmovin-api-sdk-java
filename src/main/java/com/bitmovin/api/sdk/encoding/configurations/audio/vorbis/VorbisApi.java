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
import static com.bitmovin.api.sdk.common.BitmovinExceptionFactory.buildBitmovinException;
import com.bitmovin.api.sdk.common.BitmovinDateExpander;
import com.bitmovin.api.sdk.common.QueryMapWrapper;
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
     * @param vorbisAudioConfiguration The Vorbis Codec Configuration to be created (required)
     * @return VorbisAudioConfiguration
     * @throws BitmovinException if fails to make API call
     */
    public VorbisAudioConfiguration create(VorbisAudioConfiguration vorbisAudioConfiguration) throws BitmovinException {
        try {
            return this.apiClient.create(vorbisAudioConfiguration).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * Delete Vorbis Codec Configuration
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
     * Vorbis Codec Configuration Details
     * 
     * @param configurationId Id of the codec configuration (required)
     * @return VorbisAudioConfiguration
     * @throws BitmovinException if fails to make API call
     */
    public VorbisAudioConfiguration get(String configurationId) throws BitmovinException {
        try {
            return this.apiClient.get(configurationId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * List Vorbis Configurations
     * 
     * @return List&lt;VorbisAudioConfiguration&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<VorbisAudioConfiguration> list() throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * List Vorbis Configurations
     * 
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;VorbisAudioConfiguration&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<VorbisAudioConfiguration> list(VorbisAudioConfigurationListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface VorbisApiClient {

        @RequestLine("POST /encoding/configurations/audio/vorbis")
        ResponseEnvelope<VorbisAudioConfiguration> create(VorbisAudioConfiguration vorbisAudioConfiguration) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/configurations/audio/vorbis/{configuration_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "configuration_id") String configurationId) throws BitmovinException;
    
        @RequestLine("GET /encoding/configurations/audio/vorbis/{configuration_id}")
        ResponseEnvelope<VorbisAudioConfiguration> get(@Param(value = "configuration_id") String configurationId) throws BitmovinException;
    
        @RequestLine("GET /encoding/configurations/audio/vorbis")
        ResponseEnvelope<PaginationResponse<VorbisAudioConfiguration>> list(@QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    }
}
