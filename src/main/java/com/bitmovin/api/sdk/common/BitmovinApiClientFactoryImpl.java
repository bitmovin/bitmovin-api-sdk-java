package com.bitmovin.api.sdk.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import feign.Client;
import feign.Feign;
import feign.Logger;
import feign.jackson.JacksonEncoder;
import feign.codec.ErrorDecoder;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TimeZone;
import java.util.function.Function;

public class BitmovinApiClientFactoryImpl implements BitmovinApiClientFactory {
    private final String apiKey;
    private final String tenantOrgId;
    private final Map<String, Collection<String>> headers;
    private final Logger logger;
    private final Logger.Level logLevel;
    private final String baseUrl;
    private ErrorDecoder errorDecoder;
    private final Client client;

    protected final Feign.Builder feignBuilder;

    protected BitmovinApiClientFactoryImpl(
        String apiKey,
        String tenantOrgId,
        String baseUrl,
        Logger logger,
        Logger.Level logLevel,
        Function<ObjectMapper, ErrorDecoder> errorDecoderFactory,
        Map<String, Collection<String>> headers,
        Client client) {

        this.client = client;

        if (apiKey == null || apiKey.isEmpty()) {
            throw new IllegalArgumentException("Parameter 'apiKey' may not be null or empty.");
        }

        this.apiKey = apiKey;
        this.tenantOrgId = tenantOrgId;
        if (headers != null) {
            this.headers = headers;
        } else {
            this.headers = new LinkedHashMap<>();
        }

        if (baseUrl != null && !baseUrl.isEmpty()) {
            this.baseUrl = baseUrl;
        } else {
            this.baseUrl = "https://api.bitmovin.com/v1";
        }

        if (logger != null) {
            this.logger = logger;
        } else {
            this.logger = new Logger.NoOpLogger();
        }

        if (logLevel != null) {
            this.logLevel = logLevel;
        } else {
            this.logLevel = Logger.Level.FULL;
        }

        ObjectMapper mapper = createObjectMapper();

        if (errorDecoderFactory != null) {
            this.errorDecoder = errorDecoderFactory.apply(mapper);
        } else {
            this.errorDecoder = new BitmovinErrorDecoder(mapper);
        }

        this.feignBuilder = createFeignBuilder(mapper);
    }

    @Override
    public <T> T createApiClient(Class<T> apiClientClass) {
        return this.feignBuilder.target(apiClientClass, baseUrl);
    }

    protected ObjectMapper createObjectMapper() {
        return new ObjectMapper()
            .setSerializationInclusion(JsonInclude.Include.NON_NULL)
            .setDateFormat(new BitmovinISOInstantDateFormat())
            .configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false)
            .configure(SerializationFeature.INDENT_OUTPUT, false)
            .configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false)
            .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
            .addMixIn(Object.class, BitmovinCustomDataDeserializer.HasCustomDataProperty.class);
    }

    protected Feign.Builder createFeignBuilder(ObjectMapper mapper) {
      Feign.Builder builder = Feign.builder()
        .encoder(new JacksonEncoder(mapper))
        .decoder(new BitmovinDecoder(mapper))
        .errorDecoder(this.errorDecoder)
        .queryMapEncoder(new BitmovinQueryMapEncoder())
        .logger(this.logger)
        .logLevel(this.logLevel)
        .requestInterceptor(new BitmovinHeadersInterceptor(this.apiKey, this.tenantOrgId, this.headers));

      if (client != null) {
        builder.client(client);
      }

      return builder;
    }
}
