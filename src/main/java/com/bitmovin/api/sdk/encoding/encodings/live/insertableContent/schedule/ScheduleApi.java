package com.bitmovin.api.sdk.encoding.encodings.live.insertableContent.schedule;

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

public class ScheduleApi {

    private final ScheduleApiClient apiClient;

    public ScheduleApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(ScheduleApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of ScheduleApi
     */
    public static BitmovinApiBuilder<ScheduleApi> builder() {
        return new BitmovinApiBuilder<>(ScheduleApi.class);
    }

    /**
     * Schedule Insertable Content
     * Schedule Insertable Content for a live encoding
     * @param encodingId Id of the encoding. (required)
     * @param contentId Id of the insertable content. (required)
     * @param scheduledInsertableContent The scheduled insertable content to be created (required)
     * @return ScheduledInsertableContent
     * @throws BitmovinException if fails to make API call
     */
    public ScheduledInsertableContent create(String encodingId, String contentId, ScheduledInsertableContent scheduledInsertableContent) throws BitmovinException {
        try {
            return this.apiClient.create(encodingId, contentId, scheduledInsertableContent).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * Deschedule Insertable Content
     * 
     * @param encodingId Id of the encoding. (required)
     * @param contentId Id of the insertable content. (required)
     * @param scheduledContentId Id of the scheduled insertable content (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse delete(String encodingId, String contentId, String scheduledContentId) throws BitmovinException {
        try {
            return this.apiClient.delete(encodingId, contentId, scheduledContentId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface ScheduleApiClient {

        @RequestLine("POST /encoding/encodings/{encoding_id}/live/insertable-content/{content_id}/schedule")
        ResponseEnvelope<ScheduledInsertableContent> create(@Param(value = "encoding_id") String encodingId, @Param(value = "content_id") String contentId, ScheduledInsertableContent scheduledInsertableContent) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/encodings/{encoding_id}/live/insertable-content/{content_id}/schedule/{scheduled_content_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "encoding_id") String encodingId, @Param(value = "content_id") String contentId, @Param(value = "scheduled_content_id") String scheduledContentId) throws BitmovinException;
    }
}
