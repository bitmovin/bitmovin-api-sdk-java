package com.bitmovin.api.sdk.encoding.encodings;

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
import com.bitmovin.api.sdk.encoding.encodings.live.LiveApi;
import com.bitmovin.api.sdk.encoding.encodings.machineLearning.MachineLearningApi;
import com.bitmovin.api.sdk.encoding.encodings.customdata.CustomdataApi;
import com.bitmovin.api.sdk.encoding.encodings.streams.StreamsApi;
import com.bitmovin.api.sdk.encoding.encodings.inputStreams.InputStreamsApi;
import com.bitmovin.api.sdk.encoding.encodings.muxings.MuxingsApi;
import com.bitmovin.api.sdk.encoding.encodings.transferRetries.TransferRetriesApi;
import com.bitmovin.api.sdk.encoding.encodings.captions.CaptionsApi;
import com.bitmovin.api.sdk.encoding.encodings.sidecars.SidecarsApi;
import com.bitmovin.api.sdk.encoding.encodings.keyframes.KeyframesApi;

public class EncodingsApi {
    public final LiveApi live;
    public final MachineLearningApi machineLearning;
    public final CustomdataApi customdata;
    public final StreamsApi streams;
    public final InputStreamsApi inputStreams;
    public final MuxingsApi muxings;
    public final TransferRetriesApi transferRetries;
    public final CaptionsApi captions;
    public final SidecarsApi sidecars;
    public final KeyframesApi keyframes;

    private final EncodingsApiClient apiClient;

    public EncodingsApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(EncodingsApiClient.class);

        this.live = new LiveApi(clientFactory);
        this.machineLearning = new MachineLearningApi(clientFactory);
        this.customdata = new CustomdataApi(clientFactory);
        this.streams = new StreamsApi(clientFactory);
        this.inputStreams = new InputStreamsApi(clientFactory);
        this.muxings = new MuxingsApi(clientFactory);
        this.transferRetries = new TransferRetriesApi(clientFactory);
        this.captions = new CaptionsApi(clientFactory);
        this.sidecars = new SidecarsApi(clientFactory);
        this.keyframes = new KeyframesApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of EncodingsApi
     */
    public static BitmovinApiBuilder<EncodingsApi> builder() {
        return new BitmovinApiBuilder<>(EncodingsApi.class);
    }
    
    /**
     * Create Encoding
     * 
     * @param encoding The Encoding to be created (required)
     * @return Encoding
     * @throws BitmovinException if fails to make API call
     */
    public Encoding create(Encoding encoding) throws BitmovinException {
        try {
            return this.apiClient.create(encoding).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * Delete Encoding
     * 
     * @param encodingId Id of the encoding. (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse delete(String encodingId) throws BitmovinException {
        try {
            return this.apiClient.delete(encodingId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * Encoding Details
     * 
     * @param encodingId Id of the encoding. (required)
     * @return Encoding
     * @throws BitmovinException if fails to make API call
     */
    public Encoding get(String encodingId) throws BitmovinException {
        try {
            return this.apiClient.get(encodingId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * Encoding Start Details
     * 
     * @param encodingId Id of the encoding (required)
     * @return StartEncodingRequest
     * @throws BitmovinException if fails to make API call
     */
    public StartEncodingRequest getStartRequest(String encodingId) throws BitmovinException {
        try {
            return this.apiClient.getStartRequest(encodingId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * List all Encodings
     * 
     * @return List&lt;Encoding&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<Encoding> list() throws BitmovinException {
        try {
            return this.apiClient.list(new HashMap<String, Object>()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * List all Encodings
     * 
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;Encoding&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<Encoding> list(EncodingListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(queryParams).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * Reprioritize Encoding
     * 
     * @param encodingId Id of the encoding. (required)
     * @param reprioritizeEncodingRequest Reprioritization options (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse reprioritize(String encodingId, ReprioritizeEncodingRequest reprioritizeEncodingRequest) throws BitmovinException {
        try {
            return this.apiClient.reprioritize(encodingId, reprioritizeEncodingRequest).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * Reschedule Encoding
     * 
     * @param encodingId Id of the encoding. (required)
     * @param rescheduleEncodingRequest Rescheduling options (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse reschedule(String encodingId, RescheduleEncodingRequest rescheduleEncodingRequest) throws BitmovinException {
        try {
            return this.apiClient.reschedule(encodingId, rescheduleEncodingRequest).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * Start Encoding
     * 
     * @param encodingId Id of the encoding (required)
     * @param startEncodingRequest Encoding Startup Options (optional)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse start(String encodingId, StartEncodingRequest startEncodingRequest) throws BitmovinException {
        try {
            return this.apiClient.start(encodingId, startEncodingRequest).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * Encoding Status
     * 
     * @param encodingId Id of the encoding (required)
     * @return Task
     * @throws BitmovinException if fails to make API call
     */
    public Task status(String encodingId) throws BitmovinException {
        try {
            return this.apiClient.status(encodingId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * Stop Encoding
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
    
    interface EncodingsApiClient {
    
        @RequestLine("POST /encoding/encodings")
        ResponseEnvelope<Encoding> create(Encoding encoding) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/encodings/{encoding_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "encoding_id") String encodingId) throws BitmovinException;
    
        @RequestLine("GET /encoding/encodings/{encoding_id}")
        ResponseEnvelope<Encoding> get(@Param(value = "encoding_id") String encodingId) throws BitmovinException;
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/start")
        ResponseEnvelope<StartEncodingRequest> getStartRequest(@Param(value = "encoding_id") String encodingId) throws BitmovinException;
    
        @RequestLine("GET /encoding/encodings")
        ResponseEnvelope<PaginationResponse<Encoding>> list(@QueryMap Map<String, Object> queryParams) throws BitmovinException;
    
        @RequestLine("POST /encoding/encodings/{encoding_id}/reprioritize")
        ResponseEnvelope<BitmovinResponse> reprioritize(@Param(value = "encoding_id") String encodingId, ReprioritizeEncodingRequest reprioritizeEncodingRequest) throws BitmovinException;
    
        @RequestLine("POST /encoding/encodings/{encoding_id}/reschedule")
        ResponseEnvelope<BitmovinResponse> reschedule(@Param(value = "encoding_id") String encodingId, RescheduleEncodingRequest rescheduleEncodingRequest) throws BitmovinException;
    
        @RequestLine("POST /encoding/encodings/{encoding_id}/start")
        ResponseEnvelope<BitmovinResponse> start(@Param(value = "encoding_id") String encodingId, StartEncodingRequest startEncodingRequest) throws BitmovinException;
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/status")
        ResponseEnvelope<Task> status(@Param(value = "encoding_id") String encodingId) throws BitmovinException;
    
        @Headers("Content-Type: text/plain")
        @Body(" ")
        @RequestLine("POST /encoding/encodings/{encoding_id}/stop")
        ResponseEnvelope<BitmovinResponse> stop(@Param(value = "encoding_id") String encodingId) throws BitmovinException;
    }
}
