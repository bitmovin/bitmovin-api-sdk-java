package com.bitmovin.api.sdk.encoding.configurations.audio.dtsx;

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
import com.bitmovin.api.sdk.encoding.configurations.audio.dtsx.customdata.CustomdataApi;

public class DtsxApi {
    public final CustomdataApi customdata;

    private final DtsxApiClient apiClient;

    public DtsxApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(DtsxApiClient.class);

        this.customdata = new CustomdataApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of DtsxApi
     */
    public static BitmovinApiBuilder<DtsxApi> builder() {
        return new BitmovinApiBuilder<>(DtsxApi.class);
    }
    /**
     * Create DTS:X Codec Configuration
     * 
     * @param dtsXAudioConfiguration The DTS:X Codec Configuration to be created (required)
     * @return DtsXAudioConfiguration
     * @throws BitmovinException if fails to make API call
     */
    public DtsXAudioConfiguration create(DtsXAudioConfiguration dtsXAudioConfiguration) throws BitmovinException {
        try {
            return this.apiClient.create(dtsXAudioConfiguration).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * Delete DTS:X Codec Configuration
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
     * DTS:X Codec Configuration Details
     * 
     * @param configurationId Id of the codec configuration (required)
     * @return DtsXAudioConfiguration
     * @throws BitmovinException if fails to make API call
     */
    public DtsXAudioConfiguration get(String configurationId) throws BitmovinException {
        try {
            return this.apiClient.get(configurationId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * List DTS:X Codec Configurations
     * 
     * @return List&lt;DtsXAudioConfiguration&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<DtsXAudioConfiguration> list() throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * List DTS:X Codec Configurations
     * 
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;DtsXAudioConfiguration&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<DtsXAudioConfiguration> list(DtsXAudioConfigurationListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface DtsxApiClient { 
        @RequestLine("POST /encoding/configurations/audio/dtsx")
        ResponseEnvelope<DtsXAudioConfiguration> create(DtsXAudioConfiguration dtsXAudioConfiguration) throws BitmovinException;
   
        @RequestLine("DELETE /encoding/configurations/audio/dtsx/{configuration_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "configuration_id") String configurationId) throws BitmovinException;
   
        @RequestLine("GET /encoding/configurations/audio/dtsx/{configuration_id}")
        ResponseEnvelope<DtsXAudioConfiguration> get(@Param(value = "configuration_id") String configurationId) throws BitmovinException;
   
        @RequestLine("GET /encoding/configurations/audio/dtsx")
        ResponseEnvelope<PaginationResponse<DtsXAudioConfiguration>> list(@QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    }
}
