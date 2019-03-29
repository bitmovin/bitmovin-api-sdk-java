package com.bitmovin.api.sdk.encoding.statistics.encodings.liveStatistics.streams;

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

public class StreamsApi {

    private final StreamsApiClient apiClient;

    public StreamsApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(StreamsApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of StreamsApi
     */
    public static BitmovinApiBuilder<StreamsApi> builder() {
        return new BitmovinApiBuilder<>(StreamsApi.class);
    }
    
    /**
     * List Stream Infos of Live Statistics from an Encoding
     * 
     * @param encodingId Id of the encoding. (required)
     * @return List&lt;StreamInfos&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<StreamInfos> list(String encodingId) throws BitmovinException {
        return this.apiClient.list(encodingId, new HashMap<String, Object>()).getData().getResult();
    }
    /**
     * List Stream Infos of Live Statistics from an Encoding
     * 
     * @param encodingId Id of the encoding. (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;StreamInfos&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<StreamInfos> list(String encodingId, StreamInfosListQueryParams queryParams) throws BitmovinException {
        return this.apiClient.list(encodingId, queryParams).getData().getResult();
    }
    
    interface StreamsApiClient {
    
        @RequestLine("GET /encoding/statistics/encodings/{encoding_id}/live-statistics/streams")
        ResponseEnvelope<PaginationResponse<StreamInfos>> list(@Param(value = "encoding_id") String encodingId, @QueryMap Map<String, Object> queryParams) throws BitmovinException;
    }
}
