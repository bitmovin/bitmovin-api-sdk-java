package com.bitmovin.api.sdk.encoding.inputs.aspera;

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
import com.bitmovin.api.sdk.encoding.inputs.aspera.customdata.CustomdataApi;

public class AsperaApi {
    public final CustomdataApi customdata;

    private final AsperaApiClient apiClient;

    public AsperaApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(AsperaApiClient.class);

        this.customdata = new CustomdataApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of AsperaApi
     */
    public static BitmovinApiBuilder<AsperaApi> builder() {
        return new BitmovinApiBuilder<>(AsperaApi.class);
    }
    
    /**
     * Create Aspera Input
     * 
     * @param asperaInput The Aspera input to be created (required)
     * @return AsperaInput
     * @throws BitmovinException if fails to make API call
     */
    public AsperaInput create(AsperaInput asperaInput) throws BitmovinException {
        try {
            return this.apiClient.create(asperaInput).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * Delete Aspera Input
     * 
     * @param inputId Id of the input (required)
     * @return AsperaInput
     * @throws BitmovinException if fails to make API call
     */
    public AsperaInput delete(String inputId) throws BitmovinException {
        try {
            return this.apiClient.delete(inputId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * Aspera Input Details
     * 
     * @param inputId Id of the input (required)
     * @return AsperaInput
     * @throws BitmovinException if fails to make API call
     */
    public AsperaInput get(String inputId) throws BitmovinException {
        try {
            return this.apiClient.get(inputId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * List Aspera Inputs
     * 
     * @return List&lt;AsperaInput&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<AsperaInput> list() throws BitmovinException {
        try {
            return this.apiClient.list(new HashMap<String, Object>()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * List Aspera Inputs
     * 
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;AsperaInput&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<AsperaInput> list(AsperaInputListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(queryParams).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    interface AsperaApiClient {
    
        @RequestLine("POST /encoding/inputs/aspera")
        ResponseEnvelope<AsperaInput> create(AsperaInput asperaInput) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/inputs/aspera/{input_id}")
        ResponseEnvelope<AsperaInput> delete(@Param(value = "input_id") String inputId) throws BitmovinException;
    
        @RequestLine("GET /encoding/inputs/aspera/{input_id}")
        ResponseEnvelope<AsperaInput> get(@Param(value = "input_id") String inputId) throws BitmovinException;
    
        @RequestLine("GET /encoding/inputs/aspera")
        ResponseEnvelope<PaginationResponse<AsperaInput>> list(@QueryMap Map<String, Object> queryParams) throws BitmovinException;
    }
}
