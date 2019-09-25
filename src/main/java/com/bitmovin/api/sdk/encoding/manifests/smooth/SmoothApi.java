package com.bitmovin.api.sdk.encoding.manifests.smooth;

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
import com.bitmovin.api.sdk.common.BitmovinApiBuilder;
import com.bitmovin.api.sdk.common.BitmovinApiClientFactory;
import com.bitmovin.api.sdk.encoding.manifests.smooth.defaultapi.DefaultApi;
import com.bitmovin.api.sdk.encoding.manifests.smooth.customdata.CustomdataApi;
import com.bitmovin.api.sdk.encoding.manifests.smooth.representations.RepresentationsApi;
import com.bitmovin.api.sdk.encoding.manifests.smooth.contentprotection.ContentprotectionApi;

public class SmoothApi {
    public final DefaultApi defaultapi;
    public final CustomdataApi customdata;
    public final RepresentationsApi representations;
    public final ContentprotectionApi contentprotection;

    private final SmoothApiClient apiClient;

    public SmoothApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(SmoothApiClient.class);

        this.defaultapi = new DefaultApi(clientFactory);
        this.customdata = new CustomdataApi(clientFactory);
        this.representations = new RepresentationsApi(clientFactory);
        this.contentprotection = new ContentprotectionApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of SmoothApi
     */
    public static BitmovinApiBuilder<SmoothApi> builder() {
        return new BitmovinApiBuilder<>(SmoothApi.class);
    }
    
    /**
     * Create Smooth Streaming Manifest
     * 
     * @param smoothStreamingManifest The Smooth Streaming Manifest to be created (required)
     * @return SmoothStreamingManifest
     * @throws BitmovinException if fails to make API call
     */
    public SmoothStreamingManifest create(SmoothStreamingManifest smoothStreamingManifest) throws BitmovinException {
        try {
            return this.apiClient.create(smoothStreamingManifest).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * Delete Smooth Streaming Manifest
     * 
     * @param manifestId Id of the Smooth Streaming manifest. (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse delete(String manifestId) throws BitmovinException {
        try {
            return this.apiClient.delete(manifestId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * Smooth Streaming Manifest Details
     * 
     * @param manifestId Id of the Smooth Streaming manifest. (required)
     * @return SmoothStreamingManifest
     * @throws BitmovinException if fails to make API call
     */
    public SmoothStreamingManifest get(String manifestId) throws BitmovinException {
        try {
            return this.apiClient.get(manifestId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * List Smooth Streaming Manifests
     * 
     * @return List&lt;SmoothStreamingManifest&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<SmoothStreamingManifest> list() throws BitmovinException {
        try {
            return this.apiClient.list(new HashMap<String, Object>()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * List Smooth Streaming Manifests
     * 
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;SmoothStreamingManifest&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<SmoothStreamingManifest> list(SmoothStreamingManifestListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(queryParams).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * Start Smooth Streaming Manifest Creation
     * 
     * @param manifestId Id of the Smooth Streaming manifest. (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse start(String manifestId) throws BitmovinException {
        try {
            return this.apiClient.start(manifestId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * Smooth Streaming Manifest Creation Status
     * 
     * @param manifestId Id of the Smooth Streaming manifest. (required)
     * @return Task
     * @throws BitmovinException if fails to make API call
     */
    public Task status(String manifestId) throws BitmovinException {
        try {
            return this.apiClient.status(manifestId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * Stop Smooth Streaming Manifest Creation
     * 
     * @param manifestId Id of the Smooth Streaming manifest. (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse stop(String manifestId) throws BitmovinException {
        try {
            return this.apiClient.stop(manifestId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    interface SmoothApiClient {
    
        @RequestLine("POST /encoding/manifests/smooth")
        ResponseEnvelope<SmoothStreamingManifest> create(SmoothStreamingManifest smoothStreamingManifest) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/manifests/smooth/{manifest_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "manifest_id") String manifestId) throws BitmovinException;
    
        @RequestLine("GET /encoding/manifests/smooth/{manifest_id}")
        ResponseEnvelope<SmoothStreamingManifest> get(@Param(value = "manifest_id") String manifestId) throws BitmovinException;
    
        @RequestLine("GET /encoding/manifests/smooth")
        ResponseEnvelope<PaginationResponse<SmoothStreamingManifest>> list(@QueryMap Map<String, Object> queryParams) throws BitmovinException;
    
        @Headers("Content-Type: text/plain")
        @Body(" ")
        @RequestLine("POST /encoding/manifests/smooth/{manifest_id}/start")
        ResponseEnvelope<BitmovinResponse> start(@Param(value = "manifest_id") String manifestId) throws BitmovinException;
    
        @RequestLine("GET /encoding/manifests/smooth/{manifest_id}/status")
        ResponseEnvelope<Task> status(@Param(value = "manifest_id") String manifestId) throws BitmovinException;
    
        @Headers("Content-Type: text/plain")
        @Body(" ")
        @RequestLine("POST /encoding/manifests/smooth/{manifest_id}/stop")
        ResponseEnvelope<BitmovinResponse> stop(@Param(value = "manifest_id") String manifestId) throws BitmovinException;
    }
}
