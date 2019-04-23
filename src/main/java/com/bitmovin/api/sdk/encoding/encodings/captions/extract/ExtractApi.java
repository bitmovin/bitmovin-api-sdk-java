package com.bitmovin.api.sdk.encoding.encodings.captions.extract;

import com.bitmovin.api.sdk.common.BitmovinApiBuilder;
import com.bitmovin.api.sdk.common.BitmovinApiClientFactory;
import com.bitmovin.api.sdk.encoding.encodings.captions.extract.cea.CeaApi;
import com.bitmovin.api.sdk.encoding.encodings.captions.extract.dvbsub.DvbsubApi;
import com.bitmovin.api.sdk.encoding.encodings.captions.extract.ttml.TtmlApi;
import com.bitmovin.api.sdk.encoding.encodings.captions.extract.webvtt.WebvttApi;

public class ExtractApi {
    public final CeaApi cea;
    public final DvbsubApi dvbsub;
    public final TtmlApi ttml;
    public final WebvttApi webvtt;

    public ExtractApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.cea = new CeaApi(clientFactory);
        this.dvbsub = new DvbsubApi(clientFactory);
        this.ttml = new TtmlApi(clientFactory);
        this.webvtt = new WebvttApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of ExtractApi
     */
    public static BitmovinApiBuilder<ExtractApi> builder() {
        return new BitmovinApiBuilder<>(ExtractApi.class);
    }
    
    
}
