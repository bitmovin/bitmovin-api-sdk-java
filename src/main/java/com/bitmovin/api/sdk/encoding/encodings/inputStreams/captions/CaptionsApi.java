package com.bitmovin.api.sdk.encoding.encodings.inputStreams.captions;

import com.bitmovin.api.sdk.common.BitmovinApiBuilder;
import com.bitmovin.api.sdk.common.BitmovinApiClientFactory;
import com.bitmovin.api.sdk.encoding.encodings.inputStreams.captions.cea608.Cea608Api;
import com.bitmovin.api.sdk.encoding.encodings.inputStreams.captions.cea708.Cea708Api;

public class CaptionsApi {
    public final Cea608Api cea608;
    public final Cea708Api cea708;

    public CaptionsApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.cea608 = new Cea608Api(clientFactory);
        this.cea708 = new Cea708Api(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of CaptionsApi
     */
    public static BitmovinApiBuilder<CaptionsApi> builder() {
        return new BitmovinApiBuilder<>(CaptionsApi.class);
    }
    
    
}
