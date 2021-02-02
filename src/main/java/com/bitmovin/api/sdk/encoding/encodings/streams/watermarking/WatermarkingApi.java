package com.bitmovin.api.sdk.encoding.encodings.streams.watermarking;

import com.bitmovin.api.sdk.common.BitmovinApiBuilder;
import com.bitmovin.api.sdk.common.BitmovinApiClientFactory;
import com.bitmovin.api.sdk.encoding.encodings.streams.watermarking.nexguardFileMarker.NexguardFileMarkerApi;

public class WatermarkingApi {
    public final NexguardFileMarkerApi nexguardFileMarker;

    public WatermarkingApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.nexguardFileMarker = new NexguardFileMarkerApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of WatermarkingApi
     */
    public static BitmovinApiBuilder<WatermarkingApi> builder() {
        return new BitmovinApiBuilder<>(WatermarkingApi.class);
    }
    
    
}
