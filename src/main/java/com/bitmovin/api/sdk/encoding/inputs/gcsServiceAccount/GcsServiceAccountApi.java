package com.bitmovin.api.sdk.encoding.inputs.gcsServiceAccount;

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
import com.bitmovin.api.sdk.encoding.inputs.gcsServiceAccount.customdata.CustomdataApi;

public class GcsServiceAccountApi {
    public final CustomdataApi customdata;

    private final GcsServiceAccountApiClient apiClient;

    public GcsServiceAccountApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(GcsServiceAccountApiClient.class);

        this.customdata = new CustomdataApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of GcsServiceAccountApi
     */
    public static BitmovinApiBuilder<GcsServiceAccountApi> builder() {
        return new BitmovinApiBuilder<>(GcsServiceAccountApi.class);
    }
    
    /**
     * Create Service Account based GCS Input
     * 
     * @param gcsServiceAccountInput The GcsInput to be created (required)
     * @return GcsServiceAccountInput
     * @throws BitmovinException if fails to make API call
     */
    public GcsServiceAccountInput create(GcsServiceAccountInput gcsServiceAccountInput) throws BitmovinException {
        try {
            return this.apiClient.create(gcsServiceAccountInput).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * Delete Service Account based GCS Input
     * 
     * @param inputId Id of the input (required)
     * @return GcsServiceAccountInput
     * @throws BitmovinException if fails to make API call
     */
    public GcsServiceAccountInput delete(String inputId) throws BitmovinException {
        try {
            return this.apiClient.delete(inputId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * List Service Account based GCS Input Details
     * 
     * @param inputId Id of the input (required)
     * @return GcsServiceAccountInput
     * @throws BitmovinException if fails to make API call
     */
    public GcsServiceAccountInput get(String inputId) throws BitmovinException {
        try {
            return this.apiClient.get(inputId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * List Service Account based GCS Inputs
     * 
     * @return List&lt;GcsServiceAccountInput&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<GcsServiceAccountInput> list() throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * List Service Account based GCS Inputs
     * 
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;GcsServiceAccountInput&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<GcsServiceAccountInput> list(GcsServiceAccountInputListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    interface GcsServiceAccountApiClient {
    
        @RequestLine("POST /encoding/inputs/gcs-service-account")
        ResponseEnvelope<GcsServiceAccountInput> create(GcsServiceAccountInput gcsServiceAccountInput) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/inputs/gcs-service-account/{input_id}")
        ResponseEnvelope<GcsServiceAccountInput> delete(@Param(value = "input_id") String inputId) throws BitmovinException;
    
        @RequestLine("GET /encoding/inputs/gcs-service-account/{input_id}")
        ResponseEnvelope<GcsServiceAccountInput> get(@Param(value = "input_id") String inputId) throws BitmovinException;
    
        @RequestLine("GET /encoding/inputs/gcs-service-account")
        ResponseEnvelope<PaginationResponse<GcsServiceAccountInput>> list(@QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    }
}
