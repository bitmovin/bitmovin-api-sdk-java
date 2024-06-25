package com.bitmovin.api.sdk.notifications.webhooks.encoding.encodings.liveEncodingHeartbeat;

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

public class LiveEncodingHeartbeatApi {

    private final LiveEncodingHeartbeatApiClient apiClient;

    public LiveEncodingHeartbeatApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(LiveEncodingHeartbeatApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of LiveEncodingHeartbeatApi
     */
    public static BitmovinApiBuilder<LiveEncodingHeartbeatApi> builder() {
        return new BitmovinApiBuilder<>(LiveEncodingHeartbeatApi.class);
    }

    /**
     * Add &#39;Live Encoding Heartbeat&#39; Webhook
     * Add a new webhook notification that triggers a heartbeat webhook with a fixed &#x60;interval&#x60; for all Live Encodings. 
     * @param liveEncodingHeartbeatWebhook The &#39;Live Encoding Heartbeat&#39; Webhook to be added. (required)
     * @return LiveEncodingHeartbeatWebhook
     * @throws BitmovinException if fails to make API call
     */
    public LiveEncodingHeartbeatWebhook create(LiveEncodingHeartbeatWebhook liveEncodingHeartbeatWebhook) throws BitmovinException {
        try {
            return this.apiClient.create(liveEncodingHeartbeatWebhook).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * Delete &#39;Live Encoding Heartbeat&#39; Webhook
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
     * &#39;Live Encoding Heartbeat&#39; Webhook Details
     * 
     * @param webhookId Id of the webhook (required)
     * @return LiveEncodingHeartbeatWebhook
     * @throws BitmovinException if fails to make API call
     */
    public LiveEncodingHeartbeatWebhook getByWebhookId(String webhookId) throws BitmovinException {
        try {
            return this.apiClient.getByWebhookId(webhookId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * List &#39;Live Encoding Heartbeat&#39; Webhooks
     * 
     * @return List&lt;LiveEncodingHeartbeatWebhook&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<LiveEncodingHeartbeatWebhook> list() throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * List &#39;Live Encoding Heartbeat&#39; Webhooks
     * 
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;LiveEncodingHeartbeatWebhook&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<LiveEncodingHeartbeatWebhook> list(LiveEncodingHeartbeatWebhookListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface LiveEncodingHeartbeatApiClient {

        @RequestLine("POST /notifications/webhooks/encoding/encodings/live-encoding-heartbeat")
        ResponseEnvelope<LiveEncodingHeartbeatWebhook> create(LiveEncodingHeartbeatWebhook liveEncodingHeartbeatWebhook) throws BitmovinException;
    
        @RequestLine("DELETE /notifications/webhooks/encoding/encodings/live-encoding-heartbeat/{webhook_id}")
        ResponseEnvelope<BitmovinResponse> deleteByWebhookId(@Param(value = "webhook_id") String webhookId) throws BitmovinException;
    
        @RequestLine("GET /notifications/webhooks/encoding/encodings/live-encoding-heartbeat/{webhook_id}")
        ResponseEnvelope<LiveEncodingHeartbeatWebhook> getByWebhookId(@Param(value = "webhook_id") String webhookId) throws BitmovinException;
    
        @RequestLine("GET /notifications/webhooks/encoding/encodings/live-encoding-heartbeat")
        ResponseEnvelope<PaginationResponse<LiveEncodingHeartbeatWebhook>> list(@QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    }
}
