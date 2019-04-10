package com.bitmovin.api.sdk.encoding.encodings.machineLearning;

import com.bitmovin.api.sdk.common.BitmovinApiBuilder;
import com.bitmovin.api.sdk.common.BitmovinApiClientFactory;
import com.bitmovin.api.sdk.encoding.encodings.machineLearning.objectDetection.ObjectDetectionApi;

public class MachineLearningApi {
    public final ObjectDetectionApi objectDetection;

    public MachineLearningApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.objectDetection = new ObjectDetectionApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of MachineLearningApi
     */
    public static BitmovinApiBuilder<MachineLearningApi> builder() {
        return new BitmovinApiBuilder<>(MachineLearningApi.class);
    }
    
    
}
