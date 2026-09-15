package com.bitmovin.api.sdk.player.testing;

import com.bitmovin.api.sdk.common.BitmovinApiBuilder;
import com.bitmovin.api.sdk.common.BitmovinApiClientFactory;
import com.bitmovin.api.sdk.player.testing.codecCompatibility.CodecCompatibilityApi;

public class TestingApi {
    public final CodecCompatibilityApi codecCompatibility;

    public TestingApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.codecCompatibility = new CodecCompatibilityApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of TestingApi
     */
    public static BitmovinApiBuilder<TestingApi> builder() {
        return new BitmovinApiBuilder<>(TestingApi.class);
    }

}
