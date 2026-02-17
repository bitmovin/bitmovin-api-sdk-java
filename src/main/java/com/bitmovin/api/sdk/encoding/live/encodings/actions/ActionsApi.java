package com.bitmovin.api.sdk.encoding.live.encodings.actions;

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

public class ActionsApi {

    private final ActionsApiClient apiClient;

    public ActionsApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(ActionsApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of ActionsApi
     */
    public static BitmovinApiBuilder<ActionsApi> builder() {
        return new BitmovinApiBuilder<>(ActionsApi.class);
    }
    /**
     * Update the ingest points of a Redundant RTMP Input
     * 
     * @param encodingId Id of the encoding. (required)
     * @param updateEncodingRtmpIngestPointRequest The list of the RTMP ingest points to update. (required)
     * @return UpdateEncodingRtmpIngestPointResponse
     * @throws BitmovinException if fails to make API call
     */
    public UpdateEncodingRtmpIngestPointResponse patch(String encodingId, UpdateEncodingRtmpIngestPointRequest updateEncodingRtmpIngestPointRequest) throws BitmovinException {
        try {
            return this.apiClient.patch(encodingId, updateEncodingRtmpIngestPointRequest).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface ActionsApiClient { 
        @RequestLine("PATCH /encoding/live/encodings/{encoding_id}/actions/update-rtmp-ingest-points")
        ResponseEnvelope<UpdateEncodingRtmpIngestPointResponse> patch(@Param(value = "encoding_id") String encodingId, UpdateEncodingRtmpIngestPointRequest updateEncodingRtmpIngestPointRequest) throws BitmovinException;
    }
}
