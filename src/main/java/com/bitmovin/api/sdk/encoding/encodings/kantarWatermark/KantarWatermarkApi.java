package com.bitmovin.api.sdk.encoding.encodings.kantarWatermark;

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

public class KantarWatermarkApi {

    private final KantarWatermarkApiClient apiClient;

    public KantarWatermarkApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(KantarWatermarkApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of KantarWatermarkApi
     */
    public static BitmovinApiBuilder<KantarWatermarkApi> builder() {
        return new BitmovinApiBuilder<>(KantarWatermarkApi.class);
    }
    /**
     * Create or replace the Kantar Watermark for an encoding
     * 
     * @param encodingId Id of the encoding. (required)
     * @param kantarWatermark The Kantar Watermark to be created (required)
     * @return KantarWatermark
     * @throws BitmovinException if fails to make API call
     */
    public KantarWatermark create(String encodingId, KantarWatermark kantarWatermark) throws BitmovinException {
        try {
            return this.apiClient.create(encodingId, kantarWatermark).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * Delete the Kantar Watermark for an encoding
     * 
     * @param encodingId Id of the encoding. (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse delete(String encodingId) throws BitmovinException {
        try {
            return this.apiClient.delete(encodingId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * Get the Kantar Watermark for an encoding
     * 
     * @param encodingId Id of the encoding. (required)
     * @return KantarWatermark
     * @throws BitmovinException if fails to make API call
     */
    public KantarWatermark get(String encodingId) throws BitmovinException {
        try {
            return this.apiClient.get(encodingId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface KantarWatermarkApiClient { 
        @RequestLine("POST /encoding/encodings/{encoding_id}/kantar-watermark")
        ResponseEnvelope<KantarWatermark> create(@Param(value = "encoding_id") String encodingId, KantarWatermark kantarWatermark) throws BitmovinException;
   
        @RequestLine("DELETE /encoding/encodings/{encoding_id}/kantar-watermark")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "encoding_id") String encodingId) throws BitmovinException;
   
        @RequestLine("GET /encoding/encodings/{encoding_id}/kantar-watermark")
        ResponseEnvelope<KantarWatermark> get(@Param(value = "encoding_id") String encodingId) throws BitmovinException;
    }
}
