package com.bitmovin.api.sdk.notifications.webhooks.encoding.encodings.finished.customdata;

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

public class CustomdataApi {

    private final CustomdataApiClient apiClient;

    public CustomdataApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(CustomdataApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of CustomdataApi
     */
    public static BitmovinApiBuilder<CustomdataApi> builder() {
        return new BitmovinApiBuilder<>(CustomdataApi.class);
    }
    
    /**
     * Encoding Finished Webhook Custom Data for specific Encoding Resource
     * 
     * @param encodingId Id of the encoding (required)
     * @param webhookId Id of the webhook (required)
     * @return CustomData
     * @throws BitmovinException if fails to make API call
     */
    public CustomData getCustomDataByEncodingIdAndWebhookId(String encodingId, String webhookId) throws BitmovinException {
        try {
            return this.apiClient.getCustomDataByEncodingIdAndWebhookId(encodingId, webhookId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * Encoding Finished Webhook Custom Data
     * 
     * @param webhookId Id of the webhook (required)
     * @return CustomData
     * @throws BitmovinException if fails to make API call
     */
    public CustomData getCustomDataByWebhookId(String webhookId) throws BitmovinException {
        try {
            return this.apiClient.getCustomDataByWebhookId(webhookId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    interface CustomdataApiClient {
    
        @RequestLine("GET /notifications/webhooks/encoding/encodings/{encoding_id}/finished/{webhook_id}/customData")
        ResponseEnvelope<CustomData> getCustomDataByEncodingIdAndWebhookId(@Param(value = "encoding_id") String encodingId, @Param(value = "webhook_id") String webhookId) throws BitmovinException;
    
        @RequestLine("GET /notifications/webhooks/encoding/encodings/finished/{webhook_id}/customData")
        ResponseEnvelope<CustomData> getCustomDataByWebhookId(@Param(value = "webhook_id") String webhookId) throws BitmovinException;
    }
}
