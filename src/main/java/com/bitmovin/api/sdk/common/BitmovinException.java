package com.bitmovin.api.sdk.common;

import com.bitmovin.api.sdk.model.Link;
import com.bitmovin.api.sdk.model.Message;
import com.bitmovin.api.sdk.model.ResponseError;

import java.util.ArrayList;
import java.util.List;

public class BitmovinException extends RuntimeException {

    private String shortmessage;
    private String developerMessage;
    private int errorCode;
    private int httpStatusCode;
    private String requestId;
    private String rawJsonResponse;
    private List<Link> links = new ArrayList<>();
    private List<Message> details = new ArrayList<>();

    public BitmovinException() {
    }

    public BitmovinException(String message) {
        super(message);
    }

    public BitmovinException(String message, int httpStatusCode, String rawJsonResponse) {
        super(message);

        this.httpStatusCode = httpStatusCode;
        this.rawJsonResponse = rawJsonResponse;
    }

    public BitmovinException(String message, String shortmessage, int httpStatusCode, String rawJsonResponse, ResponseError responseError) {

        this(message, httpStatusCode, rawJsonResponse);
        this.shortmessage = shortmessage;

        if(responseError != null)
        {
            this.requestId = responseError.getRequestId();

            if (responseError.getData() != null) {
                this.details = responseError.getData().getDetails();
                this.developerMessage = responseError.getData().getDeveloperMessage();
                this.errorCode = responseError.getData().getCode();
                this.links = responseError.getData().getLinks();
            }
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
        return rawJsonResponse;
    }

    public String getRequestId() {
        return requestId;
    }

    public String getShortmessage() {
        return shortmessage;
    }
}
