package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.EsamDirection;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * ESAM condition following the SCTE-250 standard with timing offset and directional marker (OUT/IN) for signaling content boundaries
 */

public class EsamCondition {
  @JsonProperty("offset")
  private String offset;

  @JsonProperty("direction")
  private EsamDirection direction;


  /**
   * The offset from the matched signal when this condition applies in ISO 8601 duration format, accurate to milliseconds (required)
   * @return offset
   */
  public String getOffset() {
    return offset;
  }

  /**
   * The offset from the matched signal when this condition applies in ISO 8601 duration format, accurate to milliseconds (required)
   *
   * @param offset
   *        The offset from the matched signal when this condition applies in ISO 8601 duration format, accurate to milliseconds (required)
   */
  public void setOffset(String offset) {
    this.offset = offset;
  }


  /**
   * Direction marker indicating the boundary type (OUT for start, IN for end) (required)
   * @return direction
   */
  public EsamDirection getDirection() {
    return direction;
  }

  /**
   * Direction marker indicating the boundary type (OUT for start, IN for end) (required)
   *
   * @param direction
   *        Direction marker indicating the boundary type (OUT for start, IN for end) (required)
   */
  public void setDirection(EsamDirection direction) {
    this.direction = direction;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EsamCondition esamCondition = (EsamCondition) o;
    return Objects.equals(this.offset, esamCondition.offset) &&
        Objects.equals(this.direction, esamCondition.direction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offset, direction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EsamCondition {\n");
    
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
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

