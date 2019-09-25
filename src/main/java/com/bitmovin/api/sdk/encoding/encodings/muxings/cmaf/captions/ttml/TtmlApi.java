package com.bitmovin.api.sdk.encoding.encodings.muxings.cmaf.captions.ttml;

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

public class TtmlApi {

    private final TtmlApiClient apiClient;

    public TtmlApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(TtmlApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of TtmlApi
     */
    public static BitmovinApiBuilder<TtmlApi> builder() {
        return new BitmovinApiBuilder<>(TtmlApi.class);
    }
    
    /**
     * Delete TTML Embed Captions
     * 
     * @param encodingId Id of the encoding. (required)
     * @param muxingId Id of the CMAF muxing (required)
     * @param captionsId Id of the captions configuration. (required)
     * @return TtmlEmbed
     * @throws BitmovinException if fails to make API call
     */
    public TtmlEmbed delete(String encodingId, String muxingId, String captionsId) throws BitmovinException {
        try {
            return this.apiClient.delete(encodingId, muxingId, captionsId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * TTML Embed Captions Details
     * 
     * @param encodingId Id of the encoding. (required)
     * @param muxingId Id of the CMAF muxing (required)
     * @param captionsId Id of the captions. (required)
     * @return TtmlEmbed
     * @throws BitmovinException if fails to make API call
     */
    public TtmlEmbed get(String encodingId, String muxingId, String captionsId) throws BitmovinException {
        try {
            return this.apiClient.get(encodingId, muxingId, captionsId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    interface TtmlApiClient {
    
        @RequestLine("DELETE /encoding/encodings/{encoding_id}/muxings/cmaf/{muxing_id}/captions/ttml/{captions_id}")
        ResponseEnvelope<TtmlEmbed> delete(@Param(value = "encoding_id") String encodingId, @Param(value = "muxing_id") String muxingId, @Param(value = "captions_id") String captionsId) throws BitmovinException;
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/muxings/cmaf/{muxing_id}/captions/ttml/{captions_id}")
        ResponseEnvelope<TtmlEmbed> get(@Param(value = "encoding_id") String encodingId, @Param(value = "muxing_id") String muxingId, @Param(value = "captions_id") String captionsId) throws BitmovinException;
    }
}
