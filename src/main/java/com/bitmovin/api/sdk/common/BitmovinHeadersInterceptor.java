package com.bitmovin.api.sdk.common;

import feign.RequestInterceptor;
import feign.RequestTemplate;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class BitmovinHeadersInterceptor implements RequestInterceptor {
    private final String apiKey;
    private final String tenantOrgId;
    private final Map<String, Collection<String>> headers;
    private final Set<String> methodsWithBody = new HashSet<>(Arrays.asList("PATCH", "POST", "PUT"));

    public BitmovinHeadersInterceptor(String apiKey, String tenantOrgId, Map<String, Collection<String>> headers) {
        this.apiKey = apiKey;
        this.tenantOrgId = tenantOrgId;
        this.headers = headers;
    }

    public void apply(RequestTemplate requestTemplate) {
        requestTemplate.header("Content-Type", "application/json");
        requestTemplate.header("X-Api-Key", this.apiKey);
        requestTemplate.header("X-Api-Client", "bitmovin-api-sdk-java");
        requestTemplate.header("X-Api-Client-Version", "1.222.0");

        if (this.tenantOrgId != null && !this.tenantOrgId.isEmpty()) {
            requestTemplate.header("X-Tenant-Org-Id", this.tenantOrgId);
        }

        if (this.headers != null && !this.headers.isEmpty()) {
            requestTemplate.headers(this.headers);
        }

        if (requestTemplate.body() == null && methodsWithBody.contains(requestTemplate.method())) {
            // Feign 9.7 does not handle empty request bodies correctly, as it omits the Content-Length header
            requestTemplate.header("Content-Length","0");
            requestTemplate.body("");
        }
    }
}
