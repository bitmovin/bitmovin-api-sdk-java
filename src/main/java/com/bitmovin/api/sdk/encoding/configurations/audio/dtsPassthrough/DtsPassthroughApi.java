package com.bitmovin.api.sdk.encoding.configurations.audio.dtsPassthrough;

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
import com.bitmovin.api.sdk.encoding.configurations.audio.dtsPassthrough.customdata.CustomdataApi;

public class DtsPassthroughApi {
    public final CustomdataApi customdata;

    private final DtsPassthroughApiClient apiClient;

    public DtsPassthroughApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(DtsPassthroughApiClient.class);

        this.customdata = new CustomdataApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of DtsPassthroughApi
     */
    public static BitmovinApiBuilder<DtsPassthroughApi> builder() {
        return new BitmovinApiBuilder<>(DtsPassthroughApi.class);
    }
    
    /**
     * Create DTS Passthrough Configuration
     * 
     * @param dtsPassthroughAudioConfiguration The DTS Passthrough Codec Configuration to be created (required)
     * @return DtsPassthroughAudioConfiguration
     * @throws BitmovinException if fails to make API call
     */
    public DtsPassthroughAudioConfiguration create(DtsPassthroughAudioConfiguration dtsPassthroughAudioConfiguration) throws BitmovinException {
        try {
            return this.apiClient.create(dtsPassthroughAudioConfiguration).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * Delete DTS Passthrough Codec Configuration
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
     * DTS Passthrough Codec Configuration Details
     * 
     * @param configurationId Id of the codec configuration (required)
     * @return DtsPassthroughAudioConfiguration
     * @throws BitmovinException if fails to make API call
     */
    public DtsPassthroughAudioConfiguration get(String configurationId) throws BitmovinException {
        try {
            return this.apiClient.get(configurationId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * List DTS Passthrough Configurations
     * 
     * @return List&lt;DtsPassthroughAudioConfiguration&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<DtsPassthroughAudioConfiguration> list() throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * List DTS Passthrough Configurations
     * 
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;DtsPassthroughAudioConfiguration&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<DtsPassthroughAudioConfiguration> list(DtsPassthroughAudioConfigurationListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    interface DtsPassthroughApiClient {
    
        @RequestLine("POST /encoding/configurations/audio/dts-passthrough")
        ResponseEnvelope<DtsPassthroughAudioConfiguration> create(DtsPassthroughAudioConfiguration dtsPassthroughAudioConfiguration) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/configurations/audio/dts-passthrough/{configuration_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "configuration_id") String configurationId) throws BitmovinException;
    
        @RequestLine("GET /encoding/configurations/audio/dts-passthrough/{configuration_id}")
        ResponseEnvelope<DtsPassthroughAudioConfiguration> get(@Param(value = "configuration_id") String configurationId) throws BitmovinException;
    
        @RequestLine("GET /encoding/configurations/audio/dts-passthrough")
        ResponseEnvelope<PaginationResponse<DtsPassthroughAudioConfiguration>> list(@QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    }
}
