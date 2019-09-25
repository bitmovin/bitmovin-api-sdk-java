package com.bitmovin.api.sdk.encoding.infrastructure;

import com.bitmovin.api.sdk.common.BitmovinApiBuilder;
import com.bitmovin.api.sdk.common.BitmovinApiClientFactory;
import com.bitmovin.api.sdk.encoding.infrastructure.kubernetes.KubernetesApi;
import com.bitmovin.api.sdk.encoding.infrastructure.aws.AwsApi;
import com.bitmovin.api.sdk.encoding.infrastructure.gce.GceApi;

public class InfrastructureApi {
    public final KubernetesApi kubernetes;
    public final AwsApi aws;
    public final GceApi gce;

    public InfrastructureApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.kubernetes = new KubernetesApi(clientFactory);
        this.aws = new AwsApi(clientFactory);
        this.gce = new GceApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of InfrastructureApi
     */
    public static BitmovinApiBuilder<InfrastructureApi> builder() {
        return new BitmovinApiBuilder<>(InfrastructureApi.class);
    }
    
    
}
