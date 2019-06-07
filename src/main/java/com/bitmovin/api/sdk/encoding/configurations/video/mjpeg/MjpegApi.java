package com.bitmovin.api.sdk.encoding.configurations.video.mjpeg;

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
import com.bitmovin.api.sdk.encoding.configurations.video.mjpeg.customdata.CustomdataApi;

public class MjpegApi {
    public final CustomdataApi customdata;

    private final MjpegApiClient apiClient;

    public MjpegApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(MjpegApiClient.class);

        this.customdata = new CustomdataApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of MjpegApi
     */
    public static BitmovinApiBuilder<MjpegApi> builder() {
        return new BitmovinApiBuilder<>(MjpegApi.class);
    }
    
    /**
     * Create MJPEG Codec Configuration
     * 
     * @param mjpegVideoConfiguration  (required)
     * @return MjpegVideoConfiguration
     * @throws BitmovinException if fails to make API call
     */
    public MjpegVideoConfiguration create(MjpegVideoConfiguration mjpegVideoConfiguration) throws BitmovinException {
        return this.apiClient.create(mjpegVideoConfiguration).getData().getResult();
    }
    
    /**
     * Delete MJPEG Codec Configuration
     * 
     * @param configurationId Id of the codec configuration (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse delete(String configurationId) throws BitmovinException {
        return this.apiClient.delete(configurationId).getData().getResult();
    }
    
    /**
     * MJPEG Codec Configuration Details
     * 
     * @param configurationId Id of the codec configuration (required)
     * @return MjpegVideoConfiguration
     * @throws BitmovinException if fails to make API call
     */
    public MjpegVideoConfiguration get(String configurationId) throws BitmovinException {
        return this.apiClient.get(configurationId).getData().getResult();
    }
    
    /**
     * List MJPEG Configurations
     * 
     * @return List&lt;MjpegVideoConfiguration&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<MjpegVideoConfiguration> list() throws BitmovinException {
        return this.apiClient.list(new HashMap<String, Object>()).getData().getResult();
    }
    /**
     * List MJPEG Configurations
     * 
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;MjpegVideoConfiguration&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<MjpegVideoConfiguration> list(MjpegVideoConfigurationListQueryParams queryParams) throws BitmovinException {
        return this.apiClient.list(queryParams).getData().getResult();
    }
    
    interface MjpegApiClient {
    
        @RequestLine("POST /encoding/configurations/video/mjpeg")
        ResponseEnvelope<MjpegVideoConfiguration> create(MjpegVideoConfiguration mjpegVideoConfiguration) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/configurations/video/mjpeg/{configuration_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "configuration_id") String configurationId) throws BitmovinException;
    
        @RequestLine("GET /encoding/configurations/video/mjpeg/{configuration_id}")
        ResponseEnvelope<MjpegVideoConfiguration> get(@Param(value = "configuration_id") String configurationId) throws BitmovinException;
    
        @RequestLine("GET /encoding/configurations/video/mjpeg")
        ResponseEnvelope<PaginationResponse<MjpegVideoConfiguration>> list(@QueryMap Map<String, Object> queryParams) throws BitmovinException;
    }
}
