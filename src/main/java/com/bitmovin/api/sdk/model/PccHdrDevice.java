package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.PccDeviceHdrVerdict;
import com.bitmovin.api.sdk.model.PccHdrOutcomeCount;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * PccHdrDevice
 */

public class PccHdrDevice {
  @JsonProperty("key")
  private String key;

  @JsonProperty("name")
  private String name;

  @JsonProperty("qualifier")
  private String qualifier;

  @JsonProperty("passes")
  private BigDecimal passes;

  @JsonProperty("verdict")
  private PccDeviceHdrVerdict verdict;

  @JsonProperty("outcomes")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<PccHdrOutcomeCount> outcomes = new ArrayList<PccHdrOutcomeCount>();


  /**
   * Opaque stable pool key for row identity. Do not display it as a device name. (required)
   * @return key
   */
  public String getKey() {
    return key;
  }

  /**
   * Opaque stable pool key for row identity. Do not display it as a device name. (required)
   *
   * @param key
   *        Opaque stable pool key for row identity. Do not display it as a device name. (required)
   */
  public void setKey(String key) {
    this.key = key;
  }


  /**
   * Get name
   * @return name
   */
  public String getName() {
    return name;
  }

  /**
   * Set name
   *
   * @param name
   */
  public void setName(String name) {
    this.name = name;
  }


  /**
   * Get qualifier
   * @return qualifier
   */
  public String getQualifier() {
    return qualifier;
  }

  /**
   * Set qualifier
   *
   * @param qualifier
   */
  public void setQualifier(String qualifier) {
    this.qualifier = qualifier;
  }


  /**
   * All selected HDR playback passes for this device pool. (required)
   * @return passes
   */
  public BigDecimal getPasses() {
    return passes;
  }

  /**
   * All selected HDR playback passes for this device pool. (required)
   *
   * @param passes
   *        All selected HDR playback passes for this device pool. (required)
   */
  public void setPasses(BigDecimal passes) {
    this.passes = passes;
  }


  /**
   * Service-resolved verdict: negative findings outrank positive results. Null when no pass carries an HDR reading. (required)
   * @return verdict
   */
  public PccDeviceHdrVerdict getVerdict() {
    return verdict;
  }

  /**
   * Service-resolved verdict: negative findings outrank positive results. Null when no pass carries an HDR reading. (required)
   *
   * @param verdict
   *        Service-resolved verdict: negative findings outrank positive results. Null when no pass carries an HDR reading. (required)
   */
  public void setVerdict(PccDeviceHdrVerdict verdict) {
    this.verdict = verdict;
  }


  public PccHdrDevice addOutcomesItem(PccHdrOutcomeCount outcomesItem) {
    this.outcomes.add(outcomesItem);
    return this;
  }

  /**
   * Get outcomes
   * @return outcomes
   */
  public List<PccHdrOutcomeCount> getOutcomes() {
    return outcomes;
  }

  /**
   * Set outcomes
   *
   * @param outcomes
   */
  public void setOutcomes(List<PccHdrOutcomeCount> outcomes) {
    this.outcomes = outcomes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PccHdrDevice pccHdrDevice = (PccHdrDevice) o;
    return Objects.equals(this.key, pccHdrDevice.key) &&
        Objects.equals(this.name, pccHdrDevice.name) &&
        Objects.equals(this.qualifier, pccHdrDevice.qualifier) &&
        Objects.equals(this.passes, pccHdrDevice.passes) &&
        Objects.equals(this.verdict, pccHdrDevice.verdict) &&
        Objects.equals(this.outcomes, pccHdrDevice.outcomes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, name, qualifier, passes, verdict, outcomes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PccHdrDevice {\n");
    
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    qualifier: ").append(toIndentedString(qualifier)).append("\n");
    sb.append("    passes: ").append(toIndentedString(passes)).append("\n");
    sb.append("    verdict: ").append(toIndentedString(verdict)).append("\n");
    sb.append("    outcomes: ").append(toIndentedString(outcomes)).append("\n");
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

