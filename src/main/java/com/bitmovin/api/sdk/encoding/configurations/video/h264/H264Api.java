package com.bitmovin.api.sdk.encoding.configurations.video.h264;

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
import com.bitmovin.api.sdk.encoding.configurations.video.h264.customdata.CustomdataApi;

public class H264Api {
    public final CustomdataApi customdata;

    private final H264ApiClient apiClient;

    public H264Api(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(H264ApiClient.class);

        this.customdata = new CustomdataApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of H264Api
     */
    public static BitmovinApiBuilder<H264Api> builder() {
        return new BitmovinApiBuilder<>(H264Api.class);
    }
    
    /**
     * Create H264/AVC Codec Configuration
     * 
     * @param h264VideoConfiguration  (required)
     * @return H264VideoConfiguration
     * @throws BitmovinException if fails to make API call
     */
    public H264VideoConfiguration create(H264VideoConfiguration h264VideoConfiguration) throws BitmovinException {
        return this.apiClient.create(h264VideoConfiguration).getData().getResult();
    }
    
    /**
     * Delete H264/AVC Codec Configuration
     * 
     * @param configurationId Id of the codec configuration (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse delete(String configurationId) throws BitmovinException {
        return this.apiClient.delete(configurationId).getData().getResult();
    }
    
    /**
     * H264/AVC Codec Configuration Details
     * 
     * @param configurationId Id of the codec configuration (required)
     * @return H264VideoConfiguration
     * @throws BitmovinException if fails to make API call
     */
    public H264VideoConfiguration get(String configurationId) throws BitmovinException {
        return this.apiClient.get(configurationId).getData().getResult();
    }
    
    /**
     * List H264/AVC Codec Configurations
     * 
     * @return List&lt;H264VideoConfiguration&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<H264VideoConfiguration> list() throws BitmovinException {
        return this.apiClient.list(new HashMap<String, Object>()).getData().getResult();
    }
    /**
     * List H264/AVC Codec Configurations
     * 
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;H264VideoConfiguration&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<H264VideoConfiguration> list(H264VideoConfigurationListQueryParams queryParams) throws BitmovinException {
        return this.apiClient.list(queryParams).getData().getResult();
    }
    
    interface H264ApiClient {
    
        @RequestLine("POST /encoding/configurations/video/h264")
        ResponseEnvelope<H264VideoConfiguration> create(H264VideoConfiguration h264VideoConfiguration) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/configurations/video/h264/{configuration_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "configuration_id") String configurationId) throws BitmovinException;
    
        @RequestLine("GET /encoding/configurations/video/h264/{configuration_id}")
        ResponseEnvelope<H264VideoConfiguration> get(@Param(value = "configuration_id") String configurationId) throws BitmovinException;
    
        @RequestLine("GET /encoding/configurations/video/h264")
        ResponseEnvelope<PaginationResponse<H264VideoConfiguration>> list(@QueryMap Map<String, Object> queryParams) throws BitmovinException;
    }
}
