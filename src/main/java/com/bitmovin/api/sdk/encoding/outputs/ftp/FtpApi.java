package com.bitmovin.api.sdk.encoding.outputs.ftp;

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
import com.bitmovin.api.sdk.encoding.outputs.ftp.customdata.CustomdataApi;

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
     * Create FTP Output
     * 
     * @param ftpOutput The FTP output to be created (required)
     * @return FtpOutput
     * @throws BitmovinException if fails to make API call
     */
    public FtpOutput create(FtpOutput ftpOutput) throws BitmovinException {
        return this.apiClient.create(ftpOutput).getData().getResult();
    }
    
    /**
     * Delete FTP Output
     * 
     * @param outputId Id of the output (required)
     * @return FtpOutput
     * @throws BitmovinException if fails to make API call
     */
    public FtpOutput delete(String outputId) throws BitmovinException {
        return this.apiClient.delete(outputId).getData().getResult();
    }
    
    /**
     * FTP Output Details
     * 
     * @param outputId Id of the output (required)
     * @return FtpOutput
     * @throws BitmovinException if fails to make API call
     */
    public FtpOutput get(String outputId) throws BitmovinException {
        return this.apiClient.get(outputId).getData().getResult();
    }
    
    /**
     * List FTP Outputs
     * 
     * @return List&lt;FtpOutput&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<FtpOutput> list() throws BitmovinException {
        return this.apiClient.list(new HashMap<String, Object>()).getData().getResult();
    }
    /**
     * List FTP Outputs
     * 
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;FtpOutput&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<FtpOutput> list(FtpOutputListQueryParams queryParams) throws BitmovinException {
        return this.apiClient.list(queryParams).getData().getResult();
    }
    
    interface FtpApiClient {
    
        @RequestLine("POST /encoding/outputs/ftp")
        ResponseEnvelope<FtpOutput> create(FtpOutput ftpOutput) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/outputs/ftp/{output_id}")
        ResponseEnvelope<FtpOutput> delete(@Param(value = "output_id") String outputId) throws BitmovinException;
    
        @RequestLine("GET /encoding/outputs/ftp/{output_id}")
        ResponseEnvelope<FtpOutput> get(@Param(value = "output_id") String outputId) throws BitmovinException;
    
        @RequestLine("GET /encoding/outputs/ftp")
        ResponseEnvelope<PaginationResponse<FtpOutput>> list(@QueryMap Map<String, Object> queryParams) throws BitmovinException;
    }
}
