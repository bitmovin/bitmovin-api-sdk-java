package com.bitmovin.api.sdk.encoding.inputs.https;

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
import com.bitmovin.api.sdk.encoding.inputs.https.customdata.CustomdataApi;

public class HttpsApi {
    public final CustomdataApi customdata;

    private final HttpsApiClient apiClient;

    public HttpsApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(HttpsApiClient.class);

        this.customdata = new CustomdataApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of HttpsApi
     */
    public static BitmovinApiBuilder<HttpsApi> builder() {
        return new BitmovinApiBuilder<>(HttpsApi.class);
    }
    
    /**
     * Create HTTPS Input
     * 
     * @param httpsInput The Https input to be created (required)
     * @return HttpsInput
     * @throws BitmovinException if fails to make API call
     */
    public HttpsInput create(HttpsInput httpsInput) throws BitmovinException {
        try {
            return this.apiClient.create(httpsInput).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * Delete HTTPS Input
     * 
     * @param inputId Id of the input (required)
     * @return HttpsInput
     * @throws BitmovinException if fails to make API call
     */
    public HttpsInput delete(String inputId) throws BitmovinException {
        try {
            return this.apiClient.delete(inputId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * HTTPS Input Details
     * 
     * @param inputId Id of the input (required)
     * @return HttpsInput
     * @throws BitmovinException if fails to make API call
     */
    public HttpsInput get(String inputId) throws BitmovinException {
        try {
            return this.apiClient.get(inputId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * List HTTPS Inputs
     * 
     * @return List&lt;HttpsInput&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<HttpsInput> list() throws BitmovinException {
        try {
            return this.apiClient.list(new HashMap<String, Object>()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * List HTTPS Inputs
     * 
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;HttpsInput&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<HttpsInput> list(HttpsInputListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(queryParams).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    interface HttpsApiClient {
    
        @RequestLine("POST /encoding/inputs/https")
        ResponseEnvelope<HttpsInput> create(HttpsInput httpsInput) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/inputs/https/{input_id}")
        ResponseEnvelope<HttpsInput> delete(@Param(value = "input_id") String inputId) throws BitmovinException;
    
        @RequestLine("GET /encoding/inputs/https/{input_id}")
        ResponseEnvelope<HttpsInput> get(@Param(value = "input_id") String inputId) throws BitmovinException;
    
        @RequestLine("GET /encoding/inputs/https")
        ResponseEnvelope<PaginationResponse<HttpsInput>> list(@QueryMap Map<String, Object> queryParams) throws BitmovinException;
    }
}
