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
import static com.bitmovin.api.sdk.common.BitmovinExceptionFactory.buildBitmovinException;
import com.bitmovin.api.sdk.common.BitmovinDateExpander;
import com.bitmovin.api.sdk.common.QueryMapWrapper;
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
     * Create Custom HLS Manifest
     * 
     * @param hlsManifest A Custom HLS Manifest gives you full control over its contents. Add Variant Streams and Media elements via the respective endpoints. If you need a simpler solution, create a Default Manifest instead. See TODO: link (required)
     * @return HlsManifest
     * @throws BitmovinException if fails to make API call
     */
    public HlsManifest create(HlsManifest hlsManifest) throws BitmovinException {
        try {
            return this.apiClient.create(hlsManifest).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * Delete HLS Manifest
     * 
     * @param manifestId Id of the HLS Manifest. (required)
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
     * HLS Manifest Details
     * 
     * @param manifestId Id of the HLS Manifest. (required)
     * @return HlsManifest
     * @throws BitmovinException if fails to make API call
     */
    public HlsManifest get(String manifestId) throws BitmovinException {
        try {
            return this.apiClient.get(manifestId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * Manifest Start Details
     * 
     * @param manifestId ID of the manifest (required)
     * @return StartManifestRequest
     * @throws BitmovinException if fails to make API call
     */
    public StartManifestRequest getStartRequest(String manifestId) throws BitmovinException {
        try {
            return this.apiClient.getStartRequest(manifestId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * List HLS Manifests
     * 
     * @return List&lt;HlsManifest&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<HlsManifest> list() throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * List HLS Manifests
     * 
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;HlsManifest&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<HlsManifest> list(HlsManifestListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * Start HLS Manifest Creation
     * 
     * @param manifestId Id of the HLS Manifest. (required)
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
     * Start HLS Manifest Creation
     * 
     * @param manifestId Id of the HLS Manifest. (required)
     * @param startManifestRequest Manifest Startup Options (optional)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse start(String manifestId, StartManifestRequest startManifestRequest) throws BitmovinException {
        try {
            return this.apiClient.start(manifestId, startManifestRequest).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * HLS Manifest Creation Status
     * 
     * @param manifestId Id of the HLS Manifest. (required)
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
     * Stop HLS Manifest Creation
     * 
     * @param manifestId Id of the HLS Manifest. (required)
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

    interface HlsApiClient {

        @RequestLine("POST /encoding/manifests/hls")
        ResponseEnvelope<HlsManifest> create(HlsManifest hlsManifest) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/manifests/hls/{manifest_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "manifest_id") String manifestId) throws BitmovinException;
    
        @RequestLine("GET /encoding/manifests/hls/{manifest_id}")
        ResponseEnvelope<HlsManifest> get(@Param(value = "manifest_id") String manifestId) throws BitmovinException;
    
        @RequestLine("GET /encoding/manifests/hls/{manifest_id}/start")
        ResponseEnvelope<StartManifestRequest> getStartRequest(@Param(value = "manifest_id") String manifestId) throws BitmovinException;
    
        @RequestLine("GET /encoding/manifests/hls")
        ResponseEnvelope<PaginationResponse<HlsManifest>> list(@QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    
        @RequestLine("POST /encoding/manifests/hls/{manifest_id}/start")
        ResponseEnvelope<BitmovinResponse> start(@Param(value = "manifest_id") String manifestId) throws BitmovinException;

        @RequestLine("POST /encoding/manifests/hls/{manifest_id}/start")
        ResponseEnvelope<BitmovinResponse> start(@Param(value = "manifest_id") String manifestId, StartManifestRequest startManifestRequest) throws BitmovinException;
    
        @RequestLine("GET /encoding/manifests/hls/{manifest_id}/status")
        ResponseEnvelope<Task> status(@Param(value = "manifest_id") String manifestId) throws BitmovinException;
    
        @RequestLine("POST /encoding/manifests/hls/{manifest_id}/stop")
        ResponseEnvelope<BitmovinResponse> stop(@Param(value = "manifest_id") String manifestId) throws BitmovinException;
    }
}
