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
import static com.bitmovin.api.sdk.common.BitmovinExceptionFactory.buildBitmovinException;
import com.bitmovin.api.sdk.common.BitmovinDateExpander;
import com.bitmovin.api.sdk.common.QueryMapWrapper;
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
     * @param gcsInput The GcsInput to be created (required)
     * @return GcsInput
     * @throws BitmovinException if fails to make API call
     */
    public GcsInput create(GcsInput gcsInput) throws BitmovinException {
        try {
            return this.apiClient.create(gcsInput).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * Delete GCS Input
     * 
     * @param inputId Id of the input (required)
     * @return GcsInput
     * @throws BitmovinException if fails to make API call
     */
    public GcsInput delete(String inputId) throws BitmovinException {
        try {
            return this.apiClient.delete(inputId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * GCS Input Details
     * 
     * @param inputId Id of the input (required)
     * @return GcsInput
     * @throws BitmovinException if fails to make API call
     */
    public GcsInput get(String inputId) throws BitmovinException {
        try {
            return this.apiClient.get(inputId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * List GCS Inputs
     * 
     * @return List&lt;GcsInput&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<GcsInput> list() throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * List GCS Inputs
     * 
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;GcsInput&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<GcsInput> list(GcsInputListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    interface GcsApiClient {
    
        @RequestLine("POST /encoding/inputs/gcs")
        ResponseEnvelope<GcsInput> create(GcsInput gcsInput) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/inputs/gcs/{input_id}")
        ResponseEnvelope<GcsInput> delete(@Param(value = "input_id") String inputId) throws BitmovinException;
    
        @RequestLine("GET /encoding/inputs/gcs/{input_id}")
        ResponseEnvelope<GcsInput> get(@Param(value = "input_id") String inputId) throws BitmovinException;
    
        @RequestLine("GET /encoding/inputs/gcs")
        ResponseEnvelope<PaginationResponse<GcsInput>> list(@QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    }
}
