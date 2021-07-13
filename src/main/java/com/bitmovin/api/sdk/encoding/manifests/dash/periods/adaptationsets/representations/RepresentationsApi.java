package com.bitmovin.api.sdk.encoding.manifests.dash.periods.adaptationsets.representations;

import com.bitmovin.api.sdk.common.BitmovinApiBuilder;
import com.bitmovin.api.sdk.common.BitmovinApiClientFactory;
import com.bitmovin.api.sdk.encoding.manifests.dash.periods.adaptationsets.representations.vtt.VttApi;
import com.bitmovin.api.sdk.encoding.manifests.dash.periods.adaptationsets.representations.imsc.ImscApi;
import com.bitmovin.api.sdk.encoding.manifests.dash.periods.adaptationsets.representations.sprite.SpriteApi;
import com.bitmovin.api.sdk.encoding.manifests.dash.periods.adaptationsets.representations.fmp4.Fmp4Api;
import com.bitmovin.api.sdk.encoding.manifests.dash.periods.adaptationsets.representations.chunkedText.ChunkedTextApi;
import com.bitmovin.api.sdk.encoding.manifests.dash.periods.adaptationsets.representations.cmaf.CmafApi;
import com.bitmovin.api.sdk.encoding.manifests.dash.periods.adaptationsets.representations.mp4.Mp4Api;
import com.bitmovin.api.sdk.encoding.manifests.dash.periods.adaptationsets.representations.webm.WebmApi;
import com.bitmovin.api.sdk.encoding.manifests.dash.periods.adaptationsets.representations.progressiveWebm.ProgressiveWebmApi;

public class RepresentationsApi {
    public final VttApi vtt;
    public final ImscApi imsc;
    public final SpriteApi sprite;
    public final Fmp4Api fmp4;
    public final ChunkedTextApi chunkedText;
    public final CmafApi cmaf;
    public final Mp4Api mp4;
    public final WebmApi webm;
    public final ProgressiveWebmApi progressiveWebm;

    public RepresentationsApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.vtt = new VttApi(clientFactory);
        this.imsc = new ImscApi(clientFactory);
        this.sprite = new SpriteApi(clientFactory);
        this.fmp4 = new Fmp4Api(clientFactory);
        this.chunkedText = new ChunkedTextApi(clientFactory);
        this.cmaf = new CmafApi(clientFactory);
        this.mp4 = new Mp4Api(clientFactory);
        this.webm = new WebmApi(clientFactory);
        this.progressiveWebm = new ProgressiveWebmApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of RepresentationsApi
     */
    public static BitmovinApiBuilder<RepresentationsApi> builder() {
        return new BitmovinApiBuilder<>(RepresentationsApi.class);
    }
    
    
}
