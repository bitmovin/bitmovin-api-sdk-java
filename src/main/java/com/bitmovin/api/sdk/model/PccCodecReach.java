package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.PccCodecDeviceTypeReach;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * PccCodecReach
 */

public class PccCodecReach {
  @JsonProperty("codec")
  private String codec;

  @JsonProperty("byDeviceType")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<PccCodecDeviceTypeReach> byDeviceType = new ArrayList<PccCodecDeviceTypeReach>();


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


  public PccCodecReach addByDeviceTypeItem(PccCodecDeviceTypeReach byDeviceTypeItem) {
    this.byDeviceType.add(byDeviceTypeItem);
    return this;
  }

  /**
   * Get byDeviceType
   * @return byDeviceType
   */
  public List<PccCodecDeviceTypeReach> getByDeviceType() {
    return byDeviceType;
  }

  /**
   * Set byDeviceType
   *
   * @param byDeviceType
   */
  public void setByDeviceType(List<PccCodecDeviceTypeReach> byDeviceType) {
    this.byDeviceType = byDeviceType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PccCodecReach pccCodecReach = (PccCodecReach) o;
    return Objects.equals(this.codec, pccCodecReach.codec) &&
        Objects.equals(this.byDeviceType, pccCodecReach.byDeviceType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codec, byDeviceType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PccCodecReach {\n");
    
    sb.append("    codec: ").append(toIndentedString(codec)).append("\n");
    sb.append("    byDeviceType: ").append(toIndentedString(byDeviceType)).append("\n");
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

