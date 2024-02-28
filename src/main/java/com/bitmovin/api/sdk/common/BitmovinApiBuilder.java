package com.bitmovin.api.sdk.common;

import feign.Logger;
import feign.Client;
import feign.codec.ErrorDecoder;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Map;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.function.Function;

public class BitmovinApiBuilder<T> {

    private final Class apiClientClass;
    private String apiKey;
    private String tenantOrgId;
    private String baseUrl;
    private Logger logger;
    private Logger.Level logLevel;
    private Function<ObjectMapper, ErrorDecoder> errorDecoderFactory;

    private Map<String, Collection<String>> headers;
    private Client client;

    public BitmovinApiBuilder(Class<T> apiClientClass) {
        this.apiClientClass = apiClientClass;
    }

    public BitmovinApiBuilder<T> withHeaders(Map<String, Collection<String>> headers) {
        this.headers = headers;
        return this;
    }

    public BitmovinApiBuilder<T> withApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }

    public BitmovinApiBuilder<T> withTenantOrgId(String tenantOrgId) {
        this.tenantOrgId = tenantOrgId;
        return this;
    }

    public BitmovinApiBuilder<T> withLogger(Logger logger, Logger.Level logLevel) {
        this.logger = logger;
        this.logLevel = logLevel;
        return this;
    }

    public BitmovinApiBuilder<T> withErrorDecoder(Function<ObjectMapper, ErrorDecoder> errorDecoderFactory) {
        this.errorDecoderFactory = errorDecoderFactory;
        return this;
    }

    public BitmovinApiBuilder<T> withBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
        return this;
    }

    public BitmovinApiBuilder<T> withClient(Client client) {
        this.client = client;
        return this;
    }

    public T build() {
        try {
            BitmovinApiClientFactoryImpl apiClientFactory =
                new BitmovinApiClientFactoryImpl(
                    this.apiKey,
                    this.tenantOrgId,
                    this.baseUrl,
                    this.logger,
                    this.logLevel,
                    this.errorDecoderFactory,
                    this.headers,
                    this.client
                );

            Constructor ctor = apiClientClass.getConstructor(BitmovinApiClientFactory.class);
            return (T) ctor.newInstance(new Object[] { apiClientFactory });

        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException ex) {
            throw new RuntimeException("Error creating api instance of type" + this.apiClientClass.getName(), ex);
        }
    }
}
