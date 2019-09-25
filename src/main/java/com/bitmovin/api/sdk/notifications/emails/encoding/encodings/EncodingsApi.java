package com.bitmovin.api.sdk.notifications.emails.encoding.encodings;

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
import com.bitmovin.api.sdk.notifications.emails.encoding.encodings.liveInputStreamChanged.LiveInputStreamChangedApi;
import com.bitmovin.api.sdk.notifications.emails.encoding.encodings.error.ErrorApi;

public class EncodingsApi {
    public final LiveInputStreamChangedApi liveInputStreamChanged;
    public final ErrorApi error;

    private final EncodingsApiClient apiClient;

    public EncodingsApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(EncodingsApiClient.class);

        this.liveInputStreamChanged = new LiveInputStreamChangedApi(clientFactory);
        this.error = new ErrorApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of EncodingsApi
     */
    public static BitmovinApiBuilder<EncodingsApi> builder() {
        return new BitmovinApiBuilder<>(EncodingsApi.class);
    }
    
    /**
     * List Email Notifications (Specific Encoding)
     * 
     * @param encodingId Id of the encoding resource (required)
     * @return List&lt;EmailNotificationWithStreamConditions&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<EmailNotificationWithStreamConditions> list(String encodingId) throws BitmovinException {
        try {
            return this.apiClient.list(encodingId, new HashMap<String, Object>()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * List Email Notifications (Specific Encoding)
     * 
     * @param encodingId Id of the encoding resource (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;EmailNotificationWithStreamConditions&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<EmailNotificationWithStreamConditions> list(String encodingId, EmailNotificationWithStreamConditionsListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(encodingId, queryParams).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    interface EncodingsApiClient {
    
        @RequestLine("GET /notifications/emails/encoding/encodings/{encoding_id}")
        ResponseEnvelope<PaginationResponse<EmailNotificationWithStreamConditions>> list(@Param(value = "encoding_id") String encodingId, @QueryMap Map<String, Object> queryParams) throws BitmovinException;
    }
}
