package com.bitmovin.api.sdk.encoding.encodings.streams.subtitles.dvbsub;

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
import com.bitmovin.api.sdk.encoding.encodings.streams.subtitles.dvbsub.customdata.CustomdataApi;

public class DvbsubApi {
    public final CustomdataApi customdata;

    private final DvbsubApiClient apiClient;

    public DvbsubApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(DvbsubApiClient.class);

        this.customdata = new CustomdataApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of DvbsubApi
     */
    public static BitmovinApiBuilder<DvbsubApi> builder() {
        return new BitmovinApiBuilder<>(DvbsubApi.class);
    }
    
    /**
     * Burn-In DVB-SUB Subtitle into Stream
     * 
     * @param encodingId Id of the encoding. (required)
     * @param streamId Id of the stream. (required)
     * @param streamDvbSubSubtitle  (optional)
     * @return StreamDvbSubSubtitle
     * @throws BitmovinException if fails to make API call
     */
    public StreamDvbSubSubtitle create(String encodingId, String streamId, StreamDvbSubSubtitle streamDvbSubSubtitle) throws BitmovinException {
        return this.apiClient.create(encodingId, streamId, streamDvbSubSubtitle).getData().getResult();
    }
    
    /**
     * Delete Specific DVB-SUB Subtitle from Stream
     * 
     * @param encodingId Id of the encoding. (required)
     * @param streamId Id of the stream. (required)
     * @param subtitleId TODO Add description (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse delete(String encodingId, String streamId, String subtitleId) throws BitmovinException {
        return this.apiClient.delete(encodingId, streamId, subtitleId).getData().getResult();
    }
    
    /**
     * Subtitle DVB-SUB BurnIn Details
     * 
     * @param encodingId Id of the encoding. (required)
     * @param streamId Id of the stream. (required)
     * @param subtitleId Id of the subtitle. (required)
     * @return StreamDvbSubSubtitle
     * @throws BitmovinException if fails to make API call
     */
    public StreamDvbSubSubtitle get(String encodingId, String streamId, String subtitleId) throws BitmovinException {
        return this.apiClient.get(encodingId, streamId, subtitleId).getData().getResult();
    }
    
    /**
     * List the DVB-SUB subtitles of a stream
     * 
     * @param encodingId Id of the encoding. (required)
     * @param streamId Id of the stream. (required)
     * @return List&lt;StreamDvbSubSubtitle&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<StreamDvbSubSubtitle> list(String encodingId, String streamId) throws BitmovinException {
        return this.apiClient.list(encodingId, streamId, new HashMap<String, Object>()).getData().getResult();
    }
    /**
     * List the DVB-SUB subtitles of a stream
     * 
     * @param encodingId Id of the encoding. (required)
     * @param streamId Id of the stream. (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;StreamDvbSubSubtitle&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<StreamDvbSubSubtitle> list(String encodingId, String streamId, StreamDvbSubSubtitleListQueryParams queryParams) throws BitmovinException {
        return this.apiClient.list(encodingId, streamId, queryParams).getData().getResult();
    }
    
    interface DvbsubApiClient {
    
        @RequestLine("POST /encoding/encodings/{encoding_id}/streams/{stream_id}/subtitles/dvbsub")
        ResponseEnvelope<StreamDvbSubSubtitle> create(@Param(value = "encoding_id") String encodingId, @Param(value = "stream_id") String streamId, StreamDvbSubSubtitle streamDvbSubSubtitle) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/encodings/{encoding_id}/streams/{stream_id}/subtitles/dvbsub/{subtitle_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "encoding_id") String encodingId, @Param(value = "stream_id") String streamId, @Param(value = "subtitle_id") String subtitleId) throws BitmovinException;
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/streams/{stream_id}/subtitles/dvbsub/{subtitle_id}")
        ResponseEnvelope<StreamDvbSubSubtitle> get(@Param(value = "encoding_id") String encodingId, @Param(value = "stream_id") String streamId, @Param(value = "subtitle_id") String subtitleId) throws BitmovinException;
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/streams/{stream_id}/subtitles/dvbsub")
        ResponseEnvelope<PaginationResponse<StreamDvbSubSubtitle>> list(@Param(value = "encoding_id") String encodingId, @Param(value = "stream_id") String streamId, @QueryMap Map<String, Object> queryParams) throws BitmovinException;
    }
}
