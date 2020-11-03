package com.bitmovin.api.sdk.encoding.configurations;

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
import com.bitmovin.api.sdk.encoding.configurations.type.TypeApi;
import com.bitmovin.api.sdk.encoding.configurations.video.VideoApi;
import com.bitmovin.api.sdk.encoding.configurations.audio.AudioApi;
import com.bitmovin.api.sdk.encoding.configurations.subtitles.SubtitlesApi;

public class ConfigurationsApi {
    public final TypeApi type;
    public final VideoApi video;
    public final AudioApi audio;
    public final SubtitlesApi subtitles;

    private final ConfigurationsApiClient apiClient;

    public ConfigurationsApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(ConfigurationsApiClient.class);

        this.type = new TypeApi(clientFactory);
        this.video = new VideoApi(clientFactory);
        this.audio = new AudioApi(clientFactory);
        this.subtitles = new SubtitlesApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of ConfigurationsApi
     */
    public static BitmovinApiBuilder<ConfigurationsApi> builder() {
        return new BitmovinApiBuilder<>(ConfigurationsApi.class);
    }
    
    /**
     * Get Codec Configuration Details
     * 
     * @param configurationId Id of the codec configuration (required)
     * @return CodecConfiguration
     * @throws BitmovinException if fails to make API call
     */
    public CodecConfiguration get(String configurationId) throws BitmovinException {
        try {
            return this.apiClient.get(configurationId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * List all Codec Configurations
     * 
     * @return List&lt;CodecConfiguration&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<CodecConfiguration> list() throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * List all Codec Configurations
     * 
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;CodecConfiguration&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<CodecConfiguration> list(CodecConfigurationListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    interface ConfigurationsApiClient {
    
        @RequestLine("GET /encoding/configurations/{configuration_id}")
        ResponseEnvelope<CodecConfiguration> get(@Param(value = "configuration_id") String configurationId) throws BitmovinException;
    
        @RequestLine("GET /encoding/configurations")
        ResponseEnvelope<PaginationResponse<CodecConfiguration>> list(@QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    }
}
