package com.bitmovin.api.sdk.encoding.encodings.sidecars;

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
import com.bitmovin.api.sdk.encoding.encodings.sidecars.customdata.CustomdataApi;
import com.bitmovin.api.sdk.encoding.encodings.sidecars.webvtt.WebvttApi;

public class SidecarsApi {
    public final CustomdataApi customdata;
    public final WebvttApi webvtt;

    private final SidecarsApiClient apiClient;

    public SidecarsApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(SidecarsApiClient.class);

        this.customdata = new CustomdataApi(clientFactory);
        this.webvtt = new WebvttApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of SidecarsApi
     */
    public static BitmovinApiBuilder<SidecarsApi> builder() {
        return new BitmovinApiBuilder<>(SidecarsApi.class);
    }
    
    /**
     * Add Sidecar
     * 
     * @param encodingId Id of the encoding. (required)
     * @param sidecarFile The Sidecar to be added (required)
     * @return SidecarFile
     * @throws BitmovinException if fails to make API call
     */
    public SidecarFile create(String encodingId, SidecarFile sidecarFile) throws BitmovinException {
        return this.apiClient.create(encodingId, sidecarFile).getData().getResult();
    }
    
    /**
     * Delete Sidecar
     * 
     * @param encodingId Id of the encoding. (required)
     * @param sidecarId Id of the sidecar. (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse delete(String encodingId, String sidecarId) throws BitmovinException {
        return this.apiClient.delete(encodingId, sidecarId).getData().getResult();
    }
    
    /**
     * Sidecar Details
     * 
     * @param encodingId Id of the encoding. (required)
     * @param sidecarId Id of the sidecar. (required)
     * @return SidecarFile
     * @throws BitmovinException if fails to make API call
     */
    public SidecarFile get(String encodingId, String sidecarId) throws BitmovinException {
        return this.apiClient.get(encodingId, sidecarId).getData().getResult();
    }
    
    /**
     * List Sidecars
     * 
     * @param encodingId Id of the encoding. (required)
     * @return List&lt;SidecarFile&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<SidecarFile> list(String encodingId) throws BitmovinException {
        return this.apiClient.list(encodingId, new HashMap<String, Object>()).getData().getResult();
    }
    /**
     * List Sidecars
     * 
     * @param encodingId Id of the encoding. (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;SidecarFile&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<SidecarFile> list(String encodingId, SidecarFileListQueryParams queryParams) throws BitmovinException {
        return this.apiClient.list(encodingId, queryParams).getData().getResult();
    }
    
    interface SidecarsApiClient {
    
        @RequestLine("POST /encoding/encodings/{encoding_id}/sidecars")
        ResponseEnvelope<SidecarFile> create(@Param(value = "encoding_id") String encodingId, SidecarFile sidecarFile) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/encodings/{encoding_id}/sidecars/{sidecar_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "encoding_id") String encodingId, @Param(value = "sidecar_id") String sidecarId) throws BitmovinException;
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/sidecars/{sidecar_id}")
        ResponseEnvelope<SidecarFile> get(@Param(value = "encoding_id") String encodingId, @Param(value = "sidecar_id") String sidecarId) throws BitmovinException;
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/sidecars")
        ResponseEnvelope<PaginationResponse<SidecarFile>> list(@Param(value = "encoding_id") String encodingId, @QueryMap Map<String, Object> queryParams) throws BitmovinException;
    }
}
