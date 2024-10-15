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
import static com.bitmovin.api.sdk.common.BitmovinExceptionFactory.buildBitmovinException;
import com.bitmovin.api.sdk.common.BitmovinDateExpander;
import com.bitmovin.api.sdk.common.QueryMapWrapper;
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
     * @param h264VideoConfiguration The H264/AVC Codec Configuration to be created (required)
     * @return H264VideoConfiguration
     * @throws BitmovinException if fails to make API call
     */
    public H264VideoConfiguration create(H264VideoConfiguration h264VideoConfiguration) throws BitmovinException {
        try {
            return this.apiClient.create(h264VideoConfiguration).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * Delete H264/AVC Codec Configuration
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
     * H264/AVC Codec Configuration Details
     * 
     * @param configurationId Id of the codec configuration (required)
     * @return H264VideoConfiguration
     * @throws BitmovinException if fails to make API call
     */
    public H264VideoConfiguration get(String configurationId) throws BitmovinException {
        try {
            return this.apiClient.get(configurationId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * List H264/AVC Codec Configurations
     * 
     * @return List&lt;H264VideoConfiguration&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<H264VideoConfiguration> list() throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * List H264/AVC Codec Configurations
     * 
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;H264VideoConfiguration&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<H264VideoConfiguration> list(H264VideoConfigurationListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface H264ApiClient { 
        @RequestLine("POST /encoding/configurations/video/h264")
        ResponseEnvelope<H264VideoConfiguration> create(H264VideoConfiguration h264VideoConfiguration) throws BitmovinException;
   
        @RequestLine("DELETE /encoding/configurations/video/h264/{configuration_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "configuration_id") String configurationId) throws BitmovinException;
   
        @RequestLine("GET /encoding/configurations/video/h264/{configuration_id}")
        ResponseEnvelope<H264VideoConfiguration> get(@Param(value = "configuration_id") String configurationId) throws BitmovinException;
   
        @RequestLine("GET /encoding/configurations/video/h264")
        ResponseEnvelope<PaginationResponse<H264VideoConfiguration>> list(@QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    }
}
