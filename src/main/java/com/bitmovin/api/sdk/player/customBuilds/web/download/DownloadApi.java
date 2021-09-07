package com.bitmovin.api.sdk.player.customBuilds.web.download;

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

public class DownloadApi {

    private final DownloadApiClient apiClient;

    public DownloadApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(DownloadApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of DownloadApi
     */
    public static BitmovinApiBuilder<DownloadApi> builder() {
        return new BitmovinApiBuilder<>(DownloadApi.class);
    }

    /**
     * Custom Web Player Build Download Link
     * 
     * @param customBuildId Id of the custom player build (required)
     * @return CustomPlayerBuildDownload
     * @throws BitmovinException if fails to make API call
     */
    public CustomPlayerBuildDownload get(String customBuildId) throws BitmovinException {
        try {
            return this.apiClient.get(customBuildId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface DownloadApiClient {

        @RequestLine("GET /player/custom-builds/web/{custom_build_id}/download")
        ResponseEnvelope<CustomPlayerBuildDownload> get(@Param(value = "custom_build_id") String customBuildId) throws BitmovinException;
    }
}
