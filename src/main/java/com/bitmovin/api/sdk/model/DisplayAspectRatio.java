package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * DisplayAspectRatio
 */

public class DisplayAspectRatio {
  @JsonProperty("numerator")
  private Integer numerator;

  @JsonProperty("denominator")
  private Integer denominator;


  /**
   * The numerator of the display aspect ratio (DAR). For example for a DAR of 16:9, the value 16 must be used. (required)
   * minimum: 1
   * @return numerator
   */
  public Integer getNumerator() {
    return numerator;
  }

  /**
   * The numerator of the display aspect ratio (DAR). For example for a DAR of 16:9, the value 16 must be used. (required)
   * minimum: 1
   *
   * @param numerator
   *        The numerator of the display aspect ratio (DAR). For example for a DAR of 16:9, the value 16 must be used. (required)
   * minimum: 1
   */
  public void setNumerator(Integer numerator) {
    this.numerator = numerator;
  }


  /**
   * The denominator of the display aspect ratio (DAR). For example for a DAR of 16:9, the value 9 must be used. (required)
   * minimum: 1
   * @return denominator
   */
  public Integer getDenominator() {
    return denominator;
  }

  /**
   * The denominator of the display aspect ratio (DAR). For example for a DAR of 16:9, the value 9 must be used. (required)
   * minimum: 1
   *
   * @param denominator
   *        The denominator of the display aspect ratio (DAR). For example for a DAR of 16:9, the value 9 must be used. (required)
   * minimum: 1
   */
  public void setDenominator(Integer denominator) {
    this.denominator = denominator;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DisplayAspectRatio displayAspectRatio = (DisplayAspectRatio) o;
    return Objects.equals(this.numerator, displayAspectRatio.numerator) &&
        Objects.equals(this.denominator, displayAspectRatio.denominator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numerator, denominator);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DisplayAspectRatio {\n");
    
    sb.append("    numerator: ").append(toIndentedString(numerator)).append("\n");
    sb.append("    denominator: ").append(toIndentedString(denominator)).append("\n");
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

