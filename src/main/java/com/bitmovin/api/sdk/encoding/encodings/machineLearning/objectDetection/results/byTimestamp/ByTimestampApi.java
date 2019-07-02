package com.bitmovin.api.sdk.encoding.encodings.machineLearning.objectDetection.results.byTimestamp;

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

public class ByTimestampApi {

    private final ByTimestampApiClient apiClient;

    public ByTimestampApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(ByTimestampApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of ByTimestampApi
     */
    public static BitmovinApiBuilder<ByTimestampApi> builder() {
        return new BitmovinApiBuilder<>(ByTimestampApi.class);
    }
    
    /**
     * List object detection results grouped by timestamp
     * 
     * @param encodingId Id of the encoding (required)
     * @param objectDetectionId Id of the object detection configuration (required)
     * @return List&lt;ObjectDetectionTimestampResult&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<ObjectDetectionTimestampResult> list(String encodingId, String objectDetectionId) throws BitmovinException {
        return this.apiClient.list(encodingId, objectDetectionId, new HashMap<String, Object>()).getData().getResult();
    }
    /**
     * List object detection results grouped by timestamp
     * 
     * @param encodingId Id of the encoding (required)
     * @param objectDetectionId Id of the object detection configuration (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;ObjectDetectionTimestampResult&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<ObjectDetectionTimestampResult> list(String encodingId, String objectDetectionId, ObjectDetectionTimestampResultListQueryParams queryParams) throws BitmovinException {
        return this.apiClient.list(encodingId, objectDetectionId, queryParams).getData().getResult();
    }
    
    interface ByTimestampApiClient {
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/machine-learning/object-detection/{object_detection_id}/results/by-timestamp")
        ResponseEnvelope<PaginationResponse<ObjectDetectionTimestampResult>> list(@Param(value = "encoding_id") String encodingId, @Param(value = "object_detection_id") String objectDetectionId, @QueryMap Map<String, Object> queryParams) throws BitmovinException;
    }
}
