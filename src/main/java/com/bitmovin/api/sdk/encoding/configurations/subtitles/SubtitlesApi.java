package com.bitmovin.api.sdk.encoding.configurations.subtitles;

import com.bitmovin.api.sdk.common.BitmovinApiBuilder;
import com.bitmovin.api.sdk.common.BitmovinApiClientFactory;
import com.bitmovin.api.sdk.encoding.configurations.subtitles.dvbSubtitle.DvbSubtitleApi;
import com.bitmovin.api.sdk.encoding.configurations.subtitles.webvtt.WebvttApi;
import com.bitmovin.api.sdk.encoding.configurations.subtitles.imsc.ImscApi;

public class SubtitlesApi {
    public final DvbSubtitleApi dvbSubtitle;
    public final WebvttApi webvtt;
    public final ImscApi imsc;

    public SubtitlesApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.dvbSubtitle = new DvbSubtitleApi(clientFactory);
        this.webvtt = new WebvttApi(clientFactory);
        this.imsc = new ImscApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of SubtitlesApi
     */
    public static BitmovinApiBuilder<SubtitlesApi> builder() {
        return new BitmovinApiBuilder<>(SubtitlesApi.class);
    }

}
