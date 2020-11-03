package com.bitmovin.api.sdk.analytics.alerting;

import com.bitmovin.api.sdk.common.BitmovinApiBuilder;
import com.bitmovin.api.sdk.common.BitmovinApiClientFactory;
import com.bitmovin.api.sdk.analytics.alerting.rules.RulesApi;
import com.bitmovin.api.sdk.analytics.alerting.incidents.IncidentsApi;

public class AlertingApi {
    public final RulesApi rules;
    public final IncidentsApi incidents;

    public AlertingApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.rules = new RulesApi(clientFactory);
        this.incidents = new IncidentsApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of AlertingApi
     */
    public static BitmovinApiBuilder<AlertingApi> builder() {
        return new BitmovinApiBuilder<>(AlertingApi.class);
    }
    
    
}
