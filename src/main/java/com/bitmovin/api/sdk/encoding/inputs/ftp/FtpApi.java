package com.bitmovin.api.sdk.encoding.inputs.ftp;

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
import com.bitmovin.api.sdk.encoding.inputs.ftp.customdata.CustomdataApi;

public class FtpApi {
    public final CustomdataApi customdata;

    private final FtpApiClient apiClient;

    public FtpApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(FtpApiClient.class);

        this.customdata = new CustomdataApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of FtpApi
     */
    public static BitmovinApiBuilder<FtpApi> builder() {
        return new BitmovinApiBuilder<>(FtpApi.class);
    }
    
    /**
     * Create FTP Input
     * 
     * @param ftpInput The FTP input to be created (optional)
     * @return FtpInput
     * @throws BitmovinException if fails to make API call
     */
    public FtpInput create(FtpInput ftpInput) throws BitmovinException {
        return this.apiClient.create(ftpInput).getData().getResult();
    }
    
    /**
     * Delete FTP Input
     * 
     * @param inputId Id of the input (required)
     * @return FtpInput
     * @throws BitmovinException if fails to make API call
     */
    public FtpInput delete(String inputId) throws BitmovinException {
        return this.apiClient.delete(inputId).getData().getResult();
    }
    
    /**
     * FTP Input Details
     * 
     * @param inputId Id of the input (required)
     * @return FtpInput
     * @throws BitmovinException if fails to make API call
     */
    public FtpInput get(String inputId) throws BitmovinException {
        return this.apiClient.get(inputId).getData().getResult();
    }
    
    /**
     * List FTP Inputs
     * 
     * @return List&lt;FtpInput&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<FtpInput> list() throws BitmovinException {
        return this.apiClient.list(new HashMap<String, Object>()).getData().getResult();
    }
    /**
     * List FTP Inputs
     * 
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;FtpInput&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<FtpInput> list(FtpInputListQueryParams queryParams) throws BitmovinException {
        return this.apiClient.list(queryParams).getData().getResult();
    }
    
    interface FtpApiClient {
    
        @RequestLine("POST /encoding/inputs/ftp")
        ResponseEnvelope<FtpInput> create(FtpInput ftpInput) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/inputs/ftp/{input_id}")
        ResponseEnvelope<FtpInput> delete(@Param(value = "input_id") String inputId) throws BitmovinException;
    
        @RequestLine("GET /encoding/inputs/ftp/{input_id}")
        ResponseEnvelope<FtpInput> get(@Param(value = "input_id") String inputId) throws BitmovinException;
    
        @RequestLine("GET /encoding/inputs/ftp")
        ResponseEnvelope<PaginationResponse<FtpInput>> list(@QueryMap Map<String, Object> queryParams) throws BitmovinException;
    }
}
