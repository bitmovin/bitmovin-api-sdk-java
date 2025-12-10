package com.bitmovin.api.sdk.encoding.encodings.live;

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
import com.bitmovin.api.sdk.encoding.encodings.live.resetLiveManifestTimeshift.ResetLiveManifestTimeshiftApi;
import com.bitmovin.api.sdk.encoding.encodings.live.heartbeat.HeartbeatApi;
import com.bitmovin.api.sdk.encoding.encodings.live.hd.HdApi;
import com.bitmovin.api.sdk.encoding.encodings.live.insertableContent.InsertableContentApi;
import com.bitmovin.api.sdk.encoding.encodings.live.scte35Cue.Scte35CueApi;

public class LiveApi {
    public final ResetLiveManifestTimeshiftApi resetLiveManifestTimeshift;
    public final HeartbeatApi heartbeat;
    public final HdApi hd;
    public final InsertableContentApi insertableContent;
    public final Scte35CueApi scte35Cue;

    private final LiveApiClient apiClient;

    public LiveApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(LiveApiClient.class);

        this.resetLiveManifestTimeshift = new ResetLiveManifestTimeshiftApi(clientFactory);
        this.heartbeat = new HeartbeatApi(clientFactory);
        this.hd = new HdApi(clientFactory);
        this.insertableContent = new InsertableContentApi(clientFactory);
        this.scte35Cue = new Scte35CueApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of LiveApi
     */
    public static BitmovinApiBuilder<LiveApi> builder() {
        return new BitmovinApiBuilder<>(LiveApi.class);
    }
    /**
     * Live Encoding Details
     * 
     * @param encodingId Id of the encoding. (required)
     * @return LiveEncoding
     * @throws BitmovinException if fails to make API call
     */
    public LiveEncoding get(String encodingId) throws BitmovinException {
        try {
            return this.apiClient.get(encodingId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * Live Encoding Start Details
     * 
     * @param encodingId Id of the encoding (required)
     * @return StartLiveEncodingRequest
     * @throws BitmovinException if fails to make API call
     */
    public StartLiveEncodingRequest getStartRequest(String encodingId) throws BitmovinException {
        try {
            return this.apiClient.getStartRequest(encodingId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * Re-Start Live Encoding
     * 
     * @param encodingId Id of the encoding.  **Important:** Only live encodings with the status &#x60;RUNNING&#x60;, &#x60;FINISHED&#x60;, &#x60;CANCELED&#x60; or &#x60;ERROR&#x60; can be restarted.  (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse restart(String encodingId) throws BitmovinException {
        try {
            return this.apiClient.restart(encodingId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * Start Live Encoding
     * 
     * @param encodingId Id of the encoding (required)
     * @param startLiveEncodingRequest Live Encoding startup options (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse start(String encodingId, StartLiveEncodingRequest startLiveEncodingRequest) throws BitmovinException {
        try {
            return this.apiClient.start(encodingId, startLiveEncodingRequest).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * Stop Live Encoding
     * 
     * @param encodingId Id of the encoding (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse stop(String encodingId) throws BitmovinException {
        try {
            return this.apiClient.stop(encodingId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface LiveApiClient { 
        @RequestLine("GET /encoding/encodings/{encoding_id}/live")
        ResponseEnvelope<LiveEncoding> get(@Param(value = "encoding_id") String encodingId) throws BitmovinException;
   
        @RequestLine("GET /encoding/encodings/{encoding_id}/live/start")
        ResponseEnvelope<StartLiveEncodingRequest> getStartRequest(@Param(value = "encoding_id") String encodingId) throws BitmovinException;
   
        @RequestLine("POST /encoding/encodings/{encoding_id}/live/restart")
        ResponseEnvelope<BitmovinResponse> restart(@Param(value = "encoding_id") String encodingId) throws BitmovinException;
   
        @RequestLine("POST /encoding/encodings/{encoding_id}/live/start")
        ResponseEnvelope<BitmovinResponse> start(@Param(value = "encoding_id") String encodingId, StartLiveEncodingRequest startLiveEncodingRequest) throws BitmovinException;
   
        @RequestLine("POST /encoding/encodings/{encoding_id}/live/stop")
        ResponseEnvelope<BitmovinResponse> stop(@Param(value = "encoding_id") String encodingId) throws BitmovinException;
    }
}
