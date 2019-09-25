package com.bitmovin.api.sdk.encoding.outputs.sftp;

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
import com.bitmovin.api.sdk.encoding.outputs.sftp.customdata.CustomdataApi;

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
     * Create SFTP Output
     * 
     * @param sftpOutput The SFTP output to be created. (required)
     * @return SftpOutput
     * @throws BitmovinException if fails to make API call
     */
    public SftpOutput create(SftpOutput sftpOutput) throws BitmovinException {
        try {
            return this.apiClient.create(sftpOutput).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * Delete SFTP Output
     * 
     * @param outputId Id of the output (required)
     * @return SftpOutput
     * @throws BitmovinException if fails to make API call
     */
    public SftpOutput delete(String outputId) throws BitmovinException {
        try {
            return this.apiClient.delete(outputId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * SFTP Output Details
     * 
     * @param outputId Id of the output (required)
     * @return SftpOutput
     * @throws BitmovinException if fails to make API call
     */
    public SftpOutput get(String outputId) throws BitmovinException {
        try {
            return this.apiClient.get(outputId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    /**
     * List SFTP Outputs
     * 
     * @return List&lt;SftpOutput&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<SftpOutput> list() throws BitmovinException {
        try {
            return this.apiClient.list(new HashMap<String, Object>()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * List SFTP Outputs
     * 
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;SftpOutput&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<SftpOutput> list(SftpOutputListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(queryParams).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    interface SftpApiClient {
    
        @RequestLine("POST /encoding/outputs/sftp")
        ResponseEnvelope<SftpOutput> create(SftpOutput sftpOutput) throws BitmovinException;
    
        @RequestLine("DELETE /encoding/outputs/sftp/{output_id}")
        ResponseEnvelope<SftpOutput> delete(@Param(value = "output_id") String outputId) throws BitmovinException;
    
        @RequestLine("GET /encoding/outputs/sftp/{output_id}")
        ResponseEnvelope<SftpOutput> get(@Param(value = "output_id") String outputId) throws BitmovinException;
    
        @RequestLine("GET /encoding/outputs/sftp")
        ResponseEnvelope<PaginationResponse<SftpOutput>> list(@QueryMap Map<String, Object> queryParams) throws BitmovinException;
    }
}
