package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.DashRepresentation;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * DashImscRepresentation
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "typeDiscriminator", visible = false, defaultImpl = DashImscRepresentation.class)
public class DashImscRepresentation extends DashRepresentation {
  @JsonProperty("imscUrl")
  private String imscUrl;


  /**
   * URL of the referenced IMSC file (required)
   * @return imscUrl
   */
  public String getImscUrl() {
    return imscUrl;
  }

  /**
   * URL of the referenced IMSC file (required)
   *
   * @param imscUrl
   *        URL of the referenced IMSC file (required)
   */
  public void setImscUrl(String imscUrl) {
    this.imscUrl = imscUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DashImscRepresentation dashImscRepresentation = (DashImscRepresentation) o;
    return Objects.equals(this.imscUrl, dashImscRepresentation.imscUrl) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(imscUrl, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DashImscRepresentation {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    imscUrl: ").append(toIndentedString(imscUrl)).append("\n");
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

