package com.bitmovin.api.sdk.encoding.configurations.audio.dts;

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
import com.bitmovin.api.sdk.encoding.configurations.audio.dts.customdata.CustomdataApi;

public class DtsApi {
    public final CustomdataApi customdata;

    private final DtsApiClient apiClient;

    public DtsApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(DtsApiClient.class);

        this.customdata = new CustomdataApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of DtsApi
     */
    public static BitmovinApiBuilder<DtsApi> builder() {
        return new BitmovinApiBuilder<>(DtsApi.class);
    }
    
    /**
     * Create DTS Codec Configuration
     * 
     * @param dtsAudioConfiguration The DTS Codec Configuration to be created (required)
     * @return DtsAudioConfiguration
     * @throws BitmovinException if fails to make API call
     */
    public DtsAudioConfiguration create(DtsAudioConfiguration dtsAudioConfiguration) throws BitmovinException {
        try {
            return this.apiClient.create(dtsAudioConfiguration).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * Delete DTS Codec Configuration
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
     * DTS Codec Configuration Details
     * 
     * @param configurationId Id of the codec configuration (required)
     * @return DtsAudioConfiguration
     * @throws BitmovinException if fails to make API call
     */
    public DtsAudioConfiguration get(String configurationId) throws BitmovinException {
        try {
            return this.apiClient.get(configurationId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * List DTS Codec Configurations
     * 
     * @return List&lt;DtsAudioConfiguration&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<DtsAudioConfiguration> list() throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * List DTS Codec Configurations
     * 
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;DtsAudioConfiguration&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<DtsAudioConfiguration> list(DtsAudioConfigurationListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    interface DtsApiClient {
    
        @RequestLine("POST /encoding/configurations/audio/dts")
        ResponseEnvelope<DtsAudioConfiguration> create(DtsAudioConfiguration dtsAudioConfiguration) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/configurations/audio/dts/{configuration_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "configuration_id") String configurationId) throws BitmovinException;
    
        @RequestLine("GET /encoding/configurations/audio/dts/{configuration_id}")
        ResponseEnvelope<DtsAudioConfiguration> get(@Param(value = "configuration_id") String configurationId) throws BitmovinException;
    
        @RequestLine("GET /encoding/configurations/audio/dts")
        ResponseEnvelope<PaginationResponse<DtsAudioConfiguration>> list(@QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    }
}
