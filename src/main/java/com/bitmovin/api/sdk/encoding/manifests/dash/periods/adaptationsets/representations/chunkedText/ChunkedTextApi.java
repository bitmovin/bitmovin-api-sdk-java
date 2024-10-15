package com.bitmovin.api.sdk.encoding.manifests.dash.periods.adaptationsets.representations.chunkedText;

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

public class ChunkedTextApi {

    private final ChunkedTextApiClient apiClient;

    public ChunkedTextApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(ChunkedTextApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of ChunkedTextApi
     */
    public static BitmovinApiBuilder<ChunkedTextApi> builder() {
        return new BitmovinApiBuilder<>(ChunkedTextApi.class);
    }
    /**
     * Add Chunked Text Representation
     * 
     * @param manifestId Id of the manifest (required)
     * @param periodId Id of the period (required)
     * @param adaptationsetId Id of the adaptation set (required)
     * @param dashChunkedTextRepresentation The Chunked Text Representation to be added to the adaptation set (required)
     * @return DashChunkedTextRepresentation
     * @throws BitmovinException if fails to make API call
     */
    public DashChunkedTextRepresentation create(String manifestId, String periodId, String adaptationsetId, DashChunkedTextRepresentation dashChunkedTextRepresentation) throws BitmovinException {
        try {
            return this.apiClient.create(manifestId, periodId, adaptationsetId, dashChunkedTextRepresentation).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * Delete Chunked Text Representation
     * 
     * @param manifestId Id of the manifest (required)
     * @param periodId Id of the period (required)
     * @param adaptationsetId Id of the adaptation set (required)
     * @param representationId Id of the Chunked Text Representation to be deleted (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse delete(String manifestId, String periodId, String adaptationsetId, String representationId) throws BitmovinException {
        try {
            return this.apiClient.delete(manifestId, periodId, adaptationsetId, representationId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * Chunked Text Representation Details
     * 
     * @param manifestId Id of the manifest (required)
     * @param periodId Id of the period (required)
     * @param adaptationsetId Id of the adaptation set (required)
     * @param representationId Id of the representation (required)
     * @return DashChunkedTextRepresentation
     * @throws BitmovinException if fails to make API call
     */
    public DashChunkedTextRepresentation get(String manifestId, String periodId, String adaptationsetId, String representationId) throws BitmovinException {
        try {
            return this.apiClient.get(manifestId, periodId, adaptationsetId, representationId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * List all Chunked Text Representations
     * 
     * @param manifestId Id of the manifest (required)
     * @param periodId Id of the period (required)
     * @param adaptationsetId Id of the adaptation set (required)
     * @return List&lt;DashChunkedTextRepresentation&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<DashChunkedTextRepresentation> list(String manifestId, String periodId, String adaptationsetId) throws BitmovinException {
        try {
            return this.apiClient.list(manifestId, periodId, adaptationsetId, new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * List all Chunked Text Representations
     * 
     * @param manifestId Id of the manifest (required)
     * @param periodId Id of the period (required)
     * @param adaptationsetId Id of the adaptation set (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;DashChunkedTextRepresentation&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<DashChunkedTextRepresentation> list(String manifestId, String periodId, String adaptationsetId, DashChunkedTextRepresentationListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(manifestId, periodId, adaptationsetId, new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface ChunkedTextApiClient { 
        @RequestLine("POST /encoding/manifests/dash/{manifest_id}/periods/{period_id}/adaptationsets/{adaptationset_id}/representations/chunked-text")
        ResponseEnvelope<DashChunkedTextRepresentation> create(@Param(value = "manifest_id") String manifestId, @Param(value = "period_id") String periodId, @Param(value = "adaptationset_id") String adaptationsetId, DashChunkedTextRepresentation dashChunkedTextRepresentation) throws BitmovinException;
   
        @RequestLine("DELETE /encoding/manifests/dash/{manifest_id}/periods/{period_id}/adaptationsets/{adaptationset_id}/representations/chunked-text/{representation_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "manifest_id") String manifestId, @Param(value = "period_id") String periodId, @Param(value = "adaptationset_id") String adaptationsetId, @Param(value = "representation_id") String representationId) throws BitmovinException;
   
        @RequestLine("GET /encoding/manifests/dash/{manifest_id}/periods/{period_id}/adaptationsets/{adaptationset_id}/representations/chunked-text/{representation_id}")
        ResponseEnvelope<DashChunkedTextRepresentation> get(@Param(value = "manifest_id") String manifestId, @Param(value = "period_id") String periodId, @Param(value = "adaptationset_id") String adaptationsetId, @Param(value = "representation_id") String representationId) throws BitmovinException;
   
        @RequestLine("GET /encoding/manifests/dash/{manifest_id}/periods/{period_id}/adaptationsets/{adaptationset_id}/representations/chunked-text")
        ResponseEnvelope<PaginationResponse<DashChunkedTextRepresentation>> list(@Param(value = "manifest_id") String manifestId, @Param(value = "period_id") String periodId, @Param(value = "adaptationset_id") String adaptationsetId, @QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    }
}
