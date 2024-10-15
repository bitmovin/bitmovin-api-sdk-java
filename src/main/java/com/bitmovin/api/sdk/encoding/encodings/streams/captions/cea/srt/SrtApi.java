package com.bitmovin.api.sdk.encoding.encodings.streams.captions.cea.srt;

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
import com.bitmovin.api.sdk.encoding.encodings.streams.captions.cea.srt.customdata.CustomdataApi;

public class SrtApi {
    public final CustomdataApi customdata;

    private final SrtApiClient apiClient;

    public SrtApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(SrtApiClient.class);

        this.customdata = new CustomdataApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of SrtApi
     */
    public static BitmovinApiBuilder<SrtApi> builder() {
        return new BitmovinApiBuilder<>(SrtApi.class);
    }
    /**
     * Embed SRT captions as 608/708 into Stream
     * 
     * @param encodingId Id of the encoding. (required)
     * @param streamId Id of the stream. (required)
     * @param srtToCea608708Caption The SRT captions to be embedded as 607/708 into Stream (required)
     * @return SrtToCea608708Caption
     * @throws BitmovinException if fails to make API call
     */
    public SrtToCea608708Caption create(String encodingId, String streamId, SrtToCea608708Caption srtToCea608708Caption) throws BitmovinException {
        try {
            return this.apiClient.create(encodingId, streamId, srtToCea608708Caption).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * Delete SRT captions as 608/708 from Stream
     * 
     * @param encodingId Id of the encoding. (required)
     * @param streamId Id of the stream. (required)
     * @param captionsId Id of the caption. (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse delete(String encodingId, String streamId, String captionsId) throws BitmovinException {
        try {
            return this.apiClient.delete(encodingId, streamId, captionsId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * Embed SRT captions as 608/708 Details
     * 
     * @param encodingId Id of the encoding. (required)
     * @param streamId Id of the stream. (required)
     * @param captionsId Id of the caption. (required)
     * @return SrtToCea608708Caption
     * @throws BitmovinException if fails to make API call
     */
    public SrtToCea608708Caption get(String encodingId, String streamId, String captionsId) throws BitmovinException {
        try {
            return this.apiClient.get(encodingId, streamId, captionsId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * List SRT captions as 608/708 from Stream
     * 
     * @param encodingId Id of the encoding. (required)
     * @param streamId Id of the stream. (required)
     * @return List&lt;SrtToCea608708Caption&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<SrtToCea608708Caption> list(String encodingId, String streamId) throws BitmovinException {
        try {
            return this.apiClient.list(encodingId, streamId, new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * List SRT captions as 608/708 from Stream
     * 
     * @param encodingId Id of the encoding. (required)
     * @param streamId Id of the stream. (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;SrtToCea608708Caption&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<SrtToCea608708Caption> list(String encodingId, String streamId, SrtToCea608708CaptionListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(encodingId, streamId, new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface SrtApiClient { 
        @RequestLine("POST /encoding/encodings/{encoding_id}/streams/{stream_id}/captions/608-708/srt")
        ResponseEnvelope<SrtToCea608708Caption> create(@Param(value = "encoding_id") String encodingId, @Param(value = "stream_id") String streamId, SrtToCea608708Caption srtToCea608708Caption) throws BitmovinException;
   
        @RequestLine("DELETE /encoding/encodings/{encoding_id}/streams/{stream_id}/captions/608-708/srt/{captions_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "encoding_id") String encodingId, @Param(value = "stream_id") String streamId, @Param(value = "captions_id") String captionsId) throws BitmovinException;
   
        @RequestLine("GET /encoding/encodings/{encoding_id}/streams/{stream_id}/captions/608-708/srt/{captions_id}")
        ResponseEnvelope<SrtToCea608708Caption> get(@Param(value = "encoding_id") String encodingId, @Param(value = "stream_id") String streamId, @Param(value = "captions_id") String captionsId) throws BitmovinException;
   
        @RequestLine("GET /encoding/encodings/{encoding_id}/streams/{stream_id}/captions/608-708/srt")
        ResponseEnvelope<PaginationResponse<SrtToCea608708Caption>> list(@Param(value = "encoding_id") String encodingId, @Param(value = "stream_id") String streamId, @QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    }
}
