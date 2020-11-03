package com.bitmovin.api.sdk.notifications.webhooks.encoding.encodings.liveInputStreamChanged;

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

public class LiveInputStreamChangedApi {

    private final LiveInputStreamChangedApiClient apiClient;

    public LiveInputStreamChangedApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(LiveInputStreamChangedApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of LiveInputStreamChangedApi
     */
    public static BitmovinApiBuilder<LiveInputStreamChangedApi> builder() {
        return new BitmovinApiBuilder<>(LiveInputStreamChangedApi.class);
    }
    
    /**
     * Add Live Input Stream Changed Webhook Notification (All Encodings)
     * 
     * @param webhookNotificationWithStreamConditionsRequest The webhook notifications object (required)
     * @return WebhookNotificationWithStreamConditions
     * @throws BitmovinException if fails to make API call
     */
    public WebhookNotificationWithStreamConditions create(WebhookNotificationWithStreamConditionsRequest webhookNotificationWithStreamConditionsRequest) throws BitmovinException {
        try {
            return this.apiClient.create(webhookNotificationWithStreamConditionsRequest).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * Add Live Input Stream Changed Webhook Notification (Specific Encoding)
     * 
     * @param encodingId Id of the encoding resource (required)
     * @param webhookNotificationWithStreamConditionsRequest The webhook notifications object (required)
     * @return WebhookNotificationWithStreamConditions
     * @throws BitmovinException if fails to make API call
     */
    public WebhookNotificationWithStreamConditions createByEncodingId(String encodingId, WebhookNotificationWithStreamConditionsRequest webhookNotificationWithStreamConditionsRequest) throws BitmovinException {
        try {
            return this.apiClient.createByEncodingId(encodingId, webhookNotificationWithStreamConditionsRequest).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * Replace Live Input Stream Changed Webhook Notification
     * 
     * @param notificationId Id of the webhook notification (required)
     * @param webhookNotificationWithStreamConditionsRequest The webhook notification with the updated values (required)
     * @return WebhookNotificationWithStreamConditions
     * @throws BitmovinException if fails to make API call
     */
    public WebhookNotificationWithStreamConditions update(String notificationId, WebhookNotificationWithStreamConditionsRequest webhookNotificationWithStreamConditionsRequest) throws BitmovinException {
        try {
            return this.apiClient.update(notificationId, webhookNotificationWithStreamConditionsRequest).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    interface LiveInputStreamChangedApiClient {
    
        @RequestLine("POST /notifications/webhooks/encoding/encodings/live-input-stream-changed")
        ResponseEnvelope<WebhookNotificationWithStreamConditions> create(WebhookNotificationWithStreamConditionsRequest webhookNotificationWithStreamConditionsRequest) throws BitmovinException;
    
        @RequestLine("POST /notifications/webhooks/encoding/encodings/{encoding_id}/live-input-stream-changed")
        ResponseEnvelope<WebhookNotificationWithStreamConditions> createByEncodingId(@Param(value = "encoding_id") String encodingId, WebhookNotificationWithStreamConditionsRequest webhookNotificationWithStreamConditionsRequest) throws BitmovinException;
    
        @RequestLine("PUT /notifications/webhooks/encoding/encodings/live-input-stream-changed/{notification_id}")
        ResponseEnvelope<WebhookNotificationWithStreamConditions> update(@Param(value = "notification_id") String notificationId, WebhookNotificationWithStreamConditionsRequest webhookNotificationWithStreamConditionsRequest) throws BitmovinException;
    }
}
