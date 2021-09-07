package com.bitmovin.api.sdk.notifications.emails.encoding.encodings.error;

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
     * Add Encoding Error Email Notification (All Encodings)
     * 
     * @param encodingErrorEmailNotification Add a new email notification if an encoding received an error (required)
     * @return List&lt;EncodingErrorEmailNotification&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<EncodingErrorEmailNotification> create(EncodingErrorEmailNotification encodingErrorEmailNotification) throws BitmovinException {
        try {
            return this.apiClient.create(encodingErrorEmailNotification).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * Add Encoding Error Email Notification (Specific Encoding)
     * 
     * @param encodingId Id of the encoding resource (required)
     * @param emailNotification The email notifications object (required)
     * @return EmailNotification
     * @throws BitmovinException if fails to make API call
     */
    public EmailNotification createByEncodingId(String encodingId, EmailNotification emailNotification) throws BitmovinException {
        try {
            return this.apiClient.createByEncodingId(encodingId, emailNotification).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * Replace Encoding Error Email Notification
     * 
     * @param notificationId Id of the email notification (required)
     * @param emailNotification The email notification with the updated values (required)
     * @return EmailNotification
     * @throws BitmovinException if fails to make API call
     */
    public EmailNotification update(String notificationId, EmailNotification emailNotification) throws BitmovinException {
        try {
            return this.apiClient.update(notificationId, emailNotification).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface ErrorApiClient {

        @RequestLine("POST /notifications/emails/encoding/encodings/error")
        ResponseEnvelope<PaginationResponse<EncodingErrorEmailNotification>> create(EncodingErrorEmailNotification encodingErrorEmailNotification) throws BitmovinException;
    
        @RequestLine("POST /notifications/emails/encoding/encodings/{encoding_id}/error")
        ResponseEnvelope<EmailNotification> createByEncodingId(@Param(value = "encoding_id") String encodingId, EmailNotification emailNotification) throws BitmovinException;
    
        @RequestLine("PUT /notifications/emails/encoding/encodings/error/{notification_id}")
        ResponseEnvelope<EmailNotification> update(@Param(value = "notification_id") String notificationId, EmailNotification emailNotification) throws BitmovinException;
    }
}
