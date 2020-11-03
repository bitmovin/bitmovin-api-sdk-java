package com.bitmovin.api.sdk.notifications.emails;

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
import com.bitmovin.api.sdk.notifications.emails.usageReports.UsageReportsApi;
import com.bitmovin.api.sdk.notifications.emails.encoding.EncodingApi;

public class EmailsApi {
    public final UsageReportsApi usageReports;
    public final EncodingApi encoding;

    private final EmailsApiClient apiClient;

    public EmailsApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(EmailsApiClient.class);

        this.usageReports = new UsageReportsApi(clientFactory);
        this.encoding = new EncodingApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of EmailsApi
     */
    public static BitmovinApiBuilder<EmailsApi> builder() {
        return new BitmovinApiBuilder<>(EmailsApi.class);
    }
    
    /**
     * List Email Notifications
     * 
     * @return List&lt;Notification&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<Notification> list() throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * List Email Notifications
     * 
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;Notification&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<Notification> list(NotificationListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    interface EmailsApiClient {
    
        @RequestLine("GET /notifications/emails")
        ResponseEnvelope<PaginationResponse<Notification>> list(@QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    }
}
