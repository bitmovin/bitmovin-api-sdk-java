package com.bitmovin.api.sdk.encoding.encodings.captions.webvtt;

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
import com.bitmovin.api.sdk.encoding.encodings.captions.webvtt.customdata.CustomdataApi;

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
     * Extract WebVtt Captions
     * 
     * @param encodingId Id of the encoding. (required)
     * @param webVttExtract The extract WebVtt captions to be created (optional)
     * @return WebVttExtract
     * @throws BitmovinException if fails to make API call
     */
    public WebVttExtract create(String encodingId, WebVttExtract webVttExtract) throws BitmovinException {
        return this.apiClient.create(encodingId, webVttExtract).getData().getResult();
    }
    
    /**
     * Delete Extract WebVtt Captions
     * 
     * @param encodingId Id of the encoding. (required)
     * @param captionsId Id of the captions configuration. (required)
     * @return WebVttExtract
     * @throws BitmovinException if fails to make API call
     */
    public WebVttExtract delete(String encodingId, String captionsId) throws BitmovinException {
        return this.apiClient.delete(encodingId, captionsId).getData().getResult();
    }
    
    /**
     * Get Extract WebVtt Captions Details
     * 
     * @param encodingId Id of the encoding. (required)
     * @param captionsId Id of the captions. (required)
     * @return WebVttExtract
     * @throws BitmovinException if fails to make API call
     */
    public WebVttExtract get(String encodingId, String captionsId) throws BitmovinException {
        return this.apiClient.get(encodingId, captionsId).getData().getResult();
    }
    
    /**
     * List Extract WebVtt Captions
     * 
     * @param encodingId Id of the encoding. (required)
     * @return List&lt;WebVttExtract&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<WebVttExtract> list(String encodingId) throws BitmovinException {
        return this.apiClient.list(encodingId, new HashMap<String, Object>()).getData().getResult();
    }
    /**
     * List Extract WebVtt Captions
     * 
     * @param encodingId Id of the encoding. (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;WebVttExtract&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<WebVttExtract> list(String encodingId, WebVttExtractListQueryParams queryParams) throws BitmovinException {
        return this.apiClient.list(encodingId, queryParams).getData().getResult();
    }
    
    interface WebvttApiClient {
    
        @RequestLine("POST /encoding/encodings/{encoding_id}/captions/webvtt")
        ResponseEnvelope<WebVttExtract> create(@Param(value = "encoding_id") String encodingId, WebVttExtract webVttExtract) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/encodings/{encoding_id}/captions/webvtt/{captions_id}")
        ResponseEnvelope<WebVttExtract> delete(@Param(value = "encoding_id") String encodingId, @Param(value = "captions_id") String captionsId) throws BitmovinException;
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/captions/webvtt/{captions_id}")
        ResponseEnvelope<WebVttExtract> get(@Param(value = "encoding_id") String encodingId, @Param(value = "captions_id") String captionsId) throws BitmovinException;
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/captions/webvtt")
        ResponseEnvelope<PaginationResponse<WebVttExtract>> list(@Param(value = "encoding_id") String encodingId, @QueryMap Map<String, Object> queryParams) throws BitmovinException;
    }
}
