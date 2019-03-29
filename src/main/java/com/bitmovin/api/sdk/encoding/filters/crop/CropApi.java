package com.bitmovin.api.sdk.encoding.filters.crop;

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
import com.bitmovin.api.sdk.encoding.filters.crop.customdata.CustomdataApi;

public class CropApi {
    public final CustomdataApi customdata;

    private final CropApiClient apiClient;

    public CropApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(CropApiClient.class);

        this.customdata = new CustomdataApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of CropApi
     */
    public static BitmovinApiBuilder<CropApi> builder() {
        return new BitmovinApiBuilder<>(CropApi.class);
    }
    
    /**
     * Create Crop Filter
     * 
     * @param cropFilter  (optional)
     * @return CropFilter
     * @throws BitmovinException if fails to make API call
     */
    public CropFilter create(CropFilter cropFilter) throws BitmovinException {
        return this.apiClient.create(cropFilter).getData().getResult();
    }
    
    /**
     * Delete Crop Filter
     * 
     * @param filterId Id of the Crop configuration. (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse delete(String filterId) throws BitmovinException {
        return this.apiClient.delete(filterId).getData().getResult();
    }
    
    /**
     * Crop Filter Details
     * 
     * @param filterId Id of the Crop configuration. (required)
     * @return CropFilter
     * @throws BitmovinException if fails to make API call
     */
    public CropFilter get(String filterId) throws BitmovinException {
        return this.apiClient.get(filterId).getData().getResult();
    }
    
    /**
     * List Crop Filters
     * 
     * @return List&lt;CropFilter&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<CropFilter> list() throws BitmovinException {
        return this.apiClient.list(new HashMap<String, Object>()).getData().getResult();
    }
    /**
     * List Crop Filters
     * 
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;CropFilter&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<CropFilter> list(CropFilterListQueryParams queryParams) throws BitmovinException {
        return this.apiClient.list(queryParams).getData().getResult();
    }
    
    interface CropApiClient {
    
        @RequestLine("POST /encoding/filters/crop")
        ResponseEnvelope<CropFilter> create(CropFilter cropFilter) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/filters/crop/{filter_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "filter_id") String filterId) throws BitmovinException;
    
        @RequestLine("GET /encoding/filters/crop/{filter_id}")
        ResponseEnvelope<CropFilter> get(@Param(value = "filter_id") String filterId) throws BitmovinException;
    
        @RequestLine("GET /encoding/filters/crop")
        ResponseEnvelope<PaginationResponse<CropFilter>> list(@QueryMap Map<String, Object> queryParams) throws BitmovinException;
    }
}
