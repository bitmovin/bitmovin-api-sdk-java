package com.bitmovin.api.sdk.encoding.live.streamKeys.actions;

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

public class ActionsApi {

    private final ActionsApiClient apiClient;

    public ActionsApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(ActionsApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of ActionsApi
     */
    public static BitmovinApiBuilder<ActionsApi> builder() {
        return new BitmovinApiBuilder<>(ActionsApi.class);
    }

    /**
     * Unassign stream keys
     * 
     * @param streamKeysUnassignAction The action payload for unassigning stream keys (required)
     * @return StreamKeysUnassignAction
     * @throws BitmovinException if fails to make API call
     */
    public StreamKeysUnassignAction unassign(StreamKeysUnassignAction streamKeysUnassignAction) throws BitmovinException {
        try {
            return this.apiClient.unassign(streamKeysUnassignAction).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface ActionsApiClient {

        @RequestLine("POST /encoding/live/stream-keys/actions/unassign")
        ResponseEnvelope<StreamKeysUnassignAction> unassign(StreamKeysUnassignAction streamKeysUnassignAction) throws BitmovinException;
    }
}
