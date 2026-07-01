package com.bitmovin.api.sdk.encoding.configurations.video.h265v2;

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

public class H265v2Api {

    private final H265v2ApiClient apiClient;

    public H265v2Api(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(H265v2ApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of H265v2Api
     */
    public static BitmovinApiBuilder<H265v2Api> builder() {
        return new BitmovinApiBuilder<>(H265v2Api.class);
    }
    /**
     * Create H265 V2 Codec Configuration
     * 
     * @param h265V2VideoConfiguration The H265 V2 Codec Configuration to be created (required)
     * @return H265V2VideoConfiguration
     * @throws BitmovinException if fails to make API call
     */
    public H265V2VideoConfiguration create(H265V2VideoConfiguration h265V2VideoConfiguration) throws BitmovinException {
        try {
            return this.apiClient.create(h265V2VideoConfiguration).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * Delete H265 V2 Codec Configuration
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
     * H265 V2 Codec Configuration Details
     * 
     * @param configurationId Id of the codec configuration (required)
     * @return H265V2VideoConfiguration
     * @throws BitmovinException if fails to make API call
     */
    public H265V2VideoConfiguration get(String configurationId) throws BitmovinException {
        try {
            return this.apiClient.get(configurationId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * List H265 V2 Codec Configurations
     * 
     * @return List&lt;H265V2VideoConfiguration&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<H265V2VideoConfiguration> list() throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * List H265 V2 Codec Configurations
     * 
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;H265V2VideoConfiguration&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<H265V2VideoConfiguration> list(H265V2VideoConfigurationListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface H265v2ApiClient { 
        @RequestLine("POST /encoding/configurations/video/h265v2")
        ResponseEnvelope<H265V2VideoConfiguration> create(H265V2VideoConfiguration h265V2VideoConfiguration) throws BitmovinException;
   
        @RequestLine("DELETE /encoding/configurations/video/h265v2/{configuration_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "configuration_id") String configurationId) throws BitmovinException;
   
        @RequestLine("GET /encoding/configurations/video/h265v2/{configuration_id}")
        ResponseEnvelope<H265V2VideoConfiguration> get(@Param(value = "configuration_id") String configurationId) throws BitmovinException;
   
        @RequestLine("GET /encoding/configurations/video/h265v2")
        ResponseEnvelope<PaginationResponse<H265V2VideoConfiguration>> list(@QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    }
}
