package com.bitmovin.api.sdk.encoding.inputs.http;

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
import com.bitmovin.api.sdk.encoding.inputs.http.customdata.CustomdataApi;

public class HttpApi {
    public final CustomdataApi customdata;

    private final HttpApiClient apiClient;

    public HttpApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(HttpApiClient.class);

        this.customdata = new CustomdataApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of HttpApi
     */
    public static BitmovinApiBuilder<HttpApi> builder() {
        return new BitmovinApiBuilder<>(HttpApi.class);
    }

    /**
     * Create HTTP Input
     * 
     * @param httpInput The HTTP input to be created (required)
     * @return HttpInput
     * @throws BitmovinException if fails to make API call
     */
    public HttpInput create(HttpInput httpInput) throws BitmovinException {
        try {
            return this.apiClient.create(httpInput).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * Delete HTTP Input
     * 
     * @param inputId Id of the input (required)
     * @return HttpInput
     * @throws BitmovinException if fails to make API call
     */
    public HttpInput delete(String inputId) throws BitmovinException {
        try {
            return this.apiClient.delete(inputId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * HTTP Input Details
     * 
     * @param inputId Id of the input (required)
     * @return HttpInput
     * @throws BitmovinException if fails to make API call
     */
    public HttpInput get(String inputId) throws BitmovinException {
        try {
            return this.apiClient.get(inputId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * List HTTP Inputs
     * 
     * @return List&lt;HttpInput&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<HttpInput> list() throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * List HTTP Inputs
     * 
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;HttpInput&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<HttpInput> list(HttpInputListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface HttpApiClient {

        @RequestLine("POST /encoding/inputs/http")
        ResponseEnvelope<HttpInput> create(HttpInput httpInput) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/inputs/http/{input_id}")
        ResponseEnvelope<HttpInput> delete(@Param(value = "input_id") String inputId) throws BitmovinException;
    
        @RequestLine("GET /encoding/inputs/http/{input_id}")
        ResponseEnvelope<HttpInput> get(@Param(value = "input_id") String inputId) throws BitmovinException;
    
        @RequestLine("GET /encoding/inputs/http")
        ResponseEnvelope<PaginationResponse<HttpInput>> list(@QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    }
}
