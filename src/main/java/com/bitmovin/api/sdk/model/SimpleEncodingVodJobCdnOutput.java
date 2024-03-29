package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.SimpleEncodingLiveMaxResolution;
import com.bitmovin.api.sdk.model.SimpleEncodingVodJobOutput;
import com.bitmovin.api.sdk.model.SimpleEncodingVodJobOutputArtifact;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * SimpleEncodingVodJobCdnOutput
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = false, defaultImpl = SimpleEncodingVodJobCdnOutput.class)
public class SimpleEncodingVodJobCdnOutput extends SimpleEncodingVodJobOutput {
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
    SimpleEncodingVodJobCdnOutput simpleEncodingVodJobCdnOutput = (SimpleEncodingVodJobCdnOutput) o;
    return Objects.equals(this.maxResolution, simpleEncodingVodJobCdnOutput.maxResolution) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxResolution, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SimpleEncodingVodJobCdnOutput {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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

