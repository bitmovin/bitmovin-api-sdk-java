package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.Link;
import com.bitmovin.api.sdk.model.Message;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * ResponseErrorData
 */

public class ResponseErrorData {
  @JsonProperty("code")
  private Integer code;

  @JsonProperty("message")
  private String message;

  @JsonProperty("developerMessage")
  private String developerMessage;

  @JsonProperty("links")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<Link> links = new ArrayList<Link>();

  @JsonProperty("details")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<Message> details = new ArrayList<Message>();

  /**
   * Contains an error code as defined in https://bitmovin.com/encoding-documentation/bitmovin-api/#/introduction/api-error-codes (required)
   * @return code
   */
  public Integer getCode() {
    return code;
  }

  /**
   * General error message (required)
   * @return message
   */
  public String getMessage() {
    return message;
  }

  /**
   * More detailed message meant for developers (required)
   * @return developerMessage
   */
  public String getDeveloperMessage() {
    return developerMessage;
  }

  /**
   * collection of links to webpages containing further information on the topic
   * @return links
   */
  public List<Link> getLinks() {
    return links;
  }

  /**
   * collection of messages containing more detailed information on the cause of the error
   * @return details
   */
  public List<Message> getDetails() {
    return details;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseErrorData responseErrorData = (ResponseErrorData) o;
    return Objects.equals(this.code, responseErrorData.code) &&
        Objects.equals(this.message, responseErrorData.message) &&
        Objects.equals(this.developerMessage, responseErrorData.developerMessage) &&
        Objects.equals(this.links, responseErrorData.links) &&
        Objects.equals(this.details, responseErrorData.details);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message, developerMessage, links, details);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseErrorData {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    developerMessage: ").append(toIndentedString(developerMessage)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

