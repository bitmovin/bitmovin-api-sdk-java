package com.bitmovin.api.sdk.encoding.inputs.udpMulticast;

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
import com.bitmovin.api.sdk.encoding.inputs.udpMulticast.customdata.CustomdataApi;

public class UdpMulticastApi {
    public final CustomdataApi customdata;

    private final UdpMulticastApiClient apiClient;

    public UdpMulticastApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(UdpMulticastApiClient.class);

        this.customdata = new CustomdataApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of UdpMulticastApi
     */
    public static BitmovinApiBuilder<UdpMulticastApi> builder() {
        return new BitmovinApiBuilder<>(UdpMulticastApi.class);
    }
    
    /**
     * Create UDP multicast input
     * 
     * @param udpMulticastInput The UdpMulticastInput to be created (required)
     * @return UdpMulticastInput
     * @throws BitmovinException if fails to make API call
     */
    public UdpMulticastInput create(UdpMulticastInput udpMulticastInput) throws BitmovinException {
        return this.apiClient.create(udpMulticastInput).getData().getResult();
    }
    
    /**
     * Delete UDP multicast input
     * 
     * @param inputId Id of the input (required)
     * @return UdpMulticastInput
     * @throws BitmovinException if fails to make API call
     */
    public UdpMulticastInput delete(String inputId) throws BitmovinException {
        return this.apiClient.delete(inputId).getData().getResult();
    }
    
    /**
     * UDP multicast Input Details
     * 
     * @param inputId Id of the input (required)
     * @return UdpMulticastInput
     * @throws BitmovinException if fails to make API call
     */
    public UdpMulticastInput get(String inputId) throws BitmovinException {
        return this.apiClient.get(inputId).getData().getResult();
    }
    
    /**
     * List UDP multicast inputs
     * 
     * @return List&lt;UdpMulticastInput&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<UdpMulticastInput> list() throws BitmovinException {
        return this.apiClient.list(new HashMap<String, Object>()).getData().getResult();
    }
    /**
     * List UDP multicast inputs
     * 
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;UdpMulticastInput&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<UdpMulticastInput> list(UdpMulticastInputListQueryParams queryParams) throws BitmovinException {
        return this.apiClient.list(queryParams).getData().getResult();
    }
    
    interface UdpMulticastApiClient {
    
        @RequestLine("POST /encoding/inputs/udp-multicast")
        ResponseEnvelope<UdpMulticastInput> create(UdpMulticastInput udpMulticastInput) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/inputs/udp-multicast/{input_id}")
        ResponseEnvelope<UdpMulticastInput> delete(@Param(value = "input_id") String inputId) throws BitmovinException;
    
        @RequestLine("GET /encoding/inputs/udp-multicast/{input_id}")
        ResponseEnvelope<UdpMulticastInput> get(@Param(value = "input_id") String inputId) throws BitmovinException;
    
        @RequestLine("GET /encoding/inputs/udp-multicast")
        ResponseEnvelope<PaginationResponse<UdpMulticastInput>> list(@QueryMap Map<String, Object> queryParams) throws BitmovinException;
    }
}
