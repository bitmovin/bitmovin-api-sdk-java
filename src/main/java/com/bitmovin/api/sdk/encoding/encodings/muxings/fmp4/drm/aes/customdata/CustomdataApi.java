package com.bitmovin.api.sdk.encoding.encodings.muxings.fmp4.drm.aes.customdata;

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
     * AES Encryption Custom Data of fMP4
     * 
     * @param encodingId Id of the encoding. (required)
     * @param muxingId Id of the fMP4 muxing. (required)
     * @param drmId Id of the AES encryption configuration. (required)
     * @return CustomData
     * @throws BitmovinException if fails to make API call
     */
    public CustomData getCustomData(String encodingId, String muxingId, String drmId) throws BitmovinException {
        try {
            return this.apiClient.getCustomData(encodingId, muxingId, drmId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    interface CustomdataApiClient {
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/muxings/fmp4/{muxing_id}/drm/aes/{drm_id}/customData")
        ResponseEnvelope<CustomData> getCustomData(@Param(value = "encoding_id") String encodingId, @Param(value = "muxing_id") String muxingId, @Param(value = "drm_id") String drmId) throws BitmovinException;
    }
}
