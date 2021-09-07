package com.bitmovin.api.sdk.analytics.insights.organizations;

import com.bitmovin.api.sdk.common.BitmovinApiBuilder;
import com.bitmovin.api.sdk.common.BitmovinApiClientFactory;
import com.bitmovin.api.sdk.analytics.insights.organizations.settings.SettingsApi;

public class OrganizationsApi {
    public final SettingsApi settings;

    public OrganizationsApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.settings = new SettingsApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of OrganizationsApi
     */
    public static BitmovinApiBuilder<OrganizationsApi> builder() {
        return new BitmovinApiBuilder<>(OrganizationsApi.class);
    }

    
}
