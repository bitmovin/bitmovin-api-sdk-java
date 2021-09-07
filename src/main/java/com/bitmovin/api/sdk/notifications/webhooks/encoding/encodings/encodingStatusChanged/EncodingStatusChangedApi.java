package com.bitmovin.api.sdk.notifications.webhooks.encoding.encodings.encodingStatusChanged;

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

public class EncodingStatusChangedApi {

    private final EncodingStatusChangedApiClient apiClient;

    public EncodingStatusChangedApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(EncodingStatusChangedApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of EncodingStatusChangedApi
     */
    public static BitmovinApiBuilder<EncodingStatusChangedApi> builder() {
        return new BitmovinApiBuilder<>(EncodingStatusChangedApi.class);
    }

    /**
     * Add Encoding Changed Webhook Notification (All Encodings)
     * 
     * @param webhookNotificationWithStreamConditionsRequest The webhook notifications object. For conditions, following attributes are possible: &#39;type&#39;: &#39;Input file download&#39;, &#39;Input file analysis&#39;, &#39;Per-Title analysis&#39;, &#39;Encoding&#39;, &#39;Progressive Muxing&#39; &#39;progress&#39;: number in range of 0-100 &#39;status&#39;: &#39;RUNNING&#39;, &#39;FINISHED&#39;, &#39;ERROR&#39; Examples: To only get notified about the encoding process, create a Condition object and set attribute&#x3D;&#39;type&#39;, value&#x3D;&#39;Encoding&#39;, operator&#x3D;EQUAL To only get notified if a workflow step is finished, create a Condition object and set attribute&#x3D;&#39;status&#39;, value&#x3D;&#39;FINISHED&#39;, operator&#x3D;EQUAL To only get notified if a workflow step is over 50%,  create a Condition object and set attribute&#x3D;&#39;progress&#39;, value&#x3D;&#39;50&#39;, operator&#x3D;GREATER_THAN (required)
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
     * Add Encoding Changed Webhook Notification (Specific Encoding)
     * 
     * @param encodingId Id of the encoding resource (required)
     * @param webhookNotificationWithStreamConditionsRequest The webhook notifications object. For conditions, following attributes are possible: &#39;type&#39;: &#39;Input file download&#39;, &#39;Input file analysis&#39;, &#39;Per-Title analysis&#39;, &#39;Encoding&#39;, &#39;Progressive Muxing&#39; &#39;progress&#39;: number in range of 0-100 &#39;status&#39;: &#39;RUNNING&#39;, &#39;FINISHED&#39;, &#39;ERROR&#39; Examples: To only get notified about the encoding process, create a Condition object and set attribute&#x3D;&#39;type&#39;, value&#x3D;&#39;Encoding&#39;, operator&#x3D;EQUAL To only get notified if a workflow step is finished, create a Condition object and set attribute&#x3D;&#39;status&#39;, value&#x3D;&#39;FINISHED&#39;, operator&#x3D;EQUAL To only get notified if a workflow step is over 50%,  create a Condition object and set attribute&#x3D;&#39;progress&#39;, value&#x3D;&#39;50&#39;, operator&#x3D;GREATER_THAN  (required)
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
     * Delete Encoding Status Changed Webhook
     * 
     * @param notificationId Id of the webhook (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse deleteByWebhookId(String notificationId) throws BitmovinException {
        try {
            return this.apiClient.deleteByWebhookId(notificationId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * Replace Encoding Status Changed Webhook Notification
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

    interface EncodingStatusChangedApiClient {

        @RequestLine("POST /notifications/webhooks/encoding/encodings/encoding-status-changed")
        ResponseEnvelope<WebhookNotificationWithStreamConditions> create(WebhookNotificationWithStreamConditionsRequest webhookNotificationWithStreamConditionsRequest) throws BitmovinException;
    
        @RequestLine("POST /notifications/webhooks/encoding/encodings/{encoding_id}/encoding-status-changed")
        ResponseEnvelope<WebhookNotificationWithStreamConditions> createByEncodingId(@Param(value = "encoding_id") String encodingId, WebhookNotificationWithStreamConditionsRequest webhookNotificationWithStreamConditionsRequest) throws BitmovinException;
    
        @RequestLine("DELETE /notifications/webhooks/encoding/encodings/encoding-status-changed/{notification_id}")
        ResponseEnvelope<BitmovinResponse> deleteByWebhookId(@Param(value = "notification_id") String notificationId) throws BitmovinException;
    
        @RequestLine("PUT /notifications/webhooks/encoding/encodings/encoding-status-changed/{notification_id}")
        ResponseEnvelope<WebhookNotificationWithStreamConditions> update(@Param(value = "notification_id") String notificationId, WebhookNotificationWithStreamConditionsRequest webhookNotificationWithStreamConditionsRequest) throws BitmovinException;
    }
}
