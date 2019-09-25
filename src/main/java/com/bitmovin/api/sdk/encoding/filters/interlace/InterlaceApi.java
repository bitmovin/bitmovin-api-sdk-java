package com.bitmovin.api.sdk.encoding.filters.interlace;

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
import com.bitmovin.api.sdk.encoding.filters.interlace.customdata.CustomdataApi;

public class InterlaceApi {
    public final CustomdataApi customdata;

    private final InterlaceApiClient apiClient;

    public InterlaceApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(InterlaceApiClient.class);

        this.customdata = new CustomdataApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of InterlaceApi
     */
    public static BitmovinApiBuilder<InterlaceApi> builder() {
        return new BitmovinApiBuilder<>(InterlaceApi.class);
    }
    
    /**
     * Create Interlace Filter
     * 
     * @param interlaceFilter The Interlace Filter to be created (required)
     * @return InterlaceFilter
     * @throws BitmovinException if fails to make API call
     */
    public InterlaceFilter create(InterlaceFilter interlaceFilter) throws BitmovinException {
        try {
            return this.apiClient.create(interlaceFilter).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * Delete Interlace Filter
     * 
     * @param filterId Id of the Interlace Filter (required)
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
     * Interlace Filter Details
     * 
     * @param filterId Id of the Interlace Filter (required)
     * @return InterlaceFilter
     * @throws BitmovinException if fails to make API call
     */
    public InterlaceFilter get(String filterId) throws BitmovinException {
        try {
            return this.apiClient.get(filterId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * List Interlace Filters
     * 
     * @return List&lt;InterlaceFilter&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<InterlaceFilter> list() throws BitmovinException {
        try {
            return this.apiClient.list(new HashMap<String, Object>()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * List Interlace Filters
     * 
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;InterlaceFilter&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<InterlaceFilter> list(InterlaceFilterListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(queryParams).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    interface InterlaceApiClient {
    
        @RequestLine("POST /encoding/filters/interlace")
        ResponseEnvelope<InterlaceFilter> create(InterlaceFilter interlaceFilter) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/filters/interlace/{filter_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "filter_id") String filterId) throws BitmovinException;
    
        @RequestLine("GET /encoding/filters/interlace/{filter_id}")
        ResponseEnvelope<InterlaceFilter> get(@Param(value = "filter_id") String filterId) throws BitmovinException;
    
        @RequestLine("GET /encoding/filters/interlace")
        ResponseEnvelope<PaginationResponse<InterlaceFilter>> list(@QueryMap Map<String, Object> queryParams) throws BitmovinException;
    }
}
