package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * PccCombination
 */

public class PccCombination {
  @JsonProperty("codec")
  private String codec;

  @JsonProperty("protection")
  private String protection;

  @JsonProperty("label")
  private String label;

  @JsonProperty("hdr")
  private Boolean hdr;


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
   * The column heading, spelled the way a reader reads it rather than the way the catalogue spells it. (required)
   * @return label
   */
  public String getLabel() {
    return label;
  }

  /**
   * The column heading, spelled the way a reader reads it rather than the way the catalogue spells it. (required)
   *
   * @param label
   *        The column heading, spelled the way a reader reads it rather than the way the catalogue spells it. (required)
   */
  public void setLabel(String label) {
    this.label = label;
  }


  /**
   * Whether this column&#39;s stream is HDR. Read it here rather than out of the codec name: not every HDR codec spells &#x60;hdr10&#x60;, and the Dolby Vision ones never do. (required)
   * @return hdr
   */
  public Boolean getHdr() {
    return hdr;
  }

  /**
   * Whether this column&#39;s stream is HDR. Read it here rather than out of the codec name: not every HDR codec spells &#x60;hdr10&#x60;, and the Dolby Vision ones never do. (required)
   *
   * @param hdr
   *        Whether this column&#39;s stream is HDR. Read it here rather than out of the codec name: not every HDR codec spells &#x60;hdr10&#x60;, and the Dolby Vision ones never do. (required)
   */
  public void setHdr(Boolean hdr) {
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
    PccCombination pccCombination = (PccCombination) o;
    return Objects.equals(this.codec, pccCombination.codec) &&
        Objects.equals(this.protection, pccCombination.protection) &&
        Objects.equals(this.label, pccCombination.label) &&
        Objects.equals(this.hdr, pccCombination.hdr);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codec, protection, label, hdr);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PccCombination {\n");
    
    sb.append("    codec: ").append(toIndentedString(codec)).append("\n");
    sb.append("    protection: ").append(toIndentedString(protection)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
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

