package com.bitmovin.api.sdk.encoding.encodings.streams.burnInSubtitles.dvbsub;

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

public class DvbsubApi {

    private final DvbsubApiClient apiClient;

    public DvbsubApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(DvbsubApiClient.class);

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
     * @param burnInSubtitleDvbSub The Burn-In DVB-SUB Subtitle to be added (required)
     * @return BurnInSubtitleDvbSub
     * @throws BitmovinException if fails to make API call
     */
    public BurnInSubtitleDvbSub create(String encodingId, String streamId, BurnInSubtitleDvbSub burnInSubtitleDvbSub) throws BitmovinException {
        try {
            return this.apiClient.create(encodingId, streamId, burnInSubtitleDvbSub).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * Delete Burn-In DVB-SUB Subtitle from Stream
     * 
     * @param encodingId Id of the encoding. (required)
     * @param streamId Id of the stream. (required)
     * @param subtitleId Id of the subtitle. (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse delete(String encodingId, String streamId, String subtitleId) throws BitmovinException {
        try {
            return this.apiClient.delete(encodingId, streamId, subtitleId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * Get Burn-In DVB-SUB Subtitle Details
     * 
     * @param encodingId Id of the encoding. (required)
     * @param streamId Id of the stream. (required)
     * @param subtitleId Id of the subtitle. (required)
     * @return BurnInSubtitleDvbSub
     * @throws BitmovinException if fails to make API call
     */
    public BurnInSubtitleDvbSub get(String encodingId, String streamId, String subtitleId) throws BitmovinException {
        try {
            return this.apiClient.get(encodingId, streamId, subtitleId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * List the Burn-In DVB-SUB subtitles of a stream
     * 
     * @param encodingId Id of the encoding. (required)
     * @param streamId Id of the stream. (required)
     * @return List&lt;BurnInSubtitleDvbSub&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<BurnInSubtitleDvbSub> list(String encodingId, String streamId) throws BitmovinException {
        try {
            return this.apiClient.list(encodingId, streamId, new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * List the Burn-In DVB-SUB subtitles of a stream
     * 
     * @param encodingId Id of the encoding. (required)
     * @param streamId Id of the stream. (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;BurnInSubtitleDvbSub&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<BurnInSubtitleDvbSub> list(String encodingId, String streamId, BurnInSubtitleDvbSubListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(encodingId, streamId, new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    interface DvbsubApiClient {
    
        @RequestLine("POST /encoding/encodings/{encoding_id}/streams/{stream_id}/burn-in-subtitles/dvbsub")
        ResponseEnvelope<BurnInSubtitleDvbSub> create(@Param(value = "encoding_id") String encodingId, @Param(value = "stream_id") String streamId, BurnInSubtitleDvbSub burnInSubtitleDvbSub) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/encodings/{encoding_id}/streams/{stream_id}/burn-in-subtitles/dvbsub/{subtitle_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "encoding_id") String encodingId, @Param(value = "stream_id") String streamId, @Param(value = "subtitle_id") String subtitleId) throws BitmovinException;
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/streams/{stream_id}/burn-in-subtitles/dvbsub/{subtitle_id}")
        ResponseEnvelope<BurnInSubtitleDvbSub> get(@Param(value = "encoding_id") String encodingId, @Param(value = "stream_id") String streamId, @Param(value = "subtitle_id") String subtitleId) throws BitmovinException;
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/streams/{stream_id}/burn-in-subtitles/dvbsub")
        ResponseEnvelope<PaginationResponse<BurnInSubtitleDvbSub>> list(@Param(value = "encoding_id") String encodingId, @Param(value = "stream_id") String streamId, @QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    }
}
