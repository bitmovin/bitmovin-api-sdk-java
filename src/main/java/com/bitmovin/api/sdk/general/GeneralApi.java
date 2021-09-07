package com.bitmovin.api.sdk.general;

import com.bitmovin.api.sdk.common.BitmovinApiBuilder;
import com.bitmovin.api.sdk.common.BitmovinApiClientFactory;
import com.bitmovin.api.sdk.general.errorDefinitions.ErrorDefinitionsApi;

public class GeneralApi {
    public final ErrorDefinitionsApi errorDefinitions;

    public GeneralApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.errorDefinitions = new ErrorDefinitionsApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of GeneralApi
     */
    public static BitmovinApiBuilder<GeneralApi> builder() {
        return new BitmovinApiBuilder<>(GeneralApi.class);
    }

    
}
