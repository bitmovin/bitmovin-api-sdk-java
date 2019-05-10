package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.TimeSpan;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * PsnrQualityMetric
 */

public class PsnrQualityMetric {
  @JsonProperty("timeSpan")
  private TimeSpan timeSpan = null;

  @JsonProperty("psnr")
  private Double psnr;


  /**
   * Get timeSpan
   * @return timeSpan
   */
  public TimeSpan getTimeSpan() {
    return timeSpan;
  }

  public void setTimeSpan(TimeSpan timeSpan) {
    this.timeSpan = timeSpan;
  }


  /**
   * Peak signal-to-noise ratio
   * @return psnr
   */
  public Double getPsnr() {
    return psnr;
  }

  public void setPsnr(Double psnr) {
    this.psnr = psnr;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PsnrQualityMetric psnrQualityMetric = (PsnrQualityMetric) o;
    return Objects.equals(this.timeSpan, psnrQualityMetric.timeSpan) &&
        Objects.equals(this.psnr, psnrQualityMetric.psnr);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timeSpan, psnr);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PsnrQualityMetric {\n");
    
    sb.append("    timeSpan: ").append(toIndentedString(timeSpan)).append("\n");
    sb.append("    psnr: ").append(toIndentedString(psnr)).append("\n");
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

