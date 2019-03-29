package com.bitmovin.api.sdk.encoding.encodings.streams.subtitles;

import com.bitmovin.api.sdk.common.BitmovinApiBuilder;
import com.bitmovin.api.sdk.common.BitmovinApiClientFactory;
import com.bitmovin.api.sdk.encoding.encodings.streams.subtitles.dvbsub.DvbsubApi;

public class SubtitlesApi {
    public final DvbsubApi dvbsub;

    public SubtitlesApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.dvbsub = new DvbsubApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of SubtitlesApi
     */
    public static BitmovinApiBuilder<SubtitlesApi> builder() {
        return new BitmovinApiBuilder<>(SubtitlesApi.class);
    }
    
    
}
