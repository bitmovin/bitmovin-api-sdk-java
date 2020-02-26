package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.DashRepresentation;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * DashProgressiveWebmRepresentation
 */

public class DashProgressiveWebmRepresentation extends DashRepresentation {
  @JsonProperty("filePath")
  private String filePath;


  /**
   * Path to the Progressive WebM file (required)
   * @return filePath
   */
  public String getFilePath() {
    return filePath;
  }

  /**
   * Path to the Progressive WebM file (required)
   *
   * @param filePath
   *        Path to the Progressive WebM file (required)
   */
  public void setFilePath(String filePath) {
    this.filePath = filePath;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DashProgressiveWebmRepresentation dashProgressiveWebmRepresentation = (DashProgressiveWebmRepresentation) o;
    return Objects.equals(this.filePath, dashProgressiveWebmRepresentation.filePath) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filePath, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DashProgressiveWebmRepresentation {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    filePath: ").append(toIndentedString(filePath)).append("\n");
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

