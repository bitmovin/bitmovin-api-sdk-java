package com.bitmovin.api.sdk.common;

public interface BitmovinApiClientFactory {
    <T> T createApiClient(Class<T> apiClientClass);
}
