package com.bitmovin.api.sdk.encoding.manifests.dash;

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
import com.bitmovin.api.sdk.encoding.manifests.dash.defaultapi.DefaultApi;
import com.bitmovin.api.sdk.encoding.manifests.dash.customdata.CustomdataApi;
import com.bitmovin.api.sdk.encoding.manifests.dash.periods.PeriodsApi;

public class DashApi {
    public final DefaultApi defaultapi;
    public final CustomdataApi customdata;
    public final PeriodsApi periods;

    private final DashApiClient apiClient;

    public DashApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(DashApiClient.class);

        this.defaultapi = new DefaultApi(clientFactory);
        this.customdata = new CustomdataApi(clientFactory);
        this.periods = new PeriodsApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of DashApi
     */
    public static BitmovinApiBuilder<DashApi> builder() {
        return new BitmovinApiBuilder<>(DashApi.class);
    }

    /**
     * Create DASH Manifest
     * 
     * @param dashManifest The DASH manifest to be created (required)
     * @return DashManifest
     * @throws BitmovinException if fails to make API call
     */
    public DashManifest create(DashManifest dashManifest) throws BitmovinException {
        try {
            return this.apiClient.create(dashManifest).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * Delete DASH Manifest
     * 
     * @param manifestId UUID of the DASH manifest to be deleted (required)
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
     * DASH Manifest Details
     * 
     * @param manifestId UUID of the dash manifest (required)
     * @return DashManifest
     * @throws BitmovinException if fails to make API call
     */
    public DashManifest get(String manifestId) throws BitmovinException {
        try {
            return this.apiClient.get(manifestId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * List DASH Manifests
     * 
     * @return List&lt;DashManifest&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<DashManifest> list() throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * List DASH Manifests
     * 
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;DashManifest&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<DashManifest> list(DashManifestListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * Start DASH Manifest Creation
     * 
     * @param manifestId Id of the DASH manifest. (required)
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
     * Start DASH Manifest Creation
     * 
     * @param manifestId Id of the DASH manifest. (required)
     * @param body Manifest Startup Options (optional)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse start(String manifestId, Object body) throws BitmovinException {
        try {
            return this.apiClient.start(manifestId, body).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * DASH Manifest Creation Status
     * 
     * @param manifestId Id of the DASH manifest. (required)
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
     * Stop DASH Manifest Creation
     * 
     * @param manifestId Id of the DASH manifest. (required)
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

    interface DashApiClient {

        @RequestLine("POST /encoding/manifests/dash")
        ResponseEnvelope<DashManifest> create(DashManifest dashManifest) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/manifests/dash/{manifest_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "manifest_id") String manifestId) throws BitmovinException;
    
        @RequestLine("GET /encoding/manifests/dash/{manifest_id}")
        ResponseEnvelope<DashManifest> get(@Param(value = "manifest_id") String manifestId) throws BitmovinException;
    
        @RequestLine("GET /encoding/manifests/dash")
        ResponseEnvelope<PaginationResponse<DashManifest>> list(@QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    
        @RequestLine("POST /encoding/manifests/dash/{manifest_id}/start")
        ResponseEnvelope<BitmovinResponse> start(@Param(value = "manifest_id") String manifestId) throws BitmovinException;

        @RequestLine("POST /encoding/manifests/dash/{manifest_id}/start")
        ResponseEnvelope<BitmovinResponse> start(@Param(value = "manifest_id") String manifestId, Object body) throws BitmovinException;
    
        @RequestLine("GET /encoding/manifests/dash/{manifest_id}/status")
        ResponseEnvelope<Task> status(@Param(value = "manifest_id") String manifestId) throws BitmovinException;
    
        @RequestLine("POST /encoding/manifests/dash/{manifest_id}/stop")
        ResponseEnvelope<BitmovinResponse> stop(@Param(value = "manifest_id") String manifestId) throws BitmovinException;
    }
}
