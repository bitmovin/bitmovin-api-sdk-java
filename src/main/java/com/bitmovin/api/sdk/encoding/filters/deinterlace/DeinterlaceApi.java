package com.bitmovin.api.sdk.encoding.filters.deinterlace;

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
import com.bitmovin.api.sdk.encoding.filters.deinterlace.customdata.CustomdataApi;

public class DeinterlaceApi {
    public final CustomdataApi customdata;

    private final DeinterlaceApiClient apiClient;

    public DeinterlaceApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(DeinterlaceApiClient.class);

        this.customdata = new CustomdataApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of DeinterlaceApi
     */
    public static BitmovinApiBuilder<DeinterlaceApi> builder() {
        return new BitmovinApiBuilder<>(DeinterlaceApi.class);
    }
    
    /**
     * Create Deinterlace Filter
     * 
     * @param deinterlaceFilter  (required)
     * @return DeinterlaceFilter
     * @throws BitmovinException if fails to make API call
     */
    public DeinterlaceFilter create(DeinterlaceFilter deinterlaceFilter) throws BitmovinException {
        return this.apiClient.create(deinterlaceFilter).getData().getResult();
    }
    
    /**
     * Delete Deinterlace Filter
     * 
     * @param filterId Id of the deinterlace filter (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse delete(String filterId) throws BitmovinException {
        return this.apiClient.delete(filterId).getData().getResult();
    }
    
    /**
     * Deinterlace Filter Details
     * 
     * @param filterId Id of the deinterlace filter (required)
     * @return DeinterlaceFilter
     * @throws BitmovinException if fails to make API call
     */
    public DeinterlaceFilter get(String filterId) throws BitmovinException {
        return this.apiClient.get(filterId).getData().getResult();
    }
    
    /**
     * List Deinterlace Filters
     * 
     * @return List&lt;DeinterlaceFilter&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<DeinterlaceFilter> list() throws BitmovinException {
        return this.apiClient.list(new HashMap<String, Object>()).getData().getResult();
    }
    /**
     * List Deinterlace Filters
     * 
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;DeinterlaceFilter&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<DeinterlaceFilter> list(DeinterlaceFilterListQueryParams queryParams) throws BitmovinException {
        return this.apiClient.list(queryParams).getData().getResult();
    }
    
    interface DeinterlaceApiClient {
    
        @RequestLine("POST /encoding/filters/deinterlace")
        ResponseEnvelope<DeinterlaceFilter> create(DeinterlaceFilter deinterlaceFilter) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/filters/deinterlace/{filter_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "filter_id") String filterId) throws BitmovinException;
    
        @RequestLine("GET /encoding/filters/deinterlace/{filter_id}")
        ResponseEnvelope<DeinterlaceFilter> get(@Param(value = "filter_id") String filterId) throws BitmovinException;
    
        @RequestLine("GET /encoding/filters/deinterlace")
        ResponseEnvelope<PaginationResponse<DeinterlaceFilter>> list(@QueryMap Map<String, Object> queryParams) throws BitmovinException;
    }
}
