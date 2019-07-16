package com.bitmovin.api.sdk.player.customBuilds.web;

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
import com.bitmovin.api.sdk.player.customBuilds.web.domains.DomainsApi;
import com.bitmovin.api.sdk.player.customBuilds.web.status.StatusApi;
import com.bitmovin.api.sdk.player.customBuilds.web.download.DownloadApi;

public class WebApi {
    public final DomainsApi domains;
    public final StatusApi status;
    public final DownloadApi download;

    private final WebApiClient apiClient;

    public WebApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(WebApiClient.class);

        this.domains = new DomainsApi(clientFactory);
        this.status = new StatusApi(clientFactory);
        this.download = new DownloadApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of WebApi
     */
    public static BitmovinApiBuilder<WebApi> builder() {
        return new BitmovinApiBuilder<>(WebApi.class);
    }
    
    /**
     * Add Custom Web Player Build
     * 
     * @param customPlayerBuildDetails The Custom Web Player Build to be added (required)
     * @return CustomPlayerBuildDetails
     * @throws BitmovinException if fails to make API call
     */
    public CustomPlayerBuildDetails create(CustomPlayerBuildDetails customPlayerBuildDetails) throws BitmovinException {
        return this.apiClient.create(customPlayerBuildDetails).getData().getResult();
    }
    
    /**
     * Custom Web Player Build Details
     * 
     * @param customBuildId Id of the custom player build (required)
     * @return CustomPlayerBuildStatus
     * @throws BitmovinException if fails to make API call
     */
    public CustomPlayerBuildStatus get(String customBuildId) throws BitmovinException {
        return this.apiClient.get(customBuildId).getData().getResult();
    }
    
    /**
     * List Custom Web Player Builds
     * 
     * @return List&lt;CustomPlayerBuildDetails&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<CustomPlayerBuildDetails> list() throws BitmovinException {
        return this.apiClient.list().getData().getResult();
    }
    
    /**
     * Start Custom Web Player Build
     * 
     * @param customBuildId Id of the custom player build (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse start(String customBuildId) throws BitmovinException {
        return this.apiClient.start(customBuildId).getData().getResult();
    }
    
    interface WebApiClient {
    
        @RequestLine("POST /player/custom-builds/web")
        ResponseEnvelope<CustomPlayerBuildDetails> create(CustomPlayerBuildDetails customPlayerBuildDetails) throws BitmovinException;
    
        @RequestLine("GET /player/custom-builds/web/{custom_build_id}")
        ResponseEnvelope<CustomPlayerBuildStatus> get(@Param(value = "custom_build_id") String customBuildId) throws BitmovinException;
    
        @RequestLine("GET /player/custom-builds/web")
        ResponseEnvelope<PaginationResponse<CustomPlayerBuildDetails>> list() throws BitmovinException;
    
        @Headers("Content-Type: text/plain")
        @Body(" ")
        @RequestLine("POST /player/custom-builds/web/{custom_build_id}/start")
        ResponseEnvelope<BitmovinResponse> start(@Param(value = "custom_build_id") String customBuildId) throws BitmovinException;
    }
}
