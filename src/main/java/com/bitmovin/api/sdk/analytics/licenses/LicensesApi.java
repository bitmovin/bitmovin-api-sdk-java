package com.bitmovin.api.sdk.analytics.licenses;

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
import com.bitmovin.api.sdk.common.BitmovinApiBuilder;
import com.bitmovin.api.sdk.common.BitmovinApiClientFactory;
import com.bitmovin.api.sdk.analytics.licenses.domains.DomainsApi;

public class LicensesApi {
    public final DomainsApi domains;

    private final LicensesApiClient apiClient;

    public LicensesApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(LicensesApiClient.class);

        this.domains = new DomainsApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of LicensesApi
     */
    public static BitmovinApiBuilder<LicensesApi> builder() {
        return new BitmovinApiBuilder<>(LicensesApi.class);
    }
    
    /**
     * Create Analytics License
     * 
     * @param analyticsLicense Analytics License to be created (required)
     * @return AnalyticsLicense
     * @throws BitmovinException if fails to make API call
     */
    public AnalyticsLicense create(AnalyticsLicense analyticsLicense) throws BitmovinException {
        try {
            return this.apiClient.create(analyticsLicense).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * Get License
     * 
     * @param licenseId License id (required)
     * @return AnalyticsLicense
     * @throws BitmovinException if fails to make API call
     */
    public AnalyticsLicense get(String licenseId) throws BitmovinException {
        try {
            return this.apiClient.get(licenseId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * List Analytics Licenses
     * 
     * @return List&lt;AnalyticsLicense&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<AnalyticsLicense> list() throws BitmovinException {
        try {
            return this.apiClient.list().getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * Update Analytics License
     * 
     * @param licenseId License id (required)
     * @param analyticsLicenseUpdateRequest Analytics License details to be updated (required)
     * @return AnalyticsLicense
     * @throws BitmovinException if fails to make API call
     */
    public AnalyticsLicense update(String licenseId, AnalyticsLicenseUpdateRequest analyticsLicenseUpdateRequest) throws BitmovinException {
        try {
            return this.apiClient.update(licenseId, analyticsLicenseUpdateRequest).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    interface LicensesApiClient {
    
        @RequestLine("POST /analytics/licenses")
        ResponseEnvelope<AnalyticsLicense> create(AnalyticsLicense analyticsLicense) throws BitmovinException;
    
        @RequestLine("GET /analytics/licenses/{license_id}")
        ResponseEnvelope<AnalyticsLicense> get(@Param(value = "license_id") String licenseId) throws BitmovinException;
    
        @RequestLine("GET /analytics/licenses")
        ResponseEnvelope<PaginationResponse<AnalyticsLicense>> list() throws BitmovinException;
    
        @RequestLine("PUT /analytics/licenses/{license_id}")
        ResponseEnvelope<AnalyticsLicense> update(@Param(value = "license_id") String licenseId, AnalyticsLicenseUpdateRequest analyticsLicenseUpdateRequest) throws BitmovinException;
    }
}
