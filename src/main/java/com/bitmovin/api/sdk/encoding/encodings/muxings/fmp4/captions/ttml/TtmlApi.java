package com.bitmovin.api.sdk.encoding.encodings.muxings.fmp4.captions.ttml;

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
import com.bitmovin.api.sdk.encoding.encodings.muxings.fmp4.captions.ttml.customdata.CustomdataApi;

public class TtmlApi {
    public final CustomdataApi customdata;

    private final TtmlApiClient apiClient;

    public TtmlApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(TtmlApiClient.class);

        this.customdata = new CustomdataApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of TtmlApi
     */
    public static BitmovinApiBuilder<TtmlApi> builder() {
        return new BitmovinApiBuilder<>(TtmlApi.class);
    }
    
    /**
     * FMP4 Embed TTML Captions
     * 
     * @param encodingId Id of the encoding. (required)
     * @param muxingId Id of the fMP4 muxing. (required)
     * @param ttmlEmbed The TTML embed captions to be created. (optional)
     * @return TtmlEmbed
     * @throws BitmovinException if fails to make API call
     */
    public TtmlEmbed create(String encodingId, String muxingId, TtmlEmbed ttmlEmbed) throws BitmovinException {
        return this.apiClient.create(encodingId, muxingId, ttmlEmbed).getData().getResult();
    }
    
    /**
     * Delete TTML Embed Captions
     * 
     * @param encodingId Id of the encoding. (required)
     * @param muxingId Id of the fMP4 muxing. (required)
     * @param captionsId Id of the captions configuration. (required)
     * @return TtmlEmbed
     * @throws BitmovinException if fails to make API call
     */
    public TtmlEmbed delete(String encodingId, String muxingId, String captionsId) throws BitmovinException {
        return this.apiClient.delete(encodingId, muxingId, captionsId).getData().getResult();
    }
    
    /**
     * TTML Embed Captions Details
     * 
     * @param encodingId Id of the encoding. (required)
     * @param muxingId Id of the fMP4 muxing. (required)
     * @param captionsId Id of the captions. (required)
     * @return TtmlEmbed
     * @throws BitmovinException if fails to make API call
     */
    public TtmlEmbed get(String encodingId, String muxingId, String captionsId) throws BitmovinException {
        return this.apiClient.get(encodingId, muxingId, captionsId).getData().getResult();
    }
    
    /**
     * List TTML Embed Captions
     * 
     * @param encodingId Id of the encoding. (required)
     * @param muxingId Id of the fMP4 muxing. (required)
     * @return List&lt;TtmlEmbed&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<TtmlEmbed> list(String encodingId, String muxingId) throws BitmovinException {
        return this.apiClient.list(encodingId, muxingId, new HashMap<String, Object>()).getData().getResult();
    }
    /**
     * List TTML Embed Captions
     * 
     * @param encodingId Id of the encoding. (required)
     * @param muxingId Id of the fMP4 muxing. (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;TtmlEmbed&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<TtmlEmbed> list(String encodingId, String muxingId, TtmlEmbedListQueryParams queryParams) throws BitmovinException {
        return this.apiClient.list(encodingId, muxingId, queryParams).getData().getResult();
    }
    
    interface TtmlApiClient {
    
        @RequestLine("POST /encoding/encodings/{encoding_id}/muxings/fmp4/{muxing_id}/captions/ttml")
        ResponseEnvelope<TtmlEmbed> create(@Param(value = "encoding_id") String encodingId, @Param(value = "muxing_id") String muxingId, TtmlEmbed ttmlEmbed) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/encodings/{encoding_id}/muxings/fmp4/{muxing_id}/captions/ttml/{captions_id}")
        ResponseEnvelope<TtmlEmbed> delete(@Param(value = "encoding_id") String encodingId, @Param(value = "muxing_id") String muxingId, @Param(value = "captions_id") String captionsId) throws BitmovinException;
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/muxings/fmp4/{muxing_id}/captions/ttml/{captions_id}")
        ResponseEnvelope<TtmlEmbed> get(@Param(value = "encoding_id") String encodingId, @Param(value = "muxing_id") String muxingId, @Param(value = "captions_id") String captionsId) throws BitmovinException;
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/muxings/fmp4/{muxing_id}/captions/ttml")
        ResponseEnvelope<PaginationResponse<TtmlEmbed>> list(@Param(value = "encoding_id") String encodingId, @Param(value = "muxing_id") String muxingId, @QueryMap Map<String, Object> queryParams) throws BitmovinException;
    }
}
