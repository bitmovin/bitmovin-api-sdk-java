package com.bitmovin.api.sdk.encoding;

import com.bitmovin.api.sdk.common.BitmovinApiBuilder;
import com.bitmovin.api.sdk.common.BitmovinApiClientFactory;
import com.bitmovin.api.sdk.encoding.inputs.InputsApi;
import com.bitmovin.api.sdk.encoding.outputs.OutputsApi;
import com.bitmovin.api.sdk.encoding.configurations.ConfigurationsApi;
import com.bitmovin.api.sdk.encoding.filters.FiltersApi;
import com.bitmovin.api.sdk.encoding.encodings.EncodingsApi;
import com.bitmovin.api.sdk.encoding.manifests.ManifestsApi;
import com.bitmovin.api.sdk.encoding.infrastructure.InfrastructureApi;
import com.bitmovin.api.sdk.encoding.statistics.StatisticsApi;
import com.bitmovin.api.sdk.encoding.errorDefinitions.ErrorDefinitionsApi;

public class EncodingApi {
    public final InputsApi inputs;
    public final OutputsApi outputs;
    public final ConfigurationsApi configurations;
    public final FiltersApi filters;
    public final EncodingsApi encodings;
    public final ManifestsApi manifests;
    public final InfrastructureApi infrastructure;
    public final StatisticsApi statistics;
    public final ErrorDefinitionsApi errorDefinitions;

    public EncodingApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.inputs = new InputsApi(clientFactory);
        this.outputs = new OutputsApi(clientFactory);
        this.configurations = new ConfigurationsApi(clientFactory);
        this.filters = new FiltersApi(clientFactory);
        this.encodings = new EncodingsApi(clientFactory);
        this.manifests = new ManifestsApi(clientFactory);
        this.infrastructure = new InfrastructureApi(clientFactory);
        this.statistics = new StatisticsApi(clientFactory);
        this.errorDefinitions = new ErrorDefinitionsApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of EncodingApi
     */
    public static BitmovinApiBuilder<EncodingApi> builder() {
        return new BitmovinApiBuilder<>(EncodingApi.class);
    }
    
    
}
