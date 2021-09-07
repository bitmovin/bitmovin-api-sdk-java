package com.bitmovin.api.sdk.encoding.configurations.subtitles.imsc;

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
import com.bitmovin.api.sdk.encoding.configurations.subtitles.imsc.customdata.CustomdataApi;

public class ImscApi {
    public final CustomdataApi customdata;

    private final ImscApiClient apiClient;

    public ImscApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(ImscApiClient.class);

        this.customdata = new CustomdataApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of ImscApi
     */
    public static BitmovinApiBuilder<ImscApi> builder() {
        return new BitmovinApiBuilder<>(ImscApi.class);
    }

    /**
     * Create IMSC subtitle configuration
     * 
     * @param imscConfiguration The IMSC subtitle configuration to be created (required)
     * @return ImscConfiguration
     * @throws BitmovinException if fails to make API call
     */
    public ImscConfiguration create(ImscConfiguration imscConfiguration) throws BitmovinException {
        try {
            return this.apiClient.create(imscConfiguration).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * Delete IMSC subtitle configuration
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
     * IMSC subtitle configuration details
     * 
     * @param configurationId Id of the codec configuration (required)
     * @return ImscConfiguration
     * @throws BitmovinException if fails to make API call
     */
    public ImscConfiguration get(String configurationId) throws BitmovinException {
        try {
            return this.apiClient.get(configurationId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * List IMSC subtitle configurations
     * 
     * @return List&lt;ImscConfiguration&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<ImscConfiguration> list() throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * List IMSC subtitle configurations
     * 
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;ImscConfiguration&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<ImscConfiguration> list(ImscConfigurationListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface ImscApiClient {

        @RequestLine("POST /encoding/configurations/subtitles/imsc")
        ResponseEnvelope<ImscConfiguration> create(ImscConfiguration imscConfiguration) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/configurations/subtitles/imsc/{configuration_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "configuration_id") String configurationId) throws BitmovinException;
    
        @RequestLine("GET /encoding/configurations/subtitles/imsc/{configuration_id}")
        ResponseEnvelope<ImscConfiguration> get(@Param(value = "configuration_id") String configurationId) throws BitmovinException;
    
        @RequestLine("GET /encoding/configurations/subtitles/imsc")
        ResponseEnvelope<PaginationResponse<ImscConfiguration>> list(@QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    }
}
