package com.bitmovin.api.sdk.encoding.inputs.local;

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
import com.bitmovin.api.sdk.encoding.inputs.local.customdata.CustomdataApi;

public class LocalApi {
    public final CustomdataApi customdata;

    private final LocalApiClient apiClient;

    public LocalApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(LocalApiClient.class);

        this.customdata = new CustomdataApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of LocalApi
     */
    public static BitmovinApiBuilder<LocalApi> builder() {
        return new BitmovinApiBuilder<>(LocalApi.class);
    }
    
    /**
     * Create Local Input
     * 
     * @param localInput The LocalInput to be created. (required)
     * @return LocalInput
     * @throws BitmovinException if fails to make API call
     */
    public LocalInput create(LocalInput localInput) throws BitmovinException {
        try {
            return this.apiClient.create(localInput).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * Delete Local Input
     * 
     * @param inputId Id of the input (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse delete(String inputId) throws BitmovinException {
        try {
            return this.apiClient.delete(inputId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * Local Input Details
     * 
     * @param inputId Id of the input (required)
     * @return LocalInput
     * @throws BitmovinException if fails to make API call
     */
    public LocalInput get(String inputId) throws BitmovinException {
        try {
            return this.apiClient.get(inputId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * List Local Inputs
     * 
     * @return List&lt;LocalInput&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<LocalInput> list() throws BitmovinException {
        try {
            return this.apiClient.list(new HashMap<String, Object>()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * List Local Inputs
     * 
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;LocalInput&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<LocalInput> list(LocalInputListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(queryParams).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    interface LocalApiClient {
    
        @RequestLine("POST /encoding/inputs/local")
        ResponseEnvelope<LocalInput> create(LocalInput localInput) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/inputs/local/{input_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "input_id") String inputId) throws BitmovinException;
    
        @RequestLine("GET /encoding/inputs/local/{input_id}")
        ResponseEnvelope<LocalInput> get(@Param(value = "input_id") String inputId) throws BitmovinException;
    
        @RequestLine("GET /encoding/inputs/local")
        ResponseEnvelope<PaginationResponse<LocalInput>> list(@QueryMap Map<String, Object> queryParams) throws BitmovinException;
    }
}
