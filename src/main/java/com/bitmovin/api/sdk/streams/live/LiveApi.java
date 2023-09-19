package com.bitmovin.api.sdk.streams.live;

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
import com.bitmovin.api.sdk.streams.live.stop.StopApi;
import com.bitmovin.api.sdk.streams.live.start.StartApi;

public class LiveApi {
    public final StopApi stop;
    public final StartApi start;

    private final LiveApiClient apiClient;

    public LiveApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(LiveApiClient.class);

        this.stop = new StopApi(clientFactory);
        this.start = new StartApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of LiveApi
     */
    public static BitmovinApiBuilder<LiveApi> builder() {
        return new BitmovinApiBuilder<>(LiveApi.class);
    }

    /**
     * Create new live stream
     * 
     * @param streamsLiveCreateRequest Create a new stream. (required)
     * @return StreamsLiveResponse
     * @throws BitmovinException if fails to make API call
     */
    public StreamsLiveResponse create(StreamsLiveCreateRequest streamsLiveCreateRequest) throws BitmovinException {
        try {
            return this.apiClient.create(streamsLiveCreateRequest).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * Delete Stream
     * 
     * @param streamId Id of the stream. (required)
     * @throws BitmovinException if fails to make API call
     */
    public void delete(String streamId) throws BitmovinException {
        try {
            this.apiClient.delete(streamId);
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * Get live stream by id
     * 
     * @param streamId Id of the stream. (required)
     * @return StreamsLiveResponse
     * @throws BitmovinException if fails to make API call
     */
    public StreamsLiveResponse get(String streamId) throws BitmovinException {
        try {
            return this.apiClient.get(streamId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * Get paginated list of live streams
     * 
     * @return List&lt;StreamsLiveResponse&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<StreamsLiveResponse> list() throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * Get paginated list of live streams
     * 
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;StreamsLiveResponse&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<StreamsLiveResponse> list(StreamsLiveResponseListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * Partially update live stream by id
     * 
     * @param streamId Id of the stream. (required)
     * @param streamsLiveUpdateRequest Stream fields to update. (required)
     * @return StreamsLiveResponse
     * @throws BitmovinException if fails to make API call
     */
    public StreamsLiveResponse patchStreamsLive(String streamId, StreamsLiveUpdateRequest streamsLiveUpdateRequest) throws BitmovinException {
        try {
            return this.apiClient.patchStreamsLive(streamId, streamsLiveUpdateRequest).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * Update live stream by id
     * 
     * @param streamId Id of the stream. (required)
     * @param streamsLiveUpdateRequest The updated Streams live object. (required)
     * @return StreamsLiveResponse
     * @throws BitmovinException if fails to make API call
     */
    public StreamsLiveResponse update(String streamId, StreamsLiveUpdateRequest streamsLiveUpdateRequest) throws BitmovinException {
        try {
            return this.apiClient.update(streamId, streamsLiveUpdateRequest).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface LiveApiClient {

        @RequestLine("POST /streams/live")
        ResponseEnvelope<StreamsLiveResponse> create(StreamsLiveCreateRequest streamsLiveCreateRequest) throws BitmovinException;
    
        @RequestLine("DELETE /streams/live/{stream_id}")
        void delete(@Param(value = "stream_id") String streamId) throws BitmovinException;
    
        @RequestLine("GET /streams/live/{stream_id}")
        ResponseEnvelope<StreamsLiveResponse> get(@Param(value = "stream_id") String streamId) throws BitmovinException;
    
        @RequestLine("GET /streams/live")
        ResponseEnvelope<PaginationResponse<StreamsLiveResponse>> list(@QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    
        @RequestLine("PATCH /streams/live/{stream_id}")
        ResponseEnvelope<StreamsLiveResponse> patchStreamsLive(@Param(value = "stream_id") String streamId, StreamsLiveUpdateRequest streamsLiveUpdateRequest) throws BitmovinException;
    
        @RequestLine("PUT /streams/live/{stream_id}")
        ResponseEnvelope<StreamsLiveResponse> update(@Param(value = "stream_id") String streamId, StreamsLiveUpdateRequest streamsLiveUpdateRequest) throws BitmovinException;
    }
}
