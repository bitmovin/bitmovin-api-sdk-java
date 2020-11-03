package com.bitmovin.api.sdk.encoding.encodings.inputStreams.subtitles.dvbSubtitle;

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

public class DvbSubtitleApi {

    private final DvbSubtitleApiClient apiClient;

    public DvbSubtitleApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(DvbSubtitleApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of DvbSubtitleApi
     */
    public static BitmovinApiBuilder<DvbSubtitleApi> builder() {
        return new BitmovinApiBuilder<>(DvbSubtitleApi.class);
    }
    
    /**
     * Add DVB Subtitle Input Stream
     * 
     * @param encodingId Id of the encoding. (required)
     * @param dvbSubtitleInputStream The DVB Subtitle Input Stream to be created (required)
     * @return DvbSubtitleInputStream
     * @throws BitmovinException if fails to make API call
     */
    public DvbSubtitleInputStream create(String encodingId, DvbSubtitleInputStream dvbSubtitleInputStream) throws BitmovinException {
        try {
            return this.apiClient.create(encodingId, dvbSubtitleInputStream).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * Delete DVB Subtitle Input Stream
     * 
     * @param encodingId Id of the encoding. (required)
     * @param inputStreamId Id of the DVB Subtitle Input Stream. (required)
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
     * DVB Subtitle Input Stream Details
     * 
     * @param encodingId Id of the encoding. (required)
     * @param inputStreamId Id of the DVB Subtitle Input Stream. (required)
     * @return DvbSubtitleInputStream
     * @throws BitmovinException if fails to make API call
     */
    public DvbSubtitleInputStream get(String encodingId, String inputStreamId) throws BitmovinException {
        try {
            return this.apiClient.get(encodingId, inputStreamId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * List DVB Subtitle Input Streams
     * 
     * @param encodingId Id of the encoding. (required)
     * @return List&lt;DvbSubtitleInputStream&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<DvbSubtitleInputStream> list(String encodingId) throws BitmovinException {
        try {
            return this.apiClient.list(encodingId, new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * List DVB Subtitle Input Streams
     * 
     * @param encodingId Id of the encoding. (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;DvbSubtitleInputStream&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<DvbSubtitleInputStream> list(String encodingId, DvbSubtitleInputStreamListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(encodingId, new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    interface DvbSubtitleApiClient {
    
        @RequestLine("POST /encoding/encodings/{encoding_id}/input-streams/subtitles/dvb-subtitle")
        ResponseEnvelope<DvbSubtitleInputStream> create(@Param(value = "encoding_id") String encodingId, DvbSubtitleInputStream dvbSubtitleInputStream) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/encodings/{encoding_id}/input-streams/subtitles/dvb-subtitle/{input_stream_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "encoding_id") String encodingId, @Param(value = "input_stream_id") String inputStreamId) throws BitmovinException;
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/input-streams/subtitles/dvb-subtitle/{input_stream_id}")
        ResponseEnvelope<DvbSubtitleInputStream> get(@Param(value = "encoding_id") String encodingId, @Param(value = "input_stream_id") String inputStreamId) throws BitmovinException;
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/input-streams/subtitles/dvb-subtitle")
        ResponseEnvelope<PaginationResponse<DvbSubtitleInputStream>> list(@Param(value = "encoding_id") String encodingId, @QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    }
}
