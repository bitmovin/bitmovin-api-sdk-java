package com.bitmovin.api.sdk.analytics.outputs.azure;

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
import com.bitmovin.api.sdk.analytics.outputs.azure.customdata.CustomdataApi;

public class AzureApi {
    public final CustomdataApi customdata;

    private final AzureApiClient apiClient;

    public AzureApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(AzureApiClient.class);

        this.customdata = new CustomdataApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of AzureApi
     */
    public static BitmovinApiBuilder<AzureApi> builder() {
        return new BitmovinApiBuilder<>(AzureApi.class);
    }

    /**
     * Create Microsoft Azure Output
     * 
     * @param analyticsAzureOutput The Microsoft Azure output to be created (required)
     * @return AnalyticsAzureOutput
     * @throws BitmovinException if fails to make API call
     */
    public AnalyticsAzureOutput create(AnalyticsAzureOutput analyticsAzureOutput) throws BitmovinException {
        try {
            return this.apiClient.create(analyticsAzureOutput).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * Delete Microsoft Azure Output
     * 
     * @param outputId Id of the output (required)
     * @return AnalyticsAzureOutput
     * @throws BitmovinException if fails to make API call
     */
    public AnalyticsAzureOutput delete(String outputId) throws BitmovinException {
        try {
            return this.apiClient.delete(outputId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * Microsoft Azure Output Details
     * 
     * @param outputId Id of the output (required)
     * @return AnalyticsAzureOutput
     * @throws BitmovinException if fails to make API call
     */
    public AnalyticsAzureOutput get(String outputId) throws BitmovinException {
        try {
            return this.apiClient.get(outputId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * List Microsoft Azure Outputs
     * 
     * @return List&lt;AnalyticsAzureOutput&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<AnalyticsAzureOutput> list() throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * List Microsoft Azure Outputs
     * 
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;AnalyticsAzureOutput&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<AnalyticsAzureOutput> list(AnalyticsAzureOutputListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface AzureApiClient {

        @RequestLine("POST /analytics/outputs/azure")
        ResponseEnvelope<AnalyticsAzureOutput> create(AnalyticsAzureOutput analyticsAzureOutput) throws BitmovinException;
    
        @RequestLine("DELETE /analytics/outputs/azure/{output_id}")
        ResponseEnvelope<AnalyticsAzureOutput> delete(@Param(value = "output_id") String outputId) throws BitmovinException;
    
        @RequestLine("GET /analytics/outputs/azure/{output_id}")
        ResponseEnvelope<AnalyticsAzureOutput> get(@Param(value = "output_id") String outputId) throws BitmovinException;
    
        @RequestLine("GET /analytics/outputs/azure")
        ResponseEnvelope<PaginationResponse<AnalyticsAzureOutput>> list(@QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    }
}
