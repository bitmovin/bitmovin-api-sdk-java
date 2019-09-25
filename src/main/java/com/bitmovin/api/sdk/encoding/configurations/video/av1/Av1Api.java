package com.bitmovin.api.sdk.encoding.configurations.video.av1;

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
import com.bitmovin.api.sdk.encoding.configurations.video.av1.customdata.CustomdataApi;

public class Av1Api {
    public final CustomdataApi customdata;

    private final Av1ApiClient apiClient;

    public Av1Api(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(Av1ApiClient.class);

        this.customdata = new CustomdataApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of Av1Api
     */
    public static BitmovinApiBuilder<Av1Api> builder() {
        return new BitmovinApiBuilder<>(Av1Api.class);
    }
    
    /**
     * Create AV1 Codec Configuration
     * 
     * @param av1VideoConfiguration The AV1 Codec Configuration to be created (required)
     * @return Av1VideoConfiguration
     * @throws BitmovinException if fails to make API call
     */
    public Av1VideoConfiguration create(Av1VideoConfiguration av1VideoConfiguration) throws BitmovinException {
        try {
            return this.apiClient.create(av1VideoConfiguration).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * Delete AV1 Codec Configuration
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
     * AV1 Codec Configuration Details
     * 
     * @param configurationId Id of the codec configuration (required)
     * @return Av1VideoConfiguration
     * @throws BitmovinException if fails to make API call
     */
    public Av1VideoConfiguration get(String configurationId) throws BitmovinException {
        try {
            return this.apiClient.get(configurationId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * List AV1 Codec Configurations
     * 
     * @return List&lt;Av1VideoConfiguration&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<Av1VideoConfiguration> list() throws BitmovinException {
        try {
            return this.apiClient.list(new HashMap<String, Object>()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * List AV1 Codec Configurations
     * 
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;Av1VideoConfiguration&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<Av1VideoConfiguration> list(Av1VideoConfigurationListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(queryParams).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    interface Av1ApiClient {
    
        @RequestLine("POST /encoding/configurations/video/av1")
        ResponseEnvelope<Av1VideoConfiguration> create(Av1VideoConfiguration av1VideoConfiguration) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/configurations/video/av1/{configuration_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "configuration_id") String configurationId) throws BitmovinException;
    
        @RequestLine("GET /encoding/configurations/video/av1/{configuration_id}")
        ResponseEnvelope<Av1VideoConfiguration> get(@Param(value = "configuration_id") String configurationId) throws BitmovinException;
    
        @RequestLine("GET /encoding/configurations/video/av1")
        ResponseEnvelope<PaginationResponse<Av1VideoConfiguration>> list(@QueryMap Map<String, Object> queryParams) throws BitmovinException;
    }
}
