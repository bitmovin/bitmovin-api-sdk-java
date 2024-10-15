package com.bitmovin.api.sdk.encoding.configurations.video;

import com.bitmovin.api.sdk.common.BitmovinApiBuilder;
import com.bitmovin.api.sdk.common.BitmovinApiClientFactory;
import com.bitmovin.api.sdk.encoding.configurations.video.h262.H262Api;
import com.bitmovin.api.sdk.encoding.configurations.video.h264.H264Api;
import com.bitmovin.api.sdk.encoding.configurations.video.h265.H265Api;
import com.bitmovin.api.sdk.encoding.configurations.video.vp8.Vp8Api;
import com.bitmovin.api.sdk.encoding.configurations.video.vp9.Vp9Api;
import com.bitmovin.api.sdk.encoding.configurations.video.av1.Av1Api;
import com.bitmovin.api.sdk.encoding.configurations.video.mjpeg.MjpegApi;

public class VideoApi {
    public final H262Api h262;
    public final H264Api h264;
    public final H265Api h265;
    public final Vp8Api vp8;
    public final Vp9Api vp9;
    public final Av1Api av1;
    public final MjpegApi mjpeg;

    public VideoApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.h262 = new H262Api(clientFactory);
        this.h264 = new H264Api(clientFactory);
        this.h265 = new H265Api(clientFactory);
        this.vp8 = new Vp8Api(clientFactory);
        this.vp9 = new Vp9Api(clientFactory);
        this.av1 = new Av1Api(clientFactory);
        this.mjpeg = new MjpegApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of VideoApi
     */
    public static BitmovinApiBuilder<VideoApi> builder() {
        return new BitmovinApiBuilder<>(VideoApi.class);
    }

}
