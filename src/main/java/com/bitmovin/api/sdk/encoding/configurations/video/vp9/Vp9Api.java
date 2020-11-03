package com.bitmovin.api.sdk.encoding.configurations.video.vp9;

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
import com.bitmovin.api.sdk.encoding.configurations.video.vp9.customdata.CustomdataApi;

public class Vp9Api {
    public final CustomdataApi customdata;

    private final Vp9ApiClient apiClient;

    public Vp9Api(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(Vp9ApiClient.class);

        this.customdata = new CustomdataApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of Vp9Api
     */
    public static BitmovinApiBuilder<Vp9Api> builder() {
        return new BitmovinApiBuilder<>(Vp9Api.class);
    }
    
    /**
     * Create VP9 Codec Configuration
     * 
     * @param vp9VideoConfiguration The VP9 Codec Configuration to be created (required)
     * @return Vp9VideoConfiguration
     * @throws BitmovinException if fails to make API call
     */
    public Vp9VideoConfiguration create(Vp9VideoConfiguration vp9VideoConfiguration) throws BitmovinException {
        try {
            return this.apiClient.create(vp9VideoConfiguration).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * Delete VP9 Codec Configuration
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
     * VP9 Codec Configuration Details
     * 
     * @param configurationId Id of the codec configuration (required)
     * @return Vp9VideoConfiguration
     * @throws BitmovinException if fails to make API call
     */
    public Vp9VideoConfiguration get(String configurationId) throws BitmovinException {
        try {
            return this.apiClient.get(configurationId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * List VP9 Codec Configurations
     * 
     * @return List&lt;Vp9VideoConfiguration&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<Vp9VideoConfiguration> list() throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * List VP9 Codec Configurations
     * 
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;Vp9VideoConfiguration&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<Vp9VideoConfiguration> list(Vp9VideoConfigurationListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    interface Vp9ApiClient {
    
        @RequestLine("POST /encoding/configurations/video/vp9")
        ResponseEnvelope<Vp9VideoConfiguration> create(Vp9VideoConfiguration vp9VideoConfiguration) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/configurations/video/vp9/{configuration_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "configuration_id") String configurationId) throws BitmovinException;
    
        @RequestLine("GET /encoding/configurations/video/vp9/{configuration_id}")
        ResponseEnvelope<Vp9VideoConfiguration> get(@Param(value = "configuration_id") String configurationId) throws BitmovinException;
    
        @RequestLine("GET /encoding/configurations/video/vp9")
        ResponseEnvelope<PaginationResponse<Vp9VideoConfiguration>> list(@QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    }
}
