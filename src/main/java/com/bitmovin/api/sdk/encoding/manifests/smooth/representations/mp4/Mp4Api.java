package com.bitmovin.api.sdk.encoding.manifests.smooth.representations.mp4;

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

public class Mp4Api {

    private final Mp4ApiClient apiClient;

    public Mp4Api(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(Mp4ApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of Mp4Api
     */
    public static BitmovinApiBuilder<Mp4Api> builder() {
        return new BitmovinApiBuilder<>(Mp4Api.class);
    }
    /**
     * Add MP4 Representation to Smooth Streaming Manifest
     * 
     * @param manifestId Id of the Smooth Streaming manifest. (required)
     * @param smoothStreamingRepresentation The MP4 Representation to be added (required)
     * @return SmoothStreamingRepresentation
     * @throws BitmovinException if fails to make API call
     */
    public SmoothStreamingRepresentation create(String manifestId, SmoothStreamingRepresentation smoothStreamingRepresentation) throws BitmovinException {
        try {
            return this.apiClient.create(manifestId, smoothStreamingRepresentation).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * Delete Smooth Streaming MP4 Representation
     * 
     * @param manifestId Id of the Smooth Streaming manifest. (required)
     * @param representationId Id of the MP4 representation. (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse delete(String manifestId, String representationId) throws BitmovinException {
        try {
            return this.apiClient.delete(manifestId, representationId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * Smooth Streaming MP4 Representation Details
     * 
     * @param manifestId Id of the Smooth Streaming manifest. (required)
     * @param representationId Id of the MP4 representation. (required)
     * @return SmoothStreamingRepresentation
     * @throws BitmovinException if fails to make API call
     */
    public SmoothStreamingRepresentation get(String manifestId, String representationId) throws BitmovinException {
        try {
            return this.apiClient.get(manifestId, representationId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * List MP4 Representation
     * 
     * @param manifestId Id of the Smooth Streaming manifest. (required)
     * @return List&lt;SmoothStreamingRepresentation&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<SmoothStreamingRepresentation> list(String manifestId) throws BitmovinException {
        try {
            return this.apiClient.list(manifestId, new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * List MP4 Representation
     * 
     * @param manifestId Id of the Smooth Streaming manifest. (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;SmoothStreamingRepresentation&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<SmoothStreamingRepresentation> list(String manifestId, SmoothStreamingRepresentationListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(manifestId, new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface Mp4ApiClient { 
        @RequestLine("POST /encoding/manifests/smooth/{manifest_id}/representations/mp4")
        ResponseEnvelope<SmoothStreamingRepresentation> create(@Param(value = "manifest_id") String manifestId, SmoothStreamingRepresentation smoothStreamingRepresentation) throws BitmovinException;
   
        @RequestLine("DELETE /encoding/manifests/smooth/{manifest_id}/representations/mp4/{representation_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "manifest_id") String manifestId, @Param(value = "representation_id") String representationId) throws BitmovinException;
   
        @RequestLine("GET /encoding/manifests/smooth/{manifest_id}/representations/mp4/{representation_id}")
        ResponseEnvelope<SmoothStreamingRepresentation> get(@Param(value = "manifest_id") String manifestId, @Param(value = "representation_id") String representationId) throws BitmovinException;
   
        @RequestLine("GET /encoding/manifests/smooth/{manifest_id}/representations/mp4")
        ResponseEnvelope<PaginationResponse<SmoothStreamingRepresentation>> list(@Param(value = "manifest_id") String manifestId, @QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    }
}
