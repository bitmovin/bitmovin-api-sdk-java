package com.bitmovin.api.sdk.analytics.outputs;

import com.bitmovin.api.sdk.common.BitmovinApiBuilder;
import com.bitmovin.api.sdk.common.BitmovinApiClientFactory;
import com.bitmovin.api.sdk.analytics.outputs.s3RoleBased.S3RoleBasedApi;

public class OutputsApi {
    public final S3RoleBasedApi s3RoleBased;

    public OutputsApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.s3RoleBased = new S3RoleBasedApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of OutputsApi
     */
    public static BitmovinApiBuilder<OutputsApi> builder() {
        return new BitmovinApiBuilder<>(OutputsApi.class);
    }
    
    
}
