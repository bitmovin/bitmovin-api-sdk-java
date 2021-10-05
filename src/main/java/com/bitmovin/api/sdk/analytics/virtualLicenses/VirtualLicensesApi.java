package com.bitmovin.api.sdk.analytics.virtualLicenses;

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

public class VirtualLicensesApi {

    private final VirtualLicensesApiClient apiClient;

    public VirtualLicensesApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(VirtualLicensesApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of VirtualLicensesApi
     */
    public static BitmovinApiBuilder<VirtualLicensesApi> builder() {
        return new BitmovinApiBuilder<>(VirtualLicensesApi.class);
    }

    /**
     * Create Analytics Virtual License
     * 
     * @param analyticsVirtualLicenseRequest Analytics Virtual License to be created (required)
     * @return AnalyticsVirtualLicense
     * @throws BitmovinException if fails to make API call
     */
    public AnalyticsVirtualLicense create(AnalyticsVirtualLicenseRequest analyticsVirtualLicenseRequest) throws BitmovinException {
        try {
            return this.apiClient.create(analyticsVirtualLicenseRequest).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * Delete Analytics Virtual License
     * 
     * @param virtualLicenseId Virtual License id (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse delete(String virtualLicenseId) throws BitmovinException {
        try {
            return this.apiClient.delete(virtualLicenseId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * Analytics Virtual License
     * 
     * @param virtualLicenseId Virtual license id (required)
     * @return AnalyticsVirtualLicense
     * @throws BitmovinException if fails to make API call
     */
    public AnalyticsVirtualLicense get(String virtualLicenseId) throws BitmovinException {
        try {
            return this.apiClient.get(virtualLicenseId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * List Analytics Virtual Licenses
     * 
     * @return List&lt;AnalyticsVirtualLicense&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<AnalyticsVirtualLicense> list() throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * List Analytics Virtual Licenses
     * 
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;AnalyticsVirtualLicense&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<AnalyticsVirtualLicense> list(AnalyticsVirtualLicenseListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * Update Analytics Virtual License
     * 
     * @param virtualLicenseId Virtual license id (required)
     * @param analyticsVirtualLicenseRequest Analytics Virtual License details to be updated (required)
     * @return AnalyticsVirtualLicense
     * @throws BitmovinException if fails to make API call
     */
    public AnalyticsVirtualLicense update(String virtualLicenseId, AnalyticsVirtualLicenseRequest analyticsVirtualLicenseRequest) throws BitmovinException {
        try {
            return this.apiClient.update(virtualLicenseId, analyticsVirtualLicenseRequest).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface VirtualLicensesApiClient {

        @RequestLine("POST /analytics/virtual-licenses")
        ResponseEnvelope<AnalyticsVirtualLicense> create(AnalyticsVirtualLicenseRequest analyticsVirtualLicenseRequest) throws BitmovinException;
    
        @RequestLine("DELETE /analytics/virtual-licenses/{virtual_license_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "virtual_license_id") String virtualLicenseId) throws BitmovinException;
    
        @RequestLine("GET /analytics/virtual-licenses/{virtual_license_id}")
        ResponseEnvelope<AnalyticsVirtualLicense> get(@Param(value = "virtual_license_id") String virtualLicenseId) throws BitmovinException;
    
        @RequestLine("GET /analytics/virtual-licenses")
        ResponseEnvelope<PaginationResponse<AnalyticsVirtualLicense>> list(@QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    
        @RequestLine("PUT /analytics/virtual-licenses/{virtual_license_id}")
        ResponseEnvelope<AnalyticsVirtualLicense> update(@Param(value = "virtual_license_id") String virtualLicenseId, AnalyticsVirtualLicenseRequest analyticsVirtualLicenseRequest) throws BitmovinException;
    }
}
