package com.bitmovin.api.sdk.encoding.encodings.scte35Triggers;

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

public class Scte35TriggersApi {

    private final Scte35TriggersApiClient apiClient;

    public Scte35TriggersApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(Scte35TriggersApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of Scte35TriggersApi
     */
    public static BitmovinApiBuilder<Scte35TriggersApi> builder() {
        return new BitmovinApiBuilder<>(Scte35TriggersApi.class);
    }
    /**
     * Create SCTE 35 trigger
     * This endpoint supports VOD encodings only. Requests made with a live encoding ID will fail. 
     * @param encodingId Id of the encoding. (required)
     * @param scte35Trigger The SCTE 35 trigger to be created (required)
     * @return Scte35Trigger
     * @throws BitmovinException if fails to make API call
     */
    public Scte35Trigger create(String encodingId, Scte35Trigger scte35Trigger) throws BitmovinException {
        try {
            return this.apiClient.create(encodingId, scte35Trigger).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * Delete SCTE 35 trigger
     * This endpoint supports VOD encodings only. Requests made with a live encoding ID will fail. 
     * @param encodingId Id of the encoding (required)
     * @param scte35triggerId Id of the SCTE 35 trigger (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse delete(String encodingId, String scte35triggerId) throws BitmovinException {
        try {
            return this.apiClient.delete(encodingId, scte35triggerId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * SCTE 35 trigger Details
     * This endpoint supports VOD encodings only. Requests made with a live encoding ID will fail. 
     * @param encodingId Id of the encoding (required)
     * @param scte35triggerId Id of the SCTE 35 trigger (required)
     * @return Scte35Trigger
     * @throws BitmovinException if fails to make API call
     */
    public Scte35Trigger get(String encodingId, String scte35triggerId) throws BitmovinException {
        try {
            return this.apiClient.get(encodingId, scte35triggerId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * List all SCTE 35 triggers for an encoding
     * This endpoint supports VOD encodings only. Requests made with a live encoding ID will fail. 
     * @param encodingId Id of the encoding. (required)
     * @return List&lt;Scte35Trigger&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<Scte35Trigger> list(String encodingId) throws BitmovinException {
        try {
            return this.apiClient.list(encodingId, new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * List all SCTE 35 triggers for an encoding
     * This endpoint supports VOD encodings only. Requests made with a live encoding ID will fail. 
     * @param encodingId Id of the encoding. (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;Scte35Trigger&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<Scte35Trigger> list(String encodingId, Scte35TriggerListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(encodingId, new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface Scte35TriggersApiClient { 
        @RequestLine("POST /encoding/encodings/{encoding_id}/scte-35-triggers")
        ResponseEnvelope<Scte35Trigger> create(@Param(value = "encoding_id") String encodingId, Scte35Trigger scte35Trigger) throws BitmovinException;
   
        @RequestLine("DELETE /encoding/encodings/{encoding_id}/scte-35-triggers/{scte35trigger_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "encoding_id") String encodingId, @Param(value = "scte35trigger_id") String scte35triggerId) throws BitmovinException;
   
        @RequestLine("GET /encoding/encodings/{encoding_id}/scte-35-triggers/{scte35trigger_id}")
        ResponseEnvelope<Scte35Trigger> get(@Param(value = "encoding_id") String encodingId, @Param(value = "scte35trigger_id") String scte35triggerId) throws BitmovinException;
   
        @RequestLine("GET /encoding/encodings/{encoding_id}/scte-35-triggers")
        ResponseEnvelope<PaginationResponse<Scte35Trigger>> list(@Param(value = "encoding_id") String encodingId, @QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    }
}
