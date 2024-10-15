package com.bitmovin.api.sdk.streams.signingKeys;

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

public class SigningKeysApi {

    private final SigningKeysApiClient apiClient;

    public SigningKeysApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(SigningKeysApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of SigningKeysApi
     */
    public static BitmovinApiBuilder<SigningKeysApi> builder() {
        return new BitmovinApiBuilder<>(SigningKeysApi.class);
    }
    /**
     * Create new signing-key
     * Create new signing-key pair. There is a limit of 2 active signing keys per organization.
     * @return StreamsSigningKeyResponse
     * @throws BitmovinException if fails to make API call
     */
    public StreamsSigningKeyResponse create() throws BitmovinException {
        try {
            return this.apiClient.create().getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * Delete signing-key
     * 
     * @param keyId Id of the signing key. (required)
     * @throws BitmovinException if fails to make API call
     */
    public void delete(String keyId) throws BitmovinException {
        try {
            this.apiClient.delete(keyId);
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    /**
     * Get list of public signing key ids
     * 
     * @return StreamsPublicSigningKeyResponse
     * @throws BitmovinException if fails to make API call
     */
    public StreamsPublicSigningKeyResponse get() throws BitmovinException {
        try {
            return this.apiClient.get().getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }

    interface SigningKeysApiClient { 
        @RequestLine("POST /streams/signing-keys")
        ResponseEnvelope<StreamsSigningKeyResponse> create() throws BitmovinException;
   
        @RequestLine("DELETE /streams/signing-keys/{key_id}")
        void delete(@Param(value = "key_id") String keyId) throws BitmovinException;
   
        @RequestLine("GET /streams/signing-keys")
        ResponseEnvelope<StreamsPublicSigningKeyResponse> get() throws BitmovinException;
    }
}
