package com.bitmovin.api.sdk.encoding.outputs.akamaiNetstorage;

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
import com.bitmovin.api.sdk.encoding.outputs.akamaiNetstorage.customdata.CustomdataApi;

public class AkamaiNetstorageApi {
    public final CustomdataApi customdata;

    private final AkamaiNetstorageApiClient apiClient;

    public AkamaiNetstorageApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(AkamaiNetstorageApiClient.class);

        this.customdata = new CustomdataApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of AkamaiNetstorageApi
     */
    public static BitmovinApiBuilder<AkamaiNetstorageApi> builder() {
        return new BitmovinApiBuilder<>(AkamaiNetstorageApi.class);
    }
    
    /**
     * Create Akamai NetStorage Output
     * 
     * @param akamaiNetStorageOutput The Akamai NetStorage output to be created (required)
     * @return AkamaiNetStorageOutput
     * @throws BitmovinException if fails to make API call
     */
    public AkamaiNetStorageOutput create(AkamaiNetStorageOutput akamaiNetStorageOutput) throws BitmovinException {
        try {
            return this.apiClient.create(akamaiNetStorageOutput).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * Delete Akamai NetStorage Output
     * 
     * @param outputId Id of the output (required)
     * @return AkamaiNetStorageOutput
     * @throws BitmovinException if fails to make API call
     */
    public AkamaiNetStorageOutput delete(String outputId) throws BitmovinException {
        try {
            return this.apiClient.delete(outputId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * Akamai NetStorage Output Details
     * 
     * @param outputId Id of the output (required)
     * @return AkamaiNetStorageOutput
     * @throws BitmovinException if fails to make API call
     */
    public AkamaiNetStorageOutput get(String outputId) throws BitmovinException {
        try {
            return this.apiClient.get(outputId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * List Akamai NetStorage Outputs
     * 
     * @return List&lt;AkamaiNetStorageOutput&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<AkamaiNetStorageOutput> list() throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * List Akamai NetStorage Outputs
     * 
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;AkamaiNetStorageOutput&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<AkamaiNetStorageOutput> list(AkamaiNetStorageOutputListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    interface AkamaiNetstorageApiClient {
    
        @RequestLine("POST /encoding/outputs/akamai-netstorage")
        ResponseEnvelope<AkamaiNetStorageOutput> create(AkamaiNetStorageOutput akamaiNetStorageOutput) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/outputs/akamai-netstorage/{output_id}")
        ResponseEnvelope<AkamaiNetStorageOutput> delete(@Param(value = "output_id") String outputId) throws BitmovinException;
    
        @RequestLine("GET /encoding/outputs/akamai-netstorage/{output_id}")
        ResponseEnvelope<AkamaiNetStorageOutput> get(@Param(value = "output_id") String outputId) throws BitmovinException;
    
        @RequestLine("GET /encoding/outputs/akamai-netstorage")
        ResponseEnvelope<PaginationResponse<AkamaiNetStorageOutput>> list(@QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    }
}
