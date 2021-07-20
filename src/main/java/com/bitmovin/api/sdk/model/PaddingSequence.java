package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.PaddingDurationUnit;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * PaddingSequence
 */

public class PaddingSequence {
  @JsonProperty("duration")
  private Double duration;

  @JsonProperty("unit")
  private PaddingDurationUnit unit;


  /**
   * Duration of the padding sequence, given in the unit specified by the &#x60;unit&#x60; property. The maximum duration is 300 frames or 10 seconds. If the unit is &#x60;FRAMES&#x60;, this needs to be an integer value and will be interpreted based on the input frame rate of the main part of the ConcatenationInputStream that is used by your video output stream(s). &#x60;FRAMES&#x60; is not allowed if the encoding does not contain a video output stream. (required)
   * minimum: 0
   * @return duration
   */
  public Double getDuration() {
    return duration;
  }

  /**
   * Duration of the padding sequence, given in the unit specified by the &#x60;unit&#x60; property. The maximum duration is 300 frames or 10 seconds. If the unit is &#x60;FRAMES&#x60;, this needs to be an integer value and will be interpreted based on the input frame rate of the main part of the ConcatenationInputStream that is used by your video output stream(s). &#x60;FRAMES&#x60; is not allowed if the encoding does not contain a video output stream. (required)
   * minimum: 0
   *
   * @param duration
   *        Duration of the padding sequence, given in the unit specified by the &#x60;unit&#x60; property. The maximum duration is 300 frames or 10 seconds. If the unit is &#x60;FRAMES&#x60;, this needs to be an integer value and will be interpreted based on the input frame rate of the main part of the ConcatenationInputStream that is used by your video output stream(s). &#x60;FRAMES&#x60; is not allowed if the encoding does not contain a video output stream. (required)
   *        minimum: 0
   */
  public void setDuration(Double duration) {
    this.duration = duration;
  }


  /**
   * The unit of the &#x60;duration&#x60; property
   * @return unit
   */
  public PaddingDurationUnit getUnit() {
    return unit;
  }

  /**
   * The unit of the &#x60;duration&#x60; property
   *
   * @param unit
   *        The unit of the &#x60;duration&#x60; property
   */
  public void setUnit(PaddingDurationUnit unit) {
    this.unit = unit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaddingSequence paddingSequence = (PaddingSequence) o;
    return Objects.equals(this.duration, paddingSequence.duration) &&
        Objects.equals(this.unit, paddingSequence.unit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(duration, unit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaddingSequence {\n");
    
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
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

