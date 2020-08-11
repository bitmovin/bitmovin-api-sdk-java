package com.bitmovin.api.sdk.encoding.encodings.inputStreams.subtitles;

import com.bitmovin.api.sdk.common.BitmovinApiBuilder;
import com.bitmovin.api.sdk.common.BitmovinApiClientFactory;
import com.bitmovin.api.sdk.encoding.encodings.inputStreams.subtitles.dvbSubtitle.DvbSubtitleApi;
import com.bitmovin.api.sdk.encoding.encodings.inputStreams.subtitles.dvbTeletext.DvbTeletextApi;

public class SubtitlesApi {
    public final DvbSubtitleApi dvbSubtitle;
    public final DvbTeletextApi dvbTeletext;

    public SubtitlesApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.dvbSubtitle = new DvbSubtitleApi(clientFactory);
        this.dvbTeletext = new DvbTeletextApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of SubtitlesApi
     */
    public static BitmovinApiBuilder<SubtitlesApi> builder() {
        return new BitmovinApiBuilder<>(SubtitlesApi.class);
    }
    
    
}
