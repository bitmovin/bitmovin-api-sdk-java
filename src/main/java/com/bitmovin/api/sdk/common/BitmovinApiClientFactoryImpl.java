package com.bitmovin.api.sdk.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import feign.Feign;
import feign.Logger;
import feign.jackson.JacksonEncoder;

import java.text.SimpleDateFormat;
import java.util.TimeZone;

public class BitmovinApiClientFactoryImpl implements BitmovinApiClientFactory {
    private final String apiKey;
    private final String tenantOrgId;
    private final Logger logger;
    private final Logger.Level logLevel;
    private final String baseUrl;

    protected final Feign.Builder feignBuilder;

    protected BitmovinApiClientFactoryImpl(
        String apiKey,
        String tenantOrgId,
        String baseUrl,
        Logger logger,
        Logger.Level logLevel) {

        if (apiKey == null || apiKey.isEmpty()) {
            throw new IllegalArgumentException("Parameter 'apiKey' may not be null or empty.");
        }

        this.apiKey = apiKey;
        this.tenantOrgId = tenantOrgId;

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
        this.feignBuilder = createFeignBuilder(mapper);
    }

    @Override
    public <T> T createApiClient(Class<T> apiClientClass) {
        return this.feignBuilder.target(apiClientClass, baseUrl);
    }

    protected ObjectMapper createObjectMapper() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return new ObjectMapper()
            .setSerializationInclusion(JsonInclude.Include.NON_NULL)
            .setDateFormat(dateFormat)
            .configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false)
            .configure(SerializationFeature.INDENT_OUTPUT, false)
            .configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false)
            .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }

    protected Feign.Builder createFeignBuilder(ObjectMapper mapper) {
        return Feign.builder()
            .encoder(new JacksonEncoder(mapper))
            .decoder(new BitmovinDecoder(mapper))
            .errorDecoder(new BitmovinErrorDecoder(mapper))
            .logger(this.logger)
            .logLevel(this.logLevel)
            .requestInterceptor(new BitmovinHeadersInterceptor(this.apiKey, this.tenantOrgId));
    }
}
