package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * SpriteJpegConfig
 */

public class SpriteJpegConfig {
  @JsonProperty("quality")
  private Integer quality;


  /**
   * Quality of the JPEG file in percent. Allowed values 20 - 100 (required)
   * minimum: 20
   * maximum: 100
   * @return quality
   */
  public Integer getQuality() {
    return quality;
  }

  /**
   * Quality of the JPEG file in percent. Allowed values 20 - 100 (required)
   * minimum: 20
   * maximum: 100
   *
   * @param quality
   *        Quality of the JPEG file in percent. Allowed values 20 - 100 (required)
   *        minimum: 20
   *        maximum: 100
   */
  public void setQuality(Integer quality) {
    this.quality = quality;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpriteJpegConfig spriteJpegConfig = (SpriteJpegConfig) o;
    return Objects.equals(this.quality, spriteJpegConfig.quality);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quality);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpriteJpegConfig {\n");
    
    sb.append("    quality: ").append(toIndentedString(quality)).append("\n");
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

