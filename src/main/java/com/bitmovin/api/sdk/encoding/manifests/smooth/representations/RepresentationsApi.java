package com.bitmovin.api.sdk.encoding.manifests.smooth.representations;

import com.bitmovin.api.sdk.common.BitmovinApiBuilder;
import com.bitmovin.api.sdk.common.BitmovinApiClientFactory;
import com.bitmovin.api.sdk.encoding.manifests.smooth.representations.mp4.Mp4Api;

public class RepresentationsApi {
    public final Mp4Api mp4;

    public RepresentationsApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.mp4 = new Mp4Api(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of RepresentationsApi
     */
    public static BitmovinApiBuilder<RepresentationsApi> builder() {
        return new BitmovinApiBuilder<>(RepresentationsApi.class);
    }

}
