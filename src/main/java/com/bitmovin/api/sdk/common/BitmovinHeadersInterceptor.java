package com.bitmovin.api.sdk.common;

import feign.RequestInterceptor;
import feign.RequestTemplate;

public class BitmovinHeadersInterceptor implements RequestInterceptor {
    private final String apiKey;
    private final String tenantOrgId;

    public BitmovinHeadersInterceptor(String apiKey, String tenantOrgId) {
        this.apiKey = apiKey;
        this.tenantOrgId = tenantOrgId;
    }

    public void apply(RequestTemplate requestTemplate) {
        requestTemplate.header("Content-Type", "application/json");
        requestTemplate.header("X-Api-Key", this.apiKey);
        requestTemplate.header("X-Api-Client", "bitmovin-api-sdk-java");
        requestTemplate.header("X-Api-Client-Version", "1.12.0-alpha-0");

        if (this.tenantOrgId != null && !this.tenantOrgId.isEmpty()) {
            requestTemplate.header("X-Tenant-Org-Id", this.tenantOrgId);
        }
    }
}
