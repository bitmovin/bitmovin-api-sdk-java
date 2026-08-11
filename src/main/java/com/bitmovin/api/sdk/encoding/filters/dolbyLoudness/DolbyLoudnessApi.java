package com.bitmovin.api.sdk.encoding.filters.dolbyLoudness;

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
import com.bitmovin.api.sdk.encoding.filters.dolbyLoudness.customdata.CustomdataApi;

public class DolbyLoudnessApi {
    public final CustomdataApi customdata;

    private final DolbyLoudnessApiClient apiClient;

    public DolbyLoudnessApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(DolbyLoudnessApiClient.class);

        this.customdata = new CustomdataApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of DolbyLoudnessApi
     */
    public static BitmovinApiBuilder<DolbyLoudnessApi> builder() {
        return new BitmovinApiBuilder<>(DolbyLoudnessApi.class);
    }
    /**
     * Create Dolby Loudness Filter
     * 
     * @param dolbyLoudnessFilter The Dolby Loudness Filter to be created (required)
     * @return DolbyLoudnessFilter
     * @throws BitmovinException if fails to make API call
     */
    public DolbyLoudnessFilter create(DolbyLoudnessFilter dolbyLoudnessFilter) throws BitmovinException {
        try {
            return this.apiClient.create(dolbyLoudnessFilter).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * Delete Dolby Loudness Filter
     * 
     * @param filterId Id of the Dolby Loudness filter. (required)
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
     * Get Dolby Loudness Filter details
     * 
     * @param filterId Id of the Dolby Loudness filter. (required)
     * @return DolbyLoudnessFilter
     * @throws BitmovinException if fails to make API call
     */
    public DolbyLoudnessFilter get(String filterId) throws BitmovinException {
        try {
            return this.apiClient.get(filterId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * List Dolby Loudness Filters
     * 
     * @return List&lt;DolbyLoudnessFilter&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<DolbyLoudnessFilter> list() throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * List Dolby Loudness Filters
     * 
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;DolbyLoudnessFilter&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<DolbyLoudnessFilter> list(DolbyLoudnessFilterListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface DolbyLoudnessApiClient { 
        @RequestLine("POST /encoding/filters/dolby-loudness")
        ResponseEnvelope<DolbyLoudnessFilter> create(DolbyLoudnessFilter dolbyLoudnessFilter) throws BitmovinException;
   
        @RequestLine("DELETE /encoding/filters/dolby-loudness/{filter_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "filter_id") String filterId) throws BitmovinException;
   
        @RequestLine("GET /encoding/filters/dolby-loudness/{filter_id}")
        ResponseEnvelope<DolbyLoudnessFilter> get(@Param(value = "filter_id") String filterId) throws BitmovinException;
   
        @RequestLine("GET /encoding/filters/dolby-loudness")
        ResponseEnvelope<PaginationResponse<DolbyLoudnessFilter>> list(@QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    }
}
