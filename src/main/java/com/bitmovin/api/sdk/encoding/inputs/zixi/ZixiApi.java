package com.bitmovin.api.sdk.encoding.inputs.zixi;

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
import com.bitmovin.api.sdk.encoding.inputs.zixi.customdata.CustomdataApi;

public class ZixiApi {
    public final CustomdataApi customdata;

    private final ZixiApiClient apiClient;

    public ZixiApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(ZixiApiClient.class);

        this.customdata = new CustomdataApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of ZixiApi
     */
    public static BitmovinApiBuilder<ZixiApi> builder() {
        return new BitmovinApiBuilder<>(ZixiApi.class);
    }
    
    /**
     * Create Zixi input
     * 
     * @param zixiInput The ZixiInput to be created (required)
     * @return ZixiInput
     * @throws BitmovinException if fails to make API call
     */
    public ZixiInput create(ZixiInput zixiInput) throws BitmovinException {
        return this.apiClient.create(zixiInput).getData().getResult();
    }
    
    /**
     * Delete Zixi input
     * 
     * @param inputId Id of the input (required)
     * @return ZixiInput
     * @throws BitmovinException if fails to make API call
     */
    public ZixiInput delete(String inputId) throws BitmovinException {
        return this.apiClient.delete(inputId).getData().getResult();
    }
    
    /**
     * Zixi Input Details
     * 
     * @param inputId Id of the input (required)
     * @return ZixiInput
     * @throws BitmovinException if fails to make API call
     */
    public ZixiInput get(String inputId) throws BitmovinException {
        return this.apiClient.get(inputId).getData().getResult();
    }
    
    /**
     * List Zixi inputs
     * 
     * @return List&lt;ZixiInput&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<ZixiInput> list() throws BitmovinException {
        return this.apiClient.list(new HashMap<String, Object>()).getData().getResult();
    }
    /**
     * List Zixi inputs
     * 
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;ZixiInput&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<ZixiInput> list(ZixiInputListQueryParams queryParams) throws BitmovinException {
        return this.apiClient.list(queryParams).getData().getResult();
    }
    
    interface ZixiApiClient {
    
        @RequestLine("POST /encoding/inputs/zixi")
        ResponseEnvelope<ZixiInput> create(ZixiInput zixiInput) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/inputs/zixi/{input_id}")
        ResponseEnvelope<ZixiInput> delete(@Param(value = "input_id") String inputId) throws BitmovinException;
    
        @RequestLine("GET /encoding/inputs/zixi/{input_id}")
        ResponseEnvelope<ZixiInput> get(@Param(value = "input_id") String inputId) throws BitmovinException;
    
        @RequestLine("GET /encoding/inputs/zixi")
        ResponseEnvelope<PaginationResponse<ZixiInput>> list(@QueryMap Map<String, Object> queryParams) throws BitmovinException;
    }
}
