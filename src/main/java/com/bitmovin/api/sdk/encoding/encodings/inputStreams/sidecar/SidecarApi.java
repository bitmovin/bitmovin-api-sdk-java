package com.bitmovin.api.sdk.encoding.encodings.inputStreams.sidecar;

import com.bitmovin.api.sdk.common.BitmovinApiBuilder;
import com.bitmovin.api.sdk.common.BitmovinApiClientFactory;
import com.bitmovin.api.sdk.encoding.encodings.inputStreams.sidecar.dolbyVisionMetadataIngest.DolbyVisionMetadataIngestApi;

public class SidecarApi {
    public final DolbyVisionMetadataIngestApi dolbyVisionMetadataIngest;

    public SidecarApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.dolbyVisionMetadataIngest = new DolbyVisionMetadataIngestApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of SidecarApi
     */
    public static BitmovinApiBuilder<SidecarApi> builder() {
        return new BitmovinApiBuilder<>(SidecarApi.class);
    }
    
    
}
