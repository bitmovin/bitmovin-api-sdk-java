package com.bitmovin.api.sdk.encoding.encodings.machineLearning.objectDetection;

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
import com.bitmovin.api.sdk.encoding.encodings.machineLearning.objectDetection.customdata.CustomdataApi;
import com.bitmovin.api.sdk.encoding.encodings.machineLearning.objectDetection.results.ResultsApi;

public class ObjectDetectionApi {
    public final CustomdataApi customdata;
    public final ResultsApi results;

    private final ObjectDetectionApiClient apiClient;

    public ObjectDetectionApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(ObjectDetectionApiClient.class);

        this.customdata = new CustomdataApi(clientFactory);
        this.results = new ResultsApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of ObjectDetectionApi
     */
    public static BitmovinApiBuilder<ObjectDetectionApi> builder() {
        return new BitmovinApiBuilder<>(ObjectDetectionApi.class);
    }
    
    /**
     * Add object detection configuration to an encoding
     * 
     * @param encodingId Id of the encoding (required)
     * @param objectDetectionConfiguration The object detection configuration to be created (required)
     * @return ObjectDetectionConfiguration
     * @throws BitmovinException if fails to make API call
     */
    public ObjectDetectionConfiguration create(String encodingId, ObjectDetectionConfiguration objectDetectionConfiguration) throws BitmovinException {
        return this.apiClient.create(encodingId, objectDetectionConfiguration).getData().getResult();
    }
    
    /**
     * Delete object detection configuration
     * 
     * @param encodingId Id of the encoding (required)
     * @param objectDetectionId Id of the object detection configuration to be deleted (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse delete(String encodingId, String objectDetectionId) throws BitmovinException {
        return this.apiClient.delete(encodingId, objectDetectionId).getData().getResult();
    }
    
    /**
     * Get object detection configuration details
     * 
     * @param encodingId Id of the encoding (required)
     * @param objectDetectionId Id of the object detection configuration (required)
     * @return ObjectDetectionConfiguration
     * @throws BitmovinException if fails to make API call
     */
    public ObjectDetectionConfiguration get(String encodingId, String objectDetectionId) throws BitmovinException {
        return this.apiClient.get(encodingId, objectDetectionId).getData().getResult();
    }
    
    /**
     * List object detection configurations of an encoding
     * 
     * @param encodingId Id of the encoding (required)
     * @return List&lt;ObjectDetectionConfiguration&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<ObjectDetectionConfiguration> list(String encodingId) throws BitmovinException {
        return this.apiClient.list(encodingId, new HashMap<String, Object>()).getData().getResult();
    }
    /**
     * List object detection configurations of an encoding
     * 
     * @param encodingId Id of the encoding (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;ObjectDetectionConfiguration&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<ObjectDetectionConfiguration> list(String encodingId, ObjectDetectionConfigurationListQueryParams queryParams) throws BitmovinException {
        return this.apiClient.list(encodingId, queryParams).getData().getResult();
    }
    
    interface ObjectDetectionApiClient {
    
        @RequestLine("POST /encoding/encodings/{encoding_id}/machine-learning/object-detection")
        ResponseEnvelope<ObjectDetectionConfiguration> create(@Param(value = "encoding_id") String encodingId, ObjectDetectionConfiguration objectDetectionConfiguration) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/encodings/{encoding_id}/machine-learning/object-detection/{object_detection_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "encoding_id") String encodingId, @Param(value = "object_detection_id") String objectDetectionId) throws BitmovinException;
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/machine-learning/object-detection/{object_detection_id}")
        ResponseEnvelope<ObjectDetectionConfiguration> get(@Param(value = "encoding_id") String encodingId, @Param(value = "object_detection_id") String objectDetectionId) throws BitmovinException;
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/machine-learning/object-detection")
        ResponseEnvelope<PaginationResponse<ObjectDetectionConfiguration>> list(@Param(value = "encoding_id") String encodingId, @QueryMap Map<String, Object> queryParams) throws BitmovinException;
    }
}
