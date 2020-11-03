package com.bitmovin.api.sdk.encoding.manifests.hls.defaultapi;

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
     * Create HLS Manifest Default
     * 
     * @param hlsManifestDefault The HLS Manifest to be created (required)
     * @return HlsManifestDefault
     * @throws BitmovinException if fails to make API call
     */
    public HlsManifestDefault create(HlsManifestDefault hlsManifestDefault) throws BitmovinException {
        try {
            return this.apiClient.create(hlsManifestDefault).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    interface DefaultApiClient {
    
        @RequestLine("POST /encoding/manifests/hls/default")
        ResponseEnvelope<HlsManifestDefault> create(HlsManifestDefault hlsManifestDefault) throws BitmovinException;
    }
}
