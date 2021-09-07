package com.bitmovin.api.sdk.analytics.insights;

import com.bitmovin.api.sdk.common.BitmovinApiBuilder;
import com.bitmovin.api.sdk.common.BitmovinApiClientFactory;
import com.bitmovin.api.sdk.analytics.insights.organizations.OrganizationsApi;

public class InsightsApi {
    public final OrganizationsApi organizations;

    public InsightsApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.organizations = new OrganizationsApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of InsightsApi
     */
    public static BitmovinApiBuilder<InsightsApi> builder() {
        return new BitmovinApiBuilder<>(InsightsApi.class);
    }

    
}
