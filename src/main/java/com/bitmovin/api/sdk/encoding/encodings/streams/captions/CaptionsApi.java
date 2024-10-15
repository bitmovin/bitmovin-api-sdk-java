package com.bitmovin.api.sdk.encoding.encodings.streams.captions;

import com.bitmovin.api.sdk.common.BitmovinApiBuilder;
import com.bitmovin.api.sdk.common.BitmovinApiClientFactory;
import com.bitmovin.api.sdk.encoding.encodings.streams.captions.cea.CeaApi;

public class CaptionsApi {
    public final CeaApi cea;

    public CaptionsApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.cea = new CeaApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of CaptionsApi
     */
    public static BitmovinApiBuilder<CaptionsApi> builder() {
        return new BitmovinApiBuilder<>(CaptionsApi.class);
    }

}
