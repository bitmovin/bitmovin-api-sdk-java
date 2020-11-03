package com.bitmovin.api.sdk.encoding.outputs.akamaiMsl;

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
import com.bitmovin.api.sdk.encoding.outputs.akamaiMsl.customdata.CustomdataApi;

public class AkamaiMslApi {
    public final CustomdataApi customdata;

    private final AkamaiMslApiClient apiClient;

    public AkamaiMslApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(AkamaiMslApiClient.class);

        this.customdata = new CustomdataApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of AkamaiMslApi
     */
    public static BitmovinApiBuilder<AkamaiMslApi> builder() {
        return new BitmovinApiBuilder<>(AkamaiMslApi.class);
    }
    
    /**
     * Create Akamai MSL Output
     * 
     * @param akamaiMslOutput The Akamai MSL output to be created (required)
     * @return AkamaiMslOutput
     * @throws BitmovinException if fails to make API call
     */
    public AkamaiMslOutput create(AkamaiMslOutput akamaiMslOutput) throws BitmovinException {
        try {
            return this.apiClient.create(akamaiMslOutput).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * Delete Akamai MSL Output
     * 
     * @param outputId Id of the output (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse delete(String outputId) throws BitmovinException {
        try {
            return this.apiClient.delete(outputId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * Akamai MSL Output Details
     * 
     * @param outputId Id of the output (required)
     * @return AkamaiMslOutput
     * @throws BitmovinException if fails to make API call
     */
    public AkamaiMslOutput get(String outputId) throws BitmovinException {
        try {
            return this.apiClient.get(outputId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * List Akamai MSL Outputs
     * 
     * @return List&lt;AkamaiMslOutput&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<AkamaiMslOutput> list() throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * List Akamai MSL Outputs
     * 
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;AkamaiMslOutput&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<AkamaiMslOutput> list(AkamaiMslOutputListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    interface AkamaiMslApiClient {
    
        @RequestLine("POST /encoding/outputs/akamai-msl")
        ResponseEnvelope<AkamaiMslOutput> create(AkamaiMslOutput akamaiMslOutput) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/outputs/akamai-msl/{output_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "output_id") String outputId) throws BitmovinException;
    
        @RequestLine("GET /encoding/outputs/akamai-msl/{output_id}")
        ResponseEnvelope<AkamaiMslOutput> get(@Param(value = "output_id") String outputId) throws BitmovinException;
    
        @RequestLine("GET /encoding/outputs/akamai-msl")
        ResponseEnvelope<PaginationResponse<AkamaiMslOutput>> list(@QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    }
}
