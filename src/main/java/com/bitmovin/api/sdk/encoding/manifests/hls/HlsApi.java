package com.bitmovin.api.sdk.encoding.manifests.hls;

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
import com.bitmovin.api.sdk.encoding.manifests.hls.defaultapi.DefaultApi;
import com.bitmovin.api.sdk.encoding.manifests.hls.customdata.CustomdataApi;
import com.bitmovin.api.sdk.encoding.manifests.hls.streams.StreamsApi;
import com.bitmovin.api.sdk.encoding.manifests.hls.media.MediaApi;

public class HlsApi {
    public final DefaultApi defaultapi;
    public final CustomdataApi customdata;
    public final StreamsApi streams;
    public final MediaApi media;

    private final HlsApiClient apiClient;

    public HlsApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(HlsApiClient.class);

        this.defaultapi = new DefaultApi(clientFactory);
        this.customdata = new CustomdataApi(clientFactory);
        this.streams = new StreamsApi(clientFactory);
        this.media = new MediaApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of HlsApi
     */
    public static BitmovinApiBuilder<HlsApi> builder() {
        return new BitmovinApiBuilder<>(HlsApi.class);
    }
    
    /**
     * Create HLS Manifest
     * 
     * @param hlsManifest The HLS Manifest to be created (required)
     * @return HlsManifest
     * @throws BitmovinException if fails to make API call
     */
    public HlsManifest create(HlsManifest hlsManifest) throws BitmovinException {
        return this.apiClient.create(hlsManifest).getData().getResult();
    }
    
    /**
     * Delete HLS Manifest
     * 
     * @param manifestId Id of the hls manifest. (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse delete(String manifestId) throws BitmovinException {
        return this.apiClient.delete(manifestId).getData().getResult();
    }
    
    /**
     * HLS Manifest Details
     * 
     * @param manifestId Id of the hls manifest. (required)
     * @return HlsManifest
     * @throws BitmovinException if fails to make API call
     */
    public HlsManifest get(String manifestId) throws BitmovinException {
        return this.apiClient.get(manifestId).getData().getResult();
    }
    
    /**
     * List HLS Manifests
     * 
     * @return List&lt;HlsManifest&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<HlsManifest> list() throws BitmovinException {
        return this.apiClient.list(new HashMap<String, Object>()).getData().getResult();
    }
    /**
     * List HLS Manifests
     * 
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;HlsManifest&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<HlsManifest> list(HlsManifestListQueryParams queryParams) throws BitmovinException {
        return this.apiClient.list(queryParams).getData().getResult();
    }
    
    /**
     * Start HLS Manifest Creation
     * 
     * @param manifestId Id of the HLS manifest. (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse start(String manifestId) throws BitmovinException {
        return this.apiClient.start(manifestId).getData().getResult();
    }
    
    /**
     * HLS Manifest Creation Status
     * 
     * @param manifestId Id of the HLS manifest. (required)
     * @return Task
     * @throws BitmovinException if fails to make API call
     */
    public Task status(String manifestId) throws BitmovinException {
        return this.apiClient.status(manifestId).getData().getResult();
    }
    
    /**
     * Stop HLS Manifest Creation
     * 
     * @param manifestId Id of the HLS manifest. (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse stop(String manifestId) throws BitmovinException {
        return this.apiClient.stop(manifestId).getData().getResult();
    }
    
    interface HlsApiClient {
    
        @RequestLine("POST /encoding/manifests/hls")
        ResponseEnvelope<HlsManifest> create(HlsManifest hlsManifest) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/manifests/hls/{manifest_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "manifest_id") String manifestId) throws BitmovinException;
    
        @RequestLine("GET /encoding/manifests/hls/{manifest_id}")
        ResponseEnvelope<HlsManifest> get(@Param(value = "manifest_id") String manifestId) throws BitmovinException;
    
        @RequestLine("GET /encoding/manifests/hls")
        ResponseEnvelope<PaginationResponse<HlsManifest>> list(@QueryMap Map<String, Object> queryParams) throws BitmovinException;
    
        @Headers("Content-Type: text/plain")
        @Body(" ")
        @RequestLine("POST /encoding/manifests/hls/{manifest_id}/start")
        ResponseEnvelope<BitmovinResponse> start(@Param(value = "manifest_id") String manifestId) throws BitmovinException;
    
        @RequestLine("GET /encoding/manifests/hls/{manifest_id}/status")
        ResponseEnvelope<Task> status(@Param(value = "manifest_id") String manifestId) throws BitmovinException;
    
        @Headers("Content-Type: text/plain")
        @Body(" ")
        @RequestLine("POST /encoding/manifests/hls/{manifest_id}/stop")
        ResponseEnvelope<BitmovinResponse> stop(@Param(value = "manifest_id") String manifestId) throws BitmovinException;
    }
}
