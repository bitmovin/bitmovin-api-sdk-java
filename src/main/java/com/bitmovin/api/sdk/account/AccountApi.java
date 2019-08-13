package com.bitmovin.api.sdk.account;

import com.bitmovin.api.sdk.common.BitmovinApiBuilder;
import com.bitmovin.api.sdk.common.BitmovinApiClientFactory;
import com.bitmovin.api.sdk.account.information.InformationApi;
import com.bitmovin.api.sdk.account.login.LoginApi;
import com.bitmovin.api.sdk.account.limits.LimitsApi;
import com.bitmovin.api.sdk.account.apiKeys.ApiKeysApi;
import com.bitmovin.api.sdk.account.organizations.OrganizationsApi;

public class AccountApi {
    public final InformationApi information;
    public final LoginApi login;
    public final LimitsApi limits;
    public final ApiKeysApi apiKeys;
    public final OrganizationsApi organizations;

    public AccountApi(BitmovinApiClientFactory clientFactory) {
        if (clientFactory == null)
        {
            throw new IllegalArgumentException("Parameter 'clientFactory' may not be null.");
        }

        this.information = new InformationApi(clientFactory);
        this.login = new LoginApi(clientFactory);
        this.limits = new LimitsApi(clientFactory);
        this.apiKeys = new ApiKeysApi(clientFactory);
        this.organizations = new OrganizationsApi(clientFactory);
    }

    /**
     * Fluent builder for creating an instance of AccountApi
     */
    public static BitmovinApiBuilder<AccountApi> builder() {
        return new BitmovinApiBuilder<>(AccountApi.class);
    }
    
    
}
