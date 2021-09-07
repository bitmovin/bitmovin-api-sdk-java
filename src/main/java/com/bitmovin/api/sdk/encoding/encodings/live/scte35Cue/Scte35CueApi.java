package com.bitmovin.api.sdk.encoding.encodings.live.scte35Cue;

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

public class Scte35CueApi {

    private final Scte35CueApiClient apiClient;

    public Scte35CueApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(Scte35CueApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of Scte35CueApi
     */
    public static BitmovinApiBuilder<Scte35CueApi> builder() {
        return new BitmovinApiBuilder<>(Scte35CueApi.class);
    }

    /**
     * Insert cue duration
     * 
     * @param encodingId Id of the encoding. (required)
     * @param scte35Cue Cue duration and manifest ids. (required)
     * @return Scte35Cue
     * @throws BitmovinException if fails to make API call
     */
    public Scte35Cue create(String encodingId, Scte35Cue scte35Cue) throws BitmovinException {
        try {
            return this.apiClient.create(encodingId, scte35Cue).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface Scte35CueApiClient {

        @RequestLine("POST /encoding/encodings/{encoding_id}/live/scte-35-cue")
        ResponseEnvelope<Scte35Cue> create(@Param(value = "encoding_id") String encodingId, Scte35Cue scte35Cue) throws BitmovinException;
    }
}
