package com.bitmovin.api.sdk.encoding.encodings.sidecars.webvtt;

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

public class WebvttApi {

    private final WebvttApiClient apiClient;

    public WebvttApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(WebvttApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of WebvttApi
     */
    public static BitmovinApiBuilder<WebvttApi> builder() {
        return new BitmovinApiBuilder<>(WebvttApi.class);
    }
    
    /**
     * Add WebVTT sidecar file
     * 
     * @param encodingId Id of the encoding. (required)
     * @param webVttSidecarFile The WebVTT Sidecar file to be added (required)
     * @return WebVttSidecarFile
     * @throws BitmovinException if fails to make API call
     */
    public WebVttSidecarFile create(String encodingId, WebVttSidecarFile webVttSidecarFile) throws BitmovinException {
        try {
            return this.apiClient.create(encodingId, webVttSidecarFile).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
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
        try {
            return this.apiClient.delete(encodingId, sidecarId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * WebVTT Sidecar Details
     * 
     * @param encodingId Id of the encoding. (required)
     * @param sidecarId Id of the sidecar. (required)
     * @return WebVttSidecarFile
     * @throws BitmovinException if fails to make API call
     */
    public WebVttSidecarFile get(String encodingId, String sidecarId) throws BitmovinException {
        try {
            return this.apiClient.get(encodingId, sidecarId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * List WebVTT sidecar files
     * 
     * @param encodingId Id of the encoding. (required)
     * @return List&lt;WebVttSidecarFile&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<WebVttSidecarFile> list(String encodingId) throws BitmovinException {
        try {
            return this.apiClient.list(encodingId, new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * List WebVTT sidecar files
     * 
     * @param encodingId Id of the encoding. (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;WebVttSidecarFile&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<WebVttSidecarFile> list(String encodingId, WebVttSidecarFileListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(encodingId, new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    interface WebvttApiClient {
    
        @RequestLine("POST /encoding/encodings/{encoding_id}/sidecars/webvtt")
        ResponseEnvelope<WebVttSidecarFile> create(@Param(value = "encoding_id") String encodingId, WebVttSidecarFile webVttSidecarFile) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/encodings/{encoding_id}/sidecars/webvtt/{sidecar_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "encoding_id") String encodingId, @Param(value = "sidecar_id") String sidecarId) throws BitmovinException;
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/sidecars/webvtt/{sidecar_id}")
        ResponseEnvelope<WebVttSidecarFile> get(@Param(value = "encoding_id") String encodingId, @Param(value = "sidecar_id") String sidecarId) throws BitmovinException;
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/sidecars/webvtt")
        ResponseEnvelope<PaginationResponse<WebVttSidecarFile>> list(@Param(value = "encoding_id") String encodingId, @QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    }
}
