package com.bitmovin.api.sdk.encoding.filters.enhancedDeinterlace;

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
import com.bitmovin.api.sdk.encoding.filters.enhancedDeinterlace.customdata.CustomdataApi;

public class EnhancedDeinterlaceApi {
    public final CustomdataApi customdata;

    private final EnhancedDeinterlaceApiClient apiClient;

    public EnhancedDeinterlaceApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(EnhancedDeinterlaceApiClient.class);

        this.customdata = new CustomdataApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of EnhancedDeinterlaceApi
     */
    public static BitmovinApiBuilder<EnhancedDeinterlaceApi> builder() {
        return new BitmovinApiBuilder<>(EnhancedDeinterlaceApi.class);
    }
    
    /**
     * Create Enhanced Deinterlace Filter
     * 
     * @param enhancedDeinterlaceFilter The Enhanced Deinterlace Filter to be created (required)
     * @return EnhancedDeinterlaceFilter
     * @throws BitmovinException if fails to make API call
     */
    public EnhancedDeinterlaceFilter create(EnhancedDeinterlaceFilter enhancedDeinterlaceFilter) throws BitmovinException {
        try {
            return this.apiClient.create(enhancedDeinterlaceFilter).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * Delete Enhanced Deinterlace Filter
     * 
     * @param filterId Id of the Enhanced Deinterlace Filter (required)
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
     * Enhanced Deinterlace Filter Details
     * 
     * @param filterId Id of the Enhanced Deinterlace Filter (required)
     * @return EnhancedDeinterlaceFilter
     * @throws BitmovinException if fails to make API call
     */
    public EnhancedDeinterlaceFilter get(String filterId) throws BitmovinException {
        try {
            return this.apiClient.get(filterId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * List Enhanced Deinterlace Filters
     * 
     * @return List&lt;EnhancedDeinterlaceFilter&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<EnhancedDeinterlaceFilter> list() throws BitmovinException {
        try {
            return this.apiClient.list(new HashMap<String, Object>()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * List Enhanced Deinterlace Filters
     * 
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;EnhancedDeinterlaceFilter&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<EnhancedDeinterlaceFilter> list(EnhancedDeinterlaceFilterListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(queryParams).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    interface EnhancedDeinterlaceApiClient {
    
        @RequestLine("POST /encoding/filters/enhanced-deinterlace")
        ResponseEnvelope<EnhancedDeinterlaceFilter> create(EnhancedDeinterlaceFilter enhancedDeinterlaceFilter) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/filters/enhanced-deinterlace/{filter_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "filter_id") String filterId) throws BitmovinException;
    
        @RequestLine("GET /encoding/filters/enhanced-deinterlace/{filter_id}")
        ResponseEnvelope<EnhancedDeinterlaceFilter> get(@Param(value = "filter_id") String filterId) throws BitmovinException;
    
        @RequestLine("GET /encoding/filters/enhanced-deinterlace")
        ResponseEnvelope<PaginationResponse<EnhancedDeinterlaceFilter>> list(@QueryMap Map<String, Object> queryParams) throws BitmovinException;
    }
}
