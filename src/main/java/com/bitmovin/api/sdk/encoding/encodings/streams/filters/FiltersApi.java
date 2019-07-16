package com.bitmovin.api.sdk.encoding.encodings.streams.filters;

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

public class FiltersApi {

    private final FiltersApiClient apiClient;

    public FiltersApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(FiltersApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of FiltersApi
     */
    public static BitmovinApiBuilder<FiltersApi> builder() {
        return new BitmovinApiBuilder<>(FiltersApi.class);
    }
    
    /**
     * Add Filters to Stream
     * 
     * @param encodingId Id of the encoding. (required)
     * @param streamId Id of the stream. (required)
     * @param streamFilter The Filters to be added (required)
     * @return StreamFilterList
     * @throws BitmovinException if fails to make API call
     */
    public StreamFilterList create(String encodingId, String streamId, List<StreamFilter> streamFilter) throws BitmovinException {
        return this.apiClient.create(encodingId, streamId, streamFilter).getData().getResult();
    }
    
    /**
     * Delete Specific Filter from Stream
     * 
     * @param encodingId Id of the encoding. (required)
     * @param streamId Id of the stream. (required)
     * @param filterId Id of the filter (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse delete(String encodingId, String streamId, String filterId) throws BitmovinException {
        return this.apiClient.delete(encodingId, streamId, filterId).getData().getResult();
    }
    
    /**
     * Delete All Filters from Stream
     * 
     * @param encodingId Id of the encoding. (required)
     * @param streamId Id of the stream. (required)
     * @return BitmovinResponseList
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponseList deleteAll(String encodingId, String streamId) throws BitmovinException {
        return this.apiClient.deleteAll(encodingId, streamId).getData().getResult();
    }
    
    /**
     * List the filters of a stream
     * 
     * @param encodingId Id of the encoding. (required)
     * @param streamId Id of the stream. (required)
     * @return StreamFilterList
     * @throws BitmovinException if fails to make API call
     */
    public StreamFilterList list(String encodingId, String streamId) throws BitmovinException {
        return this.apiClient.list(encodingId, streamId, new HashMap<String, Object>()).getData().getResult();
    }
    /**
     * List the filters of a stream
     * 
     * @param encodingId Id of the encoding. (required)
     * @param streamId Id of the stream. (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return StreamFilterList
     * @throws BitmovinException if fails to make API call
     */
    public StreamFilterList list(String encodingId, String streamId, StreamFilterListListQueryParams queryParams) throws BitmovinException {
        return this.apiClient.list(encodingId, streamId, queryParams).getData().getResult();
    }
    
    interface FiltersApiClient {
    
        @RequestLine("POST /encoding/encodings/{encoding_id}/streams/{stream_id}/filters")
        ResponseEnvelope<StreamFilterList> create(@Param(value = "encoding_id") String encodingId, @Param(value = "stream_id") String streamId, List<StreamFilter> streamFilter) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/encodings/{encoding_id}/streams/{stream_id}/filters/{filter_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "encoding_id") String encodingId, @Param(value = "stream_id") String streamId, @Param(value = "filter_id") String filterId) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/encodings/{encoding_id}/streams/{stream_id}/filters")
        ResponseEnvelope<BitmovinResponseList> deleteAll(@Param(value = "encoding_id") String encodingId, @Param(value = "stream_id") String streamId) throws BitmovinException;
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/streams/{stream_id}/filters")
        ResponseEnvelope<StreamFilterList> list(@Param(value = "encoding_id") String encodingId, @Param(value = "stream_id") String streamId, @QueryMap Map<String, Object> queryParams) throws BitmovinException;
    }
}
