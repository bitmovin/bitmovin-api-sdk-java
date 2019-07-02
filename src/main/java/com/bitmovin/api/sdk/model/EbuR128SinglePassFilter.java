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
 * EbuR128SinglePassFilter
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NONE)
public class EbuR128SinglePassFilter extends Filter {
  @JsonProperty("integratedLoudness")
  private Double integratedLoudness;

  @JsonProperty("loudnessRange")
  private Double loudnessRange;

  @JsonProperty("maximumTruePeakLevel")
  private Double maximumTruePeakLevel;


  /**
   * Set the targeted integrated loudness value. Range is from &#39;-70.0&#39; to &#39;-5.0&#39;. Default value is &#39;-24.0&#39;. Value is measured in LUFS (Loudness Units, referenced to Full Scale)
   * @return integratedLoudness
   */
  public Double getIntegratedLoudness() {
    return integratedLoudness;
  }

  /**
   * Set the targeted integrated loudness value. Range is from &#39;-70.0&#39; to &#39;-5.0&#39;. Default value is &#39;-24.0&#39;. Value is measured in LUFS (Loudness Units, referenced to Full Scale)
   *
   * @param integratedLoudness
   *        Set the targeted integrated loudness value. Range is from &#39;-70.0&#39; to &#39;-5.0&#39;. Default value is &#39;-24.0&#39;. Value is measured in LUFS (Loudness Units, referenced to Full Scale)
   */
  public void setIntegratedLoudness(Double integratedLoudness) {
    this.integratedLoudness = integratedLoudness;
  }


  /**
   * Set the targeted loudness range target. Range is from &#39;1.0&#39; to &#39;20.0&#39;. Default value is &#39;7.0&#39;. Loudness range measures the variation of loudness on a macroscopic time-scale in units of LU (Loudness Units). For programmes shorter than 1 minute, the use of the measure Loudness Range is not recommended due to too few data points (Loudness Range is based on the Short-term-Loudness values (3-seconds-window)).
   * @return loudnessRange
   */
  public Double getLoudnessRange() {
    return loudnessRange;
  }

  /**
   * Set the targeted loudness range target. Range is from &#39;1.0&#39; to &#39;20.0&#39;. Default value is &#39;7.0&#39;. Loudness range measures the variation of loudness on a macroscopic time-scale in units of LU (Loudness Units). For programmes shorter than 1 minute, the use of the measure Loudness Range is not recommended due to too few data points (Loudness Range is based on the Short-term-Loudness values (3-seconds-window)).
   *
   * @param loudnessRange
   *        Set the targeted loudness range target. Range is from &#39;1.0&#39; to &#39;20.0&#39;. Default value is &#39;7.0&#39;. Loudness range measures the variation of loudness on a macroscopic time-scale in units of LU (Loudness Units). For programmes shorter than 1 minute, the use of the measure Loudness Range is not recommended due to too few data points (Loudness Range is based on the Short-term-Loudness values (3-seconds-window)).
   */
  public void setLoudnessRange(Double loudnessRange) {
    this.loudnessRange = loudnessRange;
  }


  /**
   * Set maximum true peak. Range is from &#39;-9.0&#39; to &#39;0.0&#39;. Default value is &#39;-2.0&#39;. Values are measured in dBTP (db True Peak)
   * @return maximumTruePeakLevel
   */
  public Double getMaximumTruePeakLevel() {
    return maximumTruePeakLevel;
  }

  /**
   * Set maximum true peak. Range is from &#39;-9.0&#39; to &#39;0.0&#39;. Default value is &#39;-2.0&#39;. Values are measured in dBTP (db True Peak)
   *
   * @param maximumTruePeakLevel
   *        Set maximum true peak. Range is from &#39;-9.0&#39; to &#39;0.0&#39;. Default value is &#39;-2.0&#39;. Values are measured in dBTP (db True Peak)
   */
  public void setMaximumTruePeakLevel(Double maximumTruePeakLevel) {
    this.maximumTruePeakLevel = maximumTruePeakLevel;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EbuR128SinglePassFilter ebuR128SinglePassFilter = (EbuR128SinglePassFilter) o;
    return Objects.equals(this.integratedLoudness, ebuR128SinglePassFilter.integratedLoudness) &&
        Objects.equals(this.loudnessRange, ebuR128SinglePassFilter.loudnessRange) &&
        Objects.equals(this.maximumTruePeakLevel, ebuR128SinglePassFilter.maximumTruePeakLevel) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(integratedLoudness, loudnessRange, maximumTruePeakLevel, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EbuR128SinglePassFilter {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    integratedLoudness: ").append(toIndentedString(integratedLoudness)).append("\n");
    sb.append("    loudnessRange: ").append(toIndentedString(loudnessRange)).append("\n");
    sb.append("    maximumTruePeakLevel: ").append(toIndentedString(maximumTruePeakLevel)).append("\n");
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

