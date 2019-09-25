package com.bitmovin.api.sdk.encoding.encodings.streams.burnInSubtitles.dvbsub;

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
import com.bitmovin.api.sdk.common.BitmovinApiBuilder;
import com.bitmovin.api.sdk.common.BitmovinApiClientFactory;

public class DvbsubApi {

    private final DvbsubApiClient apiClient;

    public DvbsubApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(DvbsubApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of DvbsubApi
     */
    public static BitmovinApiBuilder<DvbsubApi> builder() {
        return new BitmovinApiBuilder<>(DvbsubApi.class);
    }
    
    /**
     * Burn-In DVB-SUB Subtitle into Stream
     * 
     * @param encodingId Id of the encoding. (required)
     * @param streamId Id of the stream. (required)
     * @param streamDvbSubSubtitle The Burn-In DVB-SUB Subtitle to be added (required)
     * @return StreamDvbSubSubtitle
     * @throws BitmovinException if fails to make API call
     */
    public StreamDvbSubSubtitle create(String encodingId, String streamId, StreamDvbSubSubtitle streamDvbSubSubtitle) throws BitmovinException {
        try {
            return this.apiClient.create(encodingId, streamId, streamDvbSubSubtitle).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    interface DvbsubApiClient {
    
        @RequestLine("POST /encoding/encodings/{encoding_id}/streams/{stream_id}/burn-in-subtitles/dvbsub")
        ResponseEnvelope<StreamDvbSubSubtitle> create(@Param(value = "encoding_id") String encodingId, @Param(value = "stream_id") String streamId, StreamDvbSubSubtitle streamDvbSubSubtitle) throws BitmovinException;
    }
}
