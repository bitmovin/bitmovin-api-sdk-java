package com.bitmovin.api.sdk.encoding.encodings.inputStreams.trimming;

import com.bitmovin.api.sdk.common.BitmovinApiBuilder;
import com.bitmovin.api.sdk.common.BitmovinApiClientFactory;
import com.bitmovin.api.sdk.encoding.encodings.inputStreams.trimming.timeBased.TimeBasedApi;
import com.bitmovin.api.sdk.encoding.encodings.inputStreams.trimming.timecodeTrack.TimecodeTrackApi;
import com.bitmovin.api.sdk.encoding.encodings.inputStreams.trimming.h264PictureTiming.H264PictureTimingApi;

public class TrimmingApi {
    public final TimeBasedApi timeBased;
    public final TimecodeTrackApi timecodeTrack;
    public final H264PictureTimingApi h264PictureTiming;

    public TrimmingApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.timeBased = new TimeBasedApi(clientFactory);
        this.timecodeTrack = new TimecodeTrackApi(clientFactory);
        this.h264PictureTiming = new H264PictureTimingApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of TrimmingApi
     */
    public static BitmovinApiBuilder<TrimmingApi> builder() {
        return new BitmovinApiBuilder<>(TrimmingApi.class);
    }

    
}
