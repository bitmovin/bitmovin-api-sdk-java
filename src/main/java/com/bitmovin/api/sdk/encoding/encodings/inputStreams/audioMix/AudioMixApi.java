package com.bitmovin.api.sdk.encoding.encodings.inputStreams.audioMix;

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

public class AudioMixApi {

    private final AudioMixApiClient apiClient;

    public AudioMixApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(AudioMixApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of AudioMixApi
     */
    public static BitmovinApiBuilder<AudioMixApi> builder() {
        return new BitmovinApiBuilder<>(AudioMixApi.class);
    }
    
    /**
     * Add audio mix input stream
     * 
     * @param encodingId Id of the encoding. (required)
     * @param audioMixInputStream The audio mix input stream to be created (required)
     * @return AudioMixInputStream
     * @throws BitmovinException if fails to make API call
     */
    public AudioMixInputStream create(String encodingId, AudioMixInputStream audioMixInputStream) throws BitmovinException {
        try {
            return this.apiClient.create(encodingId, audioMixInputStream).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * Delete audio mix input stream
     * 
     * @param encodingId Id of the encoding. (required)
     * @param inputStreamId Id of the audio mix input stream. (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse delete(String encodingId, String inputStreamId) throws BitmovinException {
        try {
            return this.apiClient.delete(encodingId, inputStreamId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * Audio mix input stream details
     * 
     * @param encodingId Id of the encoding. (required)
     * @param inputStreamId Id of the audio mix input stream. (required)
     * @return AudioMixInputStream
     * @throws BitmovinException if fails to make API call
     */
    public AudioMixInputStream get(String encodingId, String inputStreamId) throws BitmovinException {
        try {
            return this.apiClient.get(encodingId, inputStreamId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * List audio mix input stream
     * 
     * @param encodingId Id of the encoding. (required)
     * @return List&lt;AudioMixInputStream&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<AudioMixInputStream> list(String encodingId) throws BitmovinException {
        try {
            return this.apiClient.list(encodingId, new HashMap<String, Object>()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * List audio mix input stream
     * 
     * @param encodingId Id of the encoding. (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;AudioMixInputStream&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<AudioMixInputStream> list(String encodingId, AudioMixInputStreamListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(encodingId, queryParams).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    interface AudioMixApiClient {
    
        @RequestLine("POST /encoding/encodings/{encoding_id}/input-streams/audio-mix")
        ResponseEnvelope<AudioMixInputStream> create(@Param(value = "encoding_id") String encodingId, AudioMixInputStream audioMixInputStream) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/encodings/{encoding_id}/input-streams/audio-mix/{input_stream_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "encoding_id") String encodingId, @Param(value = "input_stream_id") String inputStreamId) throws BitmovinException;
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/input-streams/audio-mix/{input_stream_id}")
        ResponseEnvelope<AudioMixInputStream> get(@Param(value = "encoding_id") String encodingId, @Param(value = "input_stream_id") String inputStreamId) throws BitmovinException;
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/input-streams/audio-mix")
        ResponseEnvelope<PaginationResponse<AudioMixInputStream>> list(@Param(value = "encoding_id") String encodingId, @QueryMap Map<String, Object> queryParams) throws BitmovinException;
    }
}
