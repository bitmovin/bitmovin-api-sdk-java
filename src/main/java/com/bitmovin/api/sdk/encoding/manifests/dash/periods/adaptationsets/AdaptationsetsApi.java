package com.bitmovin.api.sdk.encoding.manifests.dash.periods.adaptationsets;

import com.bitmovin.api.sdk.common.BitmovinApiBuilder;
import com.bitmovin.api.sdk.common.BitmovinApiClientFactory;
import com.bitmovin.api.sdk.encoding.manifests.dash.periods.adaptationsets.audio.AudioApi;
import com.bitmovin.api.sdk.encoding.manifests.dash.periods.adaptationsets.video.VideoApi;
import com.bitmovin.api.sdk.encoding.manifests.dash.periods.adaptationsets.subtitle.SubtitleApi;
import com.bitmovin.api.sdk.encoding.manifests.dash.periods.adaptationsets.custom.CustomApi;
import com.bitmovin.api.sdk.encoding.manifests.dash.periods.adaptationsets.representations.RepresentationsApi;
import com.bitmovin.api.sdk.encoding.manifests.dash.periods.adaptationsets.contentprotection.ContentprotectionApi;

public class AdaptationsetsApi {
    public final AudioApi audio;
    public final VideoApi video;
    public final SubtitleApi subtitle;
    public final CustomApi custom;
    public final RepresentationsApi representations;
    public final ContentprotectionApi contentprotection;

    public AdaptationsetsApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.audio = new AudioApi(clientFactory);
        this.video = new VideoApi(clientFactory);
        this.subtitle = new SubtitleApi(clientFactory);
        this.custom = new CustomApi(clientFactory);
        this.representations = new RepresentationsApi(clientFactory);
        this.contentprotection = new ContentprotectionApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of AdaptationsetsApi
     */
    public static BitmovinApiBuilder<AdaptationsetsApi> builder() {
        return new BitmovinApiBuilder<>(AdaptationsetsApi.class);
    }
    
    
}
