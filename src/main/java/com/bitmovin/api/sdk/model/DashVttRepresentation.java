package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.DashRepresentation;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * DashVttRepresentation
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "typeDiscriminator", visible = false, defaultImpl = DashVttRepresentation.class)
public class DashVttRepresentation extends DashRepresentation {
  @JsonProperty("vttUrl")
  private String vttUrl;


  /**
   * URL of the referenced VTT file (required)
   * @return vttUrl
   */
  public String getVttUrl() {
    return vttUrl;
  }

  /**
   * URL of the referenced VTT file (required)
   *
   * @param vttUrl
   *        URL of the referenced VTT file (required)
   */
  public void setVttUrl(String vttUrl) {
    this.vttUrl = vttUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DashVttRepresentation dashVttRepresentation = (DashVttRepresentation) o;
    return Objects.equals(this.vttUrl, dashVttRepresentation.vttUrl) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vttUrl, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DashVttRepresentation {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    vttUrl: ").append(toIndentedString(vttUrl)).append("\n");
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

