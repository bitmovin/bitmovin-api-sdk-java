package com.bitmovin.api.sdk.encoding.filters.ebuR128SinglePass;

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
import com.bitmovin.api.sdk.encoding.filters.ebuR128SinglePass.customdata.CustomdataApi;

public class EbuR128SinglePassApi {
    public final CustomdataApi customdata;

    private final EbuR128SinglePassApiClient apiClient;

    public EbuR128SinglePassApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(EbuR128SinglePassApiClient.class);

        this.customdata = new CustomdataApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of EbuR128SinglePassApi
     */
    public static BitmovinApiBuilder<EbuR128SinglePassApi> builder() {
        return new BitmovinApiBuilder<>(EbuR128SinglePassApi.class);
    }
    
    /**
     * Create EBU R128 Single Pass Filter
     * 
     * @param ebuR128SinglePassFilter The EBU R128 Single Pass Filter to be created (required)
     * @return EbuR128SinglePassFilter
     * @throws BitmovinException if fails to make API call
     */
    public EbuR128SinglePassFilter create(EbuR128SinglePassFilter ebuR128SinglePassFilter) throws BitmovinException {
        try {
            return this.apiClient.create(ebuR128SinglePassFilter).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * Delete EBU R128 Single Pass Filter
     * 
     * @param filterId Id of the EBU R128 Single Pass filter. (required)
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
     * EBU R128 Single Pass Filter Details
     * 
     * @param filterId Id of the EBU R128 Single Pass filter. (required)
     * @return EbuR128SinglePassFilter
     * @throws BitmovinException if fails to make API call
     */
    public EbuR128SinglePassFilter get(String filterId) throws BitmovinException {
        try {
            return this.apiClient.get(filterId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * List EBU R128 Single Pass Filters
     * 
     * @return List&lt;EbuR128SinglePassFilter&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<EbuR128SinglePassFilter> list() throws BitmovinException {
        try {
            return this.apiClient.list(new HashMap<String, Object>()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * List EBU R128 Single Pass Filters
     * 
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;EbuR128SinglePassFilter&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<EbuR128SinglePassFilter> list(EbuR128SinglePassFilterListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(queryParams).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    interface EbuR128SinglePassApiClient {
    
        @RequestLine("POST /encoding/filters/ebu-r128-single-pass")
        ResponseEnvelope<EbuR128SinglePassFilter> create(EbuR128SinglePassFilter ebuR128SinglePassFilter) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/filters/ebu-r128-single-pass/{filter_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "filter_id") String filterId) throws BitmovinException;
    
        @RequestLine("GET /encoding/filters/ebu-r128-single-pass/{filter_id}")
        ResponseEnvelope<EbuR128SinglePassFilter> get(@Param(value = "filter_id") String filterId) throws BitmovinException;
    
        @RequestLine("GET /encoding/filters/ebu-r128-single-pass")
        ResponseEnvelope<PaginationResponse<EbuR128SinglePassFilter>> list(@QueryMap Map<String, Object> queryParams) throws BitmovinException;
    }
}
