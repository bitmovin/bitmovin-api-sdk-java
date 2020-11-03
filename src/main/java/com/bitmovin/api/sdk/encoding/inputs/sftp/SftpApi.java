package com.bitmovin.api.sdk.encoding.inputs.sftp;

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
import com.bitmovin.api.sdk.encoding.inputs.sftp.customdata.CustomdataApi;

public class SftpApi {
    public final CustomdataApi customdata;

    private final SftpApiClient apiClient;

    public SftpApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(SftpApiClient.class);

        this.customdata = new CustomdataApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of SftpApi
     */
    public static BitmovinApiBuilder<SftpApi> builder() {
        return new BitmovinApiBuilder<>(SftpApi.class);
    }
    
    /**
     * Create SFTP Input
     * 
     * @param sftpInput The SFTP input to be created (required)
     * @return SftpInput
     * @throws BitmovinException if fails to make API call
     */
    public SftpInput create(SftpInput sftpInput) throws BitmovinException {
        try {
            return this.apiClient.create(sftpInput).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * Delete SFTP Input
     * 
     * @param inputId Id of the input (required)
     * @return SftpInput
     * @throws BitmovinException if fails to make API call
     */
    public SftpInput delete(String inputId) throws BitmovinException {
        try {
            return this.apiClient.delete(inputId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * SFTP Input Details
     * 
     * @param inputId Id of the input (required)
     * @return SftpInput
     * @throws BitmovinException if fails to make API call
     */
    public SftpInput get(String inputId) throws BitmovinException {
        try {
            return this.apiClient.get(inputId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * List SFTP Inputs
     * 
     * @return List&lt;SftpInput&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<SftpInput> list() throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * List SFTP Inputs
     * 
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;SftpInput&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<SftpInput> list(SftpInputListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    interface SftpApiClient {
    
        @RequestLine("POST /encoding/inputs/sftp")
        ResponseEnvelope<SftpInput> create(SftpInput sftpInput) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/inputs/sftp/{input_id}")
        ResponseEnvelope<SftpInput> delete(@Param(value = "input_id") String inputId) throws BitmovinException;
    
        @RequestLine("GET /encoding/inputs/sftp/{input_id}")
        ResponseEnvelope<SftpInput> get(@Param(value = "input_id") String inputId) throws BitmovinException;
    
        @RequestLine("GET /encoding/inputs/sftp")
        ResponseEnvelope<PaginationResponse<SftpInput>> list(@QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    }
}
