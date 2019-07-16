package com.bitmovin.api.sdk.encoding.encodings.inputStreams.trimming.timeBased;

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

public class TimeBasedApi {

    private final TimeBasedApiClient apiClient;

    public TimeBasedApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(TimeBasedApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of TimeBasedApi
     */
    public static BitmovinApiBuilder<TimeBasedApi> builder() {
        return new BitmovinApiBuilder<>(TimeBasedApi.class);
    }
    
    /**
     * Add Time-Based Trimming Input Stream
     * 
     * @param encodingId Id of the encoding. (required)
     * @param timeBasedTrimmingInputStream The Time-Based Trimming Input Stream to be created (required)
     * @return TimeBasedTrimmingInputStream
     * @throws BitmovinException if fails to make API call
     */
    public TimeBasedTrimmingInputStream create(String encodingId, TimeBasedTrimmingInputStream timeBasedTrimmingInputStream) throws BitmovinException {
        return this.apiClient.create(encodingId, timeBasedTrimmingInputStream).getData().getResult();
    }
    
    /**
     * Delete Time-Based Trimming Input Stream
     * 
     * @param encodingId Id of the encoding. (required)
     * @param inputStreamId Id of the Time-Based Trimming Input Stream. (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse delete(String encodingId, String inputStreamId) throws BitmovinException {
        return this.apiClient.delete(encodingId, inputStreamId).getData().getResult();
    }
    
    /**
     * Time-Based Trimming Input Stream Details
     * 
     * @param encodingId Id of the encoding. (required)
     * @param inputStreamId Id of the Time-Based Trimming Input Stream. (required)
     * @return TimeBasedTrimmingInputStream
     * @throws BitmovinException if fails to make API call
     */
    public TimeBasedTrimmingInputStream get(String encodingId, String inputStreamId) throws BitmovinException {
        return this.apiClient.get(encodingId, inputStreamId).getData().getResult();
    }
    
    /**
     * List Time-Based Trimming Input Streams
     * 
     * @param encodingId Id of the encoding. (required)
     * @return List&lt;TimeBasedTrimmingInputStream&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<TimeBasedTrimmingInputStream> list(String encodingId) throws BitmovinException {
        return this.apiClient.list(encodingId, new HashMap<String, Object>()).getData().getResult();
    }
    /**
     * List Time-Based Trimming Input Streams
     * 
     * @param encodingId Id of the encoding. (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;TimeBasedTrimmingInputStream&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<TimeBasedTrimmingInputStream> list(String encodingId, TimeBasedTrimmingInputStreamListQueryParams queryParams) throws BitmovinException {
        return this.apiClient.list(encodingId, queryParams).getData().getResult();
    }
    
    interface TimeBasedApiClient {
    
        @RequestLine("POST /encoding/encodings/{encoding_id}/input-streams/trimming/time-based")
        ResponseEnvelope<TimeBasedTrimmingInputStream> create(@Param(value = "encoding_id") String encodingId, TimeBasedTrimmingInputStream timeBasedTrimmingInputStream) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/encodings/{encoding_id}/input-streams/trimming/time-based/{input_stream_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "encoding_id") String encodingId, @Param(value = "input_stream_id") String inputStreamId) throws BitmovinException;
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/input-streams/trimming/time-based/{input_stream_id}")
        ResponseEnvelope<TimeBasedTrimmingInputStream> get(@Param(value = "encoding_id") String encodingId, @Param(value = "input_stream_id") String inputStreamId) throws BitmovinException;
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/input-streams/trimming/time-based")
        ResponseEnvelope<PaginationResponse<TimeBasedTrimmingInputStream>> list(@Param(value = "encoding_id") String encodingId, @QueryMap Map<String, Object> queryParams) throws BitmovinException;
    }
}
