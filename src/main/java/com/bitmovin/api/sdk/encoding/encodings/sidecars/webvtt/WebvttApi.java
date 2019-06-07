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
import com.bitmovin.api.sdk.common.BitmovinDateExpander;
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
     * @param webVttSidecarFile  (required)
     * @return WebVttSidecarFile
     * @throws BitmovinException if fails to make API call
     */
    public WebVttSidecarFile create(String encodingId, WebVttSidecarFile webVttSidecarFile) throws BitmovinException {
        return this.apiClient.create(encodingId, webVttSidecarFile).getData().getResult();
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
     * WebVTT Sidecar Details
     * 
     * @param encodingId Id of the encoding. (required)
     * @param sidecarId Id of the sidecar. (required)
     * @return WebVttSidecarFile
     * @throws BitmovinException if fails to make API call
     */
    public WebVttSidecarFile get(String encodingId, String sidecarId) throws BitmovinException {
        return this.apiClient.get(encodingId, sidecarId).getData().getResult();
    }
    
    interface WebvttApiClient {
    
        @RequestLine("POST /encoding/encodings/{encoding_id}/sidecars/webvtt")
        ResponseEnvelope<WebVttSidecarFile> create(@Param(value = "encoding_id") String encodingId, WebVttSidecarFile webVttSidecarFile) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/encodings/{encoding_id}/sidecars/webvtt/{sidecar_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "encoding_id") String encodingId, @Param(value = "sidecar_id") String sidecarId) throws BitmovinException;
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/sidecars/webvtt/{sidecar_id}")
        ResponseEnvelope<WebVttSidecarFile> get(@Param(value = "encoding_id") String encodingId, @Param(value = "sidecar_id") String sidecarId) throws BitmovinException;
    }
}
