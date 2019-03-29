package com.bitmovin.api.sdk.encoding.filters.scale;

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
import com.bitmovin.api.sdk.encoding.filters.scale.customdata.CustomdataApi;

public class ScaleApi {
    public final CustomdataApi customdata;

    private final ScaleApiClient apiClient;

    public ScaleApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(ScaleApiClient.class);

        this.customdata = new CustomdataApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of ScaleApi
     */
    public static BitmovinApiBuilder<ScaleApi> builder() {
        return new BitmovinApiBuilder<>(ScaleApi.class);
    }
    
    /**
     * Create Scale Filter
     * 
     * @param scaleFilter  (optional)
     * @return ScaleFilter
     * @throws BitmovinException if fails to make API call
     */
    public ScaleFilter create(ScaleFilter scaleFilter) throws BitmovinException {
        return this.apiClient.create(scaleFilter).getData().getResult();
    }
    
    /**
     * Delete Scale Filter
     * 
     * @param filterId Id of the scale filter (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse delete(String filterId) throws BitmovinException {
        return this.apiClient.delete(filterId).getData().getResult();
    }
    
    /**
     * Scale Filter Details
     * 
     * @param filterId Id of the scale filter (required)
     * @return ScaleFilter
     * @throws BitmovinException if fails to make API call
     */
    public ScaleFilter get(String filterId) throws BitmovinException {
        return this.apiClient.get(filterId).getData().getResult();
    }
    
    /**
     * List Scale Filters
     * 
     * @return List&lt;ScaleFilter&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<ScaleFilter> list() throws BitmovinException {
        return this.apiClient.list(new HashMap<String, Object>()).getData().getResult();
    }
    /**
     * List Scale Filters
     * 
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;ScaleFilter&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<ScaleFilter> list(ScaleFilterListQueryParams queryParams) throws BitmovinException {
        return this.apiClient.list(queryParams).getData().getResult();
    }
    
    interface ScaleApiClient {
    
        @RequestLine("POST /encoding/filters/scale")
        ResponseEnvelope<ScaleFilter> create(ScaleFilter scaleFilter) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/filters/scale/{filter_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "filter_id") String filterId) throws BitmovinException;
    
        @RequestLine("GET /encoding/filters/scale/{filter_id}")
        ResponseEnvelope<ScaleFilter> get(@Param(value = "filter_id") String filterId) throws BitmovinException;
    
        @RequestLine("GET /encoding/filters/scale")
        ResponseEnvelope<PaginationResponse<ScaleFilter>> list(@QueryMap Map<String, Object> queryParams) throws BitmovinException;
    }
}
