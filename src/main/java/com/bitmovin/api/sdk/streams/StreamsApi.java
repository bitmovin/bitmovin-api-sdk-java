package com.bitmovin.api.sdk.streams;

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

public class StreamsApi {

    private final StreamsApiClient apiClient;

    public StreamsApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(StreamsApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of StreamsApi
     */
    public static BitmovinApiBuilder<StreamsApi> builder() {
        return new BitmovinApiBuilder<>(StreamsApi.class);
    }

    /**
     * Create new Stream
     * 
     * @param createBitmovinStreamRequest Create a new Stream. (required)
     * @return BitmovinStreamResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinStreamResponse create(CreateBitmovinStreamRequest createBitmovinStreamRequest) throws BitmovinException {
        try {
            return this.apiClient.create(createBitmovinStreamRequest).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * Get Stream by id
     * 
     * @param streamId Id of the Stream. (required)
     * @return BitmovinStreamResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinStreamResponse get(String streamId) throws BitmovinException {
        try {
            return this.apiClient.get(streamId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * Get paginated list of Streams
     * 
     * @return List&lt;BitmovinStreamResponse&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<BitmovinStreamResponse> list() throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * Get paginated list of Streams
     * 
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;BitmovinStreamResponse&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<BitmovinStreamResponse> list(BitmovinStreamResponseListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * Update Stream by id
     * 
     * @param streamId Id of the Stream. (required)
     * @param updateBitmovinStreamRequest Stream fields to update. (required)
     * @return BitmovinStreamResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinStreamResponse patchBitmovinStreamsStreamsByStreamId(String streamId, UpdateBitmovinStreamRequest updateBitmovinStreamRequest) throws BitmovinException {
        try {
            return this.apiClient.patchBitmovinStreamsStreamsByStreamId(streamId, updateBitmovinStreamRequest).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface StreamsApiClient {

        @RequestLine("POST /streams")
        ResponseEnvelope<BitmovinStreamResponse> create(CreateBitmovinStreamRequest createBitmovinStreamRequest) throws BitmovinException;
    
        @RequestLine("GET /streams/{stream_id}")
        ResponseEnvelope<BitmovinStreamResponse> get(@Param(value = "stream_id") String streamId) throws BitmovinException;
    
        @RequestLine("GET /streams")
        ResponseEnvelope<PaginationResponse<BitmovinStreamResponse>> list(@QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    
        @RequestLine("PATCH /streams/{stream_id}")
        ResponseEnvelope<BitmovinStreamResponse> patchBitmovinStreamsStreamsByStreamId(@Param(value = "stream_id") String streamId, UpdateBitmovinStreamRequest updateBitmovinStreamRequest) throws BitmovinException;
    }
}
