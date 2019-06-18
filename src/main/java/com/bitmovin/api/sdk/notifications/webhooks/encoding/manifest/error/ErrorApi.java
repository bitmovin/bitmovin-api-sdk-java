package com.bitmovin.api.sdk.notifications.webhooks.encoding.manifest.error;

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

public class ErrorApi {

    private final ErrorApiClient apiClient;

    public ErrorApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(ErrorApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of ErrorApi
     */
    public static BitmovinApiBuilder<ErrorApi> builder() {
        return new BitmovinApiBuilder<>(ErrorApi.class);
    }
    
    /**
     * Add Manifest Error Webhook (All Manifests)
     * 
     * @param webhook Add a new webhook notification if a manifest creation failed with an error (required)
     * @return List&lt;Webhook&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<Webhook> create(Webhook webhook) throws BitmovinException {
        return this.apiClient.create(webhook).getData().getResult();
    }
    
    /**
     * Add Manifest Error Webhook Notification (Specific Manifest)
     * 
     * @param manifestId Id of the manifest resource (required)
     * @param webhook The webhook notifications object (required)
     * @return Webhook
     * @throws BitmovinException if fails to make API call
     */
    public Webhook createByManifestId(String manifestId, Webhook webhook) throws BitmovinException {
        return this.apiClient.createByManifestId(manifestId, webhook).getData().getResult();
    }
    
    /**
     * Replace Manifest Error Webhook Notification
     * 
     * @param notificationId Id of the webhook notification (required)
     * @param webhook The webhook notification with the updated values (required)
     * @return Webhook
     * @throws BitmovinException if fails to make API call
     */
    public Webhook update(String notificationId, Webhook webhook) throws BitmovinException {
        return this.apiClient.update(notificationId, webhook).getData().getResult();
    }
    
    interface ErrorApiClient {
    
        @RequestLine("POST /notifications/webhooks/encoding/manifest/error")
        ResponseEnvelope<PaginationResponse<Webhook>> create(Webhook webhook) throws BitmovinException;
    
        @RequestLine("POST /notifications/webhooks/encoding/manifest/{manifest_id}/error")
        ResponseEnvelope<Webhook> createByManifestId(@Param(value = "manifest_id") String manifestId, Webhook webhook) throws BitmovinException;
    
        @RequestLine("PUT /notifications/webhooks/encoding/manifest/error/{notification_id}")
        ResponseEnvelope<Webhook> update(@Param(value = "notification_id") String notificationId, Webhook webhook) throws BitmovinException;
    }
}
