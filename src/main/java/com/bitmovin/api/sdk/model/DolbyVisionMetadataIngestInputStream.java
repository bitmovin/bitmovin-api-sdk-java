package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.InputStream;
import java.util.Date;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * DolbyVisionMetadataIngestInputStream
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = false, defaultImpl = DolbyVisionMetadataIngestInputStream.class)
public class DolbyVisionMetadataIngestInputStream extends InputStream {
  @JsonProperty("inputId")
  private String inputId;

  @JsonProperty("inputPath")
  private String inputPath;


  /**
   * Id of input (required)
   * @return inputId
   */
  public String getInputId() {
    return inputId;
  }

  /**
   * Id of input (required)
   *
   * @param inputId
   *        Id of input (required)
   */
  public void setInputId(String inputId) {
    this.inputId = inputId;
  }


  /**
   * Path to Dolby Vision Metadata file (required)
   * @return inputPath
   */
  public String getInputPath() {
    return inputPath;
  }

  /**
   * Path to Dolby Vision Metadata file (required)
   *
   * @param inputPath
   *        Path to Dolby Vision Metadata file (required)
   */
  public void setInputPath(String inputPath) {
    this.inputPath = inputPath;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DolbyVisionMetadataIngestInputStream dolbyVisionMetadataIngestInputStream = (DolbyVisionMetadataIngestInputStream) o;
    return Objects.equals(this.inputId, dolbyVisionMetadataIngestInputStream.inputId) &&
        Objects.equals(this.inputPath, dolbyVisionMetadataIngestInputStream.inputPath) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inputId, inputPath, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DolbyVisionMetadataIngestInputStream {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    inputId: ").append(toIndentedString(inputId)).append("\n");
    sb.append("    inputPath: ").append(toIndentedString(inputPath)).append("\n");
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

