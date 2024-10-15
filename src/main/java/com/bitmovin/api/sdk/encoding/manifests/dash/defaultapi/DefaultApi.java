package com.bitmovin.api.sdk.encoding.manifests.dash.defaultapi;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import feign.Param;
import feign.QueryMap;
import feign.RequestLine;
import feign.Body;
import feign.Headers;

import com.bitmovin.api.sdk.model.*;
import com.bitmovin.api.sdk.common.BitmovinException;
import static com.bitmovin.api.sdk.common.BitmovinExceptionFactory.buildBitmovinException;
import com.bitmovin.api.sdk.common.BitmovinDateExpander;
import com.bitmovin.api.sdk.common.QueryMapWrapper;
import com.bitmovin.api.sdk.common.BitmovinApiBuilder;
import com.bitmovin.api.sdk.common.BitmovinApiClientFactory;

public class DefaultApi {

    private final DefaultApiClient apiClient;

    public DefaultApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(DefaultApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of DefaultApi
     */
    public static BitmovinApiBuilder<DefaultApi> builder() {
        return new BitmovinApiBuilder<>(DefaultApi.class);
    }
    /**
     * Create Default DASH Manifest
     * A Default Manifest is the easiest way to create a manifest file. Its contents will be configured automatically, depending on what output your encoding creates (muxings, thumbnails, sprites, subtitles, DRM information). If you need more control, create a Custom Manifest resource instead. See [documentation](https://developer.bitmovin.com/encoding/docs/default-vs-custom-manifest) page for a comparison
     * @param dashManifestDefault The Default DASH Manifest to be created. (required)
     * @return DashManifestDefault
     * @throws BitmovinException if fails to make API call
     */
    public DashManifestDefault create(DashManifestDefault dashManifestDefault) throws BitmovinException {
        try {
            return this.apiClient.create(dashManifestDefault).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface DefaultApiClient { 
        @RequestLine("POST /encoding/manifests/dash/default")
        ResponseEnvelope<DashManifestDefault> create(DashManifestDefault dashManifestDefault) throws BitmovinException;
    }
}
