package com.bitmovin.api.sdk.encoding.live.encodings.dnsMappings;

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

public class DnsMappingsApi {

    private final DnsMappingsApiClient apiClient;

    public DnsMappingsApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(DnsMappingsApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of DnsMappingsApi
     */
    public static BitmovinApiBuilder<DnsMappingsApi> builder() {
        return new BitmovinApiBuilder<>(DnsMappingsApi.class);
    }
    /**
     * Create new DNS mapping for encoding
     * 
     * @param encodingId Id of the encoding. (required)
     * @param dnsMappingRequest The DNS mapping to be created (required)
     * @return DnsMappingResponse
     * @throws BitmovinException if fails to make API call
     */
    public DnsMappingResponse create(String encodingId, DnsMappingRequest dnsMappingRequest) throws BitmovinException {
        try {
            return this.apiClient.create(encodingId, dnsMappingRequest).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * Delete DNS mapping
     * 
     * @param encodingId Id of the encoding. (required)
     * @param id Id of the DNS mapping (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse delete(String encodingId, String id) throws BitmovinException {
        try {
            return this.apiClient.delete(encodingId, id).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * Delete all DNS mappings for encoding
     * 
     * @param encodingId Id of the encoding. (required)
     * @return BitmovinResponseList
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponseList deleteAll(String encodingId) throws BitmovinException {
        try {
            return this.apiClient.deleteAll(encodingId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * DNS mapping details
     * 
     * @param encodingId Id of the encoding. (required)
     * @param id Id of the DNS mapping (required)
     * @return DnsMappingResponse
     * @throws BitmovinException if fails to make API call
     */
    public DnsMappingResponse get(String encodingId, String id) throws BitmovinException {
        try {
            return this.apiClient.get(encodingId, id).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * List DNS mappings for encoding
     * 
     * @param encodingId Id of the encoding. (required)
     * @return List&lt;DnsMappingResponse&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<DnsMappingResponse> list(String encodingId) throws BitmovinException {
        try {
            return this.apiClient.list(encodingId, new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * List DNS mappings for encoding
     * 
     * @param encodingId Id of the encoding. (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;DnsMappingResponse&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<DnsMappingResponse> list(String encodingId, DnsMappingResponseListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(encodingId, new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface DnsMappingsApiClient { 
        @RequestLine("POST /encoding/live/encodings/{encoding_id}/dns-mappings")
        ResponseEnvelope<DnsMappingResponse> create(@Param(value = "encoding_id") String encodingId, DnsMappingRequest dnsMappingRequest) throws BitmovinException;
   
        @RequestLine("DELETE /encoding/live/encodings/{encoding_id}/dns-mappings/{id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "encoding_id") String encodingId, @Param(value = "id") String id) throws BitmovinException;
   
        @RequestLine("DELETE /encoding/live/encodings/{encoding_id}/dns-mappings")
        ResponseEnvelope<BitmovinResponseList> deleteAll(@Param(value = "encoding_id") String encodingId) throws BitmovinException;
   
        @RequestLine("GET /encoding/live/encodings/{encoding_id}/dns-mappings/{id}")
        ResponseEnvelope<DnsMappingResponse> get(@Param(value = "encoding_id") String encodingId, @Param(value = "id") String id) throws BitmovinException;
   
        @RequestLine("GET /encoding/live/encodings/{encoding_id}/dns-mappings")
        ResponseEnvelope<PaginationResponse<DnsMappingResponse>> list(@Param(value = "encoding_id") String encodingId, @QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    }
}
