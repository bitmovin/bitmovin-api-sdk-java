package com.bitmovin.api.sdk.encoding.configurations.subtitles.dvbSubtitle;

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
import com.bitmovin.api.sdk.encoding.configurations.subtitles.dvbSubtitle.customdata.CustomdataApi;

public class DvbSubtitleApi {
    public final CustomdataApi customdata;

    private final DvbSubtitleApiClient apiClient;

    public DvbSubtitleApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(DvbSubtitleApiClient.class);

        this.customdata = new CustomdataApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of DvbSubtitleApi
     */
    public static BitmovinApiBuilder<DvbSubtitleApi> builder() {
        return new BitmovinApiBuilder<>(DvbSubtitleApi.class);
    }

    /**
     * Create DVB-SUB subtitle configuration
     * 
     * @param dvbSubtitleConfiguration The DVB-SUB subtitle configuration to be created (required)
     * @return DvbSubtitleConfiguration
     * @throws BitmovinException if fails to make API call
     */
    public DvbSubtitleConfiguration create(DvbSubtitleConfiguration dvbSubtitleConfiguration) throws BitmovinException {
        try {
            return this.apiClient.create(dvbSubtitleConfiguration).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * Delete DVB-SUB subtitle configuration
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
     * DVB-SUB subtitle configuration details
     * 
     * @param configurationId Id of the codec configuration (required)
     * @return DvbSubtitleConfiguration
     * @throws BitmovinException if fails to make API call
     */
    public DvbSubtitleConfiguration get(String configurationId) throws BitmovinException {
        try {
            return this.apiClient.get(configurationId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * List DVB-SUB subtitle configurations
     * 
     * @return List&lt;DvbSubtitleConfiguration&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<DvbSubtitleConfiguration> list() throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * List DVB-SUB subtitle configurations
     * 
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;DvbSubtitleConfiguration&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<DvbSubtitleConfiguration> list(DvbSubtitleConfigurationListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface DvbSubtitleApiClient {

        @RequestLine("POST /encoding/configurations/subtitles/dvb-subtitle")
        ResponseEnvelope<DvbSubtitleConfiguration> create(DvbSubtitleConfiguration dvbSubtitleConfiguration) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/configurations/subtitles/dvb-subtitle/{configuration_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "configuration_id") String configurationId) throws BitmovinException;
    
        @RequestLine("GET /encoding/configurations/subtitles/dvb-subtitle/{configuration_id}")
        ResponseEnvelope<DvbSubtitleConfiguration> get(@Param(value = "configuration_id") String configurationId) throws BitmovinException;
    
        @RequestLine("GET /encoding/configurations/subtitles/dvb-subtitle")
        ResponseEnvelope<PaginationResponse<DvbSubtitleConfiguration>> list(@QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    }
}
