package com.bitmovin.api.sdk.encoding.encodings.machineLearning.objectDetection.results;

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

public class ResultsApi {

    private final ResultsApiClient apiClient;

    public ResultsApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(ResultsApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of ResultsApi
     */
    public static BitmovinApiBuilder<ResultsApi> builder() {
        return new BitmovinApiBuilder<>(ResultsApi.class);
    }
    
    /**
     * List object detection results
     * 
     * @param encodingId Id of the encoding (required)
     * @param objectDetectionId Id of the object detection configuration (required)
     * @return List&lt;ObjectDetectionResult&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<ObjectDetectionResult> list(String encodingId, String objectDetectionId) throws BitmovinException {
        return this.apiClient.list(encodingId, objectDetectionId, new HashMap<String, Object>()).getData().getResult();
    }
    /**
     * List object detection results
     * 
     * @param encodingId Id of the encoding (required)
     * @param objectDetectionId Id of the object detection configuration (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;ObjectDetectionResult&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<ObjectDetectionResult> list(String encodingId, String objectDetectionId, ObjectDetectionResultListQueryParams queryParams) throws BitmovinException {
        return this.apiClient.list(encodingId, objectDetectionId, queryParams).getData().getResult();
    }
    
    interface ResultsApiClient {
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/machine-learning/object-detection/{object_detection_id}/results")
        ResponseEnvelope<PaginationResponse<ObjectDetectionResult>> list(@Param(value = "encoding_id") String encodingId, @Param(value = "object_detection_id") String objectDetectionId, @QueryMap Map<String, Object> queryParams) throws BitmovinException;
    }
}
