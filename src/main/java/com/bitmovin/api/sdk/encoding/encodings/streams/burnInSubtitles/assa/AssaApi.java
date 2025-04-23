package com.bitmovin.api.sdk.encoding.encodings.streams.burnInSubtitles.assa;

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

public class AssaApi {

    private final AssaApiClient apiClient;

    public AssaApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(AssaApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of AssaApi
     */
    public static BitmovinApiBuilder<AssaApi> builder() {
        return new BitmovinApiBuilder<>(AssaApi.class);
    }
    /**
     * Burn-In ASSA Subtitle into Stream
     * 
     * @param encodingId Id of the encoding. (required)
     * @param streamId Id of the stream. (required)
     * @param burnInSubtitleAssa The Burn-In ASSA Subtitle to be added (required)
     * @return BurnInSubtitleAssa
     * @throws BitmovinException if fails to make API call
     */
    public BurnInSubtitleAssa create(String encodingId, String streamId, BurnInSubtitleAssa burnInSubtitleAssa) throws BitmovinException {
        try {
            return this.apiClient.create(encodingId, streamId, burnInSubtitleAssa).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * Delete Burn-In ASSA Subtitle from Stream
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
     * Get Burn-In ASSA Subtitle Details
     * 
     * @param encodingId Id of the encoding. (required)
     * @param streamId Id of the stream. (required)
     * @param subtitleId Id of the burn-in subtitle. (required)
     * @return BurnInSubtitleAssa
     * @throws BitmovinException if fails to make API call
     */
    public BurnInSubtitleAssa get(String encodingId, String streamId, String subtitleId) throws BitmovinException {
        try {
            return this.apiClient.get(encodingId, streamId, subtitleId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * List the Burn-In ASSA subtitles of a stream
     * 
     * @param encodingId Id of the encoding. (required)
     * @param streamId Id of the stream. (required)
     * @return List&lt;BurnInSubtitleAssa&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<BurnInSubtitleAssa> list(String encodingId, String streamId) throws BitmovinException {
        try {
            return this.apiClient.list(encodingId, streamId, new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * List the Burn-In ASSA subtitles of a stream
     * 
     * @param encodingId Id of the encoding. (required)
     * @param streamId Id of the stream. (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;BurnInSubtitleAssa&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<BurnInSubtitleAssa> list(String encodingId, String streamId, BurnInSubtitleAssaListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(encodingId, streamId, new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface AssaApiClient { 
        @RequestLine("POST /encoding/encodings/{encoding_id}/streams/{stream_id}/burn-in-subtitles/assa")
        ResponseEnvelope<BurnInSubtitleAssa> create(@Param(value = "encoding_id") String encodingId, @Param(value = "stream_id") String streamId, BurnInSubtitleAssa burnInSubtitleAssa) throws BitmovinException;
   
        @RequestLine("DELETE /encoding/encodings/{encoding_id}/streams/{stream_id}/burn-in-subtitles/assa/{subtitle_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "encoding_id") String encodingId, @Param(value = "stream_id") String streamId, @Param(value = "subtitle_id") String subtitleId) throws BitmovinException;
   
        @RequestLine("GET /encoding/encodings/{encoding_id}/streams/{stream_id}/burn-in-subtitles/assa/{subtitle_id}")
        ResponseEnvelope<BurnInSubtitleAssa> get(@Param(value = "encoding_id") String encodingId, @Param(value = "stream_id") String streamId, @Param(value = "subtitle_id") String subtitleId) throws BitmovinException;
   
        @RequestLine("GET /encoding/encodings/{encoding_id}/streams/{stream_id}/burn-in-subtitles/assa")
        ResponseEnvelope<PaginationResponse<BurnInSubtitleAssa>> list(@Param(value = "encoding_id") String encodingId, @Param(value = "stream_id") String streamId, @QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    }
}
