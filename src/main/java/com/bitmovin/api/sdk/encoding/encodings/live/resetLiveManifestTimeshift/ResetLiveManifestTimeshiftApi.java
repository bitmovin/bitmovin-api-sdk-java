package com.bitmovin.api.sdk.encoding.encodings.live.resetLiveManifestTimeshift;

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

public class ResetLiveManifestTimeshiftApi {

    private final ResetLiveManifestTimeshiftApiClient apiClient;

    public ResetLiveManifestTimeshiftApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(ResetLiveManifestTimeshiftApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of ResetLiveManifestTimeshiftApi
     */
    public static BitmovinApiBuilder<ResetLiveManifestTimeshiftApi> builder() {
        return new BitmovinApiBuilder<>(ResetLiveManifestTimeshiftApi.class);
    }
    /**
     * Reset Live manifest time-shift
     * 
     * @param encodingId Id of the encoding. (required)
     * @param resetLiveManifestTimeShift Removes older segments from live manifests, resetting or reducing the time-shift (DVR) window. You can set &#x60;residualPeriodInSeconds&#x60; to specify how many seconds of content remain in the manifest after the reset, or &#x60;offsetInSeconds&#x60; to remove all segments before a position measured from the start of the live event. Do not set both parameters. If neither parameter is set, only the most recent segment remains. For DASH manifests that use SegmentTemplate, the duration retained by &#x60;residualPeriodInSeconds&#x60; (or when neither parameter is set) also includes the configured &#x60;liveEdgeOffset&#x60;. The configured time-shift window does not change. After the reset, new segments are added without removing older ones until the configured window duration is reached again. This operation supports HLS live manifests and, with encoder version 2.235.0 or later, DASH live manifests. The live encoding must have the &#x60;RUNNING&#x60; status. The request is processed asynchronously.  (required)
     * @return ResetLiveManifestTimeShift
     * @throws BitmovinException if fails to make API call
     */
    public ResetLiveManifestTimeShift create(String encodingId, ResetLiveManifestTimeShift resetLiveManifestTimeShift) throws BitmovinException {
        try {
            return this.apiClient.create(encodingId, resetLiveManifestTimeShift).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface ResetLiveManifestTimeshiftApiClient { 
        @RequestLine("POST /encoding/encodings/{encoding_id}/live/reset-live-manifest-timeshift")
        ResponseEnvelope<ResetLiveManifestTimeShift> create(@Param(value = "encoding_id") String encodingId, ResetLiveManifestTimeShift resetLiveManifestTimeShift) throws BitmovinException;
    }
}
