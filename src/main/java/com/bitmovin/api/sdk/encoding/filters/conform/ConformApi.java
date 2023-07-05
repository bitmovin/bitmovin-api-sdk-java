package com.bitmovin.api.sdk.encoding.filters.conform;

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
import com.bitmovin.api.sdk.encoding.filters.conform.customdata.CustomdataApi;

public class ConformApi {
    public final CustomdataApi customdata;

    private final ConformApiClient apiClient;

    public ConformApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(ConformApiClient.class);

        this.customdata = new CustomdataApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of ConformApi
     */
    public static BitmovinApiBuilder<ConformApi> builder() {
        return new BitmovinApiBuilder<>(ConformApi.class);
    }

    /**
     * Create Conform Filter
     * Retains all frames of the input. The playback speed of the output will be slower or faster.
     * @param conformFilter The Conform Filter to be created (required)
     * @return ConformFilter
     * @throws BitmovinException if fails to make API call
     */
    public ConformFilter create(ConformFilter conformFilter) throws BitmovinException {
        try {
            return this.apiClient.create(conformFilter).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * Delete Conform Filter
     * 
     * @param filterId Id of the conform filter (required)
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
     * Conform Filter Details
     * 
     * @param filterId Id of the conform filter (required)
     * @return ConformFilter
     * @throws BitmovinException if fails to make API call
     */
    public ConformFilter get(String filterId) throws BitmovinException {
        try {
            return this.apiClient.get(filterId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * List Conform Filters
     * 
     * @return List&lt;ConformFilter&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<ConformFilter> list() throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * List Conform Filters
     * 
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;ConformFilter&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<ConformFilter> list(ConformFilterListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface ConformApiClient {

        @RequestLine("POST /encoding/filters/conform")
        ResponseEnvelope<ConformFilter> create(ConformFilter conformFilter) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/filters/conform/{filter_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "filter_id") String filterId) throws BitmovinException;
    
        @RequestLine("GET /encoding/filters/conform/{filter_id}")
        ResponseEnvelope<ConformFilter> get(@Param(value = "filter_id") String filterId) throws BitmovinException;
    
        @RequestLine("GET /encoding/filters/conform")
        ResponseEnvelope<PaginationResponse<ConformFilter>> list(@QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    }
}
