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
     * @param resetLiveManifestTimeShift Removes older segments from live manifests. This resets or reduces the time-shift (DVR) window. The &#x60;residualPeriod&#x60; value determines how many seconds will remain in the time-shift window. The original time-shift window does not change. Newer segments will be added and not removed from the  manifest until the original time-shift duration is reached again.  Currently, only HLS live manifests are supported.  (required)
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
