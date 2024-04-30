package com.bitmovin.api.sdk.encoding.live.streamKeys;

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
import com.bitmovin.api.sdk.encoding.live.streamKeys.actions.ActionsApi;

public class StreamKeysApi {
    public final ActionsApi actions;

    private final StreamKeysApiClient apiClient;

    public StreamKeysApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(StreamKeysApiClient.class);

        this.actions = new ActionsApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of StreamKeysApi
     */
    public static BitmovinApiBuilder<StreamKeysApi> builder() {
        return new BitmovinApiBuilder<>(StreamKeysApi.class);
    }

    /**
     * Create new stream key
     * 
     * @param streamKey The stream key to be created (required)
     * @return StreamKey
     * @throws BitmovinException if fails to make API call
     */
    public StreamKey create(StreamKey streamKey) throws BitmovinException {
        try {
            return this.apiClient.create(streamKey).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * Delete Stream Key
     * 
     * @param streamKeyId Id of the stream key (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse delete(String streamKeyId) throws BitmovinException {
        try {
            return this.apiClient.delete(streamKeyId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * Stream Key details
     * 
     * @param streamKeyId Id of the stream key (required)
     * @return StreamKey
     * @throws BitmovinException if fails to make API call
     */
    public StreamKey get(String streamKeyId) throws BitmovinException {
        try {
            return this.apiClient.get(streamKeyId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * List Stream Keys
     * 
     * @return List&lt;StreamKey&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<StreamKey> list() throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * List Stream Keys
     * 
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;StreamKey&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<StreamKey> list(StreamKeyListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface StreamKeysApiClient {

        @RequestLine("POST /encoding/live/stream-keys")
        ResponseEnvelope<StreamKey> create(StreamKey streamKey) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/live/stream-keys/{stream_key_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "stream_key_id") String streamKeyId) throws BitmovinException;
    
        @RequestLine("GET /encoding/live/stream-keys/{stream_key_id}")
        ResponseEnvelope<StreamKey> get(@Param(value = "stream_key_id") String streamKeyId) throws BitmovinException;
    
        @RequestLine("GET /encoding/live/stream-keys")
        ResponseEnvelope<PaginationResponse<StreamKey>> list(@QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    }
}
