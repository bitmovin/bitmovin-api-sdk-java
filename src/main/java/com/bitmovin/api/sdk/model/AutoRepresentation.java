package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * AutoRepresentation
 */

public class AutoRepresentation {
  @JsonProperty("adoptConfigurationThreshold")
  private Double adoptConfigurationThreshold;


  /**
   * This is the threshold that determines whether the settings of the lower or the upper template representation (codec configuration) should be used, when representations are added automatically. The value must be between 0 and 1. Values nearer 0 will favour the higher representation, values nearer 1 will favour the lower representation.
   * @return adoptConfigurationThreshold
   */
  public Double getAdoptConfigurationThreshold() {
    return adoptConfigurationThreshold;
  }

  /**
   * This is the threshold that determines whether the settings of the lower or the upper template representation (codec configuration) should be used, when representations are added automatically. The value must be between 0 and 1. Values nearer 0 will favour the higher representation, values nearer 1 will favour the lower representation.
   *
   * @param adoptConfigurationThreshold
   *        This is the threshold that determines whether the settings of the lower or the upper template representation (codec configuration) should be used, when representations are added automatically. The value must be between 0 and 1. Values nearer 0 will favour the higher representation, values nearer 1 will favour the lower representation.
   */
  public void setAdoptConfigurationThreshold(Double adoptConfigurationThreshold) {
    this.adoptConfigurationThreshold = adoptConfigurationThreshold;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AutoRepresentation autoRepresentation = (AutoRepresentation) o;
    return Objects.equals(this.adoptConfigurationThreshold, autoRepresentation.adoptConfigurationThreshold);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adoptConfigurationThreshold);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AutoRepresentation {\n");
    
    sb.append("    adoptConfigurationThreshold: ").append(toIndentedString(adoptConfigurationThreshold)).append("\n");
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

