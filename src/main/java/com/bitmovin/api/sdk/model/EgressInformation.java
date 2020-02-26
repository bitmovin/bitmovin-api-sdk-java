package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.CloudRegion;
import com.bitmovin.api.sdk.model.EgressCategory;
import com.bitmovin.api.sdk.model.OutputType;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * EgressInformation
 */

public class EgressInformation {
  @JsonProperty("category")
  private EgressCategory category;

  @JsonProperty("bytes")
  private Long bytes;

  @JsonProperty("outputType")
  private OutputType outputType;

  @JsonProperty("outputRegion")
  private CloudRegion outputRegion;


  /**
   * Get category
   * @return category
   */
  public EgressCategory getCategory() {
    return category;
  }

  /**
   * Set category
   *
   * @param category
   */
  public void setCategory(EgressCategory category) {
    this.category = category;
  }


  /**
   * The number of bytes that have been transferred to the output (required)
   * @return bytes
   */
  public Long getBytes() {
    return bytes;
  }

  /**
   * The number of bytes that have been transferred to the output (required)
   *
   * @param bytes
   *        The number of bytes that have been transferred to the output (required)
   */
  public void setBytes(Long bytes) {
    this.bytes = bytes;
  }


  /**
   * Get outputType
   * @return outputType
   */
  public OutputType getOutputType() {
    return outputType;
  }

  /**
   * Set outputType
   *
   * @param outputType
   */
  public void setOutputType(OutputType outputType) {
    this.outputType = outputType;
  }


  /**
   * Get outputRegion
   * @return outputRegion
   */
  public CloudRegion getOutputRegion() {
    return outputRegion;
  }

  /**
   * Set outputRegion
   *
   * @param outputRegion
   */
  public void setOutputRegion(CloudRegion outputRegion) {
    this.outputRegion = outputRegion;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EgressInformation egressInformation = (EgressInformation) o;
    return Objects.equals(this.category, egressInformation.category) &&
        Objects.equals(this.bytes, egressInformation.bytes) &&
        Objects.equals(this.outputType, egressInformation.outputType) &&
        Objects.equals(this.outputRegion, egressInformation.outputRegion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, bytes, outputType, outputRegion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EgressInformation {\n");
    
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    bytes: ").append(toIndentedString(bytes)).append("\n");
    sb.append("    outputType: ").append(toIndentedString(outputType)).append("\n");
    sb.append("    outputRegion: ").append(toIndentedString(outputRegion)).append("\n");
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

