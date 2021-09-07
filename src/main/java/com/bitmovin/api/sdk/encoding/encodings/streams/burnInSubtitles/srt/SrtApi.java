package com.bitmovin.api.sdk.encoding.encodings.streams.burnInSubtitles.srt;

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

public class SrtApi {

    private final SrtApiClient apiClient;

    public SrtApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(SrtApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of SrtApi
     */
    public static BitmovinApiBuilder<SrtApi> builder() {
        return new BitmovinApiBuilder<>(SrtApi.class);
    }

    /**
     * Burn-In SRT Subtitle into Stream
     * 
     * @param encodingId Id of the encoding. (required)
     * @param streamId Id of the stream. (required)
     * @param burnInSubtitleSrt The Burn-In SRT Subtitle to be added (required)
     * @return BurnInSubtitleSrt
     * @throws BitmovinException if fails to make API call
     */
    public BurnInSubtitleSrt create(String encodingId, String streamId, BurnInSubtitleSrt burnInSubtitleSrt) throws BitmovinException {
        try {
            return this.apiClient.create(encodingId, streamId, burnInSubtitleSrt).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * Delete Burn-In SRT Subtitle from Stream
     * 
     * @param encodingId Id of the encoding. (required)
     * @param streamId Id of the stream. (required)
     * @param subtitleId Id of the burn-in subtitle. (required)
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
     * Get Burn-In SRT Subtitle Details
     * 
     * @param encodingId Id of the encoding. (required)
     * @param streamId Id of the stream. (required)
     * @param subtitleId Id of the burn-in subtitle. (required)
     * @return BurnInSubtitleSrt
     * @throws BitmovinException if fails to make API call
     */
    public BurnInSubtitleSrt get(String encodingId, String streamId, String subtitleId) throws BitmovinException {
        try {
            return this.apiClient.get(encodingId, streamId, subtitleId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * List the Burn-In SRT subtitles of a stream
     * 
     * @param encodingId Id of the encoding. (required)
     * @param streamId Id of the stream. (required)
     * @return List&lt;BurnInSubtitleSrt&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<BurnInSubtitleSrt> list(String encodingId, String streamId) throws BitmovinException {
        try {
            return this.apiClient.list(encodingId, streamId, new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * List the Burn-In SRT subtitles of a stream
     * 
     * @param encodingId Id of the encoding. (required)
     * @param streamId Id of the stream. (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;BurnInSubtitleSrt&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<BurnInSubtitleSrt> list(String encodingId, String streamId, BurnInSubtitleSrtListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(encodingId, streamId, new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface SrtApiClient {

        @RequestLine("POST /encoding/encodings/{encoding_id}/streams/{stream_id}/burn-in-subtitles/srt")
        ResponseEnvelope<BurnInSubtitleSrt> create(@Param(value = "encoding_id") String encodingId, @Param(value = "stream_id") String streamId, BurnInSubtitleSrt burnInSubtitleSrt) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/encodings/{encoding_id}/streams/{stream_id}/burn-in-subtitles/srt/{subtitle_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "encoding_id") String encodingId, @Param(value = "stream_id") String streamId, @Param(value = "subtitle_id") String subtitleId) throws BitmovinException;
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/streams/{stream_id}/burn-in-subtitles/srt/{subtitle_id}")
        ResponseEnvelope<BurnInSubtitleSrt> get(@Param(value = "encoding_id") String encodingId, @Param(value = "stream_id") String streamId, @Param(value = "subtitle_id") String subtitleId) throws BitmovinException;
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/streams/{stream_id}/burn-in-subtitles/srt")
        ResponseEnvelope<PaginationResponse<BurnInSubtitleSrt>> list(@Param(value = "encoding_id") String encodingId, @Param(value = "stream_id") String streamId, @QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    }
}
