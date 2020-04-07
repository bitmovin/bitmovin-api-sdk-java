package com.bitmovin.api.sdk.notifications.webhooks.encoding.encodings.finished;

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
import com.bitmovin.api.sdk.common.BitmovinApiBuilder;
import com.bitmovin.api.sdk.common.BitmovinApiClientFactory;
import com.bitmovin.api.sdk.notifications.webhooks.encoding.encodings.finished.customdata.CustomdataApi;

public class FinishedApi {
    public final CustomdataApi customdata;

    private final FinishedApiClient apiClient;

    public FinishedApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(FinishedApiClient.class);

        this.customdata = new CustomdataApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of FinishedApi
     */
    public static BitmovinApiBuilder<FinishedApi> builder() {
        return new BitmovinApiBuilder<>(FinishedApi.class);
    }
    
    /**
     * Add Encoding Finished Webhook
     * 
     * @param webhook The Encoding Finished Webhook to be added. **Note:** A maximum number of 5 webhooks is allowed (required)
     * @return Webhook
     * @throws BitmovinException if fails to make API call
     */
    public Webhook create(Webhook webhook) throws BitmovinException {
        try {
            return this.apiClient.create(webhook).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * Add Encoding Finished Webhook for specific Encoding Resource.
     * 
     * @param encodingId Id of the encoding (required)
     * @param webhook The Encoding Finished Webhook to be added. **Note:** A maximum number of 5 webhooks is allowed (required)
     * @return Webhook
     * @throws BitmovinException if fails to make API call
     */
    public Webhook createByEncodingId(String encodingId, Webhook webhook) throws BitmovinException {
        try {
            return this.apiClient.createByEncodingId(encodingId, webhook).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * Delete Encoding Finished Webhook for specific Encoding Resource
     * 
     * @param encodingId Id of the encoding (required)
     * @param webhookId Id of the webhook (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse deleteByEncodingIdAndWebhookId(String encodingId, String webhookId) throws BitmovinException {
        try {
            return this.apiClient.deleteByEncodingIdAndWebhookId(encodingId, webhookId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * Delete Encoding Finished Webhook
     * 
     * @param webhookId Id of the webhook (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse deleteByWebhookId(String webhookId) throws BitmovinException {
        try {
            return this.apiClient.deleteByWebhookId(webhookId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * Encoding Finished Webhook Details for specific Encoding Resource
     * 
     * @param encodingId Id of the encoding (required)
     * @param webhookId Id of the webhook (required)
     * @return Webhook
     * @throws BitmovinException if fails to make API call
     */
    public Webhook getByEncodingIdAndWebhookId(String encodingId, String webhookId) throws BitmovinException {
        try {
            return this.apiClient.getByEncodingIdAndWebhookId(encodingId, webhookId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * Encoding Finished Webhook Details
     * 
     * @param webhookId Id of the webhook (required)
     * @return Webhook
     * @throws BitmovinException if fails to make API call
     */
    public Webhook getByWebhookId(String webhookId) throws BitmovinException {
        try {
            return this.apiClient.getByWebhookId(webhookId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * List Encoding Finished Webhooks
     * 
     * @return List&lt;Webhook&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<Webhook> list() throws BitmovinException {
        try {
            return this.apiClient.list(new HashMap<String, Object>()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * List Encoding Finished Webhooks
     * 
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;Webhook&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<Webhook> list(WebhookListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(queryParams).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * List Encoding Finished Webhooks for specific Encoding Resource
     * 
     * @param encodingId Id of the encoding (required)
     * @return List&lt;Webhook&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<Webhook> listByEncodingId(String encodingId) throws BitmovinException {
        try {
            return this.apiClient.listByEncodingId(encodingId, new HashMap<String, Object>()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * List Encoding Finished Webhooks for specific Encoding Resource
     * 
     * @param encodingId Id of the encoding (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;Webhook&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<Webhook> listByEncodingId(String encodingId, WebhookListByEncodingIdQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.listByEncodingId(encodingId, queryParams).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    interface FinishedApiClient {
    
        @RequestLine("POST /notifications/webhooks/encoding/encodings/finished")
        ResponseEnvelope<Webhook> create(Webhook webhook) throws BitmovinException;
    
        @RequestLine("POST /notifications/webhooks/encoding/encodings/{encoding_id}/finished")
        ResponseEnvelope<Webhook> createByEncodingId(@Param(value = "encoding_id") String encodingId, Webhook webhook) throws BitmovinException;
    
        @RequestLine("DELETE /notifications/webhooks/encoding/encodings/{encoding_id}/finished/{webhook_id}")
        ResponseEnvelope<BitmovinResponse> deleteByEncodingIdAndWebhookId(@Param(value = "encoding_id") String encodingId, @Param(value = "webhook_id") String webhookId) throws BitmovinException;
    
        @RequestLine("DELETE /notifications/webhooks/encoding/encodings/finished/{webhook_id}")
        ResponseEnvelope<BitmovinResponse> deleteByWebhookId(@Param(value = "webhook_id") String webhookId) throws BitmovinException;
    
        @RequestLine("GET /notifications/webhooks/encoding/encodings/{encoding_id}/finished/{webhook_id}")
        ResponseEnvelope<Webhook> getByEncodingIdAndWebhookId(@Param(value = "encoding_id") String encodingId, @Param(value = "webhook_id") String webhookId) throws BitmovinException;
    
        @RequestLine("GET /notifications/webhooks/encoding/encodings/finished/{webhook_id}")
        ResponseEnvelope<Webhook> getByWebhookId(@Param(value = "webhook_id") String webhookId) throws BitmovinException;
    
        @RequestLine("GET /notifications/webhooks/encoding/encodings/finished")
        ResponseEnvelope<PaginationResponse<Webhook>> list(@QueryMap Map<String, Object> queryParams) throws BitmovinException;
    
        @RequestLine("GET /notifications/webhooks/encoding/encodings/{encoding_id}/finished")
        ResponseEnvelope<PaginationResponse<Webhook>> listByEncodingId(@Param(value = "encoding_id") String encodingId, @QueryMap Map<String, Object> queryParams) throws BitmovinException;
    }
}
