package com.bitmovin.api.sdk.analytics.insights.organizations.settings;

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

public class SettingsApi {

    private final SettingsApiClient apiClient;

    public SettingsApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(SettingsApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of SettingsApi
     */
    public static BitmovinApiBuilder<SettingsApi> builder() {
        return new BitmovinApiBuilder<>(SettingsApi.class);
    }

    /**
     * Get the current organization settings for industry insights
     * 
     * @param organizationId Organization id (required)
     * @return AnalyticsInsightsOrganizationSettings
     * @throws BitmovinException if fails to make API call
     */
    public AnalyticsInsightsOrganizationSettings get(String organizationId) throws BitmovinException {
        try {
            return this.apiClient.get(organizationId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * Update the organization settings for industry insights
     * 
     * @param organizationId Organization id (required)
     * @param analyticsInsightsOrganizationSettingsRequest Organization settings to be updated (required)
     * @return AnalyticsInsightsOrganizationSettings
     * @throws BitmovinException if fails to make API call
     */
    public AnalyticsInsightsOrganizationSettings update(String organizationId, AnalyticsInsightsOrganizationSettingsRequest analyticsInsightsOrganizationSettingsRequest) throws BitmovinException {
        try {
            return this.apiClient.update(organizationId, analyticsInsightsOrganizationSettingsRequest).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface SettingsApiClient {

        @RequestLine("GET /analytics/insights/organizations/{organization_id}/settings")
        ResponseEnvelope<AnalyticsInsightsOrganizationSettings> get(@Param(value = "organization_id") String organizationId) throws BitmovinException;
    
        @RequestLine("PUT /analytics/insights/organizations/{organization_id}/settings")
        ResponseEnvelope<AnalyticsInsightsOrganizationSettings> update(@Param(value = "organization_id") String organizationId, AnalyticsInsightsOrganizationSettingsRequest analyticsInsightsOrganizationSettingsRequest) throws BitmovinException;
    }
}
