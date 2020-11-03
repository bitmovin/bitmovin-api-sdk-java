package com.bitmovin.api.sdk.encoding.configurations.video.h262;

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
import com.bitmovin.api.sdk.encoding.configurations.video.h262.customdata.CustomdataApi;

public class H262Api {
    public final CustomdataApi customdata;

    private final H262ApiClient apiClient;

    public H262Api(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(H262ApiClient.class);

        this.customdata = new CustomdataApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of H262Api
     */
    public static BitmovinApiBuilder<H262Api> builder() {
        return new BitmovinApiBuilder<>(H262Api.class);
    }
    
    /**
     * Create H262 Codec Configuration
     * 
     * @param h262VideoConfiguration The H262 Codec Configuration to be created (required)
     * @return H262VideoConfiguration
     * @throws BitmovinException if fails to make API call
     */
    public H262VideoConfiguration create(H262VideoConfiguration h262VideoConfiguration) throws BitmovinException {
        try {
            return this.apiClient.create(h262VideoConfiguration).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * Delete H262 Codec Configuration
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
     * H262 Codec Configuration Details
     * 
     * @param configurationId Id of the codec configuration (required)
     * @return H262VideoConfiguration
     * @throws BitmovinException if fails to make API call
     */
    public H262VideoConfiguration get(String configurationId) throws BitmovinException {
        try {
            return this.apiClient.get(configurationId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * List H262 Codec Configurations
     * 
     * @return List&lt;H262VideoConfiguration&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<H262VideoConfiguration> list() throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * List H262 Codec Configurations
     * 
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;H262VideoConfiguration&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<H262VideoConfiguration> list(H262VideoConfigurationListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    interface H262ApiClient {
    
        @RequestLine("POST /encoding/configurations/video/h262")
        ResponseEnvelope<H262VideoConfiguration> create(H262VideoConfiguration h262VideoConfiguration) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/configurations/video/h262/{configuration_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "configuration_id") String configurationId) throws BitmovinException;
    
        @RequestLine("GET /encoding/configurations/video/h262/{configuration_id}")
        ResponseEnvelope<H262VideoConfiguration> get(@Param(value = "configuration_id") String configurationId) throws BitmovinException;
    
        @RequestLine("GET /encoding/configurations/video/h262")
        ResponseEnvelope<PaginationResponse<H262VideoConfiguration>> list(@QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    }
}
