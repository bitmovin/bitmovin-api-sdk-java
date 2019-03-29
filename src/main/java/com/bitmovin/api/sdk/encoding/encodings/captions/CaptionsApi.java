package com.bitmovin.api.sdk.encoding.encodings.captions;

import com.bitmovin.api.sdk.common.BitmovinApiBuilder;
import com.bitmovin.api.sdk.common.BitmovinApiClientFactory;
import com.bitmovin.api.sdk.encoding.encodings.captions.cea.CeaApi;
import com.bitmovin.api.sdk.encoding.encodings.captions.webvtt.WebvttApi;
import com.bitmovin.api.sdk.encoding.encodings.captions.ttml.TtmlApi;
import com.bitmovin.api.sdk.encoding.encodings.captions.scc.SccApi;

public class CaptionsApi {
    public final CeaApi cea;
    public final WebvttApi webvtt;
    public final TtmlApi ttml;
    public final SccApi scc;

    public CaptionsApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.cea = new CeaApi(clientFactory);
        this.webvtt = new WebvttApi(clientFactory);
        this.ttml = new TtmlApi(clientFactory);
        this.scc = new SccApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of CaptionsApi
     */
    public static BitmovinApiBuilder<CaptionsApi> builder() {
        return new BitmovinApiBuilder<>(CaptionsApi.class);
    }
    
    
}
