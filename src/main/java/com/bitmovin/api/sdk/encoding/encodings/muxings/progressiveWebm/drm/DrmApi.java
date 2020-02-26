package com.bitmovin.api.sdk.encoding.encodings.muxings.progressiveWebm.drm;

import com.bitmovin.api.sdk.common.BitmovinApiBuilder;
import com.bitmovin.api.sdk.common.BitmovinApiClientFactory;
import com.bitmovin.api.sdk.encoding.encodings.muxings.progressiveWebm.drm.cenc.CencApi;
import com.bitmovin.api.sdk.encoding.encodings.muxings.progressiveWebm.drm.speke.SpekeApi;

public class DrmApi {
    public final CencApi cenc;
    public final SpekeApi speke;

    public DrmApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.cenc = new CencApi(clientFactory);
        this.speke = new SpekeApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of DrmApi
     */
    public static BitmovinApiBuilder<DrmApi> builder() {
        return new BitmovinApiBuilder<>(DrmApi.class);
    }
    
    
}
