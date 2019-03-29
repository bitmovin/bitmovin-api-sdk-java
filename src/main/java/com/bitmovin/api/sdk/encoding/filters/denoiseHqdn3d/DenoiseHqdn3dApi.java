package com.bitmovin.api.sdk.encoding.filters.denoiseHqdn3d;

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
import com.bitmovin.api.sdk.encoding.filters.denoiseHqdn3d.customdata.CustomdataApi;

public class DenoiseHqdn3dApi {
    public final CustomdataApi customdata;

    private final DenoiseHqdn3dApiClient apiClient;

    public DenoiseHqdn3dApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(DenoiseHqdn3dApiClient.class);

        this.customdata = new CustomdataApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of DenoiseHqdn3dApi
     */
    public static BitmovinApiBuilder<DenoiseHqdn3dApi> builder() {
        return new BitmovinApiBuilder<>(DenoiseHqdn3dApi.class);
    }
    
    /**
     * Create Denoise hqdn3d Filter
     * 
     * @param denoiseHqdn3dFilter TODO Add Description (optional)
     * @return DenoiseHqdn3dFilter
     * @throws BitmovinException if fails to make API call
     */
    public DenoiseHqdn3dFilter create(DenoiseHqdn3dFilter denoiseHqdn3dFilter) throws BitmovinException {
        return this.apiClient.create(denoiseHqdn3dFilter).getData().getResult();
    }
    
    /**
     * Delete Denoise hqdn3d Filter
     * 
     * @param filterId Id of the denoise hqdn3d filter (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse delete(String filterId) throws BitmovinException {
        return this.apiClient.delete(filterId).getData().getResult();
    }
    
    /**
     * Denoise hqdn3d Filter Details
     * 
     * @param filterId Id of the denoise hqdn3d filter (required)
     * @return DenoiseHqdn3dFilter
     * @throws BitmovinException if fails to make API call
     */
    public DenoiseHqdn3dFilter get(String filterId) throws BitmovinException {
        return this.apiClient.get(filterId).getData().getResult();
    }
    
    /**
     * List Denoise hqdn3d Filters
     * 
     * @return List&lt;DenoiseHqdn3dFilter&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<DenoiseHqdn3dFilter> list() throws BitmovinException {
        return this.apiClient.list(new HashMap<String, Object>()).getData().getResult();
    }
    /**
     * List Denoise hqdn3d Filters
     * 
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;DenoiseHqdn3dFilter&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<DenoiseHqdn3dFilter> list(DenoiseHqdn3dFilterListQueryParams queryParams) throws BitmovinException {
        return this.apiClient.list(queryParams).getData().getResult();
    }
    
    interface DenoiseHqdn3dApiClient {
    
        @RequestLine("POST /encoding/filters/denoise-hqdn3d")
        ResponseEnvelope<DenoiseHqdn3dFilter> create(DenoiseHqdn3dFilter denoiseHqdn3dFilter) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/filters/denoise-hqdn3d/{filter_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "filter_id") String filterId) throws BitmovinException;
    
        @RequestLine("GET /encoding/filters/denoise-hqdn3d/{filter_id}")
        ResponseEnvelope<DenoiseHqdn3dFilter> get(@Param(value = "filter_id") String filterId) throws BitmovinException;
    
        @RequestLine("GET /encoding/filters/denoise-hqdn3d")
        ResponseEnvelope<PaginationResponse<DenoiseHqdn3dFilter>> list(@QueryMap Map<String, Object> queryParams) throws BitmovinException;
    }
}
