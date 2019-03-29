package com.bitmovin.api.sdk.encoding.inputs.gcs;

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
import com.bitmovin.api.sdk.encoding.inputs.gcs.customdata.CustomdataApi;

public class GcsApi {
    public final CustomdataApi customdata;

    private final GcsApiClient apiClient;

    public GcsApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(GcsApiClient.class);

        this.customdata = new CustomdataApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of GcsApi
     */
    public static BitmovinApiBuilder<GcsApi> builder() {
        return new BitmovinApiBuilder<>(GcsApi.class);
    }
    
    /**
     * Create GCS Input
     * 
     * @param gcsInput The GcsInput to be created (optional)
     * @return GcsInput
     * @throws BitmovinException if fails to make API call
     */
    public GcsInput create(GcsInput gcsInput) throws BitmovinException {
        return this.apiClient.create(gcsInput).getData().getResult();
    }
    
    /**
     * Delete GCS Input
     * 
     * @param inputId Id of the input (required)
     * @return GcsInput
     * @throws BitmovinException if fails to make API call
     */
    public GcsInput delete(String inputId) throws BitmovinException {
        return this.apiClient.delete(inputId).getData().getResult();
    }
    
    /**
     * GCS Input Details
     * 
     * @param inputId Id of the input (required)
     * @return GcsInput
     * @throws BitmovinException if fails to make API call
     */
    public GcsInput get(String inputId) throws BitmovinException {
        return this.apiClient.get(inputId).getData().getResult();
    }
    
    /**
     * List GCS Inputs
     * 
     * @return List&lt;GcsInput&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<GcsInput> list() throws BitmovinException {
        return this.apiClient.list(new HashMap<String, Object>()).getData().getResult();
    }
    /**
     * List GCS Inputs
     * 
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;GcsInput&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<GcsInput> list(GcsInputListQueryParams queryParams) throws BitmovinException {
        return this.apiClient.list(queryParams).getData().getResult();
    }
    
    interface GcsApiClient {
    
        @RequestLine("POST /encoding/inputs/gcs")
        ResponseEnvelope<GcsInput> create(GcsInput gcsInput) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/inputs/gcs/{input_id}")
        ResponseEnvelope<GcsInput> delete(@Param(value = "input_id") String inputId) throws BitmovinException;
    
        @RequestLine("GET /encoding/inputs/gcs/{input_id}")
        ResponseEnvelope<GcsInput> get(@Param(value = "input_id") String inputId) throws BitmovinException;
    
        @RequestLine("GET /encoding/inputs/gcs")
        ResponseEnvelope<PaginationResponse<GcsInput>> list(@QueryMap Map<String, Object> queryParams) throws BitmovinException;
    }
}
