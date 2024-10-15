package com.bitmovin.api.sdk.encoding.statistics.encodings.liveStatistics;

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
import com.bitmovin.api.sdk.encoding.statistics.encodings.liveStatistics.events.EventsApi;
import com.bitmovin.api.sdk.encoding.statistics.encodings.liveStatistics.streams.StreamsApi;
import com.bitmovin.api.sdk.encoding.statistics.encodings.liveStatistics.srt.SrtApi;

public class LiveStatisticsApi {
    public final EventsApi events;
    public final StreamsApi streams;
    public final SrtApi srt;

    private final LiveStatisticsApiClient apiClient;

    public LiveStatisticsApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(LiveStatisticsApiClient.class);

        this.events = new EventsApi(clientFactory);
        this.streams = new StreamsApi(clientFactory);
        this.srt = new SrtApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of LiveStatisticsApi
     */
    public static BitmovinApiBuilder<LiveStatisticsApi> builder() {
        return new BitmovinApiBuilder<>(LiveStatisticsApi.class);
    }
    /**
     * List Live Statistics from an Encoding
     * 
     * @param encodingId Id of the encoding. (required)
     * @return LiveEncodingStats
     * @throws BitmovinException if fails to make API call
     */
    public LiveEncodingStats get(String encodingId) throws BitmovinException {
        try {
            return this.apiClient.get(encodingId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface LiveStatisticsApiClient { 
        @RequestLine("GET /encoding/statistics/encodings/{encoding_id}/live-statistics")
        ResponseEnvelope<LiveEncodingStats> get(@Param(value = "encoding_id") String encodingId) throws BitmovinException;
    }
}
