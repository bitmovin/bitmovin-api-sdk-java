package com.bitmovin.api.sdk.encoding.manifests.dash.periods;

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
import com.bitmovin.api.sdk.encoding.manifests.dash.periods.customXmlElements.CustomXmlElementsApi;
import com.bitmovin.api.sdk.encoding.manifests.dash.periods.adaptationsets.AdaptationsetsApi;

public class PeriodsApi {
    public final CustomXmlElementsApi customXmlElements;
    public final AdaptationsetsApi adaptationsets;

    private final PeriodsApiClient apiClient;

    public PeriodsApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(PeriodsApiClient.class);

        this.customXmlElements = new CustomXmlElementsApi(clientFactory);
        this.adaptationsets = new AdaptationsetsApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of PeriodsApi
     */
    public static BitmovinApiBuilder<PeriodsApi> builder() {
        return new BitmovinApiBuilder<>(PeriodsApi.class);
    }
    
    /**
     * Add Period
     * 
     * @param manifestId Id of the manifest (required)
     * @param period The Period to be added to the manifest (required)
     * @return Period
     * @throws BitmovinException if fails to make API call
     */
    public Period create(String manifestId, Period period) throws BitmovinException {
        try {
            return this.apiClient.create(manifestId, period).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * Delete Period
     * 
     * @param manifestId Id of the manifest (required)
     * @param periodId Id of the period to be deleted (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse delete(String manifestId, String periodId) throws BitmovinException {
        try {
            return this.apiClient.delete(manifestId, periodId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * Period Details
     * 
     * @param manifestId Id of the manifest (required)
     * @param periodId Id of the period (required)
     * @return Period
     * @throws BitmovinException if fails to make API call
     */
    public Period get(String manifestId, String periodId) throws BitmovinException {
        try {
            return this.apiClient.get(manifestId, periodId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * List all Periods
     * 
     * @param manifestId Id of the manifest (required)
     * @return List&lt;Period&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<Period> list(String manifestId) throws BitmovinException {
        try {
            return this.apiClient.list(manifestId, new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * List all Periods
     * 
     * @param manifestId Id of the manifest (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;Period&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<Period> list(String manifestId, PeriodListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(manifestId, new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    interface PeriodsApiClient {
    
        @RequestLine("POST /encoding/manifests/dash/{manifest_id}/periods")
        ResponseEnvelope<Period> create(@Param(value = "manifest_id") String manifestId, Period period) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/manifests/dash/{manifest_id}/periods/{period_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "manifest_id") String manifestId, @Param(value = "period_id") String periodId) throws BitmovinException;
    
        @RequestLine("GET /encoding/manifests/dash/{manifest_id}/periods/{period_id}")
        ResponseEnvelope<Period> get(@Param(value = "manifest_id") String manifestId, @Param(value = "period_id") String periodId) throws BitmovinException;
    
        @RequestLine("GET /encoding/manifests/dash/{manifest_id}/periods")
        ResponseEnvelope<PaginationResponse<Period>> list(@Param(value = "manifest_id") String manifestId, @QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    }
}
