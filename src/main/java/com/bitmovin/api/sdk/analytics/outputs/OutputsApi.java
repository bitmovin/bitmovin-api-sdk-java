package com.bitmovin.api.sdk.analytics.outputs;

import com.bitmovin.api.sdk.common.BitmovinApiBuilder;
import com.bitmovin.api.sdk.common.BitmovinApiClientFactory;
import com.bitmovin.api.sdk.analytics.outputs.azure.AzureApi;
import com.bitmovin.api.sdk.analytics.outputs.s3RoleBased.S3RoleBasedApi;
import com.bitmovin.api.sdk.analytics.outputs.gcsServiceAccount.GcsServiceAccountApi;

public class OutputsApi {
    public final AzureApi azure;
    public final S3RoleBasedApi s3RoleBased;
    public final GcsServiceAccountApi gcsServiceAccount;

    public OutputsApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.azure = new AzureApi(clientFactory);
        this.s3RoleBased = new S3RoleBasedApi(clientFactory);
        this.gcsServiceAccount = new GcsServiceAccountApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of OutputsApi
     */
    public static BitmovinApiBuilder<OutputsApi> builder() {
        return new BitmovinApiBuilder<>(OutputsApi.class);
    }
    
    
}
