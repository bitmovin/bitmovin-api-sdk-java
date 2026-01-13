package com.bitmovin.api.sdk.encoding.encodings.live.esam;

import com.bitmovin.api.sdk.common.BitmovinApiBuilder;
import com.bitmovin.api.sdk.common.BitmovinApiClientFactory;
import com.bitmovin.api.sdk.encoding.encodings.live.esam.mediaPoints.MediaPointsApi;

public class EsamApi {
    public final MediaPointsApi mediaPoints;

    public EsamApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.mediaPoints = new MediaPointsApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of EsamApi
     */
    public static BitmovinApiBuilder<EsamApi> builder() {
        return new BitmovinApiBuilder<>(EsamApi.class);
    }

}
