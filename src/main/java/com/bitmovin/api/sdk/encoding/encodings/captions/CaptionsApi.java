package com.bitmovin.api.sdk.encoding.encodings.captions;

import com.bitmovin.api.sdk.common.BitmovinApiBuilder;
import com.bitmovin.api.sdk.common.BitmovinApiClientFactory;
import com.bitmovin.api.sdk.encoding.encodings.captions.scc.SccApi;

public class CaptionsApi {
    public final SccApi scc;

    public CaptionsApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.scc = new SccApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of CaptionsApi
     */
    public static BitmovinApiBuilder<CaptionsApi> builder() {
        return new BitmovinApiBuilder<>(CaptionsApi.class);
    }

    
}
