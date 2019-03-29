package com.bitmovin.api.sdk.encoding.encodings.muxings.fmp4.captions.webvtt;

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
import com.bitmovin.api.sdk.common.BitmovinDateExpander;
import com.bitmovin.api.sdk.common.BitmovinApiBuilder;
import com.bitmovin.api.sdk.common.BitmovinApiClientFactory;
import com.bitmovin.api.sdk.encoding.encodings.muxings.fmp4.captions.webvtt.customdata.CustomdataApi;

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
     * FMP4 Embed WebVtt Captions
     * 
     * @param encodingId Id of the encoding. (required)
     * @param muxingId Id of the fMP4 muxing. (required)
     * @param webVttEmbed The WebVtt captions to be created. (optional)
     * @return WebVttEmbed
     * @throws BitmovinException if fails to make API call
     */
    public WebVttEmbed create(String encodingId, String muxingId, WebVttEmbed webVttEmbed) throws BitmovinException {
        return this.apiClient.create(encodingId, muxingId, webVttEmbed).getData().getResult();
    }
    
    /**
     * Get FMP4 Embed WebVtt Captions Details
     * 
     * @param encodingId Id of the encoding. (required)
     * @param muxingId Id of the fMP4 muxing. (required)
     * @param captionsId Id of the captions config. (required)
     * @return WebVttEmbed
     * @throws BitmovinException if fails to make API call
     */
    public WebVttEmbed get(String encodingId, String muxingId, String captionsId) throws BitmovinException {
        return this.apiClient.get(encodingId, muxingId, captionsId).getData().getResult();
    }
    
    /**
     * List FMP4 Embed WebVtt Captions
     * 
     * @param encodingId Id of the encoding. (required)
     * @param muxingId Id of the fMP4 muxing. (required)
     * @return List&lt;WebVttEmbed&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<WebVttEmbed> list(String encodingId, String muxingId) throws BitmovinException {
        return this.apiClient.list(encodingId, muxingId).getData().getResult();
    }
    
    interface WebvttApiClient {
    
        @RequestLine("POST /encoding/encodings/{encoding_id}/muxings/fmp4/{muxing_id}/captions/webvtt")
        ResponseEnvelope<WebVttEmbed> create(@Param(value = "encoding_id") String encodingId, @Param(value = "muxing_id") String muxingId, WebVttEmbed webVttEmbed) throws BitmovinException;
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/muxings/fmp4/{muxing_id}/captions/webvtt/{captions_id}")
        ResponseEnvelope<WebVttEmbed> get(@Param(value = "encoding_id") String encodingId, @Param(value = "muxing_id") String muxingId, @Param(value = "captions_id") String captionsId) throws BitmovinException;
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/muxings/fmp4/{muxing_id}/captions/webvtt")
        ResponseEnvelope<PaginationResponse<WebVttEmbed>> list(@Param(value = "encoding_id") String encodingId, @Param(value = "muxing_id") String muxingId) throws BitmovinException;
    }
}
