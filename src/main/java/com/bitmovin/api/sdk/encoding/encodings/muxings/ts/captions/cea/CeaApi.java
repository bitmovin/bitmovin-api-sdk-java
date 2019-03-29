package com.bitmovin.api.sdk.encoding.encodings.muxings.ts.captions.cea;

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
import com.bitmovin.api.sdk.encoding.encodings.muxings.ts.captions.cea.customdata.CustomdataApi;

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
     * TS Embed CEA 608/708 Captions
     * 
     * @param encodingId Id of the encoding. (required)
     * @param muxingId Id of the TS muxing. (required)
     * @param captionsEmbedCea The captions embed CEA to be created. (optional)
     * @return CaptionsEmbedCea
     * @throws BitmovinException if fails to make API call
     */
    public CaptionsEmbedCea create(String encodingId, String muxingId, CaptionsEmbedCea captionsEmbedCea) throws BitmovinException {
        return this.apiClient.create(encodingId, muxingId, captionsEmbedCea).getData().getResult();
    }
    
    /**
     * Delete Embedded CEA 608/708 Captions
     * 
     * @param encodingId Id of the encoding. (required)
     * @param muxingId Id of the TS muxing. (required)
     * @param captionsId Id of the subtitle. (required)
     * @return CaptionsEmbedCea
     * @throws BitmovinException if fails to make API call
     */
    public CaptionsEmbedCea delete(String encodingId, String muxingId, String captionsId) throws BitmovinException {
        return this.apiClient.delete(encodingId, muxingId, captionsId).getData().getResult();
    }
    
    /**
     * Embedded CEA 608/708 Captions Details
     * 
     * @param encodingId Id of the encoding. (required)
     * @param muxingId Id of the TS muxing. (required)
     * @param captionsId Id of the captions. (required)
     * @return CaptionsEmbedCea
     * @throws BitmovinException if fails to make API call
     */
    public CaptionsEmbedCea get(String encodingId, String muxingId, String captionsId) throws BitmovinException {
        return this.apiClient.get(encodingId, muxingId, captionsId).getData().getResult();
    }
    
    /**
     * List TS Embedded CEA 608/708 Captions
     * 
     * @param encodingId Id of the encoding. (required)
     * @param muxingId Id of the TS muxing. (required)
     * @return List&lt;CaptionsEmbedCea&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<CaptionsEmbedCea> list(String encodingId, String muxingId) throws BitmovinException {
        return this.apiClient.list(encodingId, muxingId, new HashMap<String, Object>()).getData().getResult();
    }
    /**
     * List TS Embedded CEA 608/708 Captions
     * 
     * @param encodingId Id of the encoding. (required)
     * @param muxingId Id of the TS muxing. (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;CaptionsEmbedCea&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<CaptionsEmbedCea> list(String encodingId, String muxingId, CaptionsEmbedCeaListQueryParams queryParams) throws BitmovinException {
        return this.apiClient.list(encodingId, muxingId, queryParams).getData().getResult();
    }
    
    interface CeaApiClient {
    
        @RequestLine("POST /encoding/encodings/{encoding_id}/muxings/ts/{muxing_id}/captions/cea")
        ResponseEnvelope<CaptionsEmbedCea> create(@Param(value = "encoding_id") String encodingId, @Param(value = "muxing_id") String muxingId, CaptionsEmbedCea captionsEmbedCea) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/encodings/{encoding_id}/muxings/ts/{muxing_id}/captions/cea/{captions_id}")
        ResponseEnvelope<CaptionsEmbedCea> delete(@Param(value = "encoding_id") String encodingId, @Param(value = "muxing_id") String muxingId, @Param(value = "captions_id") String captionsId) throws BitmovinException;
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/muxings/ts/{muxing_id}/captions/cea/{captions_id}")
        ResponseEnvelope<CaptionsEmbedCea> get(@Param(value = "encoding_id") String encodingId, @Param(value = "muxing_id") String muxingId, @Param(value = "captions_id") String captionsId) throws BitmovinException;
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/muxings/ts/{muxing_id}/captions/cea")
        ResponseEnvelope<PaginationResponse<CaptionsEmbedCea>> list(@Param(value = "encoding_id") String encodingId, @Param(value = "muxing_id") String muxingId, @QueryMap Map<String, Object> queryParams) throws BitmovinException;
    }
}
