package com.bitmovin.api.sdk.notifications.webhooks.encoding.manifest;

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
import com.bitmovin.api.sdk.notifications.webhooks.encoding.manifest.error.ErrorApi;
import com.bitmovin.api.sdk.notifications.webhooks.encoding.manifest.finished.FinishedApi;

public class ManifestApi {
    public final ErrorApi error;
    public final FinishedApi finished;

    private final ManifestApiClient apiClient;

    public ManifestApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(ManifestApiClient.class);

        this.error = new ErrorApi(clientFactory);
        this.finished = new FinishedApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of ManifestApi
     */
    public static BitmovinApiBuilder<ManifestApi> builder() {
        return new BitmovinApiBuilder<>(ManifestApi.class);
    }
    
    /**
     * List Webhook Notifications (Specific Manifest)
     * 
     * @param manifestId Id of the manifest resource (required)
     * @return List&lt;Notification&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<Notification> list(String manifestId) throws BitmovinException {
        return this.apiClient.list(manifestId, new HashMap<String, Object>()).getData().getResult();
    }
    /**
     * List Webhook Notifications (Specific Manifest)
     * 
     * @param manifestId Id of the manifest resource (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;Notification&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<Notification> list(String manifestId, NotificationListQueryParams queryParams) throws BitmovinException {
        return this.apiClient.list(manifestId, queryParams).getData().getResult();
    }
    
    interface ManifestApiClient {
    
        @RequestLine("GET /notifications/webhooks/encoding/manifest/{manifest_id}")
        ResponseEnvelope<PaginationResponse<Notification>> list(@Param(value = "manifest_id") String manifestId, @QueryMap Map<String, Object> queryParams) throws BitmovinException;
    }
}
