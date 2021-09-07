package com.bitmovin.api.sdk.encoding.encodings.streams.qc;

import com.bitmovin.api.sdk.common.BitmovinApiBuilder;
import com.bitmovin.api.sdk.common.BitmovinApiClientFactory;
import com.bitmovin.api.sdk.encoding.encodings.streams.qc.psnr.PsnrApi;

public class QcApi {
    public final PsnrApi psnr;

    public QcApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.psnr = new PsnrApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of QcApi
     */
    public static BitmovinApiBuilder<QcApi> builder() {
        return new BitmovinApiBuilder<>(QcApi.class);
    }

    
}
