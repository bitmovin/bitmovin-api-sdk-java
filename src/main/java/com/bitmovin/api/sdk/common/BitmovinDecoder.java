package com.bitmovin.api.sdk.common;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.RuntimeJsonMappingException;
import feign.FeignException;
import feign.Response;
import feign.codec.DecodeException;
import feign.codec.Decoder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Type;

public class BitmovinDecoder implements Decoder {
    private final ObjectMapper mapper;

    public BitmovinDecoder(ObjectMapper mapper) {
        this.mapper = mapper;
    }

    private boolean checkIsSuccessResponse(JsonNode jsonNode) {
        return jsonNode.get("status") != null && jsonNode.get("status").asText().equals("SUCCESS");
    }

    public Object decode(Response response, Type type) throws IOException
    {
        if (response.body() == null)
        {
            return null;
        }

        Reader reader = response.body().asReader();

        if (!reader.markSupported())
        {
            reader = new BufferedReader(reader, 1);
        }

        try
        {
            reader.mark(1);
            if (reader.read() == -1)
            {
                return null;
            }
            reader.reset();

            JavaType javaType = this.mapper.constructType(type);
            JsonNode jsonNode = this.mapper.readValue(reader, JsonNode.class);

            if (jsonNode == null) {
                decodeException("Response does not contain valid json data", response);
            }

            if (!this.checkIsSuccessResponse(jsonNode)) {
                decodeException("Got non success response", response);
            }

            if (jsonNode.get("data") == null) {
                decodeException("Could not deserialize data object from response", response);
            }

            JsonNode resultDataJson = jsonNode.get("data").get("result");
            if (resultDataJson == null) {
                decodeException("Could not deserialize result object from response", response);
            }

            return mapper.convertValue(jsonNode, javaType);
        }
        catch (RuntimeJsonMappingException e)
        {
            if (e.getCause() != null && e.getCause() instanceof IOException)
            {
                throw (IOException) e.getCause();
            }
            throw e;
        }
    }

    public void decodeException(String message, Response response)
    {
      throw new DecodeException(response.status(), message, response.request());
    }
}
