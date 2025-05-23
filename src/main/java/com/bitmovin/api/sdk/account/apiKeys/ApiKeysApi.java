package com.bitmovin.api.sdk.account.apiKeys;

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

public class ApiKeysApi {

    private final ApiKeysApiClient apiClient;

    public ApiKeysApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(ApiKeysApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of ApiKeysApi
     */
    public static BitmovinApiBuilder<ApiKeysApi> builder() {
        return new BitmovinApiBuilder<>(ApiKeysApi.class);
    }
    /**
     * Create Api Key
     * 
     * @return AccountApiKey
     * @throws BitmovinException if fails to make API call
     */
    public AccountApiKey create() throws BitmovinException {
        try {
            return this.apiClient.create().getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * Delete Api Key
     * 
     * @param apiKeyId Id of the api key (required)
     * @return BitmovinResponse
     * @throws BitmovinException if fails to make API call
     */
    public BitmovinResponse delete(String apiKeyId) throws BitmovinException {
        try {
            return this.apiClient.delete(apiKeyId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * Get Api Key
     * 
     * @param apiKeyId Id of the api key (required)
     * @return AccountApiKey
     * @throws BitmovinException if fails to make API call
     */
    public AccountApiKey get(String apiKeyId) throws BitmovinException {
        try {
            return this.apiClient.get(apiKeyId).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * List Api Keys
     * 
     * @return List&lt;AccountApiKey&gt;
     * @throws BitmovinException if fails to make API call
     */
    public PaginationResponse<AccountApiKey> list() throws BitmovinException {
        try {
            return this.apiClient.list().getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface ApiKeysApiClient { 
        @RequestLine("POST /account/api-keys")
        ResponseEnvelope<AccountApiKey> create() throws BitmovinException;
   
        @RequestLine("DELETE /account/api-keys/{api_key_id}")
        ResponseEnvelope<BitmovinResponse> delete(@Param(value = "api_key_id") String apiKeyId) throws BitmovinException;
   
        @RequestLine("GET /account/api-keys/{api_key_id}")
        ResponseEnvelope<AccountApiKey> get(@Param(value = "api_key_id") String apiKeyId) throws BitmovinException;
   
        @RequestLine("GET /account/api-keys")
        ResponseEnvelope<PaginationResponse<AccountApiKey>> list() throws BitmovinException;
    }
}
