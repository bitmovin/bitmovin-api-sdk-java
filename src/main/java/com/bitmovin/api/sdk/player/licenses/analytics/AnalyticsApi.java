package com.bitmovin.api.sdk.player.licenses.analytics;

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

public class AnalyticsApi {

    private final AnalyticsApiClient apiClient;

    public AnalyticsApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(AnalyticsApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of AnalyticsApi
     */
    public static BitmovinApiBuilder<AnalyticsApi> builder() {
        return new BitmovinApiBuilder<>(AnalyticsApi.class);
    }
    
    /**
     * Activate Analytics
     * 
     * @param licenseId Id of the Player License (required)
     * @param playerLicenseAnalytics The Analytics key to be added to the Player License (required)
     * @return PlayerLicenseAnalytics
     * @throws BitmovinException if fails to make API call
     */
    public PlayerLicenseAnalytics create(String licenseId, PlayerLicenseAnalytics playerLicenseAnalytics) throws BitmovinException {
        try {
            return this.apiClient.create(licenseId, playerLicenseAnalytics).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * Deactivate Analytics
     * 
     * @param licenseId Id of license (required)
     * @return PlayerLicenseAnalytics
     * @throws BitmovinException if fails to make API call
     */
    public PlayerLicenseAnalytics delete(String licenseId) throws BitmovinException {
        try {
            return this.apiClient.delete(licenseId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    interface AnalyticsApiClient {
    
        @RequestLine("POST /player/licenses/{license_id}/analytics")
        ResponseEnvelope<PlayerLicenseAnalytics> create(@Param(value = "license_id") String licenseId, PlayerLicenseAnalytics playerLicenseAnalytics) throws BitmovinException;
    
        @RequestLine("DELETE /player/licenses/{license_id}/analytics")
        ResponseEnvelope<PlayerLicenseAnalytics> delete(@Param(value = "license_id") String licenseId) throws BitmovinException;
    }
}
