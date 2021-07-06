package com.bitmovin.api.sdk.encoding.configurations.audio.ac3;

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
import com.bitmovin.api.sdk.encoding.configurations.audio.ac3.customdata.CustomdataApi;

public class Ac3Api {
    public final CustomdataApi customdata;

    private final Ac3ApiClient apiClient;

    public Ac3Api(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(Ac3ApiClient.class);

        this.customdata = new CustomdataApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of Ac3Api
     */
    public static BitmovinApiBuilder<Ac3Api> builder() {
        return new BitmovinApiBuilder<>(Ac3Api.class);
    }
    
    /**
     * Create AC3 Codec Configuration.  Deprecation notice: use Dolby Digital instead. For more information check out our tutorial here: https://bitmovin.com/docs/encoding/tutorials/how-to-create-dolby-digital-plus-encodings 
     * 
     * @param ac3AudioConfiguration The AC3 Codec Configuration to be created (required)
     * @return Ac3AudioConfiguration
     * @throws BitmovinException if fails to make API call
     * @deprecated
     */
    @Deprecated
    public Ac3AudioConfiguration create(Ac3AudioConfiguration ac3AudioConfiguration) throws BitmovinException {
        try {
            return this.apiClient.create(ac3AudioConfiguration).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * Delete AC3 Codec Configuration.  Deprecation notice: use Dolby Digital instead. For more information check out our tutorial here: https://bitmovin.com/docs/encoding/tutorials/how-to-create-dolby-digital-plus-encodings 
     * 
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
     * AC3 Codec Configuration Details  Deprecation notice: use Dolby Digital instead. For more information check out our tutorial here: https://bitmovin.com/docs/encoding/tutorials/how-to-create-dolby-digital-plus-encodings 
     * 
     * @param configurationId Id of the codec configuration (required)
     * @return Ac3AudioConfiguration
     * @throws BitmovinException if fails to make API call
     * @deprecated
     */
    @Deprecated
    public Ac3AudioConfiguration get(String configurationId) throws BitmovinException {
        try {
            return this.apiClient.get(configurationId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * List AC3 Configurations.  Deprecation notice: use Dolby Digital instead. For more information check out our tutorial here:  https://bitmovin.com/docs/encoding/tutorials/how-to-create-dolby-digital-plus-encodings 
     * 
     * @return List&lt;Ac3AudioConfiguration&gt;
     * @throws BitmovinException if fails to make API call
     * @deprecated
     */
    @Deprecated
    public PaginationResponse<Ac3AudioConfiguration> list() throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * List AC3 Configurations.  Deprecation notice: use Dolby Digital instead. For more information check out our tutorial here:  https://bitmovin.com/docs/encoding/tutorials/how-to-create-dolby-digital-plus-encodings 
     * 
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;Ac3AudioConfiguration&gt;
     * @throws BitmovinException if fails to make API call
     * @deprecated
     */
    @Deprecated
    public PaginationResponse<Ac3AudioConfiguration> list(Ac3AudioConfigurationListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    interface Ac3ApiClient {
    
        @RequestLine("POST /encoding/configurations/audio/ac3")
        ResponseEnvelope<Ac3AudioConfiguration> create(Ac3AudioConfiguration ac3AudioConfiguration) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/configurations/audio/ac3/{configuration_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "configuration_id") String configurationId) throws BitmovinException;
    
        @RequestLine("GET /encoding/configurations/audio/ac3/{configuration_id}")
        ResponseEnvelope<Ac3AudioConfiguration> get(@Param(value = "configuration_id") String configurationId) throws BitmovinException;
    
        @RequestLine("GET /encoding/configurations/audio/ac3")
        ResponseEnvelope<PaginationResponse<Ac3AudioConfiguration>> list(@QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    }
}
