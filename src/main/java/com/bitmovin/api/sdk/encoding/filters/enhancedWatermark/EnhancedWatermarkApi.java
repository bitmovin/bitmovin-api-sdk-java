package com.bitmovin.api.sdk.encoding.filters.enhancedWatermark;

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
import com.bitmovin.api.sdk.encoding.filters.enhancedWatermark.customdata.CustomdataApi;

public class EnhancedWatermarkApi {
    public final CustomdataApi customdata;

    private final EnhancedWatermarkApiClient apiClient;

    public EnhancedWatermarkApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(EnhancedWatermarkApiClient.class);

        this.customdata = new CustomdataApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of EnhancedWatermarkApi
     */
    public static BitmovinApiBuilder<EnhancedWatermarkApi> builder() {
        return new BitmovinApiBuilder<>(EnhancedWatermarkApi.class);
    }
    
    /**
     * Create Enhanced Watermark Filter
     * 
     * @param enhancedWatermarkFilter Only one horizontal and one vertical distance parameter is allowed, either top or bottom, and either left or right. See example body. (optional)
     * @return EnhancedWatermarkFilter
     * @throws BitmovinException if fails to make API call
     */
    public EnhancedWatermarkFilter create(EnhancedWatermarkFilter enhancedWatermarkFilter) throws BitmovinException {
        return this.apiClient.create(enhancedWatermarkFilter).getData().getResult();
    }
    
    /**
     * Delete Enhanced Watermark Filter
     * 
     * @param filterId Id of the enhanced watermark configuration. (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse delete(String filterId) throws BitmovinException {
        return this.apiClient.delete(filterId).getData().getResult();
    }
    
    /**
     * Enhanced Watermark Filter Details
     * 
     * @param filterId Id of the enhanced watermark configuration. (required)
     * @return EnhancedWatermarkFilter
     * @throws BitmovinException if fails to make API call
     */
    public EnhancedWatermarkFilter get(String filterId) throws BitmovinException {
        return this.apiClient.get(filterId).getData().getResult();
    }
    
    /**
     * List Enhanced Watermark Filters
     * 
     * @return List&lt;EnhancedWatermarkFilter&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<EnhancedWatermarkFilter> list() throws BitmovinException {
        return this.apiClient.list(new HashMap<String, Object>()).getData().getResult();
    }
    /**
     * List Enhanced Watermark Filters
     * 
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;EnhancedWatermarkFilter&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<EnhancedWatermarkFilter> list(EnhancedWatermarkFilterListQueryParams queryParams) throws BitmovinException {
        return this.apiClient.list(queryParams).getData().getResult();
    }
    
    interface EnhancedWatermarkApiClient {
    
        @RequestLine("POST /encoding/filters/enhanced-watermark")
        ResponseEnvelope<EnhancedWatermarkFilter> create(EnhancedWatermarkFilter enhancedWatermarkFilter) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/filters/enhanced-watermark/{filter_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "filter_id") String filterId) throws BitmovinException;
    
        @RequestLine("GET /encoding/filters/enhanced-watermark/{filter_id}")
        ResponseEnvelope<EnhancedWatermarkFilter> get(@Param(value = "filter_id") String filterId) throws BitmovinException;
    
        @RequestLine("GET /encoding/filters/enhanced-watermark")
        ResponseEnvelope<PaginationResponse<EnhancedWatermarkFilter>> list(@QueryMap Map<String, Object> queryParams) throws BitmovinException;
    }
}
