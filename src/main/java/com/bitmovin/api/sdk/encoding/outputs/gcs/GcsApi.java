package com.bitmovin.api.sdk.encoding.outputs.gcs;

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
import com.bitmovin.api.sdk.common.BitmovinApiBuilder;
import com.bitmovin.api.sdk.common.BitmovinApiClientFactory;
import com.bitmovin.api.sdk.encoding.outputs.gcs.customdata.CustomdataApi;

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
     * Create GCS Output
     * 
     * @param gcsOutput The GCS output to be created (required)
     * @return GcsOutput
     * @throws BitmovinException if fails to make API call
     */
    public GcsOutput create(GcsOutput gcsOutput) throws BitmovinException {
        try {
            return this.apiClient.create(gcsOutput).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * Delete GCS Output
     * 
     * @param outputId Id of the output (required)
     * @return GcsOutput
     * @throws BitmovinException if fails to make API call
     */
    public GcsOutput delete(String outputId) throws BitmovinException {
        try {
            return this.apiClient.delete(outputId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * GCS Output Details
     * 
     * @param outputId Id of the output (required)
     * @return GcsOutput
     * @throws BitmovinException if fails to make API call
     */
    public GcsOutput get(String outputId) throws BitmovinException {
        try {
            return this.apiClient.get(outputId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * List GCS Outputs
     * 
     * @return List&lt;GcsOutput&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<GcsOutput> list() throws BitmovinException {
        try {
            return this.apiClient.list(new HashMap<String, Object>()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * List GCS Outputs
     * 
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;GcsOutput&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<GcsOutput> list(GcsOutputListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(queryParams).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    interface GcsApiClient {
    
        @RequestLine("POST /encoding/outputs/gcs")
        ResponseEnvelope<GcsOutput> create(GcsOutput gcsOutput) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/outputs/gcs/{output_id}")
        ResponseEnvelope<GcsOutput> delete(@Param(value = "output_id") String outputId) throws BitmovinException;
    
        @RequestLine("GET /encoding/outputs/gcs/{output_id}")
        ResponseEnvelope<GcsOutput> get(@Param(value = "output_id") String outputId) throws BitmovinException;
    
        @RequestLine("GET /encoding/outputs/gcs")
        ResponseEnvelope<PaginationResponse<GcsOutput>> list(@QueryMap Map<String, Object> queryParams) throws BitmovinException;
    }
}
