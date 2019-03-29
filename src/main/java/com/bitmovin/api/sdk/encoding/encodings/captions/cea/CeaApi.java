package com.bitmovin.api.sdk.encoding.encodings.captions.cea;

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
import com.bitmovin.api.sdk.encoding.encodings.captions.cea.customdata.CustomdataApi;

public class CeaApi {
    public final CustomdataApi customdata;

    private final CeaApiClient apiClient;

    public CeaApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(CeaApiClient.class);

        this.customdata = new CustomdataApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of CeaApi
     */
    public static BitmovinApiBuilder<CeaApi> builder() {
        return new BitmovinApiBuilder<>(CeaApi.class);
    }
    
    /**
     * Extract CEA 608/708 Captions
     * 
     * @param encodingId Id of the encoding. (required)
     * @param captionsCea The CEA 608/708 captions to be created (optional)
     * @return CaptionsCea
     * @throws BitmovinException if fails to make API call
     */
    public CaptionsCea create(String encodingId, CaptionsCea captionsCea) throws BitmovinException {
        return this.apiClient.create(encodingId, captionsCea).getData().getResult();
    }
    
    /**
     * Delete CEA 608/708 Captions
     * 
     * @param encodingId Id of the encoding. (required)
     * @param captionsId Id of the captions configuration. (required)
     * @return CaptionsCea
     * @throws BitmovinException if fails to make API call
     */
    public CaptionsCea delete(String encodingId, String captionsId) throws BitmovinException {
        return this.apiClient.delete(encodingId, captionsId).getData().getResult();
    }
    
    /**
     * CEA 608/708 Captions Details
     * 
     * @param encodingId Id of the encoding. (required)
     * @param captionsId Id of the captions. (required)
     * @return CaptionsCea
     * @throws BitmovinException if fails to make API call
     */
    public CaptionsCea get(String encodingId, String captionsId) throws BitmovinException {
        return this.apiClient.get(encodingId, captionsId).getData().getResult();
    }
    
    /**
     * List CEA 608/708 Captions
     * 
     * @param encodingId Id of the encoding. (required)
     * @return List&lt;CaptionsCea&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<CaptionsCea> list(String encodingId) throws BitmovinException {
        return this.apiClient.list(encodingId, new HashMap<String, Object>()).getData().getResult();
    }
    /**
     * List CEA 608/708 Captions
     * 
     * @param encodingId Id of the encoding. (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;CaptionsCea&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<CaptionsCea> list(String encodingId, CaptionsCeaListQueryParams queryParams) throws BitmovinException {
        return this.apiClient.list(encodingId, queryParams).getData().getResult();
    }
    
    interface CeaApiClient {
    
        @RequestLine("POST /encoding/encodings/{encoding_id}/captions/cea")
        ResponseEnvelope<CaptionsCea> create(@Param(value = "encoding_id") String encodingId, CaptionsCea captionsCea) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/encodings/{encoding_id}/captions/cea/{captions_id}")
        ResponseEnvelope<CaptionsCea> delete(@Param(value = "encoding_id") String encodingId, @Param(value = "captions_id") String captionsId) throws BitmovinException;
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/captions/cea/{captions_id}")
        ResponseEnvelope<CaptionsCea> get(@Param(value = "encoding_id") String encodingId, @Param(value = "captions_id") String captionsId) throws BitmovinException;
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/captions/cea")
        ResponseEnvelope<PaginationResponse<CaptionsCea>> list(@Param(value = "encoding_id") String encodingId, @QueryMap Map<String, Object> queryParams) throws BitmovinException;
    }
}
