package com.bitmovin.api.sdk.encoding.encodings.live.scheduledContentInsertion;

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

public class ScheduledContentInsertionApi {

    private final ScheduledContentInsertionApiClient apiClient;

    public ScheduledContentInsertionApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(ScheduledContentInsertionApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of ScheduledContentInsertionApi
     */
    public static BitmovinApiBuilder<ScheduledContentInsertionApi> builder() {
        return new BitmovinApiBuilder<>(ScheduledContentInsertionApi.class);
    }
    
    /**
     * Schedule A Content Insertion For a Live Encoding
     * 
     * @param encodingId Id of the encoding. (required)
     * @param scheduledContentInsertion The scheduled content insertions to be created (required)
     * @return ScheduledContentInsertion
     * @throws BitmovinException if fails to make API call
     */
    public ScheduledContentInsertion create(String encodingId, ScheduledContentInsertion scheduledContentInsertion) throws BitmovinException {
        return this.apiClient.create(encodingId, scheduledContentInsertion).getData().getResult();
    }
    
    /**
     * Deschedule A Content Insertion
     * 
     * @param encodingId Id of the encoding. (required)
     * @param contentInsertionId Id of the scheduled content insertion (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse delete(String encodingId, String contentInsertionId) throws BitmovinException {
        return this.apiClient.delete(encodingId, contentInsertionId).getData().getResult();
    }
    
    /**
     * Delete All Scheduled Content Insertions For A Live Encoding
     * 
     * @param encodingId Id of the encoding (required)
     * @throws BitmovinException if fails to make API call
     */
    public void deleteByEncodingId(String encodingId) throws BitmovinException {
        this.apiClient.deleteByEncodingId(encodingId);
    }
    
    /**
     * List All Scheduled Content Insertions For A Live Encoding
     * 
     * @param encodingId Id of the encoding. (required)
     * @return List&lt;ScheduledContentInsertion&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<ScheduledContentInsertion> list(String encodingId) throws BitmovinException {
        return this.apiClient.list(encodingId, new HashMap<String, Object>()).getData().getResult();
    }
    /**
     * List All Scheduled Content Insertions For A Live Encoding
     * 
     * @param encodingId Id of the encoding. (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;ScheduledContentInsertion&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<ScheduledContentInsertion> list(String encodingId, ScheduledContentInsertionListQueryParams queryParams) throws BitmovinException {
        return this.apiClient.list(encodingId, queryParams).getData().getResult();
    }
    
    interface ScheduledContentInsertionApiClient {
    
        @RequestLine("POST /encoding/encodings/{encoding_id}/live/scheduled-content-insertion")
        ResponseEnvelope<ScheduledContentInsertion> create(@Param(value = "encoding_id") String encodingId, ScheduledContentInsertion scheduledContentInsertion) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/encodings/{encoding_id}/live/scheduled-content-insertion/{content_insertion_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "encoding_id") String encodingId, @Param(value = "content_insertion_id") String contentInsertionId) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/encodings/{encoding_id}/live/scheduled-content-insertion")
        void deleteByEncodingId(@Param(value = "encoding_id") String encodingId) throws BitmovinException;
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/live/scheduled-content-insertion")
        ResponseEnvelope<PaginationResponse<ScheduledContentInsertion>> list(@Param(value = "encoding_id") String encodingId, @QueryMap Map<String, Object> queryParams) throws BitmovinException;
    }
}
