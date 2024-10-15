package com.bitmovin.api.sdk.encoding.inputs.directFileUpload;

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
import com.bitmovin.api.sdk.encoding.inputs.directFileUpload.customdata.CustomdataApi;

public class DirectFileUploadApi {
    public final CustomdataApi customdata;

    private final DirectFileUploadApiClient apiClient;

    public DirectFileUploadApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(DirectFileUploadApiClient.class);

        this.customdata = new CustomdataApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of DirectFileUploadApi
     */
    public static BitmovinApiBuilder<DirectFileUploadApi> builder() {
        return new BitmovinApiBuilder<>(DirectFileUploadApi.class);
    }
    /**
     * Create Direct File Upload Input
     * 
     * @param directFileUploadInput The Direct File Upload input to be created (required)
     * @return DirectFileUploadInput
     * @throws BitmovinException if fails to make API call
     */
    public DirectFileUploadInput create(DirectFileUploadInput directFileUploadInput) throws BitmovinException {
        try {
            return this.apiClient.create(directFileUploadInput).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * Delete Direct File Upload Input
     * 
     * @param inputId Id of the input (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse delete(String inputId) throws BitmovinException {
        try {
            return this.apiClient.delete(inputId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * Direct File Upload Input Details
     * 
     * @param inputId Id of the input (required)
     * @return DirectFileUploadInput
     * @throws BitmovinException if fails to make API call
     */
    public DirectFileUploadInput get(String inputId) throws BitmovinException {
        try {
            return this.apiClient.get(inputId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * List Direct File Upload Inputs
     * 
     * @return List&lt;DirectFileUploadInput&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<DirectFileUploadInput> list() throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * List Direct File Upload Inputs
     * 
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;DirectFileUploadInput&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<DirectFileUploadInput> list(DirectFileUploadInputListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface DirectFileUploadApiClient { 
        @RequestLine("POST /encoding/inputs/direct-file-upload")
        ResponseEnvelope<DirectFileUploadInput> create(DirectFileUploadInput directFileUploadInput) throws BitmovinException;
   
        @RequestLine("DELETE /encoding/inputs/direct-file-upload/{input_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "input_id") String inputId) throws BitmovinException;
   
        @RequestLine("GET /encoding/inputs/direct-file-upload/{input_id}")
        ResponseEnvelope<DirectFileUploadInput> get(@Param(value = "input_id") String inputId) throws BitmovinException;
   
        @RequestLine("GET /encoding/inputs/direct-file-upload")
        ResponseEnvelope<PaginationResponse<DirectFileUploadInput>> list(@QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    }
}
