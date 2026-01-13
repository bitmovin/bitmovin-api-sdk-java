package com.bitmovin.api.sdk.encoding.encodings.live.esam.mediaPoints;

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

public class MediaPointsApi {

    private final MediaPointsApiClient apiClient;

    public MediaPointsApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(MediaPointsApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of MediaPointsApi
     */
    public static BitmovinApiBuilder<MediaPointsApi> builder() {
        return new BitmovinApiBuilder<>(MediaPointsApi.class);
    }
    /**
     * Create ESAM media point for live stream
     * Creates an out-of-band Event Signaling and Management (ESAM) media point for insertion into a  running live stream at a specific match time. The media point contains signals with timing  offsets and optional conditions for content boundary signaling. To use this endpoint, ESAM media point insertion needs to be enabled in the &#x60;adInsertionSettings&#x60;  of the [StartLiveEncodingRequest](#/Encoding/PostEncodingEncodingsLiveStartByEncodingId).  **Out-of-band vs In-band ESAM Processing:**  - **Out-of-band (this endpoint):** Manually trigger SCTE-35 signals by creating media points    during a live stream. Use this when you want programmatic control over when ad breaks or    content boundaries occur, independent of the incoming stream content.  - **In-band (&#x60;EsamSettings&#x60;):** Automatically process SCTE-35 markers already present in the    incoming live stream. Configure EsamSettings in the    [StartLiveEncodingRequest](#/Encoding/PostEncodingEncodingsLiveStartByEncodingId) to connect    to a POIS endpoint that processes detected SCTE-35 messages.  Use out-of-band media points when you need to insert signals at specific times based on external triggers or business logic, rather than relying on SCTE-35 markers present in the source stream. 
     * @param encodingId Id of the encoding (required)
     * @param esamMediaPoint ESAM media point (required)
     * @return EsamMediaPoint
     * @throws BitmovinException if fails to make API call
     */
    public EsamMediaPoint create(String encodingId, EsamMediaPoint esamMediaPoint) throws BitmovinException {
        try {
            return this.apiClient.create(encodingId, esamMediaPoint).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface MediaPointsApiClient { 
        @RequestLine("POST /encoding/encodings/{encoding_id}/live/esam/media-points")
        ResponseEnvelope<EsamMediaPoint> create(@Param(value = "encoding_id") String encodingId, EsamMediaPoint esamMediaPoint) throws BitmovinException;
    }
}
