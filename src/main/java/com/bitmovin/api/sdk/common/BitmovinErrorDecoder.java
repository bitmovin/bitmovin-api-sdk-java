package com.bitmovin.api.sdk.common;

import com.bitmovin.api.sdk.model.ResponseError;
import com.bitmovin.api.sdk.model.ResponseErrorData;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import feign.FeignException;
import feign.Response;
import feign.codec.ErrorDecoder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;

public class BitmovinErrorDecoder implements ErrorDecoder {
    private final ObjectMapper mapper;

    public BitmovinErrorDecoder(ObjectMapper mapper) {
        this.mapper = mapper;
    }

    public Exception decode(String methodKey, Response response) {
        try
        {
            if (response.body() == null)
            {
                return new BitmovinException(response.reason(), response.status(), response.toString());
            }

            Reader reader = response.body().asReader();
            if (!reader.markSupported())
            {
                reader = new BufferedReader(reader, 1);
            }
            reader.mark(1);
            if (reader.read() == -1)
            {
                return FeignException.errorStatus(methodKey, response);
            }
            reader.reset();

            JsonNode jsonNode = this.mapper.readValue(reader, JsonNode.class);
            String rawJson = jsonNode.toString();

            ResponseError responseError = this.mapper.readValue(rawJson, ResponseError.class);

            if (responseError == null || responseError.getData() == null) {
                if(response.status() == 403)
                {
                    return new BitmovinException("Request unauthorized", response.status(), rawJson);
                }

                return new BitmovinException("Could not deserialize error data", response.status(), rawJson);
            }

            ResponseErrorData errorData = responseError.getData();
            if (errorData == null) {
                return new BitmovinException("Could not deserialize error data", response.status(), rawJson);
            }

            return new BitmovinException(errorData.getMessage(), response.status(), rawJson, responseError);

        }
        catch (IOException e)
        {
            return e;
        }
    }
}
