package com.bitmovin.api.sdk.encoding.encodings.inputStreams.trimming.h264PictureTiming;

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

public class H264PictureTimingApi {

    private final H264PictureTimingApiClient apiClient;

    public H264PictureTimingApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(H264PictureTimingApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of H264PictureTimingApi
     */
    public static BitmovinApiBuilder<H264PictureTimingApi> builder() {
        return new BitmovinApiBuilder<>(H264PictureTimingApi.class);
    }
    
    /**
     * Add H264 Picture Timing Trimming Input Stream
     * 
     * @param encodingId Id of the encoding. (required)
     * @param h264PictureTimingTrimmingInputStream  (required)
     * @return H264PictureTimingTrimmingInputStream
     * @throws BitmovinException if fails to make API call
     */
    public H264PictureTimingTrimmingInputStream create(String encodingId, H264PictureTimingTrimmingInputStream h264PictureTimingTrimmingInputStream) throws BitmovinException {
        return this.apiClient.create(encodingId, h264PictureTimingTrimmingInputStream).getData().getResult();
    }
    
    /**
     * Delete H264 Picture Timing Trimming Input Stream
     * 
     * @param encodingId Id of the encoding. (required)
     * @param inputStreamId Id of the H264 Picture Timing Trimming Input Stream. (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse delete(String encodingId, String inputStreamId) throws BitmovinException {
        return this.apiClient.delete(encodingId, inputStreamId).getData().getResult();
    }
    
    /**
     * H264 Picture Timing Trimming Input Stream Details
     * 
     * @param encodingId Id of the encoding. (required)
     * @param inputStreamId Id of the H264 Picture Timing Trimming Input Stream. (required)
     * @return H264PictureTimingTrimmingInputStream
     * @throws BitmovinException if fails to make API call
     */
    public H264PictureTimingTrimmingInputStream get(String encodingId, String inputStreamId) throws BitmovinException {
        return this.apiClient.get(encodingId, inputStreamId).getData().getResult();
    }
    
    /**
     * List H264 Picture Timing Trimming Input Streams
     * 
     * @param encodingId Id of the encoding. (required)
     * @return List&lt;H264PictureTimingTrimmingInputStream&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<H264PictureTimingTrimmingInputStream> list(String encodingId) throws BitmovinException {
        return this.apiClient.list(encodingId, new HashMap<String, Object>()).getData().getResult();
    }
    /**
     * List H264 Picture Timing Trimming Input Streams
     * 
     * @param encodingId Id of the encoding. (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;H264PictureTimingTrimmingInputStream&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<H264PictureTimingTrimmingInputStream> list(String encodingId, H264PictureTimingTrimmingInputStreamListQueryParams queryParams) throws BitmovinException {
        return this.apiClient.list(encodingId, queryParams).getData().getResult();
    }
    
    interface H264PictureTimingApiClient {
    
        @RequestLine("POST /encoding/encodings/{encoding_id}/input-streams/trimming/h264-picture-timing")
        ResponseEnvelope<H264PictureTimingTrimmingInputStream> create(@Param(value = "encoding_id") String encodingId, H264PictureTimingTrimmingInputStream h264PictureTimingTrimmingInputStream) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/encodings/{encoding_id}/input-streams/trimming/h264-picture-timing/{input_stream_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "encoding_id") String encodingId, @Param(value = "input_stream_id") String inputStreamId) throws BitmovinException;
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/input-streams/trimming/h264-picture-timing/{input_stream_id}")
        ResponseEnvelope<H264PictureTimingTrimmingInputStream> get(@Param(value = "encoding_id") String encodingId, @Param(value = "input_stream_id") String inputStreamId) throws BitmovinException;
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/input-streams/trimming/h264-picture-timing")
        ResponseEnvelope<PaginationResponse<H264PictureTimingTrimmingInputStream>> list(@Param(value = "encoding_id") String encodingId, @QueryMap Map<String, Object> queryParams) throws BitmovinException;
    }
}
