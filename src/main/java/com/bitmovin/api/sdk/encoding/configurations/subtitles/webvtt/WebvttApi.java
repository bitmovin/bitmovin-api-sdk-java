package com.bitmovin.api.sdk.encoding.configurations.subtitles.webvtt;

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
import com.bitmovin.api.sdk.encoding.configurations.subtitles.webvtt.customdata.CustomdataApi;

public class WebvttApi {
    public final CustomdataApi customdata;

    private final WebvttApiClient apiClient;

    public WebvttApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(WebvttApiClient.class);

        this.customdata = new CustomdataApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of WebvttApi
     */
    public static BitmovinApiBuilder<WebvttApi> builder() {
        return new BitmovinApiBuilder<>(WebvttApi.class);
    }
    /**
     * Create WebVtt subtitle configuration
     * 
     * @param webVttConfiguration The WebVtt subtitle configuration to be created (required)
     * @return WebVttConfiguration
     * @throws BitmovinException if fails to make API call
     */
    public WebVttConfiguration create(WebVttConfiguration webVttConfiguration) throws BitmovinException {
        try {
            return this.apiClient.create(webVttConfiguration).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * Delete WebVtt subtitle configuration
     * 
     * @param configurationId Id of the subtitle configuration (required)
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
     * WebVtt subtitle configuration details
     * 
     * @param configurationId Id of the codec configuration (required)
     * @return WebVttConfiguration
     * @throws BitmovinException if fails to make API call
     */
    public WebVttConfiguration get(String configurationId) throws BitmovinException {
        try {
            return this.apiClient.get(configurationId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * List WebVtt subtitle configurations
     * 
     * @return List&lt;WebVttConfiguration&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<WebVttConfiguration> list() throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * List WebVtt subtitle configurations
     * 
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;WebVttConfiguration&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<WebVttConfiguration> list(WebVttConfigurationListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface WebvttApiClient { 
        @RequestLine("POST /encoding/configurations/subtitles/webvtt")
        ResponseEnvelope<WebVttConfiguration> create(WebVttConfiguration webVttConfiguration) throws BitmovinException;
   
        @RequestLine("DELETE /encoding/configurations/subtitles/webvtt/{configuration_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "configuration_id") String configurationId) throws BitmovinException;
   
        @RequestLine("GET /encoding/configurations/subtitles/webvtt/{configuration_id}")
        ResponseEnvelope<WebVttConfiguration> get(@Param(value = "configuration_id") String configurationId) throws BitmovinException;
   
        @RequestLine("GET /encoding/configurations/subtitles/webvtt")
        ResponseEnvelope<PaginationResponse<WebVttConfiguration>> list(@QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    }
}
