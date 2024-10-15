package com.bitmovin.api.sdk.encoding.filters.rotate;

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
import com.bitmovin.api.sdk.encoding.filters.rotate.customdata.CustomdataApi;

public class RotateApi {
    public final CustomdataApi customdata;

    private final RotateApiClient apiClient;

    public RotateApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(RotateApiClient.class);

        this.customdata = new CustomdataApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of RotateApi
     */
    public static BitmovinApiBuilder<RotateApi> builder() {
        return new BitmovinApiBuilder<>(RotateApi.class);
    }
    /**
     * Create Rotate Filter
     * 
     * @param rotateFilter The Rotate Filter to be created (required)
     * @return RotateFilter
     * @throws BitmovinException if fails to make API call
     */
    public RotateFilter create(RotateFilter rotateFilter) throws BitmovinException {
        try {
            return this.apiClient.create(rotateFilter).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * Delete Rotate Filter
     * 
     * @param filterId Id of the Rotate Filter. (required)
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
     * Rotate Filter Details
     * 
     * @param filterId Id of the Rotate Filter. (required)
     * @return RotateFilter
     * @throws BitmovinException if fails to make API call
     */
    public RotateFilter get(String filterId) throws BitmovinException {
        try {
            return this.apiClient.get(filterId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * List Rotate Filters
     * 
     * @return List&lt;RotateFilter&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<RotateFilter> list() throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * List Rotate Filters
     * 
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;RotateFilter&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<RotateFilter> list(RotateFilterListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface RotateApiClient { 
        @RequestLine("POST /encoding/filters/rotate")
        ResponseEnvelope<RotateFilter> create(RotateFilter rotateFilter) throws BitmovinException;
   
        @RequestLine("DELETE /encoding/filters/rotate/{filter_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "filter_id") String filterId) throws BitmovinException;
   
        @RequestLine("GET /encoding/filters/rotate/{filter_id}")
        ResponseEnvelope<RotateFilter> get(@Param(value = "filter_id") String filterId) throws BitmovinException;
   
        @RequestLine("GET /encoding/filters/rotate")
        ResponseEnvelope<PaginationResponse<RotateFilter>> list(@QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    }
}
