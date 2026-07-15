package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.H265V2PerceptualEncodingMode;
import com.bitmovin.api.sdk.model.H265V2RateControlModeConfig;
import com.bitmovin.api.sdk.model.H265V2RateControlModeConfigType;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * H265V2PerceptualQualityModeConfig
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = false, defaultImpl = H265V2PerceptualQualityModeConfig.class)
public class H265V2PerceptualQualityModeConfig extends H265V2RateControlModeConfig {
  @JsonProperty("perceptualEncodingMode")
  private H265V2PerceptualEncodingMode perceptualEncodingMode;

  @JsonProperty("perceptualStrength")
  private Double perceptualStrength;

  @JsonProperty("perceptualPenaltyStrength")
  private Double perceptualPenaltyStrength;

  @JsonProperty("perceptualPenaltyKnee")
  private Double perceptualPenaltyKnee;

  @JsonProperty("perceptualTemporalStrength")
  private Double perceptualTemporalStrength;

  @JsonProperty("pixelPerDegree")
  private Double pixelPerDegree;


  /**
   * HVS-based perceptual encoding mode.
   * @return perceptualEncodingMode
   */
  public H265V2PerceptualEncodingMode getPerceptualEncodingMode() {
    return perceptualEncodingMode;
  }

  /**
   * HVS-based perceptual encoding mode.
   *
   * @param perceptualEncodingMode
   *        HVS-based perceptual encoding mode.
   */
  public void setPerceptualEncodingMode(H265V2PerceptualEncodingMode perceptualEncodingMode) {
    this.perceptualEncodingMode = perceptualEncodingMode;
  }


  /**
   * Overall strength of perceptual model (0.0-1.0).
   * @return perceptualStrength
   */
  public Double getPerceptualStrength() {
    return perceptualStrength;
  }

  /**
   * Overall strength of perceptual model (0.0-1.0).
   *
   * @param perceptualStrength
   *        Overall strength of perceptual model (0.0-1.0).
   */
  public void setPerceptualStrength(Double perceptualStrength) {
    this.perceptualStrength = perceptualStrength;
  }


  /**
   * Strength of penalties from perceptual model (0.0-1.0).
   * @return perceptualPenaltyStrength
   */
  public Double getPerceptualPenaltyStrength() {
    return perceptualPenaltyStrength;
  }

  /**
   * Strength of penalties from perceptual model (0.0-1.0).
   *
   * @param perceptualPenaltyStrength
   *        Strength of penalties from perceptual model (0.0-1.0).
   */
  public void setPerceptualPenaltyStrength(Double perceptualPenaltyStrength) {
    this.perceptualPenaltyStrength = perceptualPenaltyStrength;
  }


  /**
   * Knee point of penalty strength modulation (0.0-1.0).
   * @return perceptualPenaltyKnee
   */
  public Double getPerceptualPenaltyKnee() {
    return perceptualPenaltyKnee;
  }

  /**
   * Knee point of penalty strength modulation (0.0-1.0).
   *
   * @param perceptualPenaltyKnee
   *        Knee point of penalty strength modulation (0.0-1.0).
   */
  public void setPerceptualPenaltyKnee(Double perceptualPenaltyKnee) {
    this.perceptualPenaltyKnee = perceptualPenaltyKnee;
  }


  /**
   * Strength of temporal component of perceptual model (0.0-1.0).
   * @return perceptualTemporalStrength
   */
  public Double getPerceptualTemporalStrength() {
    return perceptualTemporalStrength;
  }

  /**
   * Strength of temporal component of perceptual model (0.0-1.0).
   *
   * @param perceptualTemporalStrength
   *        Strength of temporal component of perceptual model (0.0-1.0).
   */
  public void setPerceptualTemporalStrength(Double perceptualTemporalStrength) {
    this.perceptualTemporalStrength = perceptualTemporalStrength;
  }


  /**
   * Pixels per degree (horizontal), i.e. width / FOV.
   * @return pixelPerDegree
   */
  public Double getPixelPerDegree() {
    return pixelPerDegree;
  }

  /**
   * Pixels per degree (horizontal), i.e. width / FOV.
   *
   * @param pixelPerDegree
   *        Pixels per degree (horizontal), i.e. width / FOV.
   */
  public void setPixelPerDegree(Double pixelPerDegree) {
    this.pixelPerDegree = pixelPerDegree;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    H265V2PerceptualQualityModeConfig h265V2PerceptualQualityModeConfig = (H265V2PerceptualQualityModeConfig) o;
    return Objects.equals(this.perceptualEncodingMode, h265V2PerceptualQualityModeConfig.perceptualEncodingMode) &&
        Objects.equals(this.perceptualStrength, h265V2PerceptualQualityModeConfig.perceptualStrength) &&
        Objects.equals(this.perceptualPenaltyStrength, h265V2PerceptualQualityModeConfig.perceptualPenaltyStrength) &&
        Objects.equals(this.perceptualPenaltyKnee, h265V2PerceptualQualityModeConfig.perceptualPenaltyKnee) &&
        Objects.equals(this.perceptualTemporalStrength, h265V2PerceptualQualityModeConfig.perceptualTemporalStrength) &&
        Objects.equals(this.pixelPerDegree, h265V2PerceptualQualityModeConfig.pixelPerDegree) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(perceptualEncodingMode, perceptualStrength, perceptualPenaltyStrength, perceptualPenaltyKnee, perceptualTemporalStrength, pixelPerDegree, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class H265V2PerceptualQualityModeConfig {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    perceptualEncodingMode: ").append(toIndentedString(perceptualEncodingMode)).append("\n");
    sb.append("    perceptualStrength: ").append(toIndentedString(perceptualStrength)).append("\n");
    sb.append("    perceptualPenaltyStrength: ").append(toIndentedString(perceptualPenaltyStrength)).append("\n");
    sb.append("    perceptualPenaltyKnee: ").append(toIndentedString(perceptualPenaltyKnee)).append("\n");
    sb.append("    perceptualTemporalStrength: ").append(toIndentedString(perceptualTemporalStrength)).append("\n");
    sb.append("    pixelPerDegree: ").append(toIndentedString(pixelPerDegree)).append("\n");
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

