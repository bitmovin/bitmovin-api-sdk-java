package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.PccCodecReach;
import com.bitmovin.api.sdk.model.PccCombinationEvidence;
import com.bitmovin.api.sdk.model.PccDeviceTypeShare;
import com.bitmovin.api.sdk.model.PccHdrSummary;
import com.bitmovin.api.sdk.model.PccOverview;
import com.bitmovin.api.sdk.model.PccSupportShare;
import com.bitmovin.api.sdk.model.PccVerdictShare;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * PccSummary
 */

public class PccSummary {
  @JsonProperty("overview")
  private PccOverview overview;

  @JsonProperty("codecReach")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<PccCodecReach> codecReach = new ArrayList<PccCodecReach>();

  @JsonProperty("unansweredCombinations")
  private Integer unansweredCombinations;

  @JsonProperty("verdicts")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<PccVerdictShare> verdicts = new ArrayList<PccVerdictShare>();

  @JsonProperty("byCodec")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<PccSupportShare> byCodec = new ArrayList<PccSupportShare>();

  @JsonProperty("byProtection")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<PccSupportShare> byProtection = new ArrayList<PccSupportShare>();

  @JsonProperty("byDeviceType")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<PccDeviceTypeShare> byDeviceType = new ArrayList<PccDeviceTypeShare>();

  @JsonProperty("combinations")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<PccCombinationEvidence> combinations = new ArrayList<PccCombinationEvidence>();

  @JsonProperty("hdr")
  private PccHdrSummary hdr;


  /**
   * Get overview
   * @return overview
   */
  public PccOverview getOverview() {
    return overview;
  }

  /**
   * Set overview
   *
   * @param overview
   */
  public void setOverview(PccOverview overview) {
    this.overview = overview;
  }


  public PccSummary addCodecReachItem(PccCodecReach codecReachItem) {
    this.codecReach.add(codecReachItem);
    return this;
  }

  /**
   * Get codecReach
   * @return codecReach
   */
  public List<PccCodecReach> getCodecReach() {
    return codecReach;
  }

  /**
   * Set codecReach
   *
   * @param codecReach
   */
  public void setCodecReach(List<PccCodecReach> codecReach) {
    this.codecReach = codecReach;
  }


  /**
   * Selected applicable codec/protection combinations with no device-answering verdict. Declared unsupported and claimed-but-not-played are answers; inapplicable pairings are not gaps. (required)
   * minimum: 0
   * @return unansweredCombinations
   */
  public Integer getUnansweredCombinations() {
    return unansweredCombinations;
  }

  /**
   * Selected applicable codec/protection combinations with no device-answering verdict. Declared unsupported and claimed-but-not-played are answers; inapplicable pairings are not gaps. (required)
   * minimum: 0
   *
   * @param unansweredCombinations
   *        Selected applicable codec/protection combinations with no device-answering verdict. Declared unsupported and claimed-but-not-played are answers; inapplicable pairings are not gaps. (required)
   *        minimum: 0
   */
  public void setUnansweredCombinations(Integer unansweredCombinations) {
    this.unansweredCombinations = unansweredCombinations;
  }


  public PccSummary addVerdictsItem(PccVerdictShare verdictsItem) {
    this.verdicts.add(verdictsItem);
    return this;
  }

  /**
   * Get verdicts
   * @return verdicts
   */
  public List<PccVerdictShare> getVerdicts() {
    return verdicts;
  }

  /**
   * Set verdicts
   *
   * @param verdicts
   */
  public void setVerdicts(List<PccVerdictShare> verdicts) {
    this.verdicts = verdicts;
  }


  public PccSummary addByCodecItem(PccSupportShare byCodecItem) {
    this.byCodec.add(byCodecItem);
    return this;
  }

  /**
   * Get byCodec
   * @return byCodec
   */
  public List<PccSupportShare> getByCodec() {
    return byCodec;
  }

