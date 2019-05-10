package com.bitmovin.api.sdk.encoding.encodings.muxings.cmaf.captions;

import com.bitmovin.api.sdk.common.BitmovinApiBuilder;
import com.bitmovin.api.sdk.common.BitmovinApiClientFactory;
import com.bitmovin.api.sdk.encoding.encodings.muxings.cmaf.captions.ttml.TtmlApi;

public class CaptionsApi {
    public final TtmlApi ttml;

    public CaptionsApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.ttml = new TtmlApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of CaptionsApi
     */
    public static BitmovinApiBuilder<CaptionsApi> builder() {
        return new BitmovinApiBuilder<>(CaptionsApi.class);
    }
    
    
}
