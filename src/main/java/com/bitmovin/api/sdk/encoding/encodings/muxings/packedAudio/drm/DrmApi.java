package com.bitmovin.api.sdk.encoding.encodings.muxings.packedAudio.drm;

import com.bitmovin.api.sdk.common.BitmovinApiBuilder;
import com.bitmovin.api.sdk.common.BitmovinApiClientFactory;
import com.bitmovin.api.sdk.encoding.encodings.muxings.packedAudio.drm.aes.AesApi;

public class DrmApi {
    public final AesApi aes;

    public DrmApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.aes = new AesApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of DrmApi
     */
    public static BitmovinApiBuilder<DrmApi> builder() {
        return new BitmovinApiBuilder<>(DrmApi.class);
    }

}
