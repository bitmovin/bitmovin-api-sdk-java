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
import com.bitmovin.api.sdk.common.QueryMapWrapper;
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
     * Add &#39;Encoding Finished&#39; Webhook
     * Add a new webhook notification that triggers if an encoding finishes successfully. A maximum number of 5 webhooks is allowed
     * @param webhook The &#39;Encoding Finished&#39; Webhook to be added. (required)
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
     * Add &#39;Encoding Finished&#39; Webhook for a specific Encoding
     * 
     * @param encodingId Id of the encoding (required)
     * @param webhook The &#39;Encoding Finished&#39; Webhook to be added. A maximum number of 5 webhooks per Encoding is allowed (required)
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
     * Delete &#39;Encoding Finished&#39; Webhook for a specific Encoding
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
     * Delete &#39;Encoding Finished&#39; Webhook
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
     * &#39;Encoding Finished&#39; Webhook Details for a specific Encoding
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
     * &#39;Encoding Finished&#39; Webhook Details
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
     * List &#39;Encoding Finished&#39; Webhooks
     * 
     * @return List&lt;Webhook&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<Webhook> list() throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * List &#39;Encoding Finished&#39; Webhooks
     * 
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;Webhook&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<Webhook> list(WebhookListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * List &#39;Encoding Finished&#39; Webhooks for a specific Encoding
     * 
     * @param encodingId Id of the encoding (required)
     * @return List&lt;Webhook&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<Webhook> listByEncodingId(String encodingId) throws BitmovinException {
        try {
            return this.apiClient.listByEncodingId(encodingId, new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * List &#39;Encoding Finished&#39; Webhooks for a specific Encoding
     * 
     * @param encodingId Id of the encoding (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;Webhook&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<Webhook> listByEncodingId(String encodingId, WebhookListByEncodingIdQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.listByEncodingId(encodingId, new QueryMapWrapper(queryParams)).getData().getResult();
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
        ResponseEnvelope<PaginationResponse<Webhook>> list(@QueryMap QueryMapWrapper queryParams) throws BitmovinException;
   
        @RequestLine("GET /notifications/webhooks/encoding/encodings/{encoding_id}/finished")
        ResponseEnvelope<PaginationResponse<Webhook>> listByEncodingId(@Param(value = "encoding_id") String encodingId, @QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    }
}
