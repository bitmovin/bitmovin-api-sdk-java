package com.bitmovin.api.sdk.encoding.encodings.transferRetries;

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

public class TransferRetriesApi {

    private final TransferRetriesApiClient apiClient;

    public TransferRetriesApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(TransferRetriesApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of TransferRetriesApi
     */
    public static BitmovinApiBuilder<TransferRetriesApi> builder() {
        return new BitmovinApiBuilder<>(TransferRetriesApi.class);
    }

    /**
     * Starts transfer retry. A transfer retry is only possible within 72 hours.
     * 
     * @param encodingId Id of the encoding. (required)
     * @return TransferRetry
     * @throws BitmovinException if fails to make API call
     */
    public TransferRetry create(String encodingId) throws BitmovinException {
        try {
            return this.apiClient.create(encodingId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * Transfer retry Details
     * 
     * @param encodingId Id of the encoding. (required)
     * @param transferRetryId Id of the transfer-retry. (required)
     * @return TransferRetry
     * @throws BitmovinException if fails to make API call
     */
    public TransferRetry get(String encodingId, String transferRetryId) throws BitmovinException {
        try {
            return this.apiClient.get(encodingId, transferRetryId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * List transfer-retries
     * 
     * @param encodingId Id of the encoding. (required)
     * @return List&lt;TransferRetry&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<TransferRetry> list(String encodingId) throws BitmovinException {
        try {
            return this.apiClient.list(encodingId, new QueryMapWrapper()).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    /**
     * List transfer-retries
     * 
     * @param encodingId Id of the encoding. (required)
     * @param queryParams The query parameters for sorting, filtering and paging options (optional)
     * @return List&lt;TransferRetry&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<TransferRetry> list(String encodingId, TransferRetryListQueryParams queryParams) throws BitmovinException {
        try {
            return this.apiClient.list(encodingId, new QueryMapWrapper(queryParams)).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface TransferRetriesApiClient {

        @RequestLine("POST /encoding/encodings/{encoding_id}/transfer-retries")
        ResponseEnvelope<TransferRetry> create(@Param(value = "encoding_id") String encodingId) throws BitmovinException;
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/transfer-retries/{transfer_retry_id}")
        ResponseEnvelope<TransferRetry> get(@Param(value = "encoding_id") String encodingId, @Param(value = "transfer_retry_id") String transferRetryId) throws BitmovinException;
    
        @RequestLine("GET /encoding/encodings/{encoding_id}/transfer-retries")
        ResponseEnvelope<PaginationResponse<TransferRetry>> list(@Param(value = "encoding_id") String encodingId, @QueryMap QueryMapWrapper queryParams) throws BitmovinException;
    }
}
