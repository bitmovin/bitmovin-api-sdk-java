package com.bitmovin.api.sdk.encoding.encodings.streams.hdr;

import com.bitmovin.api.sdk.common.BitmovinApiBuilder;
import com.bitmovin.api.sdk.common.BitmovinApiClientFactory;
import com.bitmovin.api.sdk.encoding.encodings.streams.hdr.dolbyVision.DolbyVisionApi;

public class HdrApi {
    public final DolbyVisionApi dolbyVision;

    public HdrApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.dolbyVision = new DolbyVisionApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of HdrApi
     */
    public static BitmovinApiBuilder<HdrApi> builder() {
        return new BitmovinApiBuilder<>(HdrApi.class);
    }

}
