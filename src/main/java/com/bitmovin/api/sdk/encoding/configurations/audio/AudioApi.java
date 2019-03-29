package com.bitmovin.api.sdk.encoding.configurations.audio;

import com.bitmovin.api.sdk.common.BitmovinApiBuilder;
import com.bitmovin.api.sdk.common.BitmovinApiClientFactory;
import com.bitmovin.api.sdk.encoding.configurations.audio.aac.AacApi;
import com.bitmovin.api.sdk.encoding.configurations.audio.heAacV1.HeAacV1Api;
import com.bitmovin.api.sdk.encoding.configurations.audio.heAacV2.HeAacV2Api;
import com.bitmovin.api.sdk.encoding.configurations.audio.vorbis.VorbisApi;
import com.bitmovin.api.sdk.encoding.configurations.audio.opus.OpusApi;
import com.bitmovin.api.sdk.encoding.configurations.audio.ac3.Ac3Api;
import com.bitmovin.api.sdk.encoding.configurations.audio.eac3.Eac3Api;
import com.bitmovin.api.sdk.encoding.configurations.audio.mp2.Mp2Api;
import com.bitmovin.api.sdk.encoding.configurations.audio.mp3.Mp3Api;

public class AudioApi {
    public final AacApi aac;
    public final HeAacV1Api heAacV1;
    public final HeAacV2Api heAacV2;
    public final VorbisApi vorbis;
    public final OpusApi opus;
    public final Ac3Api ac3;
    public final Eac3Api eac3;
    public final Mp2Api mp2;
    public final Mp3Api mp3;

    public AudioApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.aac = new AacApi(clientFactory);
        this.heAacV1 = new HeAacV1Api(clientFactory);
        this.heAacV2 = new HeAacV2Api(clientFactory);
        this.vorbis = new VorbisApi(clientFactory);
        this.opus = new OpusApi(clientFactory);
        this.ac3 = new Ac3Api(clientFactory);
        this.eac3 = new Eac3Api(clientFactory);
        this.mp2 = new Mp2Api(clientFactory);
        this.mp3 = new Mp3Api(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of AudioApi
     */
    public static BitmovinApiBuilder<AudioApi> builder() {
        return new BitmovinApiBuilder<>(AudioApi.class);
    }
    
    
}
