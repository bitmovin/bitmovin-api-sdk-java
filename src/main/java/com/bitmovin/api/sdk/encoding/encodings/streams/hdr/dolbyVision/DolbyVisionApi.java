package com.bitmovin.api.sdk.encoding.encodings.streams.hdr.dolbyVision;

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

public class DolbyVisionApi {

    private final DolbyVisionApiClient apiClient;

    public DolbyVisionApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(DolbyVisionApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of DolbyVisionApi
     */
    public static BitmovinApiBuilder<DolbyVisionApi> builder() {
        return new BitmovinApiBuilder<>(DolbyVisionApi.class);
    }
    
    /**
     * Add Dolby Vision Metadata
     * 
     * @param encodingId Id of the encoding. (required)
     * @param streamId Id of the stream. (required)
     * @param dolbyVisionMetadata The Dolby Vision Metadata to be added (required)
     * @return DolbyVisionMetadata
     * @throws BitmovinException if fails to make API call
     */
    public DolbyVisionMetadata create(String encodingId, String streamId, DolbyVisionMetadata dolbyVisionMetadata) throws BitmovinException {
        try {
            return this.apiClient.create(encodingId, streamId, dolbyVisionMetadata).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * Delete Dolby Vision Metadata
     * 
     * @param encodingId Id of the encoding. (required)
     * @param streamId Id of the stream. (required)
     * @param hdrId Id of the Dolby Vision Metadata. (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse delete(String encodingId, String streamId, String hdrId) throws BitmovinException {
        try {
            return this.apiClient.delete(encodingId, streamId, hdrId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * Dolby Vision Metadata Details
     * 
     * @param encodingId Id of the encoding. (required)
     * @param streamId Id of the stream. (required)
     * @param hdrId Id of the Dolby Vision Metadata. (required)
     * @return DolbyVisionMetadata
     * @throws BitmovinException if fails to make API call
     */
    public DolbyVisionMetadata get(String encodingId, String streamId, String hdrId) throws BitmovinException {
        try {
            return this.apiClient.get(encodingId, streamId, hdrId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * List Dolby Vision Metadata
     * 
     * @param encodingId Id of the encoding. (required)
     * @param streamId Id of the stream. (required)
     * @return List&lt;DolbyVisionMetadata&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<DolbyVisionMetadata> list(String encodingId, String streamId) throws BitmovinException {
        try {
            return this.apiClient.list(encodingId, streamId, new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * List Dolby Vision Metadata
     * 
     * @param encodingId Id of the encoding. (required)
     * @param streamId Id of the stream. (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;DolbyVisionMetadata&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<DolbyVisionMetadata> list(String encodingId, String streamId, DolbyVisionMetadataListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(encodingId, streamId, new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    interface DolbyVisionApiClient {
    
        @RequestLine("POST /encoding/encodings/{encoding_id}/streams/{stream_id}/hdr/dolby-vision")
        ResponseEnvelope<DolbyVisionMetadata> create(@Param(value = "encoding_id") String encodingId, @Param(value = "stream_id") String streamId, DolbyVisionMetadata dolbyVisionMetadata) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/encodings/{encoding_id}/streams/{stream_id}/hdr/dolby-vision/{hdr_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "encoding_id") String encodingId, @Param(value = "stream_id") String streamId, @Param(value = "hdr_id") String hdrId) throws BitmovinException;
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/streams/{stream_id}/hdr/dolby-vision/{hdr_id}")
        ResponseEnvelope<DolbyVisionMetadata> get(@Param(value = "encoding_id") String encodingId, @Param(value = "stream_id") String streamId, @Param(value = "hdr_id") String hdrId) throws BitmovinException;
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/streams/{stream_id}/hdr/dolby-vision")
        ResponseEnvelope<PaginationResponse<DolbyVisionMetadata>> list(@Param(value = "encoding_id") String encodingId, @Param(value = "stream_id") String streamId, @QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    }
}
