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
 * UdpMulticastInput
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = false, defaultImpl = UdpMulticastInput.class)
public class UdpMulticastInput extends Input {
  @JsonProperty("host")
  private String host;

  @JsonProperty("port")
  private Integer port;


  /**
   * Host name or IP address to use (required)
   * @return host
   */
  public String getHost() {
    return host;
  }

  /**
   * Host name or IP address to use (required)
   *
   * @param host
   *        Host name or IP address to use (required)
   */
  public void setHost(String host) {
    this.host = host;
  }


  /**
   * Port to use (required)
   * @return port
   */
  public Integer getPort() {
    return port;
  }

  /**
   * Port to use (required)
   *
   * @param port
   *        Port to use (required)
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
    UdpMulticastInput udpMulticastInput = (UdpMulticastInput) o;
    return Objects.equals(this.host, udpMulticastInput.host) &&
        Objects.equals(this.port, udpMulticastInput.port) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(host, port, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UdpMulticastInput {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
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

