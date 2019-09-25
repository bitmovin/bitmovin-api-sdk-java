package com.bitmovin.api.sdk.encoding.infrastructure.kubernetes.agentDeployment;

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

public class AgentDeploymentApi {

    private final AgentDeploymentApiClient apiClient;

    public AgentDeploymentApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(AgentDeploymentApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of AgentDeploymentApi
     */
    public static BitmovinApiBuilder<AgentDeploymentApi> builder() {
        return new BitmovinApiBuilder<>(AgentDeploymentApi.class);
    }
    
    /**
     * Download bitmovin-agent deployment
     * 
     * @param infrastructureId Id of the Kubernetes cluster (required)
     * @throws BitmovinException if fails to make API call
     */
    public void get(String infrastructureId) throws BitmovinException {
        try {
            this.apiClient.get(infrastructureId);
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    interface AgentDeploymentApiClient {
    
        @RequestLine("GET /encoding/infrastructure/kubernetes/{infrastructure_id}/agent-deployment")
        void get(@Param(value = "infrastructure_id") String infrastructureId) throws BitmovinException;
    }
}
