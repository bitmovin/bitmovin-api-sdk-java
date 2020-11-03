package com.bitmovin.api.sdk.encoding.infrastructure.kubernetes.configuration;

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

public class ConfigurationApi {

    private final ConfigurationApiClient apiClient;

    public ConfigurationApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(ConfigurationApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of ConfigurationApi
     */
    public static BitmovinApiBuilder<ConfigurationApi> builder() {
        return new BitmovinApiBuilder<>(ConfigurationApi.class);
    }
    
    /**
     * Retrieve Kubernetes Cluster Configuration
     * 
     * @param infrastructureId Id of the Kubernetes cluster (required)
     * @return KubernetesClusterConfiguration
     * @throws BitmovinException if fails to make API call
     */
    public KubernetesClusterConfiguration get(String infrastructureId) throws BitmovinException {
        try {
            return this.apiClient.get(infrastructureId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * Update Kubernetes Cluster Configuration
     * 
     * @param infrastructureId Id of the Kubernetes cluster (required)
     * @param kubernetesClusterConfiguration The Kubernetes Cluster Configuration which should be applied (required)
     * @return KubernetesClusterConfiguration
     * @throws BitmovinException if fails to make API call
     */
    public KubernetesClusterConfiguration update(String infrastructureId, KubernetesClusterConfiguration kubernetesClusterConfiguration) throws BitmovinException {
        try {
            return this.apiClient.update(infrastructureId, kubernetesClusterConfiguration).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    interface ConfigurationApiClient {
    
        @RequestLine("GET /encoding/infrastructure/kubernetes/{infrastructure_id}/configuration")
        ResponseEnvelope<KubernetesClusterConfiguration> get(@Param(value = "infrastructure_id") String infrastructureId) throws BitmovinException;
    
        @RequestLine("PUT /encoding/infrastructure/kubernetes/{infrastructure_id}/configuration")
        ResponseEnvelope<KubernetesClusterConfiguration> update(@Param(value = "infrastructure_id") String infrastructureId, KubernetesClusterConfiguration kubernetesClusterConfiguration) throws BitmovinException;
    }
}
