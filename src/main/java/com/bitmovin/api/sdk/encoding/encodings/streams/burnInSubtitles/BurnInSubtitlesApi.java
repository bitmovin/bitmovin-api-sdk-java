package com.bitmovin.api.sdk.encoding.encodings.streams.burnInSubtitles;

import com.bitmovin.api.sdk.common.BitmovinApiBuilder;
import com.bitmovin.api.sdk.common.BitmovinApiClientFactory;
import com.bitmovin.api.sdk.encoding.encodings.streams.burnInSubtitles.dvbsub.DvbsubApi;
import com.bitmovin.api.sdk.encoding.encodings.streams.burnInSubtitles.srt.SrtApi;

public class BurnInSubtitlesApi {
    public final DvbsubApi dvbsub;
    public final SrtApi srt;

    public BurnInSubtitlesApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.dvbsub = new DvbsubApi(clientFactory);
        this.srt = new SrtApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of BurnInSubtitlesApi
     */
    public static BitmovinApiBuilder<BurnInSubtitlesApi> builder() {
        return new BitmovinApiBuilder<>(BurnInSubtitlesApi.class);
    }
    
    
}
