package com.bitmovin.api.sdk.encoding.statistics.cdn;

import com.bitmovin.api.sdk.common.BitmovinApiBuilder;
import com.bitmovin.api.sdk.common.BitmovinApiClientFactory;
import com.bitmovin.api.sdk.encoding.statistics.cdn.usage.UsageApi;

public class CdnApi {
    public final UsageApi usage;

    public CdnApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.usage = new UsageApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of CdnApi
     */
    public static BitmovinApiBuilder<CdnApi> builder() {
        return new BitmovinApiBuilder<>(CdnApi.class);
    }

    
}
