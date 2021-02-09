package com.bitmovin.api.sdk.common;

import feign.RequestInterceptor;
import feign.RequestTemplate;

import java.util.Collection;
import java.util.Map;

public class BitmovinHeadersInterceptor implements RequestInterceptor {
    private final String apiKey;
    private final String tenantOrgId;
    private final Map<String, Collection<String>> headers;

    public BitmovinHeadersInterceptor(String apiKey, String tenantOrgId, Map<String, Collection<String>> headers) {
        this.apiKey = apiKey;
        this.tenantOrgId = tenantOrgId;
        this.headers = headers;
    }

    public void apply(RequestTemplate requestTemplate) {
        requestTemplate.header("Content-Type", "application/json");
        requestTemplate.header("X-Api-Key", this.apiKey);
        requestTemplate.header("X-Api-Client", "bitmovin-api-sdk-java");
        requestTemplate.header("X-Api-Client-Version", "1.59.0");

        if (this.tenantOrgId != null && !this.tenantOrgId.isEmpty()) {
            requestTemplate.header("X-Tenant-Org-Id", this.tenantOrgId);
        }

        if (this.headers != null && !this.headers.isEmpty()) {
            requestTemplate.headers(this.headers);
        }
    }
}
