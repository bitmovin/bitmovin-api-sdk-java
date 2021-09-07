package com.bitmovin.api.sdk.encoding.outputs.gcsServiceAccount;

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
import com.bitmovin.api.sdk.encoding.outputs.gcsServiceAccount.customdata.CustomdataApi;

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
     * Create Service Account based GCS Output
     * 
     * @param gcsServiceAccountOutput The GCS output to be created (required)
     * @return GcsServiceAccountOutput
     * @throws BitmovinException if fails to make API call
     */
    public GcsServiceAccountOutput create(GcsServiceAccountOutput gcsServiceAccountOutput) throws BitmovinException {
        try {
            return this.apiClient.create(gcsServiceAccountOutput).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * Delete Service Account based GCS Output
     * 
     * @param outputId Id of the output (required)
     * @return GcsServiceAccountOutput
     * @throws BitmovinException if fails to make API call
     */
    public GcsServiceAccountOutput delete(String outputId) throws BitmovinException {
        try {
            return this.apiClient.delete(outputId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * Service Account based GCS Output Details
     * 
     * @param outputId Id of the output (required)
     * @return GcsServiceAccountOutput
     * @throws BitmovinException if fails to make API call
     */
    public GcsServiceAccountOutput get(String outputId) throws BitmovinException {
        try {
            return this.apiClient.get(outputId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * List Service Account based GCS Outputs
     * 
     * @return List&lt;GcsServiceAccountOutput&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<GcsServiceAccountOutput> list() throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * List Service Account based GCS Outputs
     * 
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;GcsServiceAccountOutput&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<GcsServiceAccountOutput> list(GcsServiceAccountOutputListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface GcsServiceAccountApiClient {

        @RequestLine("POST /encoding/outputs/gcs-service-account")
        ResponseEnvelope<GcsServiceAccountOutput> create(GcsServiceAccountOutput gcsServiceAccountOutput) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/outputs/gcs-service-account/{output_id}")
        ResponseEnvelope<GcsServiceAccountOutput> delete(@Param(value = "output_id") String outputId) throws BitmovinException;
    
        @RequestLine("GET /encoding/outputs/gcs-service-account/{output_id}")
        ResponseEnvelope<GcsServiceAccountOutput> get(@Param(value = "output_id") String outputId) throws BitmovinException;
    
        @RequestLine("GET /encoding/outputs/gcs-service-account")
        ResponseEnvelope<PaginationResponse<GcsServiceAccountOutput>> list(@QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    }
}
