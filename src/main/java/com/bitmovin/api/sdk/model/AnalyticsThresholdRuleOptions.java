package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * AnalyticsThresholdRuleOptions
 */

public class AnalyticsThresholdRuleOptions {
  @JsonProperty("threshold")
  private Double threshold;

  @JsonProperty("persistence")
  private Integer persistence;

  @JsonProperty("sampleSize")
  private Integer sampleSize;

  @JsonProperty("recovery")
  private Integer recovery;

  @JsonProperty("repeatInterval")
  private Integer repeatInterval;

  @JsonProperty("notifyOnResolved")
  private Boolean notifyOnResolved;


  /**
   * Threshold for triggering alert (required)
   * @return threshold
   */
  public Double getThreshold() {
    return threshold;
  }

  /**
   * Threshold for triggering alert (required)
   *
   * @param threshold
   *        Threshold for triggering alert (required)
   */
  public void setThreshold(Double threshold) {
    this.threshold = threshold;
  }


  /**
   * Persistence of threshold violation in minutes (required)
   * @return persistence
   */
  public Integer getPersistence() {
    return persistence;
  }

  /**
   * Persistence of threshold violation in minutes (required)
   *
   * @param persistence
   *        Persistence of threshold violation in minutes (required)
   */
  public void setPersistence(Integer persistence) {
    this.persistence = persistence;
  }


  /**
   * Sample size for rule processing (required)
   * @return sampleSize
   */
  public Integer getSampleSize() {
    return sampleSize;
  }

  /**
   * Sample size for rule processing (required)
   *
   * @param sampleSize
   *        Sample size for rule processing (required)
   */
  public void setSampleSize(Integer sampleSize) {
    this.sampleSize = sampleSize;
  }


  /**
   * Number of minutes without violation after which incident is considered as recovered (required)
   * @return recovery
   */
  public Integer getRecovery() {
    return recovery;
  }

  /**
   * Number of minutes without violation after which incident is considered as recovered (required)
   *
   * @param recovery
   *        Number of minutes without violation after which incident is considered as recovered (required)
   */
  public void setRecovery(Integer recovery) {
    this.recovery = recovery;
  }


  /**
   * Interval for repeating notifications (required)
   * @return repeatInterval
   */
  public Integer getRepeatInterval() {
    return repeatInterval;
  }

  /**
   * Interval for repeating notifications (required)
   *
   * @param repeatInterval
   *        Interval for repeating notifications (required)
   */
  public void setRepeatInterval(Integer repeatInterval) {
    this.repeatInterval = repeatInterval;
  }


  /**
   * Send notification after incident is resolved
   * @return notifyOnResolved
   */
  public Boolean getNotifyOnResolved() {
    return notifyOnResolved;
  }

  /**
   * Send notification after incident is resolved
   *
   * @param notifyOnResolved
   *        Send notification after incident is resolved
   */
  public void setNotifyOnResolved(Boolean notifyOnResolved) {
    this.notifyOnResolved = notifyOnResolved;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalyticsThresholdRuleOptions analyticsThresholdRuleOptions = (AnalyticsThresholdRuleOptions) o;
    return Objects.equals(this.threshold, analyticsThresholdRuleOptions.threshold) &&
        Objects.equals(this.persistence, analyticsThresholdRuleOptions.persistence) &&
        Objects.equals(this.sampleSize, analyticsThresholdRuleOptions.sampleSize) &&
        Objects.equals(this.recovery, analyticsThresholdRuleOptions.recovery) &&
        Objects.equals(this.repeatInterval, analyticsThresholdRuleOptions.repeatInterval) &&
        Objects.equals(this.notifyOnResolved, analyticsThresholdRuleOptions.notifyOnResolved);
  }

  @Override
  public int hashCode() {
    return Objects.hash(threshold, persistence, sampleSize, recovery, repeatInterval, notifyOnResolved);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalyticsThresholdRuleOptions {\n");
    
    sb.append("    threshold: ").append(toIndentedString(threshold)).append("\n");
    sb.append("    persistence: ").append(toIndentedString(persistence)).append("\n");
    sb.append("    sampleSize: ").append(toIndentedString(sampleSize)).append("\n");
    sb.append("    recovery: ").append(toIndentedString(recovery)).append("\n");
    sb.append("    repeatInterval: ").append(toIndentedString(repeatInterval)).append("\n");
    sb.append("    notifyOnResolved: ").append(toIndentedString(notifyOnResolved)).append("\n");
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

