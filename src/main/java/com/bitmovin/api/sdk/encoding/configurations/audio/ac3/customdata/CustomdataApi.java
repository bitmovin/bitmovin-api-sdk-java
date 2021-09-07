package com.bitmovin.api.sdk.encoding.configurations.audio.ac3.customdata;

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

public class CustomdataApi {

    private final CustomdataApiClient apiClient;

    public CustomdataApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(CustomdataApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of CustomdataApi
     */
    public static BitmovinApiBuilder<CustomdataApi> builder() {
        return new BitmovinApiBuilder<>(CustomdataApi.class);
    }

    /**
     * AC3 Codec Configuration Custom Data.  Deprecation notice: use Dolby Digital instead. For more information check out our tutorial here: https://bitmovin.com/docs/encoding/tutorials/how-to-create-dolby-digital-plus-encodings 
     * 
     * @param configurationId Id of the codec configuration (required)
     * @return CustomData
     * @throws BitmovinException if fails to make API call
     * @deprecated
     */
    @Deprecated
    public CustomData getCustomData(String configurationId) throws BitmovinException {
        try {
            return this.apiClient.getCustomData(configurationId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface CustomdataApiClient {

        @RequestLine("GET /encoding/configurations/audio/ac3/{configuration_id}/customData")
        ResponseEnvelope<CustomData> getCustomData(@Param(value = "configuration_id") String configurationId) throws BitmovinException;
    }
}
