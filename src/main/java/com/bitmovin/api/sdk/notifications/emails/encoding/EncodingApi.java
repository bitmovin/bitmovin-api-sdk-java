package com.bitmovin.api.sdk.notifications.emails.encoding;

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
import com.bitmovin.api.sdk.notifications.emails.encoding.encodings.EncodingsApi;

public class EncodingApi {
    public final EncodingsApi encodings;

    private final EncodingApiClient apiClient;

    public EncodingApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(EncodingApiClient.class);

        this.encodings = new EncodingsApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of EncodingApi
     */
    public static BitmovinApiBuilder<EncodingApi> builder() {
        return new BitmovinApiBuilder<>(EncodingApi.class);
    }
    /**
     * List Email Notifications (All Encodings)
     * 
     * @return List&lt;EmailNotification&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<EmailNotification> list() throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * List Email Notifications (All Encodings)
     * 
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;EmailNotification&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<EmailNotification> list(EmailNotificationListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface EncodingApiClient { 
        @RequestLine("GET /notifications/emails/encoding")
        ResponseEnvelope<PaginationResponse<EmailNotification>> list(@QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    }
}
