package com.bitmovin.api.sdk.encoding.infrastructure.kubernetes;

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
import com.bitmovin.api.sdk.encoding.infrastructure.kubernetes.status.StatusApi;
import com.bitmovin.api.sdk.encoding.infrastructure.kubernetes.customdata.CustomdataApi;
import com.bitmovin.api.sdk.encoding.infrastructure.kubernetes.configuration.ConfigurationApi;
import com.bitmovin.api.sdk.encoding.infrastructure.kubernetes.agentDeployment.AgentDeploymentApi;
import com.bitmovin.api.sdk.encoding.infrastructure.kubernetes.prewarmedDeployment.PrewarmedDeploymentApi;

public class KubernetesApi {
    public final StatusApi status;
    public final CustomdataApi customdata;
    public final ConfigurationApi configuration;
    public final AgentDeploymentApi agentDeployment;
    public final PrewarmedDeploymentApi prewarmedDeployment;

    private final KubernetesApiClient apiClient;

    public KubernetesApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(KubernetesApiClient.class);

        this.status = new StatusApi(clientFactory);
        this.customdata = new CustomdataApi(clientFactory);
        this.configuration = new ConfigurationApi(clientFactory);
        this.agentDeployment = new AgentDeploymentApi(clientFactory);
        this.prewarmedDeployment = new PrewarmedDeploymentApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of KubernetesApi
     */
    public static BitmovinApiBuilder<KubernetesApi> builder() {
        return new BitmovinApiBuilder<>(KubernetesApi.class);
    }
    
    /**
     * Connect Kubernetes Cluster
     * 
     * @param kubernetesCluster The Kubernetes Cluster to be created (required)
     * @return KubernetesCluster
     * @throws BitmovinException if fails to make API call
     */
    public KubernetesCluster create(KubernetesCluster kubernetesCluster) throws BitmovinException {
        try {
            return this.apiClient.create(kubernetesCluster).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * Disconnect Kubernetes Cluster
     * 
     * @param infrastructureId Id of the Kubernetes cluster (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse delete(String infrastructureId) throws BitmovinException {
        try {
            return this.apiClient.delete(infrastructureId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * Kubernetes Cluster Details
     * 
     * @param infrastructureId Id of the Kubernetes cluster (required)
     * @return KubernetesCluster
     * @throws BitmovinException if fails to make API call
     */
    public KubernetesCluster get(String infrastructureId) throws BitmovinException {
        try {
            return this.apiClient.get(infrastructureId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * List Kubernetes Cluster
     * 
     * @return List&lt;KubernetesCluster&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<KubernetesCluster> list() throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * List Kubernetes Cluster
     * 
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;KubernetesCluster&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<KubernetesCluster> list(KubernetesClusterListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    interface KubernetesApiClient {
    
        @RequestLine("POST /encoding/infrastructure/kubernetes")
        ResponseEnvelope<KubernetesCluster> create(KubernetesCluster kubernetesCluster) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/infrastructure/kubernetes/{infrastructure_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "infrastructure_id") String infrastructureId) throws BitmovinException;
    
        @RequestLine("GET /encoding/infrastructure/kubernetes/{infrastructure_id}")
        ResponseEnvelope<KubernetesCluster> get(@Param(value = "infrastructure_id") String infrastructureId) throws BitmovinException;
    
        @RequestLine("GET /encoding/infrastructure/kubernetes")
        ResponseEnvelope<PaginationResponse<KubernetesCluster>> list(@QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    }
}
