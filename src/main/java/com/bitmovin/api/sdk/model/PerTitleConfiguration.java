package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.AutoRepresentation;
import com.bitmovin.api.sdk.model.PerTitleFixedResolutionAndBitrateConfiguration;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * PerTitleConfiguration
 */

public class PerTitleConfiguration {
  @JsonProperty("minBitrate")
  private Integer minBitrate;

  @JsonProperty("maxBitrate")
  private Integer maxBitrate;

  @JsonProperty("minBitrateStepSize")
  private Double minBitrateStepSize;

  @JsonProperty("maxBitrateStepSize")
  private Double maxBitrateStepSize;

  @JsonProperty("autoRepresentations")
  private AutoRepresentation autoRepresentations;

  @JsonProperty("complexityFactor")
  private Double complexityFactor;

  @JsonProperty("fixedResolutionAndBitrateConfiguration")
  private PerTitleFixedResolutionAndBitrateConfiguration fixedResolutionAndBitrateConfiguration;

  @JsonProperty("targetQualityCrf")
  private Double targetQualityCrf;

  @JsonProperty("resolutionScaleFactor")
  private Double resolutionScaleFactor;


  /**
   * The minimum bitrate that will be used by the Per-Title algorithm.
   * @return minBitrate
   */
  public Integer getMinBitrate() {
    return minBitrate;
  }

  /**
   * The minimum bitrate that will be used by the Per-Title algorithm.
   *
   * @param minBitrate
   *        The minimum bitrate that will be used by the Per-Title algorithm.
   */
  public void setMinBitrate(Integer minBitrate) {
    this.minBitrate = minBitrate;
  }


  /**
   * The maximum bitrate that will be used by the Per-Title algorithm. It will not generate any rendition with a higher bitrate.
   * @return maxBitrate
   */
  public Integer getMaxBitrate() {
    return maxBitrate;
  }

  /**
   * The maximum bitrate that will be used by the Per-Title algorithm. It will not generate any rendition with a higher bitrate.
   *
   * @param maxBitrate
   *        The maximum bitrate that will be used by the Per-Title algorithm. It will not generate any rendition with a higher bitrate.
   */
  public void setMaxBitrate(Integer maxBitrate) {
    this.maxBitrate = maxBitrate;
  }


  /**
   * The minimum ratio between the bitrates of generated renditions, e.g. if the first bitrate is 240,000, a minimum ratio of 1.5 will require the next higher bitrate to be at least 360,000
   * @return minBitrateStepSize
   */
  public Double getMinBitrateStepSize() {
    return minBitrateStepSize;
  }

  /**
   * The minimum ratio between the bitrates of generated renditions, e.g. if the first bitrate is 240,000, a minimum ratio of 1.5 will require the next higher bitrate to be at least 360,000
   *
   * @param minBitrateStepSize
   *        The minimum ratio between the bitrates of generated renditions, e.g. if the first bitrate is 240,000, a minimum ratio of 1.5 will require the next higher bitrate to be at least 360,000
   */
  public void setMinBitrateStepSize(Double minBitrateStepSize) {
    this.minBitrateStepSize = minBitrateStepSize;
  }


  /**
   * The maximum ratio between the bitrates of neighbouring renditions, e.g., if the first bitrate is 240,000, a maximum ratio of 1.5 will require the next higher bitrate to be at most 360,000
   * @return maxBitrateStepSize
   */
  public Double getMaxBitrateStepSize() {
    return maxBitrateStepSize;
  }

  /**
   * The maximum ratio between the bitrates of neighbouring renditions, e.g., if the first bitrate is 240,000, a maximum ratio of 1.5 will require the next higher bitrate to be at most 360,000
   *
   * @param maxBitrateStepSize
   *        The maximum ratio between the bitrates of neighbouring renditions, e.g., if the first bitrate is 240,000, a maximum ratio of 1.5 will require the next higher bitrate to be at most 360,000
   */
  public void setMaxBitrateStepSize(Double maxBitrateStepSize) {
    this.maxBitrateStepSize = maxBitrateStepSize;
  }


  /**
   * Get autoRepresentations
   * @return autoRepresentations
   */
  public AutoRepresentation getAutoRepresentations() {
    return autoRepresentations;
  }

  /**
   * Set autoRepresentations
   *
   * @param autoRepresentations
   */
  public void setAutoRepresentations(AutoRepresentation autoRepresentations) {
    this.autoRepresentations = autoRepresentations;
  }


  /**
   * Will modify the assumed complexity for the Per-Title algorithm (&gt; 0.0). Values higher than 1 will increase complexity and thus select smaller resolutions for given bitrates. This will also result in a higher bitrate for the top rendition. Values lower than 1 will decrease assumed complexity and thus select higher resolutions for given bitrates and also decrease the bitrate of the top rendition
   * minimum: 0
   * @return complexityFactor
   */
  public Double getComplexityFactor() {
    return complexityFactor;
  }

  /**
   * Will modify the assumed complexity for the Per-Title algorithm (&gt; 0.0). Values higher than 1 will increase complexity and thus select smaller resolutions for given bitrates. This will also result in a higher bitrate for the top rendition. Values lower than 1 will decrease assumed complexity and thus select higher resolutions for given bitrates and also decrease the bitrate of the top rendition
   * minimum: 0
   *
   * @param complexityFactor
   *        Will modify the assumed complexity for the Per-Title algorithm (&gt; 0.0). Values higher than 1 will increase complexity and thus select smaller resolutions for given bitrates. This will also result in a higher bitrate for the top rendition. Values lower than 1 will decrease assumed complexity and thus select higher resolutions for given bitrates and also decrease the bitrate of the top rendition
   *        minimum: 0
   */
  public void setComplexityFactor(Double complexityFactor) {
    this.complexityFactor = complexityFactor;
  }


