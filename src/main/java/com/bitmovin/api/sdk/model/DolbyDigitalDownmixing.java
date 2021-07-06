package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.DolbyDigitalCenterMixLevel;
import com.bitmovin.api.sdk.model.DolbyDigitalDownmixingPreferredMode;
import com.bitmovin.api.sdk.model.DolbyDigitalSurroundMixLevel;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * Downmixing is used to reproduce the complete audio program when the actual decoder outputs do not match the encoded channel layout of the original audio signal.  The process of downmixing takes the information in the channels that do not have corresponding outputs, and mixes this information into the remaining channels. 
 */

public class DolbyDigitalDownmixing {
  @JsonProperty("loRoCenterMixLevel")
  private DolbyDigitalCenterMixLevel loRoCenterMixLevel;

  @JsonProperty("ltRtCenterMixLevel")
  private DolbyDigitalCenterMixLevel ltRtCenterMixLevel;

  @JsonProperty("loRoSurroundMixLevel")
  private DolbyDigitalSurroundMixLevel loRoSurroundMixLevel;

  @JsonProperty("ltRtSurroundMixLevel")
  private DolbyDigitalSurroundMixLevel ltRtSurroundMixLevel;

  @JsonProperty("preferredMode")
  private DolbyDigitalDownmixingPreferredMode preferredMode;


  /**
   * The level shift applied to the C channel when adding to the L and R outputs as a result of downmixing to one Lo/Ro output.
   * @return loRoCenterMixLevel
   */
  public DolbyDigitalCenterMixLevel getLoRoCenterMixLevel() {
    return loRoCenterMixLevel;
  }

  /**
   * The level shift applied to the C channel when adding to the L and R outputs as a result of downmixing to one Lo/Ro output.
   *
   * @param loRoCenterMixLevel
   *        The level shift applied to the C channel when adding to the L and R outputs as a result of downmixing to one Lo/Ro output.
   */
  public void setLoRoCenterMixLevel(DolbyDigitalCenterMixLevel loRoCenterMixLevel) {
    this.loRoCenterMixLevel = loRoCenterMixLevel;
  }


  /**
   * The level shift applied to the C channel when adding to the L and R outputs as a result of downmixing to one Lt/Rt output.
   * @return ltRtCenterMixLevel
   */
  public DolbyDigitalCenterMixLevel getLtRtCenterMixLevel() {
    return ltRtCenterMixLevel;
  }

  /**
   * The level shift applied to the C channel when adding to the L and R outputs as a result of downmixing to one Lt/Rt output.
   *
   * @param ltRtCenterMixLevel
   *        The level shift applied to the C channel when adding to the L and R outputs as a result of downmixing to one Lt/Rt output.
   */
  public void setLtRtCenterMixLevel(DolbyDigitalCenterMixLevel ltRtCenterMixLevel) {
    this.ltRtCenterMixLevel = ltRtCenterMixLevel;
  }


  /**
   * The level shift applied to the surround channels when downmixing to one Lo/Ro output.
   * @return loRoSurroundMixLevel
   */
  public DolbyDigitalSurroundMixLevel getLoRoSurroundMixLevel() {
    return loRoSurroundMixLevel;
  }

  /**
   * The level shift applied to the surround channels when downmixing to one Lo/Ro output.
   *
   * @param loRoSurroundMixLevel
   *        The level shift applied to the surround channels when downmixing to one Lo/Ro output.
   */
  public void setLoRoSurroundMixLevel(DolbyDigitalSurroundMixLevel loRoSurroundMixLevel) {
    this.loRoSurroundMixLevel = loRoSurroundMixLevel;
  }


  /**
   * The level shift applied to the surround channels when downmixing to one Lt/Rt output.
   * @return ltRtSurroundMixLevel
   */
  public DolbyDigitalSurroundMixLevel getLtRtSurroundMixLevel() {
    return ltRtSurroundMixLevel;
  }

  /**
   * The level shift applied to the surround channels when downmixing to one Lt/Rt output.
   *
   * @param ltRtSurroundMixLevel
   *        The level shift applied to the surround channels when downmixing to one Lt/Rt output.
   */
  public void setLtRtSurroundMixLevel(DolbyDigitalSurroundMixLevel ltRtSurroundMixLevel) {
    this.ltRtSurroundMixLevel = ltRtSurroundMixLevel;
  }


  /**
   * Get preferredMode
   * @return preferredMode
   */
  public DolbyDigitalDownmixingPreferredMode getPreferredMode() {
    return preferredMode;
  }

  /**
   * Set preferredMode
   *
   * @param preferredMode
   */
  public void setPreferredMode(DolbyDigitalDownmixingPreferredMode preferredMode) {
    this.preferredMode = preferredMode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DolbyDigitalDownmixing dolbyDigitalDownmixing = (DolbyDigitalDownmixing) o;
    return Objects.equals(this.loRoCenterMixLevel, dolbyDigitalDownmixing.loRoCenterMixLevel) &&
        Objects.equals(this.ltRtCenterMixLevel, dolbyDigitalDownmixing.ltRtCenterMixLevel) &&
        Objects.equals(this.loRoSurroundMixLevel, dolbyDigitalDownmixing.loRoSurroundMixLevel) &&
        Objects.equals(this.ltRtSurroundMixLevel, dolbyDigitalDownmixing.ltRtSurroundMixLevel) &&
        Objects.equals(this.preferredMode, dolbyDigitalDownmixing.preferredMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loRoCenterMixLevel, ltRtCenterMixLevel, loRoSurroundMixLevel, ltRtSurroundMixLevel, preferredMode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DolbyDigitalDownmixing {\n");
    
    sb.append("    loRoCenterMixLevel: ").append(toIndentedString(loRoCenterMixLevel)).append("\n");
    sb.append("    ltRtCenterMixLevel: ").append(toIndentedString(ltRtCenterMixLevel)).append("\n");
    sb.append("    loRoSurroundMixLevel: ").append(toIndentedString(loRoSurroundMixLevel)).append("\n");
    sb.append("    ltRtSurroundMixLevel: ").append(toIndentedString(ltRtSurroundMixLevel)).append("\n");
    sb.append("    preferredMode: ").append(toIndentedString(preferredMode)).append("\n");
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

