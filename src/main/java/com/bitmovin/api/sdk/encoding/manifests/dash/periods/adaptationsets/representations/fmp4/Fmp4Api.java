package com.bitmovin.api.sdk.encoding.manifests.dash.periods.adaptationsets.representations.fmp4;

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
import com.bitmovin.api.sdk.encoding.manifests.dash.periods.adaptationsets.representations.fmp4.drm.DrmApi;
import com.bitmovin.api.sdk.encoding.manifests.dash.periods.adaptationsets.representations.fmp4.contentprotection.ContentprotectionApi;

public class Fmp4Api {
    public final DrmApi drm;
    public final ContentprotectionApi contentprotection;

    private final Fmp4ApiClient apiClient;

    public Fmp4Api(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(Fmp4ApiClient.class);

        this.drm = new DrmApi(clientFactory);
        this.contentprotection = new ContentprotectionApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of Fmp4Api
     */
    public static BitmovinApiBuilder<Fmp4Api> builder() {
        return new BitmovinApiBuilder<>(Fmp4Api.class);
    }

    /**
     * Add fMP4 Representation
     * 
     * @param manifestId Id of the manifest (required)
     * @param periodId Id of the period (required)
     * @param adaptationsetId Id of the adaptation set (required)
     * @param dashFmp4Representation The fMP4 representation to be added to the adaptation set (required)
     * @return DashFmp4Representation
     * @throws BitmovinException if fails to make API call
     */
    public DashFmp4Representation create(String manifestId, String periodId, String adaptationsetId, DashFmp4Representation dashFmp4Representation) throws BitmovinException {
        try {
            return this.apiClient.create(manifestId, periodId, adaptationsetId, dashFmp4Representation).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * Delete fMP4 Representation
     * 
     * @param manifestId Id of the manifest (required)
     * @param periodId Id of the period (required)
     * @param adaptationsetId Id of the adaptation set (required)
     * @param representationId Id of the fMP4 representation to be deleted (required)
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
     * fMP4 Representation Details
     * 
     * @param manifestId Id of the manifest (required)
     * @param periodId Id of the period (required)
     * @param adaptationsetId Id of the adaptation set (required)
     * @param representationId Id of the representation (required)
     * @return DashFmp4Representation
     * @throws BitmovinException if fails to make API call
     */
    public DashFmp4Representation get(String manifestId, String periodId, String adaptationsetId, String representationId) throws BitmovinException {
        try {
            return this.apiClient.get(manifestId, periodId, adaptationsetId, representationId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * List all fMP4 Representations
     * 
     * @param manifestId Id of the manifest (required)
     * @param periodId Id of the period (required)
     * @param adaptationsetId Id of the adaptation set (required)
     * @return List&lt;DashFmp4Representation&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<DashFmp4Representation> list(String manifestId, String periodId, String adaptationsetId) throws BitmovinException {
        try {
            return this.apiClient.list(manifestId, periodId, adaptationsetId, new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * List all fMP4 Representations
     * 
     * @param manifestId Id of the manifest (required)
     * @param periodId Id of the period (required)
     * @param adaptationsetId Id of the adaptation set (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;DashFmp4Representation&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<DashFmp4Representation> list(String manifestId, String periodId, String adaptationsetId, DashFmp4RepresentationListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(manifestId, periodId, adaptationsetId, new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface Fmp4ApiClient {

        @RequestLine("POST /encoding/manifests/dash/{manifest_id}/periods/{period_id}/adaptationsets/{adaptationset_id}/representations/fmp4")
        ResponseEnvelope<DashFmp4Representation> create(@Param(value = "manifest_id") String manifestId, @Param(value = "period_id") String periodId, @Param(value = "adaptationset_id") String adaptationsetId, DashFmp4Representation dashFmp4Representation) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/manifests/dash/{manifest_id}/periods/{period_id}/adaptationsets/{adaptationset_id}/representations/fmp4/{representation_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "manifest_id") String manifestId, @Param(value = "period_id") String periodId, @Param(value = "adaptationset_id") String adaptationsetId, @Param(value = "representation_id") String representationId) throws BitmovinException;
    
        @RequestLine("GET /encoding/manifests/dash/{manifest_id}/periods/{period_id}/adaptationsets/{adaptationset_id}/representations/fmp4/{representation_id}")
        ResponseEnvelope<DashFmp4Representation> get(@Param(value = "manifest_id") String manifestId, @Param(value = "period_id") String periodId, @Param(value = "adaptationset_id") String adaptationsetId, @Param(value = "representation_id") String representationId) throws BitmovinException;
    
        @RequestLine("GET /encoding/manifests/dash/{manifest_id}/periods/{period_id}/adaptationsets/{adaptationset_id}/representations/fmp4")
        ResponseEnvelope<PaginationResponse<DashFmp4Representation>> list(@Param(value = "manifest_id") String manifestId, @Param(value = "period_id") String periodId, @Param(value = "adaptationset_id") String adaptationsetId, @QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    }
}
