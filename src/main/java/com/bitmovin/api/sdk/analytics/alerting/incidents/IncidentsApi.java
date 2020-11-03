package com.bitmovin.api.sdk.analytics.alerting.incidents;

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

public class IncidentsApi {

    private final IncidentsApiClient apiClient;

    public IncidentsApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(IncidentsApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of IncidentsApi
     */
    public static BitmovinApiBuilder<IncidentsApi> builder() {
        return new BitmovinApiBuilder<>(IncidentsApi.class);
    }
    
    /**
     * List Incidents
     * 
     * @return List&lt;AnalyticsIncident&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<AnalyticsIncident> list() throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * List Incidents
     * 
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;AnalyticsIncident&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<AnalyticsIncident> list(AnalyticsIncidentListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * List Incidents per license
     * 
     * @param licenseKey License key (required)
     * @return List&lt;AnalyticsIncident&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<AnalyticsIncident> listByLicenseKey(String licenseKey) throws BitmovinException {
        try {
            return this.apiClient.listByLicenseKey(licenseKey, new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * List Incidents per license
     * 
     * @param licenseKey License key (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;AnalyticsIncident&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<AnalyticsIncident> listByLicenseKey(String licenseKey, AnalyticsIncidentListByLicenseKeyQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.listByLicenseKey(licenseKey, new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    interface IncidentsApiClient {
    
        @RequestLine("GET /analytics/alerting/incidents")
        ResponseEnvelope<PaginationResponse<AnalyticsIncident>> list(@QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    
        @RequestLine("GET /analytics/alerting/incidents/{license_key}")
        ResponseEnvelope<PaginationResponse<AnalyticsIncident>> listByLicenseKey(@Param(value = "license_key") String licenseKey, @QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    }
}
