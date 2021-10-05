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
 * DolbyVisionInputStream
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = false, defaultImpl = DolbyVisionInputStream.class)
public class DolbyVisionInputStream extends InputStream {
  @JsonProperty("inputId")
  private String inputId;

  @JsonProperty("videoInputPath")
  private String videoInputPath;

  @JsonProperty("metadataInputPath")
  private String metadataInputPath;


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
   * Path to Dolby Vision input video file. (required)
   * @return videoInputPath
   */
  public String getVideoInputPath() {
    return videoInputPath;
  }

  /**
   * Path to Dolby Vision input video file. (required)
   *
   * @param videoInputPath
   *        Path to Dolby Vision input video file. (required)
   */
  public void setVideoInputPath(String videoInputPath) {
    this.videoInputPath = videoInputPath;
  }


  /**
   * Path to Dolby Vision Metadata file. This field is required when the metadata is not embedded in the video input file.
   * @return metadataInputPath
   */
  public String getMetadataInputPath() {
    return metadataInputPath;
  }

  /**
   * Path to Dolby Vision Metadata file. This field is required when the metadata is not embedded in the video input file.
   *
   * @param metadataInputPath
   *        Path to Dolby Vision Metadata file. This field is required when the metadata is not embedded in the video input file.
   */
  public void setMetadataInputPath(String metadataInputPath) {
    this.metadataInputPath = metadataInputPath;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DolbyVisionInputStream dolbyVisionInputStream = (DolbyVisionInputStream) o;
    return Objects.equals(this.inputId, dolbyVisionInputStream.inputId) &&
        Objects.equals(this.videoInputPath, dolbyVisionInputStream.videoInputPath) &&
        Objects.equals(this.metadataInputPath, dolbyVisionInputStream.metadataInputPath) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inputId, videoInputPath, metadataInputPath, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DolbyVisionInputStream {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    inputId: ").append(toIndentedString(inputId)).append("\n");
    sb.append("    videoInputPath: ").append(toIndentedString(videoInputPath)).append("\n");
    sb.append("    metadataInputPath: ").append(toIndentedString(metadataInputPath)).append("\n");
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

