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
import static com.bitmovin.api.sdk.common.BitmovinExceptionFactory.buildBitmovinException;
import com.bitmovin.api.sdk.common.BitmovinDateExpander;
import com.bitmovin.api.sdk.common.QueryMapWrapper;
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
        try {
            return this.apiClient.create(zixiInput).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * Delete Zixi input
     * 
     * @param inputId Id of the input (required)
     * @return ZixiInput
     * @throws BitmovinException if fails to make API call
     */
    public ZixiInput delete(String inputId) throws BitmovinException {
        try {
            return this.apiClient.delete(inputId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * Zixi Input Details
     * 
     * @param inputId Id of the input (required)
     * @return ZixiInput
     * @throws BitmovinException if fails to make API call
     */
    public ZixiInput get(String inputId) throws BitmovinException {
        try {
            return this.apiClient.get(inputId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * List Zixi inputs
     * 
     * @return List&lt;ZixiInput&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<ZixiInput> list() throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * List Zixi inputs
     * 
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;ZixiInput&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<ZixiInput> list(ZixiInputListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface ZixiApiClient {

        @RequestLine("POST /encoding/inputs/zixi")
        ResponseEnvelope<ZixiInput> create(ZixiInput zixiInput) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/inputs/zixi/{input_id}")
        ResponseEnvelope<ZixiInput> delete(@Param(value = "input_id") String inputId) throws BitmovinException;
    
        @RequestLine("GET /encoding/inputs/zixi/{input_id}")
        ResponseEnvelope<ZixiInput> get(@Param(value = "input_id") String inputId) throws BitmovinException;
    
        @RequestLine("GET /encoding/inputs/zixi")
        ResponseEnvelope<PaginationResponse<ZixiInput>> list(@QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    }
}
