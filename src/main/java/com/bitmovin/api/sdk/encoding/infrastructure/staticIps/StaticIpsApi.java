package com.bitmovin.api.sdk.encoding.infrastructure.staticIps;

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

public class StaticIpsApi {

    private final StaticIpsApiClient apiClient;

    public StaticIpsApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(StaticIpsApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of StaticIpsApi
     */
    public static BitmovinApiBuilder<StaticIpsApi> builder() {
        return new BitmovinApiBuilder<>(StaticIpsApi.class);
    }
    /**
     * Add Static IP Address
     * 
     * @param staticIp The static ip to be created (required)
     * @return StaticIp
     * @throws BitmovinException if fails to make API call
     */
    public StaticIp create(StaticIp staticIp) throws BitmovinException {
        try {
            return this.apiClient.create(staticIp).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * Delete Static IP Address
     * 
     * @param id Id of the Static IP Address (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse delete(String id) throws BitmovinException {
        try {
            return this.apiClient.delete(id).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * Static IP Address Details
     * 
     * @param id Id of the Static IP Address (required)
     * @return StaticIp
     * @throws BitmovinException if fails to make API call
     */
    public StaticIp get(String id) throws BitmovinException {
        try {
            return this.apiClient.get(id).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * List all Static IP Addresses
     * 
     * @return List&lt;StaticIp&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<StaticIp> list() throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * List all Static IP Addresses
     * 
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;StaticIp&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<StaticIp> list(StaticIpListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface StaticIpsApiClient { 
        @RequestLine("POST /encoding/infrastructure/static-ips")
        ResponseEnvelope<StaticIp> create(StaticIp staticIp) throws BitmovinException;
   
        @RequestLine("DELETE /encoding/infrastructure/static-ips/{id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "id") String id) throws BitmovinException;
   
        @RequestLine("GET /encoding/infrastructure/static-ips/{id}")
        ResponseEnvelope<StaticIp> get(@Param(value = "id") String id) throws BitmovinException;
   
        @RequestLine("GET /encoding/infrastructure/static-ips")
        ResponseEnvelope<PaginationResponse<StaticIp>> list(@QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    }
}
