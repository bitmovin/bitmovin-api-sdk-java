package com.bitmovin.api.sdk.encoding.infrastructure.kubernetes.prewarmedDeployment;

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
import com.bitmovin.api.sdk.common.BitmovinDateExpander;
import com.bitmovin.api.sdk.common.BitmovinApiBuilder;
import com.bitmovin.api.sdk.common.BitmovinApiClientFactory;

public class PrewarmedDeploymentApi {

    private final PrewarmedDeploymentApiClient apiClient;

    public PrewarmedDeploymentApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(PrewarmedDeploymentApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of PrewarmedDeploymentApi
     */
    public static BitmovinApiBuilder<PrewarmedDeploymentApi> builder() {
        return new BitmovinApiBuilder<>(PrewarmedDeploymentApi.class);
    }
    
    /**
     * Prewarm Encoders
     * 
     * @param infrastructureId Id of the kubernetes cluster. (required)
     * @param prewarmEncoderSettings  (required)
     * @return PrewarmEncoderSettings
     * @throws BitmovinException if fails to make API call
     */
    public PrewarmEncoderSettings create(String infrastructureId, PrewarmEncoderSettings prewarmEncoderSettings) throws BitmovinException {
        return this.apiClient.create(infrastructureId, prewarmEncoderSettings).getData().getResult();
    }
    
    /**
     * Delete Prewarmed Encoders
     * 
     * @param infrastructureId Id of the kubernetes cluster. (required)
     * @param deploymentId Id of the prewarmed deployment. (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse delete(String infrastructureId, String deploymentId) throws BitmovinException {
        return this.apiClient.delete(infrastructureId, deploymentId).getData().getResult();
    }
    
    /**
     * Get Prewarmed Encoders
     * 
     * @param infrastructureId Id of the kubernetes cluster. (required)
     * @param deploymentId Id of the prewarmed deployment. (required)
     * @return PrewarmEncoderSettings
     * @throws BitmovinException if fails to make API call
     */
    public PrewarmEncoderSettings get(String infrastructureId, String deploymentId) throws BitmovinException {
        return this.apiClient.get(infrastructureId, deploymentId).getData().getResult();
    }
    
    /**
     * List Prewarmed Encoders
     * 
     * @param infrastructureId Id of the kubernetes cluster. (required)
     * @return List&lt;PrewarmEncoderSettings&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<PrewarmEncoderSettings> list(String infrastructureId) throws BitmovinException {
        return this.apiClient.list(infrastructureId, new HashMap<String, Object>()).getData().getResult();
    }
    /**
     * List Prewarmed Encoders
     * 
     * @param infrastructureId Id of the kubernetes cluster. (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;PrewarmEncoderSettings&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<PrewarmEncoderSettings> list(String infrastructureId, PrewarmEncoderSettingsListQueryParams queryParams) throws BitmovinException {
        return this.apiClient.list(infrastructureId, queryParams).getData().getResult();
    }
    
    interface PrewarmedDeploymentApiClient {
    
        @RequestLine("POST /encoding/infrastructure/kubernetes/{infrastructure_id}/prewarmed-deployment")
        ResponseEnvelope<PrewarmEncoderSettings> create(@Param(value = "infrastructure_id") String infrastructureId, PrewarmEncoderSettings prewarmEncoderSettings) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/infrastructure/kubernetes/{infrastructure_id}/prewarmed-deployment/{deployment_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "infrastructure_id") String infrastructureId, @Param(value = "deployment_id") String deploymentId) throws BitmovinException;
    
        @RequestLine("GET /encoding/infrastructure/kubernetes/{infrastructure_id}/prewarmed-deployment/{deployment_id}")
        ResponseEnvelope<PrewarmEncoderSettings> get(@Param(value = "infrastructure_id") String infrastructureId, @Param(value = "deployment_id") String deploymentId) throws BitmovinException;
    
        @RequestLine("GET /encoding/infrastructure/kubernetes/{infrastructure_id}/prewarmed-deployment")
        ResponseEnvelope<PaginationResponse<PrewarmEncoderSettings>> list(@Param(value = "infrastructure_id") String infrastructureId, @QueryMap Map<String, Object> queryParams) throws BitmovinException;
    }
}