  /**
   * Additional configuration for fixed resolution and bitrate templates
   * @return fixedResolutionAndBitrateConfiguration
   */
  public PerTitleFixedResolutionAndBitrateConfiguration getFixedResolutionAndBitrateConfiguration() {
    return fixedResolutionAndBitrateConfiguration;
  }

  /**
   * Additional configuration for fixed resolution and bitrate templates
   *
   * @param fixedResolutionAndBitrateConfiguration
   *        Additional configuration for fixed resolution and bitrate templates
   */
  public void setFixedResolutionAndBitrateConfiguration(PerTitleFixedResolutionAndBitrateConfiguration fixedResolutionAndBitrateConfiguration) {
    this.fixedResolutionAndBitrateConfiguration = fixedResolutionAndBitrateConfiguration;
  }


  /**
   * Desired target quality of the highest representation expressed as CRF value
   * @return targetQualityCrf
   */
  public Double getTargetQualityCrf() {
    return targetQualityCrf;
  }

  /**
   * Desired target quality of the highest representation expressed as CRF value
   *
   * @param targetQualityCrf
   *        Desired target quality of the highest representation expressed as CRF value
   */
  public void setTargetQualityCrf(Double targetQualityCrf) {
    this.targetQualityCrf = targetQualityCrf;
  }


  /**
   * This factor influences the resolution selection of the per-title algorithm. The default value is 0.0. negative values will lead to results where the algorithm will choose lower resolutions for given bitrates. A positive value will result in higher resolutions to be selected. The range of the factor is -5.0 to +5.0. Please note that changing this factor might also lead to slightly different bitrate selection by the algorithm.
   * @return resolutionScaleFactor
   */
  public Double getResolutionScaleFactor() {
    return resolutionScaleFactor;
  }

  /**
   * This factor influences the resolution selection of the per-title algorithm. The default value is 0.0. negative values will lead to results where the algorithm will choose lower resolutions for given bitrates. A positive value will result in higher resolutions to be selected. The range of the factor is -5.0 to +5.0. Please note that changing this factor might also lead to slightly different bitrate selection by the algorithm.
   *
   * @param resolutionScaleFactor
   *        This factor influences the resolution selection of the per-title algorithm. The default value is 0.0. negative values will lead to results where the algorithm will choose lower resolutions for given bitrates. A positive value will result in higher resolutions to be selected. The range of the factor is -5.0 to +5.0. Please note that changing this factor might also lead to slightly different bitrate selection by the algorithm.
   */
  public void setResolutionScaleFactor(Double resolutionScaleFactor) {
    this.resolutionScaleFactor = resolutionScaleFactor;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PerTitleConfiguration perTitleConfiguration = (PerTitleConfiguration) o;
    return Objects.equals(this.minBitrate, perTitleConfiguration.minBitrate) &&
        Objects.equals(this.maxBitrate, perTitleConfiguration.maxBitrate) &&
        Objects.equals(this.minBitrateStepSize, perTitleConfiguration.minBitrateStepSize) &&
        Objects.equals(this.maxBitrateStepSize, perTitleConfiguration.maxBitrateStepSize) &&
        Objects.equals(this.autoRepresentations, perTitleConfiguration.autoRepresentations) &&
        Objects.equals(this.complexityFactor, perTitleConfiguration.complexityFactor) &&
        Objects.equals(this.fixedResolutionAndBitrateConfiguration, perTitleConfiguration.fixedResolutionAndBitrateConfiguration) &&
        Objects.equals(this.targetQualityCrf, perTitleConfiguration.targetQualityCrf) &&
        Objects.equals(this.resolutionScaleFactor, perTitleConfiguration.resolutionScaleFactor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minBitrate, maxBitrate, minBitrateStepSize, maxBitrateStepSize, autoRepresentations, complexityFactor, fixedResolutionAndBitrateConfiguration, targetQualityCrf, resolutionScaleFactor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PerTitleConfiguration {\n");
    
    sb.append("    minBitrate: ").append(toIndentedString(minBitrate)).append("\n");
    sb.append("    maxBitrate: ").append(toIndentedString(maxBitrate)).append("\n");
    sb.append("    minBitrateStepSize: ").append(toIndentedString(minBitrateStepSize)).append("\n");
    sb.append("    maxBitrateStepSize: ").append(toIndentedString(maxBitrateStepSize)).append("\n");
    sb.append("    autoRepresentations: ").append(toIndentedString(autoRepresentations)).append("\n");
    sb.append("    complexityFactor: ").append(toIndentedString(complexityFactor)).append("\n");
    sb.append("    fixedResolutionAndBitrateConfiguration: ").append(toIndentedString(fixedResolutionAndBitrateConfiguration)).append("\n");
    sb.append("    targetQualityCrf: ").append(toIndentedString(targetQualityCrf)).append("\n");
    sb.append("    resolutionScaleFactor: ").append(toIndentedString(resolutionScaleFactor)).append("\n");
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

