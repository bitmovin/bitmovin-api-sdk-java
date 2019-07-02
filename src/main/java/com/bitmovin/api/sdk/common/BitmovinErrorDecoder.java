package com.bitmovin.api.sdk.common;

import com.bitmovin.api.sdk.model.Link;
import com.bitmovin.api.sdk.model.Message;
import com.bitmovin.api.sdk.model.ResponseError;
import com.bitmovin.api.sdk.model.ResponseErrorData;
import com.fasterxml.jackson.databind.ObjectMapper;
import feign.Request;
import feign.Response;
import feign.codec.ErrorDecoder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.charset.StandardCharsets;

public class BitmovinErrorDecoder implements ErrorDecoder {
    private final ObjectMapper mapper;

    public BitmovinErrorDecoder(ObjectMapper mapper) {
        this.mapper = mapper;
    }

    public Exception decode(String methodKey, Response response) {

        try {
            String requestJsonBody = null;
            if (response.request() != null && response.request().body() != null) {
                requestJsonBody = new String(response.request().body(), StandardCharsets.UTF_8);
            }

            String responseJsonBody = null;
            if (response.body() != null && !this.isNoContent(response.body())) {
                responseJsonBody = response.body().toString();
            }

            ResponseError responseError = null;
            try {
                responseError = this.mapper.readValue(responseJsonBody, ResponseError.class);
            } catch (Exception ex) {
                // do nothing, the response probably was not in the expected ResponseError format
            }

            String shortMessage = getShortMessage(response, responseError);
            String errorMessage = this.buildErrorMessage(responseError, shortMessage, response.request(), requestJsonBody, response, responseJsonBody);

            return new BitmovinException(errorMessage, shortMessage, response.status(), responseJsonBody, responseError);
        } catch (IOException e) {
            return e;
        }
    }

    private String buildErrorMessage(ResponseError responseError, String shortMessage, Request request, String requestJsonBody, Response response, String responseJsonBody) {

        StringBuilder stringBuilder = new StringBuilder();
        appendLine(stringBuilder, shortMessage);

        if (responseError != null) {
            ResponseErrorData data = responseError.getData();

            if (data != null) {
                appendLine(stringBuilder, String.format("developerMessage: %s", data.getDeveloperMessage()));
                appendLine(stringBuilder, String.format("errorCode: %s", data.getCode()));

                if (data.getDetails().size() > 0) {
                    appendLine(stringBuilder, "details:");
                    for (Message detail : data.getDetails()) {
                        appendErrorDetailMessage(stringBuilder, detail);
                    }
                }

                if (data.getLinks().size() > 0) {
                    appendLine(stringBuilder, "links:");
                    for (Link link : data.getLinks()) {
                        appendLine(stringBuilder, String.format("  %s: %s", link.getTitle(), link.getHref()));
                    }
                }
            }
        }

        appendRequestMessage(stringBuilder, request, requestJsonBody);
        appendResponseMessage(stringBuilder, response, responseJsonBody);

        return stringBuilder.toString().trim();
    }

    private String getShortMessage(Response response, ResponseError responseError) {
        String shortMessage = "Request failed: " + response.reason();

        if (responseError != null &&
                responseError.getData() != null &&
                responseError.getData().getMessage() != null &&
                !responseError.getData().getMessage().isEmpty()) {
            shortMessage = responseError.getData().getMessage();
        }
        return shortMessage;
    }

    private void appendErrorDetailMessage(StringBuilder stringBuilder, Message detail) {
        appendLine(stringBuilder, String.format("  - id: %s", detail.getId()));
        appendLine(stringBuilder, String.format("    date: %s", detail.getDate()));
        appendLine(stringBuilder, String.format("    type: %s", detail.getType()));
        appendLine(stringBuilder, String.format("    text: %s", detail.getText()));

        if (detail.getField() != null) {
            appendLine(stringBuilder, String.format("    field: %s", detail.getField()));
        }
    }

    private void appendRequestMessage(StringBuilder stringBuilder, Request request, String requestJsonBody) {
        appendLine(stringBuilder, "request:");
        appendLine(stringBuilder, String.format("  method: %s", request.method()));
        appendLine(stringBuilder, String.format("  url: %s", request.url()));

        if (requestJsonBody != null && !requestJsonBody.isEmpty()) {
            appendLine(stringBuilder, String.format("  body: %s", requestJsonBody));
        }
    }

    private void appendResponseMessage(StringBuilder stringBuilder, Response response, String responseJsonBody) {
        appendLine(stringBuilder, "response:");
        appendLine(stringBuilder, String.format("  httpStatusCode: %s", response.status()));
        if (responseJsonBody != null && !responseJsonBody.isEmpty()) {
            appendLine(stringBuilder, String.format("  body: %s", responseJsonBody));
        }
    }

    private void appendLine(StringBuilder errorMessage, String message) {
        errorMessage.append(message);
        errorMessage.append(System.lineSeparator());
    }

    private boolean isNoContent(Response.Body body) throws IOException {
        Reader reader = new BufferedReader(body.asReader());
        reader.mark(1);
        boolean noContent = reader.read() == -1;
        reader.reset();

        return noContent;
    }
}
