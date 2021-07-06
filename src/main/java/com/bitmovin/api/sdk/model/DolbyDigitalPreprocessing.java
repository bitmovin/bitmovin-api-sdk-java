package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.DolbyDigitalDynamicRangeCompression;
import com.bitmovin.api.sdk.model.DolbyDigitalLfeLowPassFilter;
import com.bitmovin.api.sdk.model.DolbyDigitalNinetyDegreePhaseShift;
import com.bitmovin.api.sdk.model.DolbyDigitalThreeDbAttenuation;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * DolbyDigitalPreprocessing
 */

public class DolbyDigitalPreprocessing {
  @JsonProperty("dynamicRangeCompression")
  private DolbyDigitalDynamicRangeCompression dynamicRangeCompression;

  @JsonProperty("lfeLowPassFilter")
  private DolbyDigitalLfeLowPassFilter lfeLowPassFilter;

  @JsonProperty("ninetyDegreePhaseShift")
  private DolbyDigitalNinetyDegreePhaseShift ninetyDegreePhaseShift;

  @JsonProperty("threeDbAttenuation")
  private DolbyDigitalThreeDbAttenuation threeDbAttenuation;


  /**
   * It indicates a gain change to be applied in the Dolby Digital decoder in order to implement dynamic range compression.  The values typically indicate gain reductions (cut) during loud passages and gain increases (boost) during quiet passages based on desired compression characteristics. 
   * @return dynamicRangeCompression
   */
  public DolbyDigitalDynamicRangeCompression getDynamicRangeCompression() {
    return dynamicRangeCompression;
  }

  /**
   * It indicates a gain change to be applied in the Dolby Digital decoder in order to implement dynamic range compression.  The values typically indicate gain reductions (cut) during loud passages and gain increases (boost) during quiet passages based on desired compression characteristics. 
   *
   * @param dynamicRangeCompression
   *        It indicates a gain change to be applied in the Dolby Digital decoder in order to implement dynamic range compression.  The values typically indicate gain reductions (cut) during loud passages and gain increases (boost) during quiet passages based on desired compression characteristics. 
   */
  public void setDynamicRangeCompression(DolbyDigitalDynamicRangeCompression dynamicRangeCompression) {
    this.dynamicRangeCompression = dynamicRangeCompression;
  }


  /**
   * It applies a 120 Hz low-pass filter to the low-frequency effects (LFE) channel.  This is only allowed if the &#x60;channelLayout&#x60; contains a LFE channel. 
   * @return lfeLowPassFilter
   */
  public DolbyDigitalLfeLowPassFilter getLfeLowPassFilter() {
    return lfeLowPassFilter;
  }

  /**
   * It applies a 120 Hz low-pass filter to the low-frequency effects (LFE) channel.  This is only allowed if the &#x60;channelLayout&#x60; contains a LFE channel. 
   *
   * @param lfeLowPassFilter
   *        It applies a 120 Hz low-pass filter to the low-frequency effects (LFE) channel.  This is only allowed if the &#x60;channelLayout&#x60; contains a LFE channel. 
   */
  public void setLfeLowPassFilter(DolbyDigitalLfeLowPassFilter lfeLowPassFilter) {
    this.lfeLowPassFilter = lfeLowPassFilter;
  }


  /**
   * Get ninetyDegreePhaseShift
   * @return ninetyDegreePhaseShift
   */
  public DolbyDigitalNinetyDegreePhaseShift getNinetyDegreePhaseShift() {
    return ninetyDegreePhaseShift;
  }

  /**
   * Set ninetyDegreePhaseShift
   *
   * @param ninetyDegreePhaseShift
   */
  public void setNinetyDegreePhaseShift(DolbyDigitalNinetyDegreePhaseShift ninetyDegreePhaseShift) {
    this.ninetyDegreePhaseShift = ninetyDegreePhaseShift;
  }


  /**
   * Get threeDbAttenuation
   * @return threeDbAttenuation
   */
  public DolbyDigitalThreeDbAttenuation getThreeDbAttenuation() {
    return threeDbAttenuation;
  }

  /**
   * Set threeDbAttenuation
   *
   * @param threeDbAttenuation
   */
  public void setThreeDbAttenuation(DolbyDigitalThreeDbAttenuation threeDbAttenuation) {
    this.threeDbAttenuation = threeDbAttenuation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DolbyDigitalPreprocessing dolbyDigitalPreprocessing = (DolbyDigitalPreprocessing) o;
    return Objects.equals(this.dynamicRangeCompression, dolbyDigitalPreprocessing.dynamicRangeCompression) &&
        Objects.equals(this.lfeLowPassFilter, dolbyDigitalPreprocessing.lfeLowPassFilter) &&
        Objects.equals(this.ninetyDegreePhaseShift, dolbyDigitalPreprocessing.ninetyDegreePhaseShift) &&
        Objects.equals(this.threeDbAttenuation, dolbyDigitalPreprocessing.threeDbAttenuation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dynamicRangeCompression, lfeLowPassFilter, ninetyDegreePhaseShift, threeDbAttenuation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DolbyDigitalPreprocessing {\n");
    
    sb.append("    dynamicRangeCompression: ").append(toIndentedString(dynamicRangeCompression)).append("\n");
    sb.append("    lfeLowPassFilter: ").append(toIndentedString(lfeLowPassFilter)).append("\n");
    sb.append("    ninetyDegreePhaseShift: ").append(toIndentedString(ninetyDegreePhaseShift)).append("\n");
    sb.append("    threeDbAttenuation: ").append(toIndentedString(threeDbAttenuation)).append("\n");
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

