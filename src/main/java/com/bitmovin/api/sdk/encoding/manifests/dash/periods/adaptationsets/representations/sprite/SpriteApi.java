package com.bitmovin.api.sdk.encoding.manifests.dash.periods.adaptationsets.representations.sprite;

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

public class SpriteApi {

    private final SpriteApiClient apiClient;

    public SpriteApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(SpriteApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of SpriteApi
     */
    public static BitmovinApiBuilder<SpriteApi> builder() {
        return new BitmovinApiBuilder<>(SpriteApi.class);
    }

    /**
     * Add Sprite Representation
     * 
     * @param manifestId Id of the manifest (required)
     * @param periodId Id of the period (required)
     * @param adaptationsetId Id of the adaptation set (required)
     * @param spriteRepresentation The Sprite representation to be added to the adaptation set. Note that the adaptation set has to be an image adaptation set.  Only supported for sprites generated with encoder version &#x60;2.76.0&#x60; or above.  (required)
     * @return SpriteRepresentation
     * @throws BitmovinException if fails to make API call
     */
    public SpriteRepresentation create(String manifestId, String periodId, String adaptationsetId, SpriteRepresentation spriteRepresentation) throws BitmovinException {
        try {
            return this.apiClient.create(manifestId, periodId, adaptationsetId, spriteRepresentation).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * Delete Sprite Representation
     * 
     * @param manifestId Id of the manifest (required)
     * @param periodId Id of the period (required)
     * @param adaptationsetId Id of the adaptation set (required)
     * @param representationId Id of the Sprite representation to be deleted (required)
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
     * Sprite Representation Details
     * 
     * @param manifestId Id of the manifest (required)
     * @param periodId Id of the period (required)
     * @param adaptationsetId Id of the adaptation set (required)
     * @param representationId Id of the Sprite representation (required)
     * @return SpriteRepresentation
     * @throws BitmovinException if fails to make API call
     */
    public SpriteRepresentation get(String manifestId, String periodId, String adaptationsetId, String representationId) throws BitmovinException {
        try {
            return this.apiClient.get(manifestId, periodId, adaptationsetId, representationId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * List all Sprite Representations
     * 
     * @param manifestId Id of the manifest (required)
     * @param periodId Id of the period (required)
     * @param adaptationsetId Id of the adaptation set (required)
     * @return List&lt;SpriteRepresentation&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<SpriteRepresentation> list(String manifestId, String periodId, String adaptationsetId) throws BitmovinException {
        try {
            return this.apiClient.list(manifestId, periodId, adaptationsetId, new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * List all Sprite Representations
     * 
     * @param manifestId Id of the manifest (required)
     * @param periodId Id of the period (required)
     * @param adaptationsetId Id of the adaptation set (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;SpriteRepresentation&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<SpriteRepresentation> list(String manifestId, String periodId, String adaptationsetId, SpriteRepresentationListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(manifestId, periodId, adaptationsetId, new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface SpriteApiClient {

        @RequestLine("POST /encoding/manifests/dash/{manifest_id}/periods/{period_id}/adaptationsets/{adaptationset_id}/representations/sprite")
        ResponseEnvelope<SpriteRepresentation> create(@Param(value = "manifest_id") String manifestId, @Param(value = "period_id") String periodId, @Param(value = "adaptationset_id") String adaptationsetId, SpriteRepresentation spriteRepresentation) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/manifests/dash/{manifest_id}/periods/{period_id}/adaptationsets/{adaptationset_id}/representations/sprite/{representation_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "manifest_id") String manifestId, @Param(value = "period_id") String periodId, @Param(value = "adaptationset_id") String adaptationsetId, @Param(value = "representation_id") String representationId) throws BitmovinException;
    
        @RequestLine("GET /encoding/manifests/dash/{manifest_id}/periods/{period_id}/adaptationsets/{adaptationset_id}/representations/sprite/{representation_id}")
        ResponseEnvelope<SpriteRepresentation> get(@Param(value = "manifest_id") String manifestId, @Param(value = "period_id") String periodId, @Param(value = "adaptationset_id") String adaptationsetId, @Param(value = "representation_id") String representationId) throws BitmovinException;
    
        @RequestLine("GET /encoding/manifests/dash/{manifest_id}/periods/{period_id}/adaptationsets/{adaptationset_id}/representations/sprite")
        ResponseEnvelope<PaginationResponse<SpriteRepresentation>> list(@Param(value = "manifest_id") String manifestId, @Param(value = "period_id") String periodId, @Param(value = "adaptationset_id") String adaptationsetId, @QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    }
}
