package com.bitmovin.api.sdk.common;

import com.bitmovin.api.sdk.model.Link;
import com.bitmovin.api.sdk.model.Message;
import com.bitmovin.api.sdk.model.ResponseError;

import java.util.List;

public class BitmovinException extends Exception {
    private List<Message> details;
    private String developerMessage;
    private int errorCode;
    private int httpStatusCode;
    private List<Link> links;
    private String rawJson;
    private String requestId;

    public BitmovinException() {
    }

    public BitmovinException(String message) {
        super(message);
    }

    public BitmovinException(String message, int httpStatusCode, String rawJson) {
        super(message);

        this.httpStatusCode = httpStatusCode;
        this.rawJson = rawJson;
    }

    public BitmovinException(String message, int httpStatusCode, String rawJson, ResponseError responseError) {
        super(message);

        this.httpStatusCode = httpStatusCode;
        this.rawJson = rawJson;
        this.requestId = responseError.getRequestId();

        if (responseError.getData() != null) {
            this.details = responseError.getData().getDetails();
            this.developerMessage = responseError.getData().getDeveloperMessage();
            this.errorCode = responseError.getData().getCode();
            this.links = responseError.getData().getLinks();
        }
    }

    public List<Message> getDetails() {
        return details;
    }

    public String getDeveloperMessage() {
        return developerMessage;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public int getHttpStatusCode() {
        return httpStatusCode;
    }

    public List<Link> getLinks() {
        return links;
    }

    public String getRawJson() {
        return rawJson;
    }

    public String getRequestId() {
        return requestId;
    }
}
