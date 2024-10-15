package com.bitmovin.api.sdk.encoding.manifests.hls.media;

import com.bitmovin.api.sdk.common.BitmovinApiBuilder;
import com.bitmovin.api.sdk.common.BitmovinApiClientFactory;
import com.bitmovin.api.sdk.encoding.manifests.hls.media.customTags.CustomTagsApi;
import com.bitmovin.api.sdk.encoding.manifests.hls.media.type.TypeApi;
import com.bitmovin.api.sdk.encoding.manifests.hls.media.video.VideoApi;
import com.bitmovin.api.sdk.encoding.manifests.hls.media.audio.AudioApi;
import com.bitmovin.api.sdk.encoding.manifests.hls.media.subtitles.SubtitlesApi;
import com.bitmovin.api.sdk.encoding.manifests.hls.media.vtt.VttApi;
import com.bitmovin.api.sdk.encoding.manifests.hls.media.closedCaptions.ClosedCaptionsApi;

public class MediaApi {
    public final CustomTagsApi customTags;
    public final TypeApi type;
    public final VideoApi video;
    public final AudioApi audio;
    public final SubtitlesApi subtitles;
    public final VttApi vtt;
    public final ClosedCaptionsApi closedCaptions;

    public MediaApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.customTags = new CustomTagsApi(clientFactory);
        this.type = new TypeApi(clientFactory);
        this.video = new VideoApi(clientFactory);
        this.audio = new AudioApi(clientFactory);
        this.subtitles = new SubtitlesApi(clientFactory);
        this.vtt = new VttApi(clientFactory);
        this.closedCaptions = new ClosedCaptionsApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of MediaApi
     */
    public static BitmovinApiBuilder<MediaApi> builder() {
        return new BitmovinApiBuilder<>(MediaApi.class);
    }

}
