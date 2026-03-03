package com.bitmovin.api.sdk.agents.aisa.sessions;

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

public class SessionsApi {

    private final SessionsApiClient apiClient;

    public SessionsApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(SessionsApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of SessionsApi
     */
    public static BitmovinApiBuilder<SessionsApi> builder() {
        return new BitmovinApiBuilder<>(SessionsApi.class);
    }
    /**
     * Create Agent Session
     * 
     * @param xUserId User ID used to scope agent sessions (required)
     * @return AgentSessionResponse
     * @throws BitmovinException if fails to make API call
     */
    public AgentSessionResponse create(String xUserId) throws BitmovinException {
        try {
            return this.apiClient.create().getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * Delete Agent Session
     * 
     * @param sessionId Id of the session (required)
     * @param xUserId User ID used to scope agent sessions (required)
     * @return AgentSessionResponse
     * @throws BitmovinException if fails to make API call
     */
    public AgentSessionResponse delete(String sessionId, String xUserId) throws BitmovinException {
        try {
            return this.apiClient.delete(sessionId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * Get Agent Session Details
     * 
     * @param sessionId Id of the session (required)
     * @param xUserId User ID used to scope agent sessions (required)
     * @return AgentSessionHistoryResponse
     * @throws BitmovinException if fails to make API call
     */
    public AgentSessionHistoryResponse get(String sessionId, String xUserId) throws BitmovinException {
        try {
            return this.apiClient.get(sessionId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * List Agent Sessions
     * 
     * @param xUserId User ID used to scope agent sessions (required)
     * @return AgentSessionListResponse
     * @throws BitmovinException if fails to make API call
     */
    public AgentSessionListResponse list(String xUserId) throws BitmovinException {
        try {
            return this.apiClient.list().getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface SessionsApiClient { 
        @RequestLine("POST /agents/aisa/sessions")
        ResponseEnvelope<AgentSessionResponse> create() throws BitmovinException;
   
        @RequestLine("DELETE /agents/aisa/sessions/{session_id}")
        ResponseEnvelope<AgentSessionResponse> delete(@Param(value = "session_id") String sessionId) throws BitmovinException;
   
        @RequestLine("GET /agents/aisa/sessions/{session_id}")
        ResponseEnvelope<AgentSessionHistoryResponse> get(@Param(value = "session_id") String sessionId) throws BitmovinException;
   
        @RequestLine("GET /agents/aisa/sessions")
        ResponseEnvelope<AgentSessionListResponse> list() throws BitmovinException;
    }
}
