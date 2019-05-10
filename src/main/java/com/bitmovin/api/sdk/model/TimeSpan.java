package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * TimeSpan
 */

public class TimeSpan {
  @JsonProperty("from")
  private Long from;

  @JsonProperty("to")
  private Long to;


  /**
   * Start offset of the time frame in milliseconds
   * @return from
   */
  public Long getFrom() {
    return from;
  }

  public void setFrom(Long from) {
    this.from = from;
  }


  /**
   * End offset of the time frame in milliseconds
   * @return to
   */
  public Long getTo() {
    return to;
  }

  public void setTo(Long to) {
    this.to = to;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeSpan timeSpan = (TimeSpan) o;
    return Objects.equals(this.from, timeSpan.from) &&
        Objects.equals(this.to, timeSpan.to);
  }

  @Override
  public int hashCode() {
    return Objects.hash(from, to);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeSpan {\n");
    
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
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

