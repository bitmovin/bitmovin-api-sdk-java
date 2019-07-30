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
import com.bitmovin.api.sdk.common.BitmovinDateExpander;
import com.bitmovin.api.sdk.common.BitmovinApiBuilder;
import com.bitmovin.api.sdk.common.BitmovinApiClientFactory;
import com.bitmovin.api.sdk.encoding.encodings.live.insertableContent.InsertableContentApi;
import com.bitmovin.api.sdk.encoding.encodings.live.scheduledContentInsertion.ScheduledContentInsertionApi;
import com.bitmovin.api.sdk.encoding.encodings.live.stopInsertedContent.StopInsertedContentApi;

public class LiveApi {
    public final InsertableContentApi insertableContent;
    public final ScheduledContentInsertionApi scheduledContentInsertion;
    public final StopInsertedContentApi stopInsertedContent;

    private final LiveApiClient apiClient;

    public LiveApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(LiveApiClient.class);

        this.insertableContent = new InsertableContentApi(clientFactory);
        this.scheduledContentInsertion = new ScheduledContentInsertionApi(clientFactory);
        this.stopInsertedContent = new StopInsertedContentApi(clientFactory);
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
        return this.apiClient.get(encodingId).getData().getResult();
    }
    
    /**
     * Live Encoding Start Details
     * 
     * @param encodingId Id of the encoding (required)
     * @return StartLiveEncodingRequest
     * @throws BitmovinException if fails to make API call
     */
    public StartLiveEncodingRequest getStartRequest(String encodingId) throws BitmovinException {
        return this.apiClient.getStartRequest(encodingId).getData().getResult();
    }
    
    /**
     * Re-Start Live Encoding
     * 
     * @param encodingId Id of the encoding (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse restart(String encodingId) throws BitmovinException {
        return this.apiClient.restart(encodingId).getData().getResult();
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
        return this.apiClient.start(encodingId, startLiveEncodingRequest).getData().getResult();
    }
    
    /**
     * Stop Live Encoding
     * 
     * @param encodingId Id of the encoding (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse stop(String encodingId) throws BitmovinException {
        return this.apiClient.stop(encodingId).getData().getResult();
    }
    
    interface LiveApiClient {
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/live")
        ResponseEnvelope<LiveEncoding> get(@Param(value = "encoding_id") String encodingId) throws BitmovinException;
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/live/start")
        ResponseEnvelope<StartLiveEncodingRequest> getStartRequest(@Param(value = "encoding_id") String encodingId) throws BitmovinException;
    
        @Headers("Content-Type: text/plain")
        @Body(" ")
        @RequestLine("POST /encoding/encodings/{encoding_id}/live/restart")
        ResponseEnvelope<BitmovinResponse> restart(@Param(value = "encoding_id") String encodingId) throws BitmovinException;
    
        @RequestLine("POST /encoding/encodings/{encoding_id}/live/start")
        ResponseEnvelope<BitmovinResponse> start(@Param(value = "encoding_id") String encodingId, StartLiveEncodingRequest startLiveEncodingRequest) throws BitmovinException;
    
        @Headers("Content-Type: text/plain")
        @Body(" ")
        @RequestLine("POST /encoding/encodings/{encoding_id}/live/stop")
        ResponseEnvelope<BitmovinResponse> stop(@Param(value = "encoding_id") String encodingId) throws BitmovinException;
    }
}
