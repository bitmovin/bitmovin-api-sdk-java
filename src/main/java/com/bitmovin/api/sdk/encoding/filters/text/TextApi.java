package com.bitmovin.api.sdk.encoding.filters.text;

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
import com.bitmovin.api.sdk.encoding.filters.text.customdata.CustomdataApi;

public class TextApi {
    public final CustomdataApi customdata;

    private final TextApiClient apiClient;

    public TextApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(TextApiClient.class);

        this.customdata = new CustomdataApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of TextApi
     */
    public static BitmovinApiBuilder<TextApi> builder() {
        return new BitmovinApiBuilder<>(TextApi.class);
    }
    /**
     * Create Text Filter
     * 
     * @param textFilter The Text Filter to be created (required)
     * @return TextFilter
     * @throws BitmovinException if fails to make API call
     */
    public TextFilter create(TextFilter textFilter) throws BitmovinException {
        try {
            return this.apiClient.create(textFilter).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * Delete Text Filter
     * 
     * @param filterId Id of the Text Filter (required)
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
     * Text Filter Details
     * 
     * @param filterId Id of the Text Filter (required)
     * @return TextFilter
     * @throws BitmovinException if fails to make API call
     */
    public TextFilter get(String filterId) throws BitmovinException {
        try {
            return this.apiClient.get(filterId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * List Text Filters
     * 
     * @return List&lt;TextFilter&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<TextFilter> list() throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * List Text Filters
     * 
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;TextFilter&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<TextFilter> list(TextFilterListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface TextApiClient { 
        @RequestLine("POST /encoding/filters/text")
        ResponseEnvelope<TextFilter> create(TextFilter textFilter) throws BitmovinException;
   
        @RequestLine("DELETE /encoding/filters/text/{filter_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "filter_id") String filterId) throws BitmovinException;
   
        @RequestLine("GET /encoding/filters/text/{filter_id}")
        ResponseEnvelope<TextFilter> get(@Param(value = "filter_id") String filterId) throws BitmovinException;
   
        @RequestLine("GET /encoding/filters/text")
        ResponseEnvelope<PaginationResponse<TextFilter>> list(@QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    }
}
