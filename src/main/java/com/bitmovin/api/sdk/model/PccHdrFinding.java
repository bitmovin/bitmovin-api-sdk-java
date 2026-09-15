package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * PccHdrFinding
 */

public class PccHdrFinding {
  @JsonProperty("device")
  private String device;

  @JsonProperty("codec")
  private String codec;

  @JsonProperty("protection")
  private String protection;

  @JsonProperty("sentence")
  private String sentence;


  /**
   * The device pool, under the name the rest of the report shows it by. (required)
   * @return device
   */
  public String getDevice() {
    return device;
  }

  /**
   * The device pool, under the name the rest of the report shows it by. (required)
   *
   * @param device
   *        The device pool, under the name the rest of the report shows it by. (required)
   */
  public void setDevice(String device) {
    this.device = device;
  }


  /**
   * Get codec
   * @return codec
   */
  public String getCodec() {
    return codec;
  }

  /**
   * Set codec
   *
   * @param codec
   */
  public void setCodec(String codec) {
    this.codec = codec;
  }


  /**
   * Get protection
   * @return protection
   */
  public String getProtection() {
    return protection;
  }

  /**
   * Set protection
   *
   * @param protection
   */
  public void setProtection(String protection) {
    this.protection = protection;
  }


  /**
   * What was found, in one paragraph. (required)
   * @return sentence
   */
  public String getSentence() {
    return sentence;
  }

  /**
   * What was found, in one paragraph. (required)
   *
   * @param sentence
   *        What was found, in one paragraph. (required)
   */
  public void setSentence(String sentence) {
    this.sentence = sentence;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PccHdrFinding pccHdrFinding = (PccHdrFinding) o;
    return Objects.equals(this.device, pccHdrFinding.device) &&
        Objects.equals(this.codec, pccHdrFinding.codec) &&
        Objects.equals(this.protection, pccHdrFinding.protection) &&
        Objects.equals(this.sentence, pccHdrFinding.sentence);
  }

  @Override
  public int hashCode() {
    return Objects.hash(device, codec, protection, sentence);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PccHdrFinding {\n");
    
    sb.append("    device: ").append(toIndentedString(device)).append("\n");
    sb.append("    codec: ").append(toIndentedString(codec)).append("\n");
    sb.append("    protection: ").append(toIndentedString(protection)).append("\n");
    sb.append("    sentence: ").append(toIndentedString(sentence)).append("\n");
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

