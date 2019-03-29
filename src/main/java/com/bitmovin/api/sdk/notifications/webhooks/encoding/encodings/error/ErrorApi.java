package com.bitmovin.api.sdk.notifications.webhooks.encoding.encodings.error;

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
import com.bitmovin.api.sdk.notifications.webhooks.encoding.encodings.error.customdata.CustomdataApi;

public class ErrorApi {
    public final CustomdataApi customdata;

    private final ErrorApiClient apiClient;

    public ErrorApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(ErrorApiClient.class);

        this.customdata = new CustomdataApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of ErrorApi
     */
    public static BitmovinApiBuilder<ErrorApi> builder() {
        return new BitmovinApiBuilder<>(ErrorApi.class);
    }
    
    /**
     * Add Encoding Error Webhook
     * 
     * @param webhook  (optional)
     * @return Webhook
     * @throws BitmovinException if fails to make API call
     */
    public Webhook create(Webhook webhook) throws BitmovinException {
        return this.apiClient.create(webhook).getData().getResult();
    }
    
    /**
     * Add Encoding Error Webhook for specific Encoding Resource
     * 
     * @param encodingId Id of the encoding (required)
     * @param webhook  (optional)
     * @return Webhook
     * @throws BitmovinException if fails to make API call
     */
    public Webhook createbyEncodingId(String encodingId, Webhook webhook) throws BitmovinException {
        return this.apiClient.createbyEncodingId(encodingId, webhook).getData().getResult();
    }
    
    /**
     * Delete Encoding Error Webhook for specific Encoding Resource
     * 
     * @param encodingId Id of the encoding (required)
     * @param webhookId Id of the webhook (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse deleteByEncodingIdAndWebhookId(String encodingId, String webhookId) throws BitmovinException {
        return this.apiClient.deleteByEncodingIdAndWebhookId(encodingId, webhookId).getData().getResult();
    }
    
    /**
     * Delete Encoding Error Webhook
     * 
     * @param webhookId Id of the webhook (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse deleteByWebhookId(String webhookId) throws BitmovinException {
        return this.apiClient.deleteByWebhookId(webhookId).getData().getResult();
    }
    
    /**
     * Encoding Error Webhook Details for specific Encoding Resource
     * 
     * @param encodingId Id of the encoding (required)
     * @param webhookId Id of the webhook (required)
     * @return Webhook
     * @throws BitmovinException if fails to make API call
     */
    public Webhook getByEncodingIdAndWebhookId(String encodingId, String webhookId) throws BitmovinException {
        return this.apiClient.getByEncodingIdAndWebhookId(encodingId, webhookId).getData().getResult();
    }
    
    /**
     * Encoding Error Webhook Details
     * 
     * @param webhookId Id of the webhook (required)
     * @return Webhook
     * @throws BitmovinException if fails to make API call
     */
    public Webhook getByWebhookId(String webhookId) throws BitmovinException {
        return this.apiClient.getByWebhookId(webhookId).getData().getResult();
    }
    
    /**
     * List Encoding Error Webhooks
     * 
     * @return List&lt;Webhook&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<Webhook> list() throws BitmovinException {
        return this.apiClient.list(new HashMap<String, Object>()).getData().getResult();
    }
    /**
     * List Encoding Error Webhooks
     * 
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;Webhook&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<Webhook> list(WebhookListQueryParams queryParams) throws BitmovinException {
        return this.apiClient.list(queryParams).getData().getResult();
    }
    
    /**
     * List Encoding Error Webhooks for specific Encoding Resource
     * 
     * @param encodingId Id of the encoding (required)
     * @return List&lt;Webhook&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<Webhook> listByEncodingId(String encodingId) throws BitmovinException {
        return this.apiClient.listByEncodingId(encodingId, new HashMap<String, Object>()).getData().getResult();
    }
    /**
     * List Encoding Error Webhooks for specific Encoding Resource
     * 
     * @param encodingId Id of the encoding (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;Webhook&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<Webhook> listByEncodingId(String encodingId, WebhookListByEncodingIdQueryParams queryParams) throws BitmovinException {
        return this.apiClient.listByEncodingId(encodingId, queryParams).getData().getResult();
    }
    
    interface ErrorApiClient {
    
        @RequestLine("POST /notifications/webhooks/encoding/encodings/error")
        ResponseEnvelope<Webhook> create(Webhook webhook) throws BitmovinException;
    
        @RequestLine("POST /notifications/webhooks/encoding/encodings/{encoding_id}/error")
        ResponseEnvelope<Webhook> createbyEncodingId(@Param(value = "encoding_id") String encodingId, Webhook webhook) throws BitmovinException;
    
        @RequestLine("DELETE /notifications/webhooks/encoding/encodings/{encoding_id}/error/{webhook_id}")
        ResponseEnvelope<BitmovinResponse> deleteByEncodingIdAndWebhookId(@Param(value = "encoding_id") String encodingId, @Param(value = "webhook_id") String webhookId) throws BitmovinException;
    
        @RequestLine("DELETE /notifications/webhooks/encoding/encodings/error/{webhook_id}")
        ResponseEnvelope<BitmovinResponse> deleteByWebhookId(@Param(value = "webhook_id") String webhookId) throws BitmovinException;
    
        @RequestLine("GET /notifications/webhooks/encoding/encodings/{encoding_id}/error/{webhook_id}")
        ResponseEnvelope<Webhook> getByEncodingIdAndWebhookId(@Param(value = "encoding_id") String encodingId, @Param(value = "webhook_id") String webhookId) throws BitmovinException;
    
        @RequestLine("GET /notifications/webhooks/encoding/encodings/error/{webhook_id}")
        ResponseEnvelope<Webhook> getByWebhookId(@Param(value = "webhook_id") String webhookId) throws BitmovinException;
    
        @RequestLine("GET /notifications/webhooks/encoding/encodings/error")
        ResponseEnvelope<PaginationResponse<Webhook>> list(@QueryMap Map<String, Object> queryParams) throws BitmovinException;
    
        @RequestLine("GET /notifications/webhooks/encoding/encodings/{encoding_id}/error")
        ResponseEnvelope<PaginationResponse<Webhook>> listByEncodingId(@Param(value = "encoding_id") String encodingId, @QueryMap Map<String, Object> queryParams) throws BitmovinException;
    }
}