  /**
   * Set byCodec
   *
   * @param byCodec
   */
  public void setByCodec(List<PccSupportShare> byCodec) {
    this.byCodec = byCodec;
  }


  public PccSummary addByProtectionItem(PccSupportShare byProtectionItem) {
    this.byProtection.add(byProtectionItem);
    return this;
  }

  /**
   * Get byProtection
   * @return byProtection
   */
  public List<PccSupportShare> getByProtection() {
    return byProtection;
  }

  /**
   * Set byProtection
   *
   * @param byProtection
   */
  public void setByProtection(List<PccSupportShare> byProtection) {
    this.byProtection = byProtection;
  }


  public PccSummary addByDeviceTypeItem(PccDeviceTypeShare byDeviceTypeItem) {
    this.byDeviceType.add(byDeviceTypeItem);
    return this;
  }

  /**
   * Get byDeviceType
   * @return byDeviceType
   */
  public List<PccDeviceTypeShare> getByDeviceType() {
    return byDeviceType;
  }

  /**
   * Set byDeviceType
   *
   * @param byDeviceType
   */
  public void setByDeviceType(List<PccDeviceTypeShare> byDeviceType) {
    this.byDeviceType = byDeviceType;
  }


  public PccSummary addCombinationsItem(PccCombinationEvidence combinationsItem) {
    this.combinations.add(combinationsItem);
    return this;
  }

  /**
   * Every selected combination, with what the selected device pools answered about it. One that several pools claimed and none played points at the stream rather than at the devices. (required)
   * @return combinations
   */
  public List<PccCombinationEvidence> getCombinations() {
    return combinations;
  }

  /**
   * Every selected combination, with what the selected device pools answered about it. One that several pools claimed and none played points at the stream rather than at the devices. (required)
   *
   * @param combinations
   *        Every selected combination, with what the selected device pools answered about it. One that several pools claimed and none played points at the stream rather than at the devices. (required)
   */
  public void setCombinations(List<PccCombinationEvidence> combinations) {
    this.combinations = combinations;
  }


  /**
   * Get hdr
   * @return hdr
   */
  public PccHdrSummary getHdr() {
    return hdr;
  }

  /**
   * Set hdr
   *
   * @param hdr
   */
  public void setHdr(PccHdrSummary hdr) {
    this.hdr = hdr;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PccSummary pccSummary = (PccSummary) o;
    return Objects.equals(this.overview, pccSummary.overview) &&
        Objects.equals(this.codecReach, pccSummary.codecReach) &&
        Objects.equals(this.unansweredCombinations, pccSummary.unansweredCombinations) &&
        Objects.equals(this.verdicts, pccSummary.verdicts) &&
        Objects.equals(this.byCodec, pccSummary.byCodec) &&
        Objects.equals(this.byProtection, pccSummary.byProtection) &&
        Objects.equals(this.byDeviceType, pccSummary.byDeviceType) &&
        Objects.equals(this.combinations, pccSummary.combinations) &&
        Objects.equals(this.hdr, pccSummary.hdr);
  }

  @Override
  public int hashCode() {
    return Objects.hash(overview, codecReach, unansweredCombinations, verdicts, byCodec, byProtection, byDeviceType, combinations, hdr);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PccSummary {\n");
    
    sb.append("    overview: ").append(toIndentedString(overview)).append("\n");
    sb.append("    codecReach: ").append(toIndentedString(codecReach)).append("\n");
    sb.append("    unansweredCombinations: ").append(toIndentedString(unansweredCombinations)).append("\n");
    sb.append("    verdicts: ").append(toIndentedString(verdicts)).append("\n");
    sb.append("    byCodec: ").append(toIndentedString(byCodec)).append("\n");
    sb.append("    byProtection: ").append(toIndentedString(byProtection)).append("\n");
    sb.append("    byDeviceType: ").append(toIndentedString(byDeviceType)).append("\n");
    sb.append("    combinations: ").append(toIndentedString(combinations)).append("\n");
    sb.append("    hdr: ").append(toIndentedString(hdr)).append("\n");
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

