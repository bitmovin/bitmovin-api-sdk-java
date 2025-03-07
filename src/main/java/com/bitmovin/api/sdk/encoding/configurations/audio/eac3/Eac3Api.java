package com.bitmovin.api.sdk.encoding.configurations.audio.eac3;

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
import com.bitmovin.api.sdk.encoding.configurations.audio.eac3.customdata.CustomdataApi;

public class Eac3Api {
    public final CustomdataApi customdata;

    private final Eac3ApiClient apiClient;

    public Eac3Api(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(Eac3ApiClient.class);

        this.customdata = new CustomdataApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of Eac3Api
     */
    public static BitmovinApiBuilder<Eac3Api> builder() {
        return new BitmovinApiBuilder<>(Eac3Api.class);
    }
    /**
     * Create E-AC3 Codec Configuration
     * Deprecation notice: use Dolby Digital Plus instead. For more information check out our tutorial here: https://bitmovin.com/docs/encoding/tutorials/how-to-create-dolby-digital-plus-encodings 
     * @param eac3AudioConfiguration The E-AC3 Codec Configuration to be created (required)
     * @return Eac3AudioConfiguration
     * @throws BitmovinException if fails to make API call
     * @deprecated
     */
    @Deprecated
    public Eac3AudioConfiguration create(Eac3AudioConfiguration eac3AudioConfiguration) throws BitmovinException {
        try {
            return this.apiClient.create(eac3AudioConfiguration).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * Delete E-AC3 Codec Configuration
     * Deprecation notice: use Dolby Digital Plus instead. For more information check out our tutorial here: https://bitmovin.com/docs/encoding/tutorials/how-to-create-dolby-digital-plus-encodings 
     * @param configurationId Id of the codec configuration (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     * @deprecated
     */
    @Deprecated
    public BitmovinResponse delete(String configurationId) throws BitmovinException {
        try {
            return this.apiClient.delete(configurationId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * E-AC3 Codec Configuration Details
     * Deprecation notice: use Dolby Digital Plus instead. For more information check out our tutorial here: https://bitmovin.com/docs/encoding/tutorials/how-to-create-dolby-digital-plus-encodings 
     * @param configurationId Id of the codec configuration (required)
     * @return Eac3AudioConfiguration
     * @throws BitmovinException if fails to make API call
     * @deprecated
     */
    @Deprecated
    public Eac3AudioConfiguration get(String configurationId) throws BitmovinException {
        try {
            return this.apiClient.get(configurationId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * List E-AC3 Configurations
     * Deprecation notice: use Dolby Digital Plus instead. For more information check out our tutorial here: https://bitmovin.com/docs/encoding/tutorials/how-to-create-dolby-digital-plus-encodings 
     * @return List&lt;Eac3AudioConfiguration&gt;
     * @throws BitmovinException if fails to make API call
     * @deprecated
     */
    @Deprecated
    public PaginationResponse<Eac3AudioConfiguration> list() throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * List E-AC3 Configurations
     * Deprecation notice: use Dolby Digital Plus instead. For more information check out our tutorial here: https://bitmovin.com/docs/encoding/tutorials/how-to-create-dolby-digital-plus-encodings 
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;Eac3AudioConfiguration&gt;
     * @throws BitmovinException if fails to make API call
     * @deprecated
     */
    @Deprecated
    public PaginationResponse<Eac3AudioConfiguration> list(Eac3AudioConfigurationListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface Eac3ApiClient { 
        @RequestLine("POST /encoding/configurations/audio/eac3")
        ResponseEnvelope<Eac3AudioConfiguration> create(Eac3AudioConfiguration eac3AudioConfiguration) throws BitmovinException;
   
        @RequestLine("DELETE /encoding/configurations/audio/eac3/{configuration_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "configuration_id") String configurationId) throws BitmovinException;
   
        @RequestLine("GET /encoding/configurations/audio/eac3/{configuration_id}")
        ResponseEnvelope<Eac3AudioConfiguration> get(@Param(value = "configuration_id") String configurationId) throws BitmovinException;
   
        @RequestLine("GET /encoding/configurations/audio/eac3")
        ResponseEnvelope<PaginationResponse<Eac3AudioConfiguration>> list(@QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    }
}
