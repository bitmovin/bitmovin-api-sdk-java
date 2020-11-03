package com.bitmovin.api.sdk.encoding.inputs.srt;

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
import com.bitmovin.api.sdk.encoding.inputs.srt.customdata.CustomdataApi;

public class SrtApi {
    public final CustomdataApi customdata;

    private final SrtApiClient apiClient;

    public SrtApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(SrtApiClient.class);

        this.customdata = new CustomdataApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of SrtApi
     */
    public static BitmovinApiBuilder<SrtApi> builder() {
        return new BitmovinApiBuilder<>(SrtApi.class);
    }
    
    /**
     * Create SRT input
     * 
     * @param srtInput The SrtInput to be created (required)
     * @return SrtInput
     * @throws BitmovinException if fails to make API call
     */
    public SrtInput create(SrtInput srtInput) throws BitmovinException {
        try {
            return this.apiClient.create(srtInput).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * Delete SRT input
     * 
     * @param inputId Id of the input (required)
     * @return SrtInput
     * @throws BitmovinException if fails to make API call
     */
    public SrtInput delete(String inputId) throws BitmovinException {
        try {
            return this.apiClient.delete(inputId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * SRT Input Details
     * 
     * @param inputId Id of the input (required)
     * @return SrtInput
     * @throws BitmovinException if fails to make API call
     */
    public SrtInput get(String inputId) throws BitmovinException {
        try {
            return this.apiClient.get(inputId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * List SRT inputs
     * 
     * @return List&lt;SrtInput&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<SrtInput> list() throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * List SRT inputs
     * 
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;SrtInput&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<SrtInput> list(SrtInputListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    interface SrtApiClient {
    
        @RequestLine("POST /encoding/inputs/srt")
        ResponseEnvelope<SrtInput> create(SrtInput srtInput) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/inputs/srt/{input_id}")
        ResponseEnvelope<SrtInput> delete(@Param(value = "input_id") String inputId) throws BitmovinException;
    
        @RequestLine("GET /encoding/inputs/srt/{input_id}")
        ResponseEnvelope<SrtInput> get(@Param(value = "input_id") String inputId) throws BitmovinException;
    
        @RequestLine("GET /encoding/inputs/srt")
        ResponseEnvelope<PaginationResponse<SrtInput>> list(@QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    }
}
