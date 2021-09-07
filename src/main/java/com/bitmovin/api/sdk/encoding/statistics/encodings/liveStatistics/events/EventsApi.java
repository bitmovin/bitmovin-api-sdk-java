package com.bitmovin.api.sdk.encoding.statistics.encodings.liveStatistics.events;

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

public class EventsApi {

    private final EventsApiClient apiClient;

    public EventsApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(EventsApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of EventsApi
     */
    public static BitmovinApiBuilder<EventsApi> builder() {
        return new BitmovinApiBuilder<>(EventsApi.class);
    }

    /**
     * List Events of Live Statistics from an Encoding
     * 
     * @param encodingId Id of the encoding. (required)
     * @return List&lt;LiveEncodingStatsEvent&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<LiveEncodingStatsEvent> list(String encodingId) throws BitmovinException {
        try {
            return this.apiClient.list(encodingId, new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * List Events of Live Statistics from an Encoding
     * 
     * @param encodingId Id of the encoding. (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;LiveEncodingStatsEvent&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<LiveEncodingStatsEvent> list(String encodingId, LiveEncodingStatsEventListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(encodingId, new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface EventsApiClient {

        @RequestLine("GET /encoding/statistics/encodings/{encoding_id}/live-statistics/events")
        ResponseEnvelope<PaginationResponse<LiveEncodingStatsEvent>> list(@Param(value = "encoding_id") String encodingId, @QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    }
}
