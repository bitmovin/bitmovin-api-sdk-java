package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.Filter;
import java.util.Date;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * ConformFilter
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = false, defaultImpl = ConformFilter.class)
public class ConformFilter extends Filter {
  @JsonProperty("targetFps")
  private Double targetFps;


  /**
   * The FPS the input should be changed to.
   * @return targetFps
   */
  public Double getTargetFps() {
    return targetFps;
  }

  /**
   * The FPS the input should be changed to.
   *
   * @param targetFps
   *        The FPS the input should be changed to.
   */
  public void setTargetFps(Double targetFps) {
    this.targetFps = targetFps;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConformFilter conformFilter = (ConformFilter) o;
    return Objects.equals(this.targetFps, conformFilter.targetFps) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetFps, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConformFilter {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    targetFps: ").append(toIndentedString(targetFps)).append("\n");
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

