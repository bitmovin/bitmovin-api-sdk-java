package com.bitmovin.api.sdk.notifications.emails.encoding.encodings.liveInputStreamChanged;

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
     * Add Live Input Stream Changed Email Notification (All Encodings)
     * 
     * @param emailNotificationWithStreamConditionsRequest The email notifications object (required)
     * @return EmailNotificationWithStreamConditions
     * @throws BitmovinException if fails to make API call
     */
    public EmailNotificationWithStreamConditions create(EmailNotificationWithStreamConditionsRequest emailNotificationWithStreamConditionsRequest) throws BitmovinException {
        try {
            return this.apiClient.create(emailNotificationWithStreamConditionsRequest).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * Add Live Input Stream Changed Email Notification (Specific Encoding)
     * 
     * @param encodingId Id of the encoding resource (required)
     * @param emailNotificationWithStreamConditionsRequest The email notifications object (required)
     * @return EmailNotificationWithStreamConditions
     * @throws BitmovinException if fails to make API call
     */
    public EmailNotificationWithStreamConditions createByEncodingId(String encodingId, EmailNotificationWithStreamConditionsRequest emailNotificationWithStreamConditionsRequest) throws BitmovinException {
        try {
            return this.apiClient.createByEncodingId(encodingId, emailNotificationWithStreamConditionsRequest).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * Replace Live Input Stream Changed Email Notification
     * 
     * @param notificationId Id of the email notification (required)
     * @param emailNotificationWithStreamConditionsRequest The email notification with the updated values (required)
     * @return EmailNotificationWithStreamConditions
     * @throws BitmovinException if fails to make API call
     */
    public EmailNotificationWithStreamConditions update(String notificationId, EmailNotificationWithStreamConditionsRequest emailNotificationWithStreamConditionsRequest) throws BitmovinException {
        try {
            return this.apiClient.update(notificationId, emailNotificationWithStreamConditionsRequest).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    interface LiveInputStreamChangedApiClient {
    
        @RequestLine("POST /notifications/emails/encoding/encodings/live-input-stream-changed")
        ResponseEnvelope<EmailNotificationWithStreamConditions> create(EmailNotificationWithStreamConditionsRequest emailNotificationWithStreamConditionsRequest) throws BitmovinException;
    
        @RequestLine("POST /notifications/emails/encoding/encodings/{encoding_id}/live-input-stream-changed")
        ResponseEnvelope<EmailNotificationWithStreamConditions> createByEncodingId(@Param(value = "encoding_id") String encodingId, EmailNotificationWithStreamConditionsRequest emailNotificationWithStreamConditionsRequest) throws BitmovinException;
    
        @RequestLine("PUT /notifications/emails/encoding/encodings/live-input-stream-changed/{notification_id}")
        ResponseEnvelope<EmailNotificationWithStreamConditions> update(@Param(value = "notification_id") String notificationId, EmailNotificationWithStreamConditionsRequest emailNotificationWithStreamConditionsRequest) throws BitmovinException;
    }
}
