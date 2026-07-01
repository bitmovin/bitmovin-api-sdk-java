package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.H265V2RateControlModeConfigType;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * Rate control mode configuration. Use H265V2PerceptualQualityModeConfig for PQP mode or H265V2ConstantBitrateModeConfig for CBR mode.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = false, defaultImpl = H265V2RateControlModeConfig.class)
@JsonSubTypes({
  @JsonSubTypes.Type(value = H265V2PerceptualQualityModeConfig.class, name = "PERCEPTUAL_QUALITY_MODE"),
  @JsonSubTypes.Type(value = H265V2ConstantBitrateModeConfig.class, name = "CONSTANT_BITRATE_MODE"),
})

public class H265V2RateControlModeConfig {
  @JsonProperty("type")
  private H265V2RateControlModeConfigType type;


  /**
   * Get type
   * @return type
   */
  public H265V2RateControlModeConfigType getType() {
    return type;
  }

  /**
   * Set type
   *
   * @param type
   */
  public void setType(H265V2RateControlModeConfigType type) {
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
    H265V2RateControlModeConfig h265V2RateControlModeConfig = (H265V2RateControlModeConfig) o;
    return Objects.equals(this.type, h265V2RateControlModeConfig.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class H265V2RateControlModeConfig {\n");
    
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

