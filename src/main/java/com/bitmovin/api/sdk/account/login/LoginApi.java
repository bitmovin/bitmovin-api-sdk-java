package com.bitmovin.api.sdk.account.login;

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

public class LoginApi {

    private final LoginApiClient apiClient;

    public LoginApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.apiClient = clientFactory.createApiClient(LoginApiClient.class);

    }

    /**
     * Fluent builder for creating an instance of LoginApi
     */
    public static BitmovinApiBuilder<LoginApi> builder() {
        return new BitmovinApiBuilder<>(LoginApi.class);
    }
    
    /**
     * Login
     * 
     * @param login Login Credentials (required)
     * @return AccountInformation
     * @throws BitmovinException if fails to make API call
     */
    public AccountInformation create(Login login) throws BitmovinException {
        try {
            return this.apiClient.create(login).getData().getResult();
        } catch (Exception ex) {
            throw buildBitmovinException(ex);
        }
    }
    
    interface LoginApiClient {
    
        @RequestLine("POST /account/login")
        ResponseEnvelope<AccountInformation> create(Login login) throws BitmovinException;
    }
}
