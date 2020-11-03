package com.bitmovin.api.sdk.encoding.encodings.inputStreams.trimming.timecodeTrack;

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

public class TimecodeTrackApi {

    private final TimecodeTrackApiClient apiClient;

    public TimecodeTrackApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(TimecodeTrackApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of TimecodeTrackApi
     */
    public static BitmovinApiBuilder<TimecodeTrackApi> builder() {
        return new BitmovinApiBuilder<>(TimecodeTrackApi.class);
    }
    
    /**
     * Add Timecode Track Trimming Input Stream
     * 
     * @param encodingId Id of the encoding. (required)
     * @param timecodeTrackTrimmingInputStream The Timecode Track Trimming Input Stream to be created (required)
     * @return TimecodeTrackTrimmingInputStream
     * @throws BitmovinException if fails to make API call
     */
    public TimecodeTrackTrimmingInputStream create(String encodingId, TimecodeTrackTrimmingInputStream timecodeTrackTrimmingInputStream) throws BitmovinException {
        try {
            return this.apiClient.create(encodingId, timecodeTrackTrimmingInputStream).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * Delete Timecode Track Trimming Input Stream
     * 
     * @param encodingId Id of the encoding. (required)
     * @param inputStreamId Id of the Timecode Track Trimming Input Stream. (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse delete(String encodingId, String inputStreamId) throws BitmovinException {
        try {
            return this.apiClient.delete(encodingId, inputStreamId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * Timecode Track Trimming Input Stream Details
     * 
     * @param encodingId Id of the encoding. (required)
     * @param inputStreamId Id of the Timecode Track Trimming Input Stream. (required)
     * @return TimecodeTrackTrimmingInputStream
     * @throws BitmovinException if fails to make API call
     */
    public TimecodeTrackTrimmingInputStream get(String encodingId, String inputStreamId) throws BitmovinException {
        try {
            return this.apiClient.get(encodingId, inputStreamId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * List Timecode Track Trimming Input Streams
     * 
     * @param encodingId Id of the encoding. (required)
     * @return List&lt;TimecodeTrackTrimmingInputStream&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<TimecodeTrackTrimmingInputStream> list(String encodingId) throws BitmovinException {
        try {
            return this.apiClient.list(encodingId, new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * List Timecode Track Trimming Input Streams
     * 
     * @param encodingId Id of the encoding. (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;TimecodeTrackTrimmingInputStream&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<TimecodeTrackTrimmingInputStream> list(String encodingId, TimecodeTrackTrimmingInputStreamListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(encodingId, new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    interface TimecodeTrackApiClient {
    
        @RequestLine("POST /encoding/encodings/{encoding_id}/input-streams/trimming/timecode-track")
        ResponseEnvelope<TimecodeTrackTrimmingInputStream> create(@Param(value = "encoding_id") String encodingId, TimecodeTrackTrimmingInputStream timecodeTrackTrimmingInputStream) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/encodings/{encoding_id}/input-streams/trimming/timecode-track/{input_stream_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "encoding_id") String encodingId, @Param(value = "input_stream_id") String inputStreamId) throws BitmovinException;
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/input-streams/trimming/timecode-track/{input_stream_id}")
        ResponseEnvelope<TimecodeTrackTrimmingInputStream> get(@Param(value = "encoding_id") String encodingId, @Param(value = "input_stream_id") String inputStreamId) throws BitmovinException;
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/input-streams/trimming/timecode-track")
        ResponseEnvelope<PaginationResponse<TimecodeTrackTrimmingInputStream>> list(@Param(value = "encoding_id") String encodingId, @QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    }
}
