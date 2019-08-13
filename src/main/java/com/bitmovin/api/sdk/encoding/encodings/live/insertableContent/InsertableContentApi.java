package com.bitmovin.api.sdk.encoding.encodings.live.insertableContent;

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
import com.bitmovin.api.sdk.encoding.encodings.live.insertableContent.schedule.ScheduleApi;
import com.bitmovin.api.sdk.encoding.encodings.live.insertableContent.scheduled.ScheduledApi;
import com.bitmovin.api.sdk.encoding.encodings.live.insertableContent.stop.StopApi;

public class InsertableContentApi {
    public final ScheduleApi schedule;
    public final ScheduledApi scheduled;
    public final StopApi stop;

    private final InsertableContentApiClient apiClient;

    public InsertableContentApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(InsertableContentApiClient.class);

        this.schedule = new ScheduleApi(clientFactory);
        this.scheduled = new ScheduledApi(clientFactory);
        this.stop = new StopApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of InsertableContentApi
     */
    public static BitmovinApiBuilder<InsertableContentApi> builder() {
        return new BitmovinApiBuilder<>(InsertableContentApi.class);
    }
    
    /**
     * Make Insertable Content Available For A Live Encoding
     * 
     * @param encodingId Id of the encoding. (required)
     * @param insertableContent The insertable content to be created (required)
     * @return InsertableContent
     * @throws BitmovinException if fails to make API call
     */
    public InsertableContent create(String encodingId, InsertableContent insertableContent) throws BitmovinException {
        return this.apiClient.create(encodingId, insertableContent).getData().getResult();
    }
    
    /**
     * List All Inseratble Content Available For A Live Encoding
     * 
     * @param encodingId Id of the encoding. (required)
     * @return List&lt;InsertableContent&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<InsertableContent> list(String encodingId) throws BitmovinException {
        return this.apiClient.list(encodingId, new HashMap<String, Object>()).getData().getResult();
    }
    /**
     * List All Inseratble Content Available For A Live Encoding
     * 
     * @param encodingId Id of the encoding. (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;InsertableContent&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<InsertableContent> list(String encodingId, InsertableContentListQueryParams queryParams) throws BitmovinException {
        return this.apiClient.list(encodingId, queryParams).getData().getResult();
    }
    
    interface InsertableContentApiClient {
    
        @RequestLine("POST /encoding/encodings/{encoding_id}/live/insertable-content")
        ResponseEnvelope<InsertableContent> create(@Param(value = "encoding_id") String encodingId, InsertableContent insertableContent) throws BitmovinException;
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/live/insertable-content")
        ResponseEnvelope<PaginationResponse<InsertableContent>> list(@Param(value = "encoding_id") String encodingId, @QueryMap Map<String, Object> queryParams) throws BitmovinException;
    }
}
