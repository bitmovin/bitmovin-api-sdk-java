package com.bitmovin.api.sdk.encoding.statistics.encodings;

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
import com.bitmovin.api.sdk.encoding.statistics.encodings.live.LiveApi;
import com.bitmovin.api.sdk.encoding.statistics.encodings.vod.VodApi;
import com.bitmovin.api.sdk.encoding.statistics.encodings.liveStatistics.LiveStatisticsApi;

public class EncodingsApi {
    public final LiveApi live;
    public final VodApi vod;
    public final LiveStatisticsApi liveStatistics;

    private final EncodingsApiClient apiClient;

    public EncodingsApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(EncodingsApiClient.class);

        this.live = new LiveApi(clientFactory);
        this.vod = new VodApi(clientFactory);
        this.liveStatistics = new LiveStatisticsApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of EncodingsApi
     */
    public static BitmovinApiBuilder<EncodingsApi> builder() {
        return new BitmovinApiBuilder<>(EncodingsApi.class);
    }
    
    /**
     * Get Statistics from an Encoding
     * 
     * @param encodingId Id of the encoding (required)
     * @return EncodingStats
     * @throws BitmovinException if fails to make API call
     */
    public EncodingStats get(String encodingId) throws BitmovinException {
        try {
            return this.apiClient.get(encodingId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    interface EncodingsApiClient {
    
        @RequestLine("GET /encoding/statistics/encodings/{encoding_id}")
        ResponseEnvelope<EncodingStats> get(@Param(value = "encoding_id") String encodingId) throws BitmovinException;
    }
}
