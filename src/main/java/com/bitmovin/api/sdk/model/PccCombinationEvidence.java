package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * PccCombinationEvidence
 */

public class PccCombinationEvidence {
  @JsonProperty("codec")
  private String codec;

  @JsonProperty("protection")
  private String protection;

  @JsonProperty("playedBy")
  private BigDecimal playedBy;

  @JsonProperty("claimedNotPlayedBy")
  private BigDecimal claimedNotPlayedBy;

  @JsonProperty("measuredBy")
  private BigDecimal measuredBy;

  @JsonProperty("notApplicable")
  private Boolean notApplicable;

  @JsonProperty("assetHosts")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<String> assetHosts = new ArrayList<String>();

  @JsonProperty("licenseServers")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<String> licenseServers = new ArrayList<String>();


  /**
   * The codec, as the shared contract spells it. (required)
   * @return codec
   */
  public String getCodec() {
    return codec;
  }

  /**
   * The codec, as the shared contract spells it. (required)
   *
   * @param codec
   *        The codec, as the shared contract spells it. (required)
   */
  public void setCodec(String codec) {
    this.codec = codec;
  }


  /**
   * The content protection, as the shared contract spells it. (required)
   * @return protection
   */
  public String getProtection() {
    return protection;
  }

  /**
   * The content protection, as the shared contract spells it. (required)
   *
   * @param protection
   *        The content protection, as the shared contract spells it. (required)
   */
  public void setProtection(String protection) {
    this.protection = protection;
  }


  /**
   * Device pools that played it, which is what proves the stream behind it works at all. (required)
   * @return playedBy
   */
  public BigDecimal getPlayedBy() {
    return playedBy;
  }

  /**
   * Device pools that played it, which is what proves the stream behind it works at all. (required)
   *
   * @param playedBy
   *        Device pools that played it, which is what proves the stream behind it works at all. (required)
   */
  public void setPlayedBy(BigDecimal playedBy) {
    this.playedBy = playedBy;
  }


  /**
   * Device pools that reported support for it and then failed to play it. (required)
   * @return claimedNotPlayedBy
   */
  public BigDecimal getClaimedNotPlayedBy() {
    return claimedNotPlayedBy;
  }

  /**
   * Device pools that reported support for it and then failed to play it. (required)
   *
   * @param claimedNotPlayedBy
   *        Device pools that reported support for it and then failed to play it. (required)
   */
  public void setClaimedNotPlayedBy(BigDecimal claimedNotPlayedBy) {
    this.claimedNotPlayedBy = claimedNotPlayedBy;
  }


  /**
   * Device pools that produced an answer either way. (required)
   * @return measuredBy
   */
  public BigDecimal getMeasuredBy() {
    return measuredBy;
  }

  /**
   * Device pools that produced an answer either way. (required)
   *
   * @param measuredBy
   *        Device pools that produced an answer either way. (required)
   */
  public void setMeasuredBy(BigDecimal measuredBy) {
    this.measuredBy = measuredBy;
  }


  /**
   * No conformant stream can exist for this pairing, so it is neither gap nor result. (required)
   * @return notApplicable
   */
  public Boolean getNotApplicable() {
    return notApplicable;
  }

  /**
   * No conformant stream can exist for this pairing, so it is neither gap nor result. (required)
   *
   * @param notApplicable
   *        No conformant stream can exist for this pairing, so it is neither gap nor result. (required)
   */
  public void setNotApplicable(Boolean notApplicable) {
    this.notApplicable = notApplicable;
  }


  public PccCombinationEvidence addAssetHostsItem(String assetHostsItem) {
    this.assetHosts.add(assetHostsItem);
    return this;
  }

  /**
   * Hosts that served its stream. A host only — never a path and never a URL. (required)
   * @return assetHosts
   */
  public List<String> getAssetHosts() {
    return assetHosts;
  }

  /**
   * Hosts that served its stream. A host only — never a path and never a URL. (required)
   *
   * @param assetHosts
   *        Hosts that served its stream. A host only — never a path and never a URL. (required)
   */
  public void setAssetHosts(List<String> assetHosts) {
    this.assetHosts = assetHosts;
  }


  public PccCombinationEvidence addLicenseServersItem(String licenseServersItem) {
    this.licenseServers.add(licenseServersItem);
    return this;
  }

  /**
   * Hosts that licensed it. A separate axis from the one above: without both, a device refusing a codec cannot be told from a stream that stopped being served. (required)
   * @return licenseServers
   */
  public List<String> getLicenseServers() {
    return licenseServers;
  }

  /**
   * Hosts that licensed it. A separate axis from the one above: without both, a device refusing a codec cannot be told from a stream that stopped being served. (required)
   *
   * @param licenseServers
   *        Hosts that licensed it. A separate axis from the one above: without both, a device refusing a codec cannot be told from a stream that stopped being served. (required)
   */
  public void setLicenseServers(List<String> licenseServers) {
    this.licenseServers = licenseServers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PccCombinationEvidence pccCombinationEvidence = (PccCombinationEvidence) o;
    return Objects.equals(this.codec, pccCombinationEvidence.codec) &&
        Objects.equals(this.protection, pccCombinationEvidence.protection) &&
        Objects.equals(this.playedBy, pccCombinationEvidence.playedBy) &&
        Objects.equals(this.claimedNotPlayedBy, pccCombinationEvidence.claimedNotPlayedBy) &&
        Objects.equals(this.measuredBy, pccCombinationEvidence.measuredBy) &&
        Objects.equals(this.notApplicable, pccCombinationEvidence.notApplicable) &&
        Objects.equals(this.assetHosts, pccCombinationEvidence.assetHosts) &&
        Objects.equals(this.licenseServers, pccCombinationEvidence.licenseServers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codec, protection, playedBy, claimedNotPlayedBy, measuredBy, notApplicable, assetHosts, licenseServers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PccCombinationEvidence {\n");
    
    sb.append("    codec: ").append(toIndentedString(codec)).append("\n");
    sb.append("    protection: ").append(toIndentedString(protection)).append("\n");
    sb.append("    playedBy: ").append(toIndentedString(playedBy)).append("\n");
    sb.append("    claimedNotPlayedBy: ").append(toIndentedString(claimedNotPlayedBy)).append("\n");
    sb.append("    measuredBy: ").append(toIndentedString(measuredBy)).append("\n");
    sb.append("    notApplicable: ").append(toIndentedString(notApplicable)).append("\n");
    sb.append("    assetHosts: ").append(toIndentedString(assetHosts)).append("\n");
    sb.append("    licenseServers: ").append(toIndentedString(licenseServers)).append("\n");
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

