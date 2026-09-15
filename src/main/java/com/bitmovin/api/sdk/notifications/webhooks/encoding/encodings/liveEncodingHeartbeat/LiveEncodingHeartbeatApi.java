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
import com.bitmovin.api.sdk.notifications.webhooks.encoding.encodings.liveEncodingHeartbeat.customdata.CustomdataApi;

public class LiveEncodingHeartbeatApi {
    public final CustomdataApi customdata;

    private final LiveEncodingHeartbeatApiClient apiClient;

    public LiveEncodingHeartbeatApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(LiveEncodingHeartbeatApiClient.class);

        this.customdata = new CustomdataApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of LiveEncodingHeartbeatApi
     */
    public static BitmovinApiBuilder<LiveEncodingHeartbeatApi> builder() {
        return new BitmovinApiBuilder<>(LiveEncodingHeartbeatApi.class);
    }
    /**
     * Create &#39;Live Encoding Heartbeat&#39; Webhook
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
     * Create &#39;Live Encoding Heartbeat&#39; Webhook for a specific Encoding
     * Add a webhook notification that triggers a heartbeat with a fixed &#x60;interval&#x60; for a specific encoding. A maximum number of 5 webhooks per Encoding is allowed. Can also be added to an already running live encoding (on a supported encoder version); the first heartbeat fires immediately, then one every &#x60;interval&#x60; seconds.
     * @param encodingId Id of the encoding (required)
     * @param liveEncodingHeartbeatWebhook The &#39;Live Encoding Heartbeat&#39; Webhook to be added. (required)
     * @return LiveEncodingHeartbeatWebhook
     * @throws BitmovinException if fails to make API call
     */
    public LiveEncodingHeartbeatWebhook createByEncodingId(String encodingId, LiveEncodingHeartbeatWebhook liveEncodingHeartbeatWebhook) throws BitmovinException {
        try {
            return this.apiClient.createByEncodingId(encodingId, liveEncodingHeartbeatWebhook).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * Delete &#39;Live Encoding Heartbeat&#39; Webhook for a specific Encoding
     * Delete a &#39;Live Encoding Heartbeat&#39; webhook for a specific encoding. Can also be deleted while the live encoding is running (on a supported encoder version); no further heartbeats are sent, but deliveries already in flight are not cancelled.
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
     * Get &#39;Live Encoding Heartbeat&#39; Webhook details for a specific Encoding
     * 
     * @param encodingId Id of the encoding (required)
     * @param webhookId Id of the webhook (required)
     * @return LiveEncodingHeartbeatWebhook
     * @throws BitmovinException if fails to make API call
     */
    public LiveEncodingHeartbeatWebhook getByEncodingIdAndWebhookId(String encodingId, String webhookId) throws BitmovinException {
        try {
            return this.apiClient.getByEncodingIdAndWebhookId(encodingId, webhookId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * Get &#39;Live Encoding Heartbeat&#39; Webhook details
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
    /**
     * List &#39;Live Encoding Heartbeat&#39; Webhooks for a specific Encoding
     * 
     * @param encodingId Id of the encoding (required)
     * @return List&lt;LiveEncodingHeartbeatWebhook&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<LiveEncodingHeartbeatWebhook> listByEncodingId(String encodingId) throws BitmovinException {
        try {
            return this.apiClient.listByEncodingId(encodingId, new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * List &#39;Live Encoding Heartbeat&#39; Webhooks for a specific Encoding
     * 
     * @param encodingId Id of the encoding (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;LiveEncodingHeartbeatWebhook&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<LiveEncodingHeartbeatWebhook> listByEncodingId(String encodingId, LiveEncodingHeartbeatWebhookListByEncodingIdQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.listByEncodingId(encodingId, new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface LiveEncodingHeartbeatApiClient { 
        @RequestLine("POST /notifications/webhooks/encoding/encodings/live-encoding-heartbeat")
        ResponseEnvelope<LiveEncodingHeartbeatWebhook> create(LiveEncodingHeartbeatWebhook liveEncodingHeartbeatWebhook) throws BitmovinException;
   
        @RequestLine("POST /notifications/webhooks/encoding/encodings/{encoding_id}/live-encoding-heartbeat")
        ResponseEnvelope<LiveEncodingHeartbeatWebhook> createByEncodingId(@Param(value = "encoding_id") String encodingId, LiveEncodingHeartbeatWebhook liveEncodingHeartbeatWebhook) throws BitmovinException;
   
        @RequestLine("DELETE /notifications/webhooks/encoding/encodings/{encoding_id}/live-encoding-heartbeat/{webhook_id}")
        ResponseEnvelope<BitmovinResponse> deleteByEncodingIdAndWebhookId(@Param(value = "encoding_id") String encodingId, @Param(value = "webhook_id") String webhookId) throws BitmovinException;
   
        @RequestLine("DELETE /notifications/webhooks/encoding/encodings/live-encoding-heartbeat/{webhook_id}")
        ResponseEnvelope<BitmovinResponse> deleteByWebhookId(@Param(value = "webhook_id") String webhookId) throws BitmovinException;
   
        @RequestLine("GET /notifications/webhooks/encoding/encodings/{encoding_id}/live-encoding-heartbeat/{webhook_id}")
        ResponseEnvelope<LiveEncodingHeartbeatWebhook> getByEncodingIdAndWebhookId(@Param(value = "encoding_id") String encodingId, @Param(value = "webhook_id") String webhookId) throws BitmovinException;
   
        @RequestLine("GET /notifications/webhooks/encoding/encodings/live-encoding-heartbeat/{webhook_id}")
        ResponseEnvelope<LiveEncodingHeartbeatWebhook> getByWebhookId(@Param(value = "webhook_id") String webhookId) throws BitmovinException;
   
        @RequestLine("GET /notifications/webhooks/encoding/encodings/live-encoding-heartbeat")
        ResponseEnvelope<PaginationResponse<LiveEncodingHeartbeatWebhook>> list(@QueryMap QueryMapWrapper queryParams) throws BitmovinException;
   
        @RequestLine("GET /notifications/webhooks/encoding/encodings/{encoding_id}/live-encoding-heartbeat")
        ResponseEnvelope<PaginationResponse<LiveEncodingHeartbeatWebhook>> listByEncodingId(@Param(value = "encoding_id") String encodingId, @QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    }
}
