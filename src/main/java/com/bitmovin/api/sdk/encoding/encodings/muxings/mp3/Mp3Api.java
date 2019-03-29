package com.bitmovin.api.sdk.encoding.encodings.muxings.mp3;

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
import com.bitmovin.api.sdk.encoding.encodings.muxings.mp3.customdata.CustomdataApi;
import com.bitmovin.api.sdk.encoding.encodings.muxings.mp3.information.InformationApi;

public class Mp3Api {
    public final CustomdataApi customdata;
    public final InformationApi information;

    private final Mp3ApiClient apiClient;

    public Mp3Api(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(Mp3ApiClient.class);

        this.customdata = new CustomdataApi(clientFactory);
        this.information = new InformationApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of Mp3Api
     */
    public static BitmovinApiBuilder<Mp3Api> builder() {
        return new BitmovinApiBuilder<>(Mp3Api.class);
    }
    
    /**
     * Add MP3 Muxing
     * 
     * @param encodingId Id of the encoding. (required)
     * @param mp3Muxing  (optional)
     * @return Mp3Muxing
     * @throws BitmovinException if fails to make API call
     */
    public Mp3Muxing create(String encodingId, Mp3Muxing mp3Muxing) throws BitmovinException {
        return this.apiClient.create(encodingId, mp3Muxing).getData().getResult();
    }
    
    /**
     * Delete MP3 Muxing
     * 
     * @param encodingId Id of the encoding. (required)
     * @param muxingId Id of the MP3 muxing (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse delete(String encodingId, String muxingId) throws BitmovinException {
        return this.apiClient.delete(encodingId, muxingId).getData().getResult();
    }
    
    /**
     * MP3 Muxing Details
     * 
     * @param encodingId Id of the encoding. (required)
     * @param muxingId Id of the MP3 muxing (required)
     * @return Mp3Muxing
     * @throws BitmovinException if fails to make API call
     */
    public Mp3Muxing get(String encodingId, String muxingId) throws BitmovinException {
        return this.apiClient.get(encodingId, muxingId).getData().getResult();
    }
    
    /**
     * List MP3 Muxings
     * 
     * @param encodingId Id of the encoding. (required)
     * @return List&lt;Mp3Muxing&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<Mp3Muxing> list(String encodingId) throws BitmovinException {
        return this.apiClient.list(encodingId, new HashMap<String, Object>()).getData().getResult();
    }
    /**
     * List MP3 Muxings
     * 
     * @param encodingId Id of the encoding. (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;Mp3Muxing&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<Mp3Muxing> list(String encodingId, Mp3MuxingListQueryParams queryParams) throws BitmovinException {
        return this.apiClient.list(encodingId, queryParams).getData().getResult();
    }
    
    interface Mp3ApiClient {
    
        @RequestLine("POST /encoding/encodings/{encoding_id}/muxings/mp3")
        ResponseEnvelope<Mp3Muxing> create(@Param(value = "encoding_id") String encodingId, Mp3Muxing mp3Muxing) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/encodings/{encoding_id}/muxings/mp3/{muxing_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "encoding_id") String encodingId, @Param(value = "muxing_id") String muxingId) throws BitmovinException;
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/muxings/mp3/{muxing_id}")
        ResponseEnvelope<Mp3Muxing> get(@Param(value = "encoding_id") String encodingId, @Param(value = "muxing_id") String muxingId) throws BitmovinException;
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/muxings/mp3")
        ResponseEnvelope<PaginationResponse<Mp3Muxing>> list(@Param(value = "encoding_id") String encodingId, @QueryMap Map<String, Object> queryParams) throws BitmovinException;
    }
}
