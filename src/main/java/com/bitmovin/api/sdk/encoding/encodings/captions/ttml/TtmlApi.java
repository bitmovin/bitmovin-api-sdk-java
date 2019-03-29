package com.bitmovin.api.sdk.encoding.encodings.captions.ttml;

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
import com.bitmovin.api.sdk.encoding.encodings.captions.ttml.customdata.CustomdataApi;

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
     * Extract TTML Captions
     * 
     * @param encodingId Id of the encoding. (required)
     * @param ttmlExtract The TTML extract captions to be created (optional)
     * @return TtmlExtract
     * @throws BitmovinException if fails to make API call
     */
    public TtmlExtract create(String encodingId, TtmlExtract ttmlExtract) throws BitmovinException {
        return this.apiClient.create(encodingId, ttmlExtract).getData().getResult();
    }
    
    /**
     * Delete TTML Extract Captions
     * 
     * @param encodingId Id of the encoding. (required)
     * @param captionsId Id of the captions configuration. (required)
     * @return TtmlExtract
     * @throws BitmovinException if fails to make API call
     */
    public TtmlExtract delete(String encodingId, String captionsId) throws BitmovinException {
        return this.apiClient.delete(encodingId, captionsId).getData().getResult();
    }
    
    /**
     * TTML Extract Captions Details
     * 
     * @param encodingId Id of the encoding. (required)
     * @param captionsId Id of the captions. (required)
     * @return TtmlExtract
     * @throws BitmovinException if fails to make API call
     */
    public TtmlExtract get(String encodingId, String captionsId) throws BitmovinException {
        return this.apiClient.get(encodingId, captionsId).getData().getResult();
    }
    
    /**
     * List TTML Extract Captions
     * 
     * @param encodingId Id of the encoding. (required)
     * @return List&lt;TtmlExtract&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<TtmlExtract> list(String encodingId) throws BitmovinException {
        return this.apiClient.list(encodingId, new HashMap<String, Object>()).getData().getResult();
    }
    /**
     * List TTML Extract Captions
     * 
     * @param encodingId Id of the encoding. (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;TtmlExtract&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<TtmlExtract> list(String encodingId, TtmlExtractListQueryParams queryParams) throws BitmovinException {
        return this.apiClient.list(encodingId, queryParams).getData().getResult();
    }
    
    interface TtmlApiClient {
    
        @RequestLine("POST /encoding/encodings/{encoding_id}/captions/ttml")
        ResponseEnvelope<TtmlExtract> create(@Param(value = "encoding_id") String encodingId, TtmlExtract ttmlExtract) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/encodings/{encoding_id}/captions/ttml/{captions_id}")
        ResponseEnvelope<TtmlExtract> delete(@Param(value = "encoding_id") String encodingId, @Param(value = "captions_id") String captionsId) throws BitmovinException;
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/captions/ttml/{captions_id}")
        ResponseEnvelope<TtmlExtract> get(@Param(value = "encoding_id") String encodingId, @Param(value = "captions_id") String captionsId) throws BitmovinException;
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/captions/ttml")
        ResponseEnvelope<PaginationResponse<TtmlExtract>> list(@Param(value = "encoding_id") String encodingId, @QueryMap Map<String, Object> queryParams) throws BitmovinException;
    }
}
