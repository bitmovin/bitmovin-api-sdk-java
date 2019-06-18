package com.bitmovin.api.sdk.common;

import com.bitmovin.api.sdk.model.Link;
import com.bitmovin.api.sdk.model.Message;
import com.bitmovin.api.sdk.model.ResponseError;
import com.bitmovin.api.sdk.model.ResponseErrorData;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import feign.FeignException;
import feign.Request;
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

        try {

            String requestJsonBody = null;
            String responseJsonBody;
            ResponseError responseError;

            if (response.body() == null || this.isNoContent(response.body())) {
                return new BitmovinException(response.reason(), response.status(), response.toString());
            }

            Reader reader = new BufferedReader(response.body().asReader());
            JsonNode responseJsonNode = this.mapper.readValue(reader, JsonNode.class);
            responseJsonBody = responseJsonNode.toString();

            responseError = this.mapper.readValue(responseJsonBody, ResponseError.class);

            if (responseError == null || responseError.getData() == null) {
                return new BitmovinException("Could not deserialize error data", response.status(), responseJsonBody);
            }

            if (response.request() != null && response.request().body() != null) {
                JsonNode requestJsonNode = this.mapper.readValue(response.request().body(), JsonNode.class);
                requestJsonBody = requestJsonNode.toString();
            }

            String errorMessage = this.buildErrorMessage(responseError, response.request(), requestJsonBody, response, responseJsonBody);
            return new BitmovinException(errorMessage, response.status(), responseJsonBody, responseError);

        } catch (IOException e) {
            return e;
        }
    }

    private String buildErrorMessage(ResponseError responseError, Request request, String requestJsonBody, Response response, String responseJsonBody) {

        StringBuilder errorMessage = new StringBuilder();

        errorMessage.append(String.format("%s\n", responseError.getData().getMessage()));
        errorMessage.append(String.format("developerMessage: %s\n", responseError.getData().getDeveloperMessage()));
        errorMessage.append(String.format("errorCode: %s\n", responseError.getData().getCode()));

        if(responseError.getData().getDetails().size() > 0) {
            errorMessage.append("details:\n");
            for (Message detail : responseError.getData().getDetails()) {
                errorMessage.append(this.buildErrorDetailMessage(detail));
            }
        }

        if(responseError.getData().getLinks().size() > 0) {
            errorMessage.append("links:\n");
            for (Link link : responseError.getData().getLinks()) {
                errorMessage.append(String.format("  %s: %s\n", link.getTitle(), link.getHref()));
            }
        }

        errorMessage.append(this.buildRequestMessage(request, requestJsonBody));

        errorMessage.append(this.buildResponseMessage(response, responseJsonBody));

        return errorMessage.toString();
    }

    private String buildErrorDetailMessage(Message detail) {
        StringBuilder errorDetailMessage = new StringBuilder();
        errorDetailMessage.append(String.format("  - id: %s\n", detail.getId()));
        errorDetailMessage.append(String.format("    date: %s\n", detail.getDate()));
        errorDetailMessage.append(String.format("    type: %s\n", detail.getType()));
        errorDetailMessage.append(String.format("    text: %s\n", detail.getText()));

        if(detail.getField() != null) {
            errorDetailMessage.append(String.format("    field: %s\n", detail.getField()));
        }

        return errorDetailMessage.toString();
    }

    private String buildRequestMessage(Request request, String requestJsonBody) {
        StringBuilder requestMessage = new StringBuilder("request:\n");
        requestMessage.append(String.format("  method: %s\n", request.method()));
        requestMessage.append(String.format("  url: %s\n", request.url()));

        if(requestJsonBody != null) {
            requestMessage.append(String.format("  body: %s\n", requestJsonBody));
        }
        return requestMessage.toString();
    }

    private String buildResponseMessage(Response response, String responseJsonBody) {
        StringBuilder responseMessage = new StringBuilder("response:\n");
        responseMessage.append(String.format("  httpStatusCode: %s\n", response.status()));
        responseMessage.append(String.format("  body: %s", responseJsonBody));

        return responseMessage.toString();
    }

    private boolean isNoContent(Response.Body body) throws IOException {
        Reader reader = new BufferedReader(body.asReader());
        reader.mark(1);
        boolean noContent = reader.read() == -1;
        reader.reset();

        return noContent;
    }
}
