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
import com.bitmovin.api.sdk.common.BitmovinDateExpander;
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
     * Create DASH Manifest Default
     * 
     * @param dashManifestDefault The DASH Manifest Default to be created (optional)
     * @return DashManifestDefault
     * @throws BitmovinException if fails to make API call
     */
    public DashManifestDefault create(DashManifestDefault dashManifestDefault) throws BitmovinException {
        return this.apiClient.create(dashManifestDefault).getData().getResult();
    }
    
    interface DefaultApiClient {
    
        @RequestLine("POST /encoding/manifests/dash/default")
        ResponseEnvelope<DashManifestDefault> create(DashManifestDefault dashManifestDefault) throws BitmovinException;
    }
}
