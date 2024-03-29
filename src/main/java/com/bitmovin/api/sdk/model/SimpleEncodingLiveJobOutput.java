package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.SimpleEncodingLiveMaxResolution;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * SimpleEncodingLiveJobOutput
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = false, defaultImpl = SimpleEncodingLiveJobOutput.class)
@JsonSubTypes({
  @JsonSubTypes.Type(value = SimpleEncodingLiveJobUrlOutput.class, name = "URL"),
  @JsonSubTypes.Type(value = SimpleEncodingLiveJobCdnOutput.class, name = "CDN"),
})

public class SimpleEncodingLiveJobOutput {
  @JsonProperty("maxResolution")
  private SimpleEncodingLiveMaxResolution maxResolution;


  /**
   * The maximum output resolution to be generated
   * @return maxResolution
   */
  public SimpleEncodingLiveMaxResolution getMaxResolution() {
    return maxResolution;
  }

  /**
   * The maximum output resolution to be generated
   *
   * @param maxResolution
   *        The maximum output resolution to be generated
   */
  public void setMaxResolution(SimpleEncodingLiveMaxResolution maxResolution) {
    this.maxResolution = maxResolution;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SimpleEncodingLiveJobOutput simpleEncodingLiveJobOutput = (SimpleEncodingLiveJobOutput) o;
    return Objects.equals(this.maxResolution, simpleEncodingLiveJobOutput.maxResolution);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxResolution);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SimpleEncodingLiveJobOutput {\n");
    
    sb.append("    maxResolution: ").append(toIndentedString(maxResolution)).append("\n");
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

