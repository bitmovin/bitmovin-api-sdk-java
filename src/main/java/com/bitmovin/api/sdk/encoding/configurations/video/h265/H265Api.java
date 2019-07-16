package com.bitmovin.api.sdk.encoding.configurations.video.h265;

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
import com.bitmovin.api.sdk.common.BitmovinDateExpander;
import com.bitmovin.api.sdk.common.BitmovinApiBuilder;
import com.bitmovin.api.sdk.common.BitmovinApiClientFactory;
import com.bitmovin.api.sdk.encoding.configurations.video.h265.customdata.CustomdataApi;

public class H265Api {
    public final CustomdataApi customdata;

    private final H265ApiClient apiClient;

    public H265Api(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(H265ApiClient.class);

        this.customdata = new CustomdataApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of H265Api
     */
    public static BitmovinApiBuilder<H265Api> builder() {
        return new BitmovinApiBuilder<>(H265Api.class);
    }
    
    /**
     * Create H265/HEVC Codec Configuration
     * 
     * @param h265VideoConfiguration The H265/HEVC Codec Configuration to be created (required)
     * @return H265VideoConfiguration
     * @throws BitmovinException if fails to make API call
     */
    public H265VideoConfiguration create(H265VideoConfiguration h265VideoConfiguration) throws BitmovinException {
        return this.apiClient.create(h265VideoConfiguration).getData().getResult();
    }
    
    /**
     * Delete H265/HEVC Codec Configuration
     * 
     * @param configurationId Id of the codec configuration (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse delete(String configurationId) throws BitmovinException {
        return this.apiClient.delete(configurationId).getData().getResult();
    }
    
    /**
     * H265/HEVC Codec Configuration Details
     * 
     * @param configurationId Id of the codec configuration (required)
     * @return H265VideoConfiguration
     * @throws BitmovinException if fails to make API call
     */
    public H265VideoConfiguration get(String configurationId) throws BitmovinException {
        return this.apiClient.get(configurationId).getData().getResult();
    }
    
    /**
     * List H265/HEVC Codec Configurations
     * 
     * @return List&lt;H265VideoConfiguration&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<H265VideoConfiguration> list() throws BitmovinException {
        return this.apiClient.list(new HashMap<String, Object>()).getData().getResult();
    }
    /**
     * List H265/HEVC Codec Configurations
     * 
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;H265VideoConfiguration&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<H265VideoConfiguration> list(H265VideoConfigurationListQueryParams queryParams) throws BitmovinException {
        return this.apiClient.list(queryParams).getData().getResult();
    }
    
    interface H265ApiClient {
    
        @RequestLine("POST /encoding/configurations/video/h265")
        ResponseEnvelope<H265VideoConfiguration> create(H265VideoConfiguration h265VideoConfiguration) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/configurations/video/h265/{configuration_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "configuration_id") String configurationId) throws BitmovinException;
    
        @RequestLine("GET /encoding/configurations/video/h265/{configuration_id}")
        ResponseEnvelope<H265VideoConfiguration> get(@Param(value = "configuration_id") String configurationId) throws BitmovinException;
    
        @RequestLine("GET /encoding/configurations/video/h265")
        ResponseEnvelope<PaginationResponse<H265VideoConfiguration>> list(@QueryMap Map<String, Object> queryParams) throws BitmovinException;
    }
}
