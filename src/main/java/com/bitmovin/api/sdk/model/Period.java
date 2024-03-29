package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.BitmovinResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * Period
 */

public class Period extends BitmovinResponse {
  @JsonProperty("start")
  private Double start;

  @JsonProperty("duration")
  private Double duration;


  /**
   * Starting time in seconds
   * @return start
   */
  public Double getStart() {
    return start;
  }

  /**
   * Starting time in seconds
   *
   * @param start
   *        Starting time in seconds
   */
  public void setStart(Double start) {
    this.start = start;
  }


  /**
   * Duration in seconds.&lt;br/&gt;Please note that the duration of a Period is usually determined by the media contained therein.&lt;br/&gt;Setting the &#x60;duration&#x60; property to a specific value will override this default behaviour.&lt;br/&gt;Warning: Use at your own risk!
   * @return duration
   */
  public Double getDuration() {
    return duration;
  }

  /**
   * Duration in seconds.&lt;br/&gt;Please note that the duration of a Period is usually determined by the media contained therein.&lt;br/&gt;Setting the &#x60;duration&#x60; property to a specific value will override this default behaviour.&lt;br/&gt;Warning: Use at your own risk!
   *
   * @param duration
   *        Duration in seconds.&lt;br/&gt;Please note that the duration of a Period is usually determined by the media contained therein.&lt;br/&gt;Setting the &#x60;duration&#x60; property to a specific value will override this default behaviour.&lt;br/&gt;Warning: Use at your own risk!
   */
  public void setDuration(Double duration) {
    this.duration = duration;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Period period = (Period) o;
    return Objects.equals(this.start, period.start) &&
        Objects.equals(this.duration, period.duration) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(start, duration, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Period {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
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

