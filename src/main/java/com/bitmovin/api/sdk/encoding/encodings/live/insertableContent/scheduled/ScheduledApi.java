package com.bitmovin.api.sdk.encoding.encodings.live.insertableContent.scheduled;

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

public class ScheduledApi {

    private final ScheduledApiClient apiClient;

    public ScheduledApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(ScheduledApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of ScheduledApi
     */
    public static BitmovinApiBuilder<ScheduledApi> builder() {
        return new BitmovinApiBuilder<>(ScheduledApi.class);
    }
    
    /**
     * List All Scheduled Insertable Content For A Live Encoding
     * 
     * @param encodingId Id of the encoding. (required)
     * @return List&lt;ScheduledInsertableContent&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<ScheduledInsertableContent> list(String encodingId) throws BitmovinException {
        try {
            return this.apiClient.list(encodingId, new HashMap<String, Object>()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * List All Scheduled Insertable Content For A Live Encoding
     * 
     * @param encodingId Id of the encoding. (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;ScheduledInsertableContent&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<ScheduledInsertableContent> list(String encodingId, ScheduledInsertableContentListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(encodingId, queryParams).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    interface ScheduledApiClient {
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/live/insertable-content/scheduled")
        ResponseEnvelope<PaginationResponse<ScheduledInsertableContent>> list(@Param(value = "encoding_id") String encodingId, @QueryMap Map<String, Object> queryParams) throws BitmovinException;
    }
}
