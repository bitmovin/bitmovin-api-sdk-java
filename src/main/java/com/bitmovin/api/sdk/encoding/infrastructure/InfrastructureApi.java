package com.bitmovin.api.sdk.encoding.infrastructure;

import com.bitmovin.api.sdk.common.BitmovinApiBuilder;
import com.bitmovin.api.sdk.common.BitmovinApiClientFactory;
import com.bitmovin.api.sdk.encoding.infrastructure.aws.AwsApi;
import com.bitmovin.api.sdk.encoding.infrastructure.staticIps.StaticIpsApi;
import com.bitmovin.api.sdk.encoding.infrastructure.azure.AzureApi;
import com.bitmovin.api.sdk.encoding.infrastructure.gce.GceApi;
import com.bitmovin.api.sdk.encoding.infrastructure.akamai.AkamaiApi;
import com.bitmovin.api.sdk.encoding.infrastructure.prewarmedEncoderPools.PrewarmedEncoderPoolsApi;

public class InfrastructureApi {
    public final AwsApi aws;
    public final StaticIpsApi staticIps;
    public final AzureApi azure;
    public final GceApi gce;
    public final AkamaiApi akamai;
    public final PrewarmedEncoderPoolsApi prewarmedEncoderPools;

    public InfrastructureApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.aws = new AwsApi(clientFactory);
        this.staticIps = new StaticIpsApi(clientFactory);
        this.azure = new AzureApi(clientFactory);
        this.gce = new GceApi(clientFactory);
        this.akamai = new AkamaiApi(clientFactory);
        this.prewarmedEncoderPools = new PrewarmedEncoderPoolsApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of InfrastructureApi
     */
    public static BitmovinApiBuilder<InfrastructureApi> builder() {
        return new BitmovinApiBuilder<>(InfrastructureApi.class);
    }

}
