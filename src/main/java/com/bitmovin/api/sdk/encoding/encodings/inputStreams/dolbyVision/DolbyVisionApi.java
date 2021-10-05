package com.bitmovin.api.sdk.encoding.encodings.inputStreams.dolbyVision;

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
     * Add Dolby Vision input stream
     * 
     * @param encodingId Id of the encoding. (required)
     * @param dolbyVisionInputStream The Dolby Vision input stream to be created (required)
     * @return DolbyVisionInputStream
     * @throws BitmovinException if fails to make API call
     */
    public DolbyVisionInputStream create(String encodingId, DolbyVisionInputStream dolbyVisionInputStream) throws BitmovinException {
        try {
            return this.apiClient.create(encodingId, dolbyVisionInputStream).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * Delete Dolby Vision input stream
     * 
     * @param encodingId Id of the encoding. (required)
     * @param dolbyVisionInputStreamId Id of the Dolby Vision input stream. (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse delete(String encodingId, String dolbyVisionInputStreamId) throws BitmovinException {
        try {
            return this.apiClient.delete(encodingId, dolbyVisionInputStreamId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * Dolby Vision input stream details
     * 
     * @param encodingId Id of the encoding. (required)
     * @param dolbyVisionInputStreamId Id of the Dolby Vision input stream. (required)
     * @return DolbyVisionInputStream
     * @throws BitmovinException if fails to make API call
     */
    public DolbyVisionInputStream get(String encodingId, String dolbyVisionInputStreamId) throws BitmovinException {
        try {
            return this.apiClient.get(encodingId, dolbyVisionInputStreamId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * List Dolby Vision input stream
     * 
     * @param encodingId Id of the encoding. (required)
     * @return List&lt;DolbyVisionInputStream&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<DolbyVisionInputStream> list(String encodingId) throws BitmovinException {
        try {
            return this.apiClient.list(encodingId, new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * List Dolby Vision input stream
     * 
     * @param encodingId Id of the encoding. (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;DolbyVisionInputStream&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<DolbyVisionInputStream> list(String encodingId, DolbyVisionInputStreamListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(encodingId, new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface DolbyVisionApiClient {

        @RequestLine("POST /encoding/encodings/{encoding_id}/input-streams/dolby-vision")
        ResponseEnvelope<DolbyVisionInputStream> create(@Param(value = "encoding_id") String encodingId, DolbyVisionInputStream dolbyVisionInputStream) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/encodings/{encoding_id}/input-streams/dolby-vision/{dolby_vision_input_stream_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "encoding_id") String encodingId, @Param(value = "dolby_vision_input_stream_id") String dolbyVisionInputStreamId) throws BitmovinException;
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/input-streams/dolby-vision/{dolby_vision_input_stream_id}")
        ResponseEnvelope<DolbyVisionInputStream> get(@Param(value = "encoding_id") String encodingId, @Param(value = "dolby_vision_input_stream_id") String dolbyVisionInputStreamId) throws BitmovinException;
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/input-streams/dolby-vision")
        ResponseEnvelope<PaginationResponse<DolbyVisionInputStream>> list(@Param(value = "encoding_id") String encodingId, @QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    }
}
