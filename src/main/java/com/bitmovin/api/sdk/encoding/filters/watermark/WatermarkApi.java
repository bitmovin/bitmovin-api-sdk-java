package com.bitmovin.api.sdk.encoding.filters.watermark;

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
import com.bitmovin.api.sdk.encoding.filters.watermark.customdata.CustomdataApi;

public class WatermarkApi {
    public final CustomdataApi customdata;

    private final WatermarkApiClient apiClient;

    public WatermarkApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(WatermarkApiClient.class);

        this.customdata = new CustomdataApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of WatermarkApi
     */
    public static BitmovinApiBuilder<WatermarkApi> builder() {
        return new BitmovinApiBuilder<>(WatermarkApi.class);
    }
    
    /**
     * Create Watermark Filter
     * 
     * @param watermarkFilter The Watermark Filter to be created. Only one horizontal and one vertical distance parameter is allowed, either top or bottom, and either left or right. See example body. (required)
     * @return WatermarkFilter
     * @throws BitmovinException if fails to make API call
     */
    public WatermarkFilter create(WatermarkFilter watermarkFilter) throws BitmovinException {
        try {
            return this.apiClient.create(watermarkFilter).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * Delete Watermark Filter
     * 
     * @param filterId Id of the Watermark Filter. (required)
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
     * Watermark Filter Details
     * 
     * @param filterId Id of the Watermark Filter. (required)
     * @return WatermarkFilter
     * @throws BitmovinException if fails to make API call
     */
    public WatermarkFilter get(String filterId) throws BitmovinException {
        try {
            return this.apiClient.get(filterId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * List Watermark Filters
     * 
     * @return List&lt;WatermarkFilter&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<WatermarkFilter> list() throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * List Watermark Filters
     * 
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;WatermarkFilter&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<WatermarkFilter> list(WatermarkFilterListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    interface WatermarkApiClient {
    
        @RequestLine("POST /encoding/filters/watermark")
        ResponseEnvelope<WatermarkFilter> create(WatermarkFilter watermarkFilter) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/filters/watermark/{filter_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "filter_id") String filterId) throws BitmovinException;
    
        @RequestLine("GET /encoding/filters/watermark/{filter_id}")
        ResponseEnvelope<WatermarkFilter> get(@Param(value = "filter_id") String filterId) throws BitmovinException;
    
        @RequestLine("GET /encoding/filters/watermark")
        ResponseEnvelope<PaginationResponse<WatermarkFilter>> list(@QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    }
}
