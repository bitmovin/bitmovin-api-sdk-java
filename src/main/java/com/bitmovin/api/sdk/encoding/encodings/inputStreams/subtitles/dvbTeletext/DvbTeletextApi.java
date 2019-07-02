package com.bitmovin.api.sdk.encoding.encodings.inputStreams.subtitles.dvbTeletext;

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

public class DvbTeletextApi {

    private final DvbTeletextApiClient apiClient;

    public DvbTeletextApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(DvbTeletextApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of DvbTeletextApi
     */
    public static BitmovinApiBuilder<DvbTeletextApi> builder() {
        return new BitmovinApiBuilder<>(DvbTeletextApi.class);
    }
    
    /**
     * Add DVB-Teletext Input Stream
     * 
     * @param encodingId Id of the encoding. (required)
     * @param dvbTeletextInputStream  (required)
     * @return DvbTeletextInputStream
     * @throws BitmovinException if fails to make API call
     */
    public DvbTeletextInputStream create(String encodingId, DvbTeletextInputStream dvbTeletextInputStream) throws BitmovinException {
        return this.apiClient.create(encodingId, dvbTeletextInputStream).getData().getResult();
    }
    
    /**
     * Delete DVB-Teletext Input Stream
     * 
     * @param encodingId Id of the encoding. (required)
     * @param inputStreamId Id of the DVB-Teletext input stream. (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse delete(String encodingId, String inputStreamId) throws BitmovinException {
        return this.apiClient.delete(encodingId, inputStreamId).getData().getResult();
    }
    
    /**
     * DVB-Teletext Input Stream Details
     * 
     * @param encodingId Id of the encoding. (required)
     * @param inputStreamId Id of the DVB-Teletext input stream. (required)
     * @return DvbTeletextInputStream
     * @throws BitmovinException if fails to make API call
     */
    public DvbTeletextInputStream get(String encodingId, String inputStreamId) throws BitmovinException {
        return this.apiClient.get(encodingId, inputStreamId).getData().getResult();
    }
    
    /**
     * List DVB-Teletext Input Streams
     * 
     * @param encodingId Id of the encoding. (required)
     * @return List&lt;DvbTeletextInputStream&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<DvbTeletextInputStream> list(String encodingId) throws BitmovinException {
        return this.apiClient.list(encodingId, new HashMap<String, Object>()).getData().getResult();
    }
    /**
     * List DVB-Teletext Input Streams
     * 
     * @param encodingId Id of the encoding. (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;DvbTeletextInputStream&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<DvbTeletextInputStream> list(String encodingId, DvbTeletextInputStreamListQueryParams queryParams) throws BitmovinException {
        return this.apiClient.list(encodingId, queryParams).getData().getResult();
    }
    
    interface DvbTeletextApiClient {
    
        @RequestLine("POST /encoding/encodings/{encoding_id}/input-streams/subtitles/dvb-teletext")
        ResponseEnvelope<DvbTeletextInputStream> create(@Param(value = "encoding_id") String encodingId, DvbTeletextInputStream dvbTeletextInputStream) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/encodings/{encoding_id}/input-streams/subtitles/dvb-teletext/{input_stream_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "encoding_id") String encodingId, @Param(value = "input_stream_id") String inputStreamId) throws BitmovinException;
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/input-streams/subtitles/dvb-teletext/{input_stream_id}")
        ResponseEnvelope<DvbTeletextInputStream> get(@Param(value = "encoding_id") String encodingId, @Param(value = "input_stream_id") String inputStreamId) throws BitmovinException;
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/input-streams/subtitles/dvb-teletext")
        ResponseEnvelope<PaginationResponse<DvbTeletextInputStream>> list(@Param(value = "encoding_id") String encodingId, @QueryMap Map<String, Object> queryParams) throws BitmovinException;
    }
}
