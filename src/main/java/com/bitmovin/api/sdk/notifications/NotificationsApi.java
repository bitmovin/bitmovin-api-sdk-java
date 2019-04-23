package com.bitmovin.api.sdk.notifications;

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
import com.bitmovin.api.sdk.notifications.webhooks.WebhooksApi;
import com.bitmovin.api.sdk.notifications.states.StatesApi;
import com.bitmovin.api.sdk.notifications.emails.EmailsApi;

public class NotificationsApi {
    public final WebhooksApi webhooks;
    public final StatesApi states;
    public final EmailsApi emails;

    private final NotificationsApiClient apiClient;

    public NotificationsApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(NotificationsApiClient.class);

        this.webhooks = new WebhooksApi(clientFactory);
        this.states = new StatesApi(clientFactory);
        this.emails = new EmailsApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of NotificationsApi
     */
    public static BitmovinApiBuilder<NotificationsApi> builder() {
        return new BitmovinApiBuilder<>(NotificationsApi.class);
    }
    
    /**
     * Delete Notification
     * 
     * @param notificationId Id of the notification (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse delete(String notificationId) throws BitmovinException {
        return this.apiClient.delete(notificationId).getData().getResult();
    }
    
    /**
     * Get Notification
     * 
     * @param notificationId Id of the notification (required)
     * @return Notification
     * @throws BitmovinException if fails to make API call
     */
    public Notification get(String notificationId) throws BitmovinException {
        return this.apiClient.get(notificationId).getData().getResult();
    }
    
    /**
     * List Notifications
     * 
     * @return List&lt;Notification&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<Notification> list() throws BitmovinException {
        return this.apiClient.list(new HashMap<String, Object>()).getData().getResult();
    }
    /**
     * List Notifications
     * 
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;Notification&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<Notification> list(NotificationListQueryParams queryParams) throws BitmovinException {
        return this.apiClient.list(queryParams).getData().getResult();
    }
    
    /**
     * List Notification State History (All Resources)
     * 
     * @param notificationId Id of the notification (required)
     * @return List&lt;NotificationStateEntry&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<NotificationStateEntry> listByNotificationId(String notificationId) throws BitmovinException {
        return this.apiClient.listByNotificationId(notificationId, new HashMap<String, Object>()).getData().getResult();
    }
    /**
     * List Notification State History (All Resources)
     * 
     * @param notificationId Id of the notification (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;NotificationStateEntry&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<NotificationStateEntry> listByNotificationId(String notificationId, NotificationStateEntryListByNotificationIdQueryParams queryParams) throws BitmovinException {
        return this.apiClient.listByNotificationId(notificationId, queryParams).getData().getResult();
    }
    
    /**
     * Mute Notification
     * 
     * @param notificationId Id of the notification (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse mute(String notificationId) throws BitmovinException {
        return this.apiClient.mute(notificationId).getData().getResult();
    }
    
    /**
     * Unmute Notification
     * 
     * @param notificationId Id of the notification (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse unmute(String notificationId) throws BitmovinException {
        return this.apiClient.unmute(notificationId).getData().getResult();
    }
    
    interface NotificationsApiClient {
    
        @RequestLine("DELETE /notifications/{notification_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "notification_id") String notificationId) throws BitmovinException;
    
        @RequestLine("GET /notifications/{notification_id}")
        ResponseEnvelope<Notification> get(@Param(value = "notification_id") String notificationId) throws BitmovinException;
    
        @RequestLine("GET /notifications")
        ResponseEnvelope<PaginationResponse<Notification>> list(@QueryMap Map<String, Object> queryParams) throws BitmovinException;
    
        @RequestLine("GET /notifications/{notification_id}/states")
        ResponseEnvelope<PaginationResponse<NotificationStateEntry>> listByNotificationId(@Param(value = "notification_id") String notificationId, @QueryMap Map<String, Object> queryParams) throws BitmovinException;
    
        @Headers("Content-Type: text/plain")
        @Body(" ")
        @RequestLine("POST /notifications/{notification_id}/mute")
        ResponseEnvelope<BitmovinResponse> mute(@Param(value = "notification_id") String notificationId) throws BitmovinException;
    
        @Headers("Content-Type: text/plain")
        @Body(" ")
        @RequestLine("POST /notifications/{notification_id}/unmute")
        ResponseEnvelope<BitmovinResponse> unmute(@Param(value = "notification_id") String notificationId) throws BitmovinException;
    }
}
