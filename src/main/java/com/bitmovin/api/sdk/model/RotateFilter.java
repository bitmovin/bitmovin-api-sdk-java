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
 * RotateFilter
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = false, defaultImpl = RotateFilter.class)
public class RotateFilter extends Filter {
  @JsonProperty("rotation")
  private Integer rotation;


  /**
   * Rotation of the video in degrees. A positive value will rotate the video clockwise and a negative one counter clockwise. (required)
   * @return rotation
   */
  public Integer getRotation() {
    return rotation;
  }

  /**
   * Rotation of the video in degrees. A positive value will rotate the video clockwise and a negative one counter clockwise. (required)
   *
   * @param rotation
   *        Rotation of the video in degrees. A positive value will rotate the video clockwise and a negative one counter clockwise. (required)
   */
  public void setRotation(Integer rotation) {
    this.rotation = rotation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RotateFilter rotateFilter = (RotateFilter) o;
    return Objects.equals(this.rotation, rotateFilter.rotation) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rotation, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RotateFilter {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    rotation: ").append(toIndentedString(rotation)).append("\n");
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

