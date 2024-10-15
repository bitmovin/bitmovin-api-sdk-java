package com.bitmovin.api.sdk.encoding.encodings.streams.captions.cea;

import com.bitmovin.api.sdk.common.BitmovinApiBuilder;
import com.bitmovin.api.sdk.common.BitmovinApiClientFactory;
import com.bitmovin.api.sdk.encoding.encodings.streams.captions.cea.scc.SccApi;
import com.bitmovin.api.sdk.encoding.encodings.streams.captions.cea.srt.SrtApi;

public class CeaApi {
    public final SccApi scc;
    public final SrtApi srt;

    public CeaApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.scc = new SccApi(clientFactory);
        this.srt = new SrtApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of CeaApi
     */
    public static BitmovinApiBuilder<CeaApi> builder() {
        return new BitmovinApiBuilder<>(CeaApi.class);
    }

}
