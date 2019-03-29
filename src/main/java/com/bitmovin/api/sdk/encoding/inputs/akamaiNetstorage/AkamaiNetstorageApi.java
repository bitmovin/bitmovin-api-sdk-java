package com.bitmovin.api.sdk.encoding.inputs.akamaiNetstorage;

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
import com.bitmovin.api.sdk.encoding.inputs.akamaiNetstorage.customdata.CustomdataApi;

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
     * Create Akamai NetStorage Input
     * 
     * @param akamaiNetStorageInput The Akamai NetStorage input to be created (optional)
     * @return AkamaiNetStorageInput
     * @throws BitmovinException if fails to make API call
     */
    public AkamaiNetStorageInput create(AkamaiNetStorageInput akamaiNetStorageInput) throws BitmovinException {
        return this.apiClient.create(akamaiNetStorageInput).getData().getResult();
    }
    
    /**
     * Delete Akamai NetStorage Input
     * 
     * @param inputId Id of the input (required)
     * @return AkamaiNetStorageInput
     * @throws BitmovinException if fails to make API call
     */
    public AkamaiNetStorageInput delete(String inputId) throws BitmovinException {
        return this.apiClient.delete(inputId).getData().getResult();
    }
    
    /**
     * Akamai NetStorage Input Details
     * 
     * @param inputId Id of the input (required)
     * @return AkamaiNetStorageInput
     * @throws BitmovinException if fails to make API call
     */
    public AkamaiNetStorageInput get(String inputId) throws BitmovinException {
        return this.apiClient.get(inputId).getData().getResult();
    }
    
    /**
     * List Akamai NetStorage Inputs
     * 
     * @return List&lt;AkamaiNetStorageInput&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<AkamaiNetStorageInput> list() throws BitmovinException {
        return this.apiClient.list(new HashMap<String, Object>()).getData().getResult();
    }
    /**
     * List Akamai NetStorage Inputs
     * 
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;AkamaiNetStorageInput&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<AkamaiNetStorageInput> list(AkamaiNetStorageInputListQueryParams queryParams) throws BitmovinException {
        return this.apiClient.list(queryParams).getData().getResult();
    }
    
    interface AkamaiNetstorageApiClient {
    
        @RequestLine("POST /encoding/inputs/akamai-netstorage")
        ResponseEnvelope<AkamaiNetStorageInput> create(AkamaiNetStorageInput akamaiNetStorageInput) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/inputs/akamai-netstorage/{input_id}")
        ResponseEnvelope<AkamaiNetStorageInput> delete(@Param(value = "input_id") String inputId) throws BitmovinException;
    
        @RequestLine("GET /encoding/inputs/akamai-netstorage/{input_id}")
        ResponseEnvelope<AkamaiNetStorageInput> get(@Param(value = "input_id") String inputId) throws BitmovinException;
    
        @RequestLine("GET /encoding/inputs/akamai-netstorage")
        ResponseEnvelope<PaginationResponse<AkamaiNetStorageInput>> list(@QueryMap Map<String, Object> queryParams) throws BitmovinException;
    }
}
