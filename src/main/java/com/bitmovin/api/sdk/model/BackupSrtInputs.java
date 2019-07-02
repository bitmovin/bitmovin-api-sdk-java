package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.SrtInput;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * BackupSrtInputs
 */

public class BackupSrtInputs {
  @JsonProperty("delayThreshold")
  private Integer delayThreshold;

  @JsonProperty("srtInputs")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<SrtInput> srtInputs = new ArrayList<SrtInput>();


  /**
   * When there is no input signal present for this number of seconds, the encoder will switch to the next input
   * @return delayThreshold
   */
  public Integer getDelayThreshold() {
    return delayThreshold;
  }

  /**
   * When there is no input signal present for this number of seconds, the encoder will switch to the next input
   *
   * @param delayThreshold
   *        When there is no input signal present for this number of seconds, the encoder will switch to the next input
   */
  public void setDelayThreshold(Integer delayThreshold) {
    this.delayThreshold = delayThreshold;
  }


  public BackupSrtInputs addSrtInputsItem(SrtInput srtInputsItem) {
    this.srtInputs.add(srtInputsItem);
    return this;
  }

  /**
   * Get srtInputs
   * @return srtInputs
   */
  public List<SrtInput> getSrtInputs() {
    return srtInputs;
  }

  /**
   * Set srtInputs
   *
   * @param srtInputs
   */
  public void setSrtInputs(List<SrtInput> srtInputs) {
    this.srtInputs = srtInputs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BackupSrtInputs backupSrtInputs = (BackupSrtInputs) o;
    return Objects.equals(this.delayThreshold, backupSrtInputs.delayThreshold) &&
        Objects.equals(this.srtInputs, backupSrtInputs.srtInputs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(delayThreshold, srtInputs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BackupSrtInputs {\n");
    
    sb.append("    delayThreshold: ").append(toIndentedString(delayThreshold)).append("\n");
    sb.append("    srtInputs: ").append(toIndentedString(srtInputs)).append("\n");
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

