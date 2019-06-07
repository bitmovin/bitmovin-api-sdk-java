package com.bitmovin.api.sdk.player.licenses;

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
import com.bitmovin.api.sdk.player.licenses.analytics.AnalyticsApi;
import com.bitmovin.api.sdk.player.licenses.domains.DomainsApi;
import com.bitmovin.api.sdk.player.licenses.thirdPartyLicensing.ThirdPartyLicensingApi;

public class LicensesApi {
    public final AnalyticsApi analytics;
    public final DomainsApi domains;
    public final ThirdPartyLicensingApi thirdPartyLicensing;

    private final LicensesApiClient apiClient;

    public LicensesApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(LicensesApiClient.class);

        this.analytics = new AnalyticsApi(clientFactory);
        this.domains = new DomainsApi(clientFactory);
        this.thirdPartyLicensing = new ThirdPartyLicensingApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of LicensesApi
     */
    public static BitmovinApiBuilder<LicensesApi> builder() {
        return new BitmovinApiBuilder<>(LicensesApi.class);
    }
    
    /**
     * Create Player License
     * 
     * @param playerLicense Player License to be created (required)
     * @return PlayerLicense
     * @throws BitmovinException if fails to make API call
     */
    public PlayerLicense create(PlayerLicense playerLicense) throws BitmovinException {
        return this.apiClient.create(playerLicense).getData().getResult();
    }
    
    /**
     * Get License
     * 
     * @param licenseId ID of the License (required)
     * @return PlayerLicense
     * @throws BitmovinException if fails to make API call
     */
    public PlayerLicense get(String licenseId) throws BitmovinException {
        return this.apiClient.get(licenseId).getData().getResult();
    }
    
    /**
     * List Player Licenses
     * 
     * @return List&lt;PlayerLicense&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<PlayerLicense> list() throws BitmovinException {
        return this.apiClient.list(new HashMap<String, Object>()).getData().getResult();
    }
    /**
     * List Player Licenses
     * 
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;PlayerLicense&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<PlayerLicense> list(PlayerLicenseListQueryParams queryParams) throws BitmovinException {
        return this.apiClient.list(queryParams).getData().getResult();
    }
    
    interface LicensesApiClient {
    
        @RequestLine("POST /player/licenses")
        ResponseEnvelope<PlayerLicense> create(PlayerLicense playerLicense) throws BitmovinException;
    
        @RequestLine("GET /player/licenses/{license_id}")
        ResponseEnvelope<PlayerLicense> get(@Param(value = "license_id") String licenseId) throws BitmovinException;
    
        @RequestLine("GET /player/licenses")
        ResponseEnvelope<PaginationResponse<PlayerLicense>> list(@QueryMap Map<String, Object> queryParams) throws BitmovinException;
    }
}
