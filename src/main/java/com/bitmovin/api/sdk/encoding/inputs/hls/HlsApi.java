package com.bitmovin.api.sdk.encoding.inputs.hls;

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

public class HlsApi {

    private final HlsApiClient apiClient;

    public HlsApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(HlsApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of HlsApi
     */
    public static BitmovinApiBuilder<HlsApi> builder() {
        return new BitmovinApiBuilder<>(HlsApi.class);
    }
    /**
     * Create HLS input
     * 
     * @param hlsInput The HLSInput to be created (required)
     * @return HlsInput
     * @throws BitmovinException if fails to make API call
     */
    public HlsInput create(HlsInput hlsInput) throws BitmovinException {
        try {
            return this.apiClient.create(hlsInput).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * Delete HLS Input
     * 
     * @param inputId Id of the input (required)
     * @return HlsInput
     * @throws BitmovinException if fails to make API call
     */
    public HlsInput delete(String inputId) throws BitmovinException {
        try {
            return this.apiClient.delete(inputId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * HLS Input Details
     * 
     * @param inputId Id of the input (required)
     * @return HlsInput
     * @throws BitmovinException if fails to make API call
     */
    public HlsInput get(String inputId) throws BitmovinException {
        try {
            return this.apiClient.get(inputId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * List HLS inputs
     * 
     * @return List&lt;HlsInput&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<HlsInput> list() throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * List HLS inputs
     * 
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;HlsInput&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<HlsInput> list(HlsInputListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface HlsApiClient { 
        @RequestLine("POST /encoding/inputs/hls")
        ResponseEnvelope<HlsInput> create(HlsInput hlsInput) throws BitmovinException;
   
        @RequestLine("DELETE /encoding/inputs/hls/{input_id}")
        ResponseEnvelope<HlsInput> delete(@Param(value = "input_id") String inputId) throws BitmovinException;
   
        @RequestLine("GET /encoding/inputs/hls/{input_id}")
        ResponseEnvelope<HlsInput> get(@Param(value = "input_id") String inputId) throws BitmovinException;
   
        @RequestLine("GET /encoding/inputs/hls")
        ResponseEnvelope<PaginationResponse<HlsInput>> list(@QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    }
}
