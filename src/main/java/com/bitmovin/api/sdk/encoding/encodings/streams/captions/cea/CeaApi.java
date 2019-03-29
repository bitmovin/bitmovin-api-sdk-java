package com.bitmovin.api.sdk.encoding.encodings.streams.captions.cea;

import com.bitmovin.api.sdk.common.BitmovinApiBuilder;
import com.bitmovin.api.sdk.common.BitmovinApiClientFactory;
import com.bitmovin.api.sdk.encoding.encodings.streams.captions.cea.scc.SccApi;

public class CeaApi {
    public final SccApi scc;

    public CeaApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.scc = new SccApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of CeaApi
     */
    public static BitmovinApiBuilder<CeaApi> builder() {
        return new BitmovinApiBuilder<>(CeaApi.class);
    }
    
    
}
