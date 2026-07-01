package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
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
  @JsonProperty("percept")
  private Integer percept;

  @JsonProperty("percStr")
  private Double percStr;

  @JsonProperty("percPenaltyStr")
  private Double percPenaltyStr;

  @JsonProperty("percPenaltyKnee")
  private Double percPenaltyKnee;

  @JsonProperty("percTemporalStr")
  private Double percTemporalStr;

  @JsonProperty("pixelPerDegree")
  private Double pixelPerDegree;


  /**
   * HVS-based perceptual encoding mode (0:off 1:cudqp 2:+quant).
   * @return percept
   */
  public Integer getPercept() {
    return percept;
  }

  /**
   * HVS-based perceptual encoding mode (0:off 1:cudqp 2:+quant).
   *
   * @param percept
   *        HVS-based perceptual encoding mode (0:off 1:cudqp 2:+quant).
   */
  public void setPercept(Integer percept) {
    this.percept = percept;
  }


  /**
   * Overall strength of perceptual model (0.0-1.0).
   * @return percStr
   */
  public Double getPercStr() {
    return percStr;
  }

  /**
   * Overall strength of perceptual model (0.0-1.0).
   *
   * @param percStr
   *        Overall strength of perceptual model (0.0-1.0).
   */
  public void setPercStr(Double percStr) {
    this.percStr = percStr;
  }


  /**
   * Strength of penalties from perceptual model (0.0-1.0).
   * @return percPenaltyStr
   */
  public Double getPercPenaltyStr() {
    return percPenaltyStr;
  }

  /**
   * Strength of penalties from perceptual model (0.0-1.0).
   *
   * @param percPenaltyStr
   *        Strength of penalties from perceptual model (0.0-1.0).
   */
  public void setPercPenaltyStr(Double percPenaltyStr) {
    this.percPenaltyStr = percPenaltyStr;
  }


  /**
   * Knee point of penalty strength modulation (0.0-1.0).
   * @return percPenaltyKnee
   */
  public Double getPercPenaltyKnee() {
    return percPenaltyKnee;
  }

  /**
   * Knee point of penalty strength modulation (0.0-1.0).
   *
   * @param percPenaltyKnee
   *        Knee point of penalty strength modulation (0.0-1.0).
   */
  public void setPercPenaltyKnee(Double percPenaltyKnee) {
    this.percPenaltyKnee = percPenaltyKnee;
  }


  /**
   * Strength of temporal component of perceptual model (0.0-1.0).
   * @return percTemporalStr
   */
  public Double getPercTemporalStr() {
    return percTemporalStr;
  }

  /**
   * Strength of temporal component of perceptual model (0.0-1.0).
   *
   * @param percTemporalStr
   *        Strength of temporal component of perceptual model (0.0-1.0).
   */
  public void setPercTemporalStr(Double percTemporalStr) {
    this.percTemporalStr = percTemporalStr;
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
    return Objects.equals(this.percept, h265V2PerceptualQualityModeConfig.percept) &&
        Objects.equals(this.percStr, h265V2PerceptualQualityModeConfig.percStr) &&
        Objects.equals(this.percPenaltyStr, h265V2PerceptualQualityModeConfig.percPenaltyStr) &&
        Objects.equals(this.percPenaltyKnee, h265V2PerceptualQualityModeConfig.percPenaltyKnee) &&
        Objects.equals(this.percTemporalStr, h265V2PerceptualQualityModeConfig.percTemporalStr) &&
        Objects.equals(this.pixelPerDegree, h265V2PerceptualQualityModeConfig.pixelPerDegree) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(percept, percStr, percPenaltyStr, percPenaltyKnee, percTemporalStr, pixelPerDegree, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class H265V2PerceptualQualityModeConfig {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    percept: ").append(toIndentedString(percept)).append("\n");
    sb.append("    percStr: ").append(toIndentedString(percStr)).append("\n");
    sb.append("    percPenaltyStr: ").append(toIndentedString(percPenaltyStr)).append("\n");
    sb.append("    percPenaltyKnee: ").append(toIndentedString(percPenaltyKnee)).append("\n");
    sb.append("    percTemporalStr: ").append(toIndentedString(percTemporalStr)).append("\n");
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

