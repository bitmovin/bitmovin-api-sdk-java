package com.bitmovin.api.sdk.encoding.filters.unsharp;

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
import com.bitmovin.api.sdk.encoding.filters.unsharp.customdata.CustomdataApi;

public class UnsharpApi {
    public final CustomdataApi customdata;

    private final UnsharpApiClient apiClient;

    public UnsharpApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(UnsharpApiClient.class);

        this.customdata = new CustomdataApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of UnsharpApi
     */
    public static BitmovinApiBuilder<UnsharpApi> builder() {
        return new BitmovinApiBuilder<>(UnsharpApi.class);
    }
    
    /**
     * Create Unsharp Filter
     * 
     * @param unsharpFilter The Unsharp Filter to be created (required)
     * @return UnsharpFilter
     * @throws BitmovinException if fails to make API call
     */
    public UnsharpFilter create(UnsharpFilter unsharpFilter) throws BitmovinException {
        try {
            return this.apiClient.create(unsharpFilter).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * Delete Unsharp Filter
     * 
     * @param filterId Id of the unsharp filter (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse delete(String filterId) throws BitmovinException {
        try {
            return this.apiClient.delete(filterId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * Unsharp Filter Details
     * 
     * @param filterId Id of the unsharp filter (required)
     * @return UnsharpFilter
     * @throws BitmovinException if fails to make API call
     */
    public UnsharpFilter get(String filterId) throws BitmovinException {
        try {
            return this.apiClient.get(filterId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * List Unsharp Filters
     * 
     * @return List&lt;UnsharpFilter&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<UnsharpFilter> list() throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * List Unsharp Filters
     * 
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;UnsharpFilter&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<UnsharpFilter> list(UnsharpFilterListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    interface UnsharpApiClient {
    
        @RequestLine("POST /encoding/filters/unsharp")
        ResponseEnvelope<UnsharpFilter> create(UnsharpFilter unsharpFilter) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/filters/unsharp/{filter_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "filter_id") String filterId) throws BitmovinException;
    
        @RequestLine("GET /encoding/filters/unsharp/{filter_id}")
        ResponseEnvelope<UnsharpFilter> get(@Param(value = "filter_id") String filterId) throws BitmovinException;
    
        @RequestLine("GET /encoding/filters/unsharp")
        ResponseEnvelope<PaginationResponse<UnsharpFilter>> list(@QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    }
}
