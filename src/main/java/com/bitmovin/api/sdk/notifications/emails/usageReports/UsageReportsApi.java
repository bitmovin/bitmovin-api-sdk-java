package com.bitmovin.api.sdk.notifications.emails.usageReports;

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

public class UsageReportsApi {

    private final UsageReportsApiClient apiClient;

    public UsageReportsApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(UsageReportsApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of UsageReportsApi
     */
    public static BitmovinApiBuilder<UsageReportsApi> builder() {
        return new BitmovinApiBuilder<>(UsageReportsApi.class);
    }

    /**
     * List Email Notifications (All Usage Reports)
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
     * List Email Notifications (All Usage Reports)
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

    interface UsageReportsApiClient {

        @RequestLine("GET /notifications/emails/usage-reports")
        ResponseEnvelope<PaginationResponse<EmailNotification>> list(@QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    }
}
