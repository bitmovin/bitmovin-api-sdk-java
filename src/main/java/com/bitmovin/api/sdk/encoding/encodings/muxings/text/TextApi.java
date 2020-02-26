package com.bitmovin.api.sdk.encoding.encodings.muxings.text;

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
import com.bitmovin.api.sdk.encoding.encodings.muxings.text.customdata.CustomdataApi;

public class TextApi {
    public final CustomdataApi customdata;

    private final TextApiClient apiClient;

    public TextApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(TextApiClient.class);

        this.customdata = new CustomdataApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of TextApi
     */
    public static BitmovinApiBuilder<TextApi> builder() {
        return new BitmovinApiBuilder<>(TextApi.class);
    }
    
    /**
     * Add Text muxing
     * 
     * @param encodingId Id of the encoding. (required)
     * @param textMuxing The Text muxing to be created (required)
     * @return TextMuxing
     * @throws BitmovinException if fails to make API call
     */
    public TextMuxing create(String encodingId, TextMuxing textMuxing) throws BitmovinException {
        try {
            return this.apiClient.create(encodingId, textMuxing).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * Delete Text muxing
     * 
     * @param encodingId Id of the encoding. (required)
     * @param muxingId Id of the Text muxing (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse delete(String encodingId, String muxingId) throws BitmovinException {
        try {
            return this.apiClient.delete(encodingId, muxingId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * Text muxing details
     * 
     * @param encodingId Id of the encoding. (required)
     * @param muxingId Id of the Text muxing (required)
     * @return TextMuxing
     * @throws BitmovinException if fails to make API call
     */
    public TextMuxing get(String encodingId, String muxingId) throws BitmovinException {
        try {
            return this.apiClient.get(encodingId, muxingId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * List Text muxings
     * 
     * @param encodingId Id of the encoding. (required)
     * @return List&lt;TextMuxing&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<TextMuxing> list(String encodingId) throws BitmovinException {
        try {
            return this.apiClient.list(encodingId, new HashMap<String, Object>()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * List Text muxings
     * 
     * @param encodingId Id of the encoding. (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;TextMuxing&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<TextMuxing> list(String encodingId, TextMuxingListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(encodingId, queryParams).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    interface TextApiClient {
    
        @RequestLine("POST /encoding/encodings/{encoding_id}/muxings/text")
        ResponseEnvelope<TextMuxing> create(@Param(value = "encoding_id") String encodingId, TextMuxing textMuxing) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/encodings/{encoding_id}/muxings/text/{muxing_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "encoding_id") String encodingId, @Param(value = "muxing_id") String muxingId) throws BitmovinException;
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/muxings/text/{muxing_id}")
        ResponseEnvelope<TextMuxing> get(@Param(value = "encoding_id") String encodingId, @Param(value = "muxing_id") String muxingId) throws BitmovinException;
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/muxings/text")
        ResponseEnvelope<PaginationResponse<TextMuxing>> list(@Param(value = "encoding_id") String encodingId, @QueryMap Map<String, Object> queryParams) throws BitmovinException;
    }
}
