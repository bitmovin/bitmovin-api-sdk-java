package com.bitmovin.api.sdk.encoding.statistics.encodings.vod;

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
import com.bitmovin.api.sdk.common.BitmovinApiBuilder;
import com.bitmovin.api.sdk.common.BitmovinApiClientFactory;

public class VodApi {

    private final VodApiClient apiClient;

    public VodApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(VodApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of VodApi
     */
    public static BitmovinApiBuilder<VodApi> builder() {
        return new BitmovinApiBuilder<>(VodApi.class);
    }
    
    /**
     * List VOD Encoding Statistics
     * 
     * @return List&lt;EncodingStatisticsVod&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<EncodingStatisticsVod> list() throws BitmovinException {
        try {
            return this.apiClient.list(new HashMap<String, Object>()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * List VOD Encoding Statistics
     * 
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;EncodingStatisticsVod&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<EncodingStatisticsVod> list(EncodingStatisticsVodListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(queryParams).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * List VOD Encoding Statistics Within Specific Dates
     * 
     * @param from Start date, format: yyyy-MM-dd (required)
     * @param to End date, format: yyyy-MM-dd (required)
     * @return List&lt;EncodingStatisticsVod&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<EncodingStatisticsVod> listByDateRange(Date from, Date to) throws BitmovinException {
        try {
            return this.apiClient.listByDateRange(from, to, new HashMap<String, Object>()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * List VOD Encoding Statistics Within Specific Dates
     * 
     * @param from Start date, format: yyyy-MM-dd (required)
     * @param to End date, format: yyyy-MM-dd (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;EncodingStatisticsVod&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<EncodingStatisticsVod> listByDateRange(Date from, Date to, EncodingStatisticsVodListByDateRangeQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.listByDateRange(from, to, queryParams).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    interface VodApiClient {
    
        @RequestLine("GET /encoding/statistics/encodings/vod")
        ResponseEnvelope<PaginationResponse<EncodingStatisticsVod>> list(@QueryMap Map<String, Object> queryParams) throws BitmovinException;
    
        @RequestLine("GET /encoding/statistics/encodings/vod/{from}/{to}")
        ResponseEnvelope<PaginationResponse<EncodingStatisticsVod>> listByDateRange(@Param(value = "from", expander = BitmovinDateExpander.class) Date from, @Param(value = "to", expander = BitmovinDateExpander.class) Date to, @QueryMap Map<String, Object> queryParams) throws BitmovinException;
    }
}
