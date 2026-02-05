package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.DolbyAtmosDynamicRangeCompression;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * DolbyAtmosPreprocessing
 */

public class DolbyAtmosPreprocessing {
  @JsonProperty("dynamicRangeCompression")
  private DolbyAtmosDynamicRangeCompression dynamicRangeCompression;


  /**
   * It indicates a gain change to be applied in the Dolby Atmos decoder in order to implement dynamic range compression.  The values typically indicate gain reductions (cut) during loud passages and gain increases (boost) during quiet passages based on desired compression characteristics. 
   * @return dynamicRangeCompression
   */
  public DolbyAtmosDynamicRangeCompression getDynamicRangeCompression() {
    return dynamicRangeCompression;
  }

  /**
   * It indicates a gain change to be applied in the Dolby Atmos decoder in order to implement dynamic range compression.  The values typically indicate gain reductions (cut) during loud passages and gain increases (boost) during quiet passages based on desired compression characteristics. 
   *
   * @param dynamicRangeCompression
   *        It indicates a gain change to be applied in the Dolby Atmos decoder in order to implement dynamic range compression.  The values typically indicate gain reductions (cut) during loud passages and gain increases (boost) during quiet passages based on desired compression characteristics. 
   */
  public void setDynamicRangeCompression(DolbyAtmosDynamicRangeCompression dynamicRangeCompression) {
    this.dynamicRangeCompression = dynamicRangeCompression;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DolbyAtmosPreprocessing dolbyAtmosPreprocessing = (DolbyAtmosPreprocessing) o;
    return Objects.equals(this.dynamicRangeCompression, dolbyAtmosPreprocessing.dynamicRangeCompression);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dynamicRangeCompression);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DolbyAtmosPreprocessing {\n");
    
    sb.append("    dynamicRangeCompression: ").append(toIndentedString(dynamicRangeCompression)).append("\n");
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

