package com.bitmovin.api.sdk.streams.video;

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

public class VideoApi {

    private final VideoApiClient apiClient;

    public VideoApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(VideoApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of VideoApi
     */
    public static BitmovinApiBuilder<VideoApi> builder() {
        return new BitmovinApiBuilder<>(VideoApi.class);
    }

    /**
     * Create new Stream
     * 
     * @param streamsVideoCreateRequest Create a new stream. (required)
     * @return StreamsVideoResponse
     * @throws BitmovinException if fails to make API call
     */
    public StreamsVideoResponse create(StreamsVideoCreateRequest streamsVideoCreateRequest) throws BitmovinException {
        try {
            return this.apiClient.create(streamsVideoCreateRequest).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * Get stream by id
     * 
     * @param streamId Id of the stream. (required)
     * @return StreamsVideoResponse
     * @throws BitmovinException if fails to make API call
     */
    public StreamsVideoResponse get(String streamId) throws BitmovinException {
        try {
            return this.apiClient.get(streamId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * Get paginated list of streams
     * 
     * @return List&lt;StreamsVideoResponse&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<StreamsVideoResponse> list() throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * Get paginated list of streams
     * 
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;StreamsVideoResponse&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<StreamsVideoResponse> list(StreamsVideoResponseListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * Update stream by id
     * 
     * @param streamId Id of the stream. (required)
     * @param streamsVideoUpdateRequest Stream fields to update. (required)
     * @return StreamsVideoResponse
     * @throws BitmovinException if fails to make API call
     */
    public StreamsVideoResponse patchStreamsVideo(String streamId, StreamsVideoUpdateRequest streamsVideoUpdateRequest) throws BitmovinException {
        try {
            return this.apiClient.patchStreamsVideo(streamId, streamsVideoUpdateRequest).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface VideoApiClient {

        @RequestLine("POST /streams/video")
        ResponseEnvelope<StreamsVideoResponse> create(StreamsVideoCreateRequest streamsVideoCreateRequest) throws BitmovinException;
    
        @RequestLine("GET /streams/video/{stream_id}")
        ResponseEnvelope<StreamsVideoResponse> get(@Param(value = "stream_id") String streamId) throws BitmovinException;
    
        @RequestLine("GET /streams/video")
        ResponseEnvelope<PaginationResponse<StreamsVideoResponse>> list(@QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    
        @RequestLine("PATCH /streams/video/{stream_id}")
        ResponseEnvelope<StreamsVideoResponse> patchStreamsVideo(@Param(value = "stream_id") String streamId, StreamsVideoUpdateRequest streamsVideoUpdateRequest) throws BitmovinException;
    }
}
