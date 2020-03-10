package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.DashOnDemandRepresentationType;
import com.bitmovin.api.sdk.model.DashRepresentation;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * DashMp4Representation
 */

public class DashMp4Representation extends DashRepresentation {
  @JsonProperty("filePath")
  private String filePath;

  @JsonProperty("type")
  private DashOnDemandRepresentationType type;


  /**
   * Path to the MP4 file (required)
   * @return filePath
   */
  public String getFilePath() {
    return filePath;
  }

  /**
   * Path to the MP4 file (required)
   *
   * @param filePath
   *        Path to the MP4 file (required)
   */
  public void setFilePath(String filePath) {
    this.filePath = filePath;
  }


  /**
   * The type of the dash representation
   * @return type
   */
  public DashOnDemandRepresentationType getType() {
    return type;
  }

  /**
   * The type of the dash representation
   *
   * @param type
   *        The type of the dash representation
   */
  public void setType(DashOnDemandRepresentationType type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DashMp4Representation dashMp4Representation = (DashMp4Representation) o;
    return Objects.equals(this.filePath, dashMp4Representation.filePath) &&
        Objects.equals(this.type, dashMp4Representation.type) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filePath, type, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DashMp4Representation {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    filePath: ").append(toIndentedString(filePath)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

