package com.bitmovin.api.sdk.encoding.encodings.captions.scc;

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
import com.bitmovin.api.sdk.encoding.encodings.captions.scc.customdata.CustomdataApi;

public class SccApi {
    public final CustomdataApi customdata;

    private final SccApiClient apiClient;

    public SccApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(SccApiClient.class);

        this.customdata = new CustomdataApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of SccApi
     */
    public static BitmovinApiBuilder<SccApi> builder() {
        return new BitmovinApiBuilder<>(SccApi.class);
    }
    
    /**
     * Convert SCC captions
     * 
     * @param encodingId Id of the encoding. (required)
     * @param convertSccCaption The SCC captions to be created (required)
     * @return ConvertSccCaption
     * @throws BitmovinException if fails to make API call
     */
    public ConvertSccCaption create(String encodingId, ConvertSccCaption convertSccCaption) throws BitmovinException {
        try {
            return this.apiClient.create(encodingId, convertSccCaption).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * Delete Convert SCC captions
     * 
     * @param encodingId Id of the encoding. (required)
     * @param captionsId Id of the caption. (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse delete(String encodingId, String captionsId) throws BitmovinException {
        try {
            return this.apiClient.delete(encodingId, captionsId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * Convert SCC captions Details
     * 
     * @param encodingId Id of the encoding. (required)
     * @param captionsId Id of the caption. (required)
     * @return ConvertSccCaption
     * @throws BitmovinException if fails to make API call
     */
    public ConvertSccCaption get(String encodingId, String captionsId) throws BitmovinException {
        try {
            return this.apiClient.get(encodingId, captionsId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * List Convert SCC captions
     * 
     * @param encodingId Id of the encoding. (required)
     * @return List&lt;ConvertSccCaption&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<ConvertSccCaption> list(String encodingId) throws BitmovinException {
        try {
            return this.apiClient.list(encodingId, new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * List Convert SCC captions
     * 
     * @param encodingId Id of the encoding. (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;ConvertSccCaption&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<ConvertSccCaption> list(String encodingId, ConvertSccCaptionListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(encodingId, new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    interface SccApiClient {
    
        @RequestLine("POST /encoding/encodings/{encoding_id}/captions/scc")
        ResponseEnvelope<ConvertSccCaption> create(@Param(value = "encoding_id") String encodingId, ConvertSccCaption convertSccCaption) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/encodings/{encoding_id}/captions/scc/{captions_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "encoding_id") String encodingId, @Param(value = "captions_id") String captionsId) throws BitmovinException;
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/captions/scc/{captions_id}")
        ResponseEnvelope<ConvertSccCaption> get(@Param(value = "encoding_id") String encodingId, @Param(value = "captions_id") String captionsId) throws BitmovinException;
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/captions/scc")
        ResponseEnvelope<PaginationResponse<ConvertSccCaption>> list(@Param(value = "encoding_id") String encodingId, @QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    }
}
