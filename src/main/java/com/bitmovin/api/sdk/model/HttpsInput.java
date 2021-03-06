package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.Input;
import java.util.Date;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * HttpsInput
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = false, defaultImpl = HttpsInput.class)
public class HttpsInput extends Input {
  @JsonProperty("host")
  private String host;

  @JsonProperty("username")
  private String username;

  @JsonProperty("password")
  private String password;

  @JsonProperty("port")
  private Integer port;


  /**
   * Host Url or IP of the HTTP server (required)
   * @return host
   */
  public String getHost() {
    return host;
  }

  /**
   * Host Url or IP of the HTTP server (required)
   *
   * @param host
   *        Host Url or IP of the HTTP server (required)
   */
  public void setHost(String host) {
    this.host = host;
  }


  /**
   * Basic Auth Username, if required
   * @return username
   */
  public String getUsername() {
    return username;
  }

  /**
   * Basic Auth Username, if required
   *
   * @param username
   *        Basic Auth Username, if required
   */
  public void setUsername(String username) {
    this.username = username;
  }


  /**
   * Basic Auth Password, if required
   * @return password
   */
  public String getPassword() {
    return password;
  }

  /**
   * Basic Auth Password, if required
   *
   * @param password
   *        Basic Auth Password, if required
   */
  public void setPassword(String password) {
    this.password = password;
  }


  /**
   * Custom Port
   * @return port
   */
  public Integer getPort() {
    return port;
  }

  /**
   * Custom Port
   *
   * @param port
   *        Custom Port
   */
  public void setPort(Integer port) {
    this.port = port;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HttpsInput httpsInput = (HttpsInput) o;
    return Objects.equals(this.host, httpsInput.host) &&
        Objects.equals(this.username, httpsInput.username) &&
        Objects.equals(this.password, httpsInput.password) &&
        Objects.equals(this.port, httpsInput.port) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(host, username, password, port, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HttpsInput {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
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

